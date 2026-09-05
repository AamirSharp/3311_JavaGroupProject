package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SensorObserverTest {

	private TestObserver observer;

	class TestObserver implements SensorObserver {
		Badge lastBadge;
		int updates = 0;

		@Override
		public void update(Badge badge) {
			lastBadge = badge;
			updates++;
		}
	}

	@BeforeEach
	void setup() {
		observer = new TestObserver();
	}

	@Test
	void testObserverCreated() {
		assertNotNull(observer);
	}

	@Test
	void testObserverType() {
		assertTrue(observer instanceof SensorObserver);
	}

	@Test
	void testNoUpdatesAtStart() {
		assertEquals(0, observer.updates);
	}

	@Test
	void testBadgeNullAtStart() {
		assertNull(observer.lastBadge);
	}

	@Test
	void testUpdateBadge() {
		Badge badge = new Badge("B001");
		observer.update(badge);

		assertEquals(badge, observer.lastBadge);
	}

	@Test
	void testOneUpdate() {
		Badge badge = new Badge("B002");
		observer.update(badge);

		assertEquals(1, observer.updates);
	}

	@Test
	void testTwoUpdates() {
		observer.update(new Badge("B001"));
		observer.update(new Badge("B002"));

		assertEquals(2, observer.updates);
	}

	@Test
	void testLastBadge() {
		Badge badge1 = new Badge("B001");
		Badge badge2 = new Badge("B002");

		observer.update(badge1);
		observer.update(badge2);

		assertEquals(badge2, observer.lastBadge);
	}

	@Test
	void testBadgeIdAfterUpdate() {
		Badge badge = new Badge("TEST123");
		observer.update(badge);

		assertEquals("TEST123", observer.lastBadge.getBadgeId());
	}

	@Test
	void testNullUpdate() {
		observer.update(null);

		assertNull(observer.lastBadge);
		assertEquals(1, observer.updates);
	}
}