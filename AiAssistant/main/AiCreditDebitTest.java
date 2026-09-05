package main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AiCreditDebitTest {

    private CreditDebit payment;

    @BeforeEach
    void setUp() {
        payment = new CreditDebit(125.50, "1234567812345678", 123, "12/30");
    }

    @Test
    void testObjectCreated() {
        assertNotNull(payment);
    }

    @Test
    void testPayPrintsChargeMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        payment.pay();

        assertTrue(output.toString().contains("charged"));
    }

    @Test
    void testRefundPrintsRefundMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        payment.refund();

        assertTrue(output.toString().contains("refunded"));
    }

    @Test
    void testPayDisplaysLastFourDigits() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        payment.pay();

        assertTrue(output.toString().contains("5678"));
    }

    @Test
    void testRefundDisplaysLastFourDigits() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        payment.refund();

        assertTrue(output.toString().contains("5678"));
    }
}