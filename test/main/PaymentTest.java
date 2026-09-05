package main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
class PaymentTest {
	private static class TestPayment extends Payment {
		private boolean paid = false;
		private boolean refunded = false;
		
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

		boolean isPaid() {
			return paid;}

		boolean isRefunded() {
			return refunded;
		}
	}

	private TestPayment payment;
	@BeforeEach
	void intial() {
		payment = new TestPayment(100.0);
	}
	@Test
	void testIntialAmount() {
		assertEquals(100.0, payment.getAmount());
	}
	
	@Test
	void testSettingCustomAmount() {
		payment.setAmount(250.0);
		assertEquals(250.0, payment.getAmount());
	}
	@Test
	void testPaidStatusBeforePaid() {
		assertFalse(payment.isPaid());
	}
	@Test
	void testRefundStatusBeforeRefund() {
		assertFalse(payment.isRefunded());
	}

	@Test
	void testifPaymentIdGenerates() {
		assertNotNull(payment.getPaymentId());
		assertTrue(payment.getPaymentId().endsWith("paid"));
	}
	@Test
	void testSettingcustomPaymentId() {
		payment.setPaymentId("custom1");
		assertEquals("custom1", payment.getPaymentId());
	}
	@Test
	void testUniqueId() {
		TestPayment newsecondpayment = new TestPayment(50.0);
		assertNotEquals(payment.getPaymentId(), newsecondpayment.getPaymentId());
	}
	@Test
	void testZeroAmountPayment() {
		TestPayment zeroPayment = new TestPayment(0.0);
		assertEquals(0.0, zeroPayment.getAmount());
	}
	@Test
	void testIsPaid() {
		payment.pay();
		assertTrue(payment.isPaid());
	}
	@Test
	void testisRefunded() {
		payment.refund();
		assertTrue(payment.isRefunded());
	}
	@Test
	void testPaymentStrategy() {
		PaymentStrategy strategy = payment;
		strategy.pay();
		assertTrue(payment.isPaid());
	}
}
