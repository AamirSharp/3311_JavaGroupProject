package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AISensorObserverTest {

    // Fake observer used to test the SensorObserver contract
    class FakeSensorObserver implements SensorObserver {

        private Badge lastBadge;
        private int updateCount = 0;

        @Override
        public void update(Badge badge) {
            lastBadge = badge;
            updateCount++;
        }

        public Badge getLastBadge() {
            return lastBadge;
        }

        public int getUpdateCount() {
            return updateCount;
        }
    }

    // 1. A class implementing SensorObserver should be created successfully
    @Test
    public void testObserverCanBeCreated() {
        FakeSensorObserver observer = new FakeSensorObserver();

        assertNotNull(observer);
        assertTrue(observer instanceof SensorObserver);
    }

    // 2. Observer should begin with no received badge
    @Test
    public void testObserverInitialState() {
        FakeSensorObserver observer = new FakeSensorObserver();

        assertNull(observer.getLastBadge());
        assertEquals(0, observer.getUpdateCount());
    }

    // 3. Calling update should give the observer the badge
    @Test
    public void testUpdateReceivesBadge() {
        FakeSensorObserver observer = new FakeSensorObserver();
        Badge badge = new Badge("B001");

        observer.update(badge);

        assertEquals(badge, observer.getLastBadge());
    }

    // 4. Update count should increase when update is called
    @Test
    public void testUpdateCountIncreases() {
        FakeSensorObserver observer = new FakeSensorObserver();

        observer.update(new Badge("B001"));

        assertEquals(1, observer.getUpdateCount());
    }

    // 5. Multiple updates should all be counted
    @Test
    public void testMultipleUpdates() {
        FakeSensorObserver observer = new FakeSensorObserver();

        observer.update(new Badge("B001"));
        observer.update(new Badge("B002"));
        observer.update(new Badge("B003"));

        assertEquals(3, observer.getUpdateCount());
    }

    // 6. The most recently supplied badge should be stored
    @Test
    public void testMostRecentBadgeIsStored() {
        FakeSensorObserver observer = new FakeSensorObserver();

        Badge firstBadge = new Badge("FIRST");
        Badge secondBadge = new Badge("SECOND");

        observer.update(firstBadge);
        observer.update(secondBadge);

        assertEquals(secondBadge, observer.getLastBadge());
        assertEquals("SECOND", observer.getLastBadge().getBadgeId());
    }

    // 7. Two observers should maintain independent states
    @Test
    public void testObserversHaveIndependentState() {
        FakeSensorObserver firstObserver = new FakeSensorObserver();
        FakeSensorObserver secondObserver = new FakeSensorObserver();

        Badge firstBadge = new Badge("B100");
        Badge secondBadge = new Badge("B200");

        firstObserver.update(firstBadge);
        secondObserver.update(secondBadge);

        assertEquals(firstBadge, firstObserver.getLastBadge());
        assertEquals(secondBadge, secondObserver.getLastBadge());
        assertNotEquals(
                firstObserver.getLastBadge(),
                secondObserver.getLastBadge()
        );
    }

    // 8. Updating one observer should not affect another observer
    @Test
    public void testUpdatingOneObserverDoesNotUpdateAnother() {
        FakeSensorObserver firstObserver = new FakeSensorObserver();
        FakeSensorObserver secondObserver = new FakeSensorObserver();

        firstObserver.update(new Badge("B001"));

        assertEquals(1, firstObserver.getUpdateCount());
        assertEquals(0, secondObserver.getUpdateCount());
        assertNull(secondObserver.getLastBadge());
    }

    // 9. A null badge can still be passed through the interface
    @Test
    public void testUpdateWithNullBadge() {
        FakeSensorObserver observer = new FakeSensorObserver();

        assertDoesNotThrow(() -> observer.update(null));
        assertNull(observer.getLastBadge());
        assertEquals(1, observer.getUpdateCount());
    }

    // 10. Observer should correctly replace a previous badge with a new badge
    @Test
    public void testBadgeReplacementAfterUpdate() {
        FakeSensorObserver observer = new FakeSensorObserver();

        observer.update(new Badge("OLD"));
        assertEquals("OLD", observer.getLastBadge().getBadgeId());

        observer.update(new Badge("NEW"));

        assertEquals("NEW", observer.getLastBadge().getBadgeId());
        assertEquals(2, observer.getUpdateCount());
    }
}