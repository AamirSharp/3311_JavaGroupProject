package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SensorTest {
    private List<SensorObserver> observers;
    private Sensor sensor;
    private Room room;
    private Badge badge;

    @BeforeEach
    void setUp() {
    	observers = new ArrayList<>();
        room = new Room("B", "LAS", 9, "CLOSED");
        sensor = new Sensor("sens-000",room);
        badge = new Badge("bad-123");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(sensor);
    }

    @Test
    public void testSendData() {
        assertDoesNotThrow(() -> sensor.sendData());
    }

    @Test
    public void testSendNullIDData() {
        Sensor sensorNoID = new Sensor(null,room);
        assertDoesNotThrow(() -> sensorNoID.sendData());

    }

    @Test
    public void testScanBadge() {
        assertDoesNotThrow(() -> sensor.scanBadge(badge));
    }

    @Test
    public void testFindOccupancy() {
        assertDoesNotThrow(() -> sensor.findOccupancy());
    }

    @Test
    public void testNotifyWithRoomObserver() {
        sensor.addObserver(new Room("C", "LAS", 0, "OPEN"));
        assertDoesNotThrow(() -> sensor.notifyObservers(badge));
    }

    @Test
    public void testScanNullBadge() throws NullPointerException {
        assertThrows(NullPointerException.class, () -> sensor.scanBadge(null),"Scan badge unsuccessful, badge is null.");
    }

    @Test
    public void testSendNullRoomData() throws NullPointerException {
        Sensor sensorNoRoom = new Sensor("921",null);
        assertThrows(NullPointerException.class, () -> sensorNoRoom.sendData(),"Send data unsucessful, room is null.");

    }

    @Test
    public void testUpdateWithNullObserver() throws NullPointerException{
        sensor.addObserver(null);
        assertThrows(NullPointerException.class, () -> sensor.notifyObservers(badge),"Notifying obsevers unsucessful, obsever added is null.");
    }

    @Test
    public void testFindOccupancyNullRoom() throws NullPointerException {
        Sensor sensorNoRoom = new Sensor("921", null);
        assertThrows(NullPointerException.class, () -> sensorNoRoom.findOccupancy(),"Finding occupancy uncessful, room is null.");
    }

}

