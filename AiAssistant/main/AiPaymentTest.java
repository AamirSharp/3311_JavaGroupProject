package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AiPaymentTest {

    // Concrete class because Payment is abstract
    private static class TestPayment extends Payment {

        boolean paid = false;
        boolean refunded = false;

        public TestPayment(double amount) {
            super(amount);
        }

        @Override
        public void pay() {
            paid = true;
        }

        @Override
        public void refund() {
            refunded = true;
        }
    }


    @Test
    public void testPaymentConstructorStoresAmount() {
        TestPayment payment = new TestPayment(100.0);

        assertEquals(100.0, payment.getAmount());
    }


    @Test
    public void testPaymentCreatesPaymentId() {
        TestPayment payment = new TestPayment(50.0);

        assertNotNull(payment.getPaymentId());
        assertTrue(payment.getPaymentId().contains("paid"));
    }


    @Test
    public void testPaymentIdsAreUnique() {
        TestPayment payment1 = new TestPayment(50.0);
        TestPayment payment2 = new TestPayment(50.0);

        assertNotEquals(
                payment1.getPaymentId(),
                payment2.getPaymentId()
        );
    }


    @Test
    public void testSetAmountChangesAmount() {
        TestPayment payment = new TestPayment(100.0);

        payment.setAmount(250.0);

        assertEquals(250.0, payment.getAmount());
    }


    @Test
    public void testSetPaymentIdChangesId() {
        TestPayment payment = new TestPayment(100.0);

        payment.setPaymentId("PAY123");

        assertEquals("PAY123", payment.getPaymentId());
    }


    @Test
    public void testPayMethodExecutes() {
        TestPayment payment = new TestPayment(100.0);

        payment.pay();

        assertTrue(payment.paid);
    }


    @Test
    public void testRefundMethodExecutes() {
        TestPayment payment = new TestPayment(100.0);

        payment.refund();

        assertTrue(payment.refunded);
    }
}