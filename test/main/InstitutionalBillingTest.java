package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InstitutionalBillingTest {

    private InstitutionalBilling billing;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        billing = new InstitutionalBilling(150.0, "EMP9988");
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testConstructorAndGetAmount() {
        assertNotNull(billing);
        assertEquals(150.0, billing.getAmount(), 0.001);
    }

    @Test
    void testPayConsoleOutput() {
        billing.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP9988has been charged 150.0", output);
    }

    @Test
    void testRefundConsoleOutput() {
        billing.refund();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP9988has been refunded 150.0", output);
    }

    @Test
    void testPaymentIdGenerated() {
        assertNotNull(billing.getPaymentId());
        assertTrue(billing.getPaymentId().contains("paid"));
    }

    @Test
    void testSetAndGetPaymentId() {
        billing.setPaymentId("CUSTOM_ID_123");
        assertEquals("CUSTOM_ID_123", billing.getPaymentId());
    }

    @Test
    void testSetAndGetAmount() {
        billing.setAmount(250.75);
        assertEquals(250.75, billing.getAmount(), 0.001);
    }

    @Test
    void testPayWithZeroAmount() {
        InstitutionalBilling zeroBilling = new InstitutionalBilling(0.0, "EMP000");
        zeroBilling.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP000has been charged 0.0", output);
    }

    @Test
    void testRefundWithZeroAmount() {
        InstitutionalBilling zeroBilling = new InstitutionalBilling(0.0, "EMP000");
        zeroBilling.refund();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP000has been refunded 0.0", output);
    }

    @Test
    void testPolymorphicPaymentStrategy() {
        PaymentStrategy strategy = new InstitutionalBilling(100.0, "EMP111");
        strategy.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP111has been charged 100.0", output);
    }

    @Test
    void testSequentialPayAndRefund() {
        billing.pay();
        billing.refund();
        String[] lines = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("EmployeeEMP9988has been charged 150.0", lines[0]);
        assertEquals("EmployeeEMP9988has been refunded 150.0", lines[1]);
    }
}