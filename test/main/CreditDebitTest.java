package main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class CreditDebitTest {

    @Test
    void testConstructorCreatesObject() {
        CreditDebit payment = new CreditDebit(100.0,
                "1234567812345678",123,"12/28");

        assertNotNull(payment);
    }

    @Test
    void testPayDoesNotThrowException() {
        CreditDebit payment = new CreditDebit(50.0,
                "1234567812345678",123,"12/28");

        assertDoesNotThrow(() -> payment.pay());
    }

    @Test
    void testRefundDoesNotThrowException() {
        CreditDebit payment = new CreditDebit(50.0,
                "1234567812345678",123,"12/28");

        assertDoesNotThrow(() -> payment.refund());
    }

    @Test
    void testPayPrintsCorrectCardEnding() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment = new CreditDebit(
                100.0,
                "1111222233334444",
                123,
                "12/28");

        payment.pay();

        assertTrue(output.toString().contains("4444"));
    }

    @Test
    void testRefundPrintsCorrectCardEnding() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment = new CreditDebit(
                100.0,
                "1111222233334444",
                123,
                "12/28");

        payment.refund();

        assertTrue(output.toString().contains("4444"));
    }

    @Test
    void testPayPrintsCharged() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment =
                new CreditDebit(75.0,
                        "1234567812345678",
                        321,
                        "11/27");

        payment.pay();

        assertTrue(output.toString().contains("charged"));
    }

    @Test
    void testRefundPrintsRefunded() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment =
                new CreditDebit(75.0,
                        "1234567812345678",
                        321,
                        "11/27");

        payment.refund();

        assertTrue(output.toString().contains("refunded"));
    }

    @Test
    void testPayPrintsAmount() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment =
                new CreditDebit(150.0,
                        "1234567812345678",
                        123,
                        "12/28");

        payment.pay();

        assertTrue(output.toString().contains("150.0"));
    }

    @Test
    void testRefundPrintsAmount() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CreditDebit payment =
                new CreditDebit(250.0,
                        "1234567812345678",
                        123,
                        "12/28");

        payment.refund();

        assertTrue(output.toString().contains("250.0"));
    }

    @Test
    void testMultiplePaymentsCanBeMade() {

        CreditDebit payment =
                new CreditDebit(100.0,
                        "1234567812345678",
                        123,
                        "12/28");

        assertDoesNotThrow(() -> {
            payment.pay();
            payment.pay();
            payment.refund();
        });
    }

}