package main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AISensorTest {
   // Fake Room class for testing
   class FakeRoom extends Room {
       private int roomNumberCallCount = 0;
       public FakeRoom() {
           super(null, null, 0);
       }
       @Override
       public String getRoomNumber() {
           roomNumberCallCount++;
           return "101";
       }
       public int getCallCount() {
           return roomNumberCallCount;
       }
   }
   // Fake Badge class for testing
   class FakeBadge extends Badge {
       private String badgeId;
       private int callCount = 0;
       public FakeBadge(String badgeId) {
           super(badgeId);
           this.badgeId = badgeId;
       }
       @Override
       public String getBadgeId() {
           callCount++;
           return badgeId;
       }
       public int getCallCount() {
           return callCount;
       }
   }
   // Fake Observer class for testing
   class FakeObserver implements SensorObserver {
       private Badge receivedBadge;
       private int updateCount = 0;
       @Override
       public void update(Badge badge) {
           receivedBadge = badge;
           updateCount++;
       }
       public Badge getReceivedBadge() {
           return receivedBadge;
       }
       public int getUpdateCount() {
           return updateCount;
       }
   }
   @Test
   public void testSensorConstructor() {
       FakeRoom room = new FakeRoom();
       Sensor sensor = new Sensor("S001", room);
       assertNotNull(sensor);
   }
   @Test
   public void testFindOccupancyCallsRoomNumber() {
       FakeRoom room = new FakeRoom();
       Sensor sensor = new Sensor("S001", room);
       sensor.findOccupancy();
       assertEquals(1, room.getCallCount());
   }
   @Test
   public void testSendDataCallsRoomNumber() {
       FakeRoom room = new FakeRoom();
       Sensor sensor = new Sensor("S001", room);
       sensor.sendData();
       assertEquals(1, room.getCallCount());
   }
   @Test
   public void testScanBadgeCallsBadgeAndNotifiesObserver() {
       FakeRoom room = new FakeRoom();
       FakeBadge badge = new FakeBadge("B001");
       FakeObserver observer = new FakeObserver();
       Sensor sensor = new Sensor("S001", room);
       sensor.addObserver(observer);
       sensor.scanBadge(badge);
       assertEquals(1, badge.getCallCount());
       assertEquals(1, observer.getUpdateCount());
       assertEquals(badge, observer.getReceivedBadge());
   }
   @Test
   public void testAddObserver() {
       FakeRoom room = new FakeRoom();
       FakeBadge badge = new FakeBadge("B002");
       FakeObserver observer = new FakeObserver();
       Sensor sensor = new Sensor("S001", room);
       sensor.addObserver(observer);
       sensor.notifyObservers(badge);
       assertEquals(1, observer.getUpdateCount());
   }
   @Test
   public void testMultipleObserversAreNotified() {
       FakeRoom room = new FakeRoom();
       FakeBadge badge = new FakeBadge("B003");
       FakeObserver observer1 = new FakeObserver();
       FakeObserver observer2 = new FakeObserver();
       Sensor sensor = new Sensor("S001", room);
       sensor.addObserver(observer1);
       sensor.addObserver(observer2);
       sensor.notifyObservers(badge);
       assertEquals(1, observer1.getUpdateCount());
       assertEquals(1, observer2.getUpdateCount());
       assertEquals(badge, observer1.getReceivedBadge());
       assertEquals(badge, observer2.getReceivedBadge());
   }
   @Test
   public void testNotifyObserversWithNoObservers() {
       FakeRoom room = new FakeRoom();
       FakeBadge badge = new FakeBadge("B004");
       Sensor sensor = new Sensor("S001", room);
       assertDoesNotThrow(() -> sensor.notifyObservers(badge));
   }
}



