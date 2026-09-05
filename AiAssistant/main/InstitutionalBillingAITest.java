package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InstitutionalBillingAITest {

    private InstitutionalBilling billing;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        billing = new InstitutionalBilling(200.0, "EMP-7788");
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testConstructorAndGetAmount() {
        assertNotNull(billing);
        assertEquals(200.0, billing.getAmount(), 0.001);
    }

    @Test
    void testPayConsoleOutput() {
        billing.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP-7788has been charged 200.0", output);
    }

    @Test
    void testRefundConsoleOutput() {
        billing.refund();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP-7788has been refunded 200.0", output);
    }

    @Test
    void testPaymentIdGenerated() {
        assertNotNull(billing.getPaymentId());
        assertTrue(billing.getPaymentId().contains("paid"));
    }

    @Test
    void testSetAndGetPaymentId() {
        billing.setPaymentId("PAY_CUSTOM_999");
        assertEquals("PAY_CUSTOM_999", billing.getPaymentId());
    }

    @Test
    void testSetAndGetAmount() {
        billing.setAmount(350.50);
        assertEquals(350.50, billing.getAmount(), 0.001);
    }

    @Test
    void testPayWithZeroAmount() {
        InstitutionalBilling zeroBilling = new InstitutionalBilling(0.0, "EMP-0000");
        zeroBilling.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP-0000has been charged 0.0", output);
    }

    @Test
    void testRefundWithZeroAmount() {
        InstitutionalBilling zeroBilling = new InstitutionalBilling(0.0, "EMP-0000");
        zeroBilling.refund();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP-0000has been refunded 0.0", output);
    }

    @Test
    void testPolymorphicPaymentStrategyReference() {
        PaymentStrategy strategy = new InstitutionalBilling(100.0, "EMP-1111");
        strategy.pay();
        String output = outputStream.toString().trim();
        assertEquals("EmployeeEMP-1111has been charged 100.0", output);
    }

    @Test
    void testSequentialPayAndRefund() {
        billing.pay();
        billing.refund();
        String[] lines = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("EmployeeEMP-7788has been charged 200.0", lines[0]);
        assertEquals("EmployeeEMP-7788has been refunded 200.0", lines[1]);
    }
}