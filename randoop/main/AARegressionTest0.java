package main;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AARegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test001");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean4 = roomListIterator3.hasMore();
        java.lang.Class<?> wildcardClass5 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test002");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        java.lang.Class<?> wildcardClass4 = roomList1.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test003");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass3 = roomList0.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test004");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test005");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test006");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test007");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        java.lang.Class<?> wildcardClass5 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test008");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.Badge badge3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test009");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test010");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test011");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test012");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test013");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test014");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test015");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test016");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        java.lang.Class<?> wildcardClass7 = sensor2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test017");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test018");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test019");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        java.lang.Class<?> wildcardClass5 = sensor2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test020");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        java.lang.Class<?> wildcardClass5 = roomListIterator4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test021");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass7 = roomIterator6.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test022");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test023");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test024");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.Room room2 = null;
        roomList0.addRoom(room2);
        java.lang.Class<?> wildcardClass4 = roomList0.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test025");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test026");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test027");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test028");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = room4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test029");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test030");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test031");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test032");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test033");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test034");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass2 = roomIterator1.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test035");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test036");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test037");
        java.util.List<main.Room> roomList0 = null;
        main.RoomListIterator roomListIterator1 = new main.RoomListIterator(roomList0);
        // The following exception was thrown during execution in test generation
        try {
            main.Room room2 = roomListIterator1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.size()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test038");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        java.lang.Class<?> wildcardClass4 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test039");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.Room room2 = null;
        roomList0.addRoom(room2);
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        main.RoomIterator roomIterator7 = roomList0.createIterator();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test040");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        java.lang.Class<?> wildcardClass6 = roomList0.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test041");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test042");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.Badge badge11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test043");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        java.lang.Class<?> wildcardClass6 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test044");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        boolean boolean8 = roomListIterator3.hasMore();
        main.Room room9 = roomListIterator3.getNext();
        boolean boolean10 = roomListIterator3.hasMore();
        boolean boolean11 = roomListIterator3.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(room9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test045");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test046");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test047");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass5 = roomIterator4.getClass();
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test048");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test049");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test050");
        java.util.List<main.Room> roomList0 = null;
        main.RoomListIterator roomListIterator1 = new main.RoomListIterator(roomList0);
        java.lang.Class<?> wildcardClass2 = roomListIterator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test051");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.Room room2 = null;
        roomList0.addRoom(room2);
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass5 = roomIterator4.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test052");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.Badge badge11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test053");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test054");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        main.Room room5 = roomListIterator3.getNext();
        java.lang.Class<?> wildcardClass6 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test055");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test056");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test057");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test058");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.Room room5 = null;
        roomList0.addRoom(room5);
        main.Room room7 = null;
        roomList0.addRoom(room7);
        main.RoomIterator roomIterator9 = roomList0.createIterator();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test059");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        boolean boolean8 = roomListIterator3.hasMore();
        main.Room room9 = roomListIterator3.getNext();
        java.lang.Class<?> wildcardClass10 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(room9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test060");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        main.Room room8 = roomListIterator3.getNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = room8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertNull(room8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test061");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        java.lang.Class<?> wildcardClass9 = sensor2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test062");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test063");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        main.Room room7 = null;
        roomList0.addRoom(room7);
        main.Room room9 = null;
        roomList0.addRoom(room9);
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test064");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room5 = roomListIterator4.getNext();
        boolean boolean6 = roomListIterator4.hasMore();
        main.Room room7 = roomListIterator4.getNext();
        boolean boolean8 = roomListIterator4.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test065");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test066");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test067");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.Room room6 = null;
        roomList0.addRoom(room6);
        main.RoomIterator roomIterator8 = roomList0.createIterator();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test068");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        sensor2.notifyObservers(badge7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test069");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test070");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test071");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test072");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test073");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        main.Room room8 = roomListIterator3.getNext();
        boolean boolean9 = roomListIterator3.hasMore();
        java.lang.Class<?> wildcardClass10 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertNull(room8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test074");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.SensorObserver sensorObserver11 = null;
        sensor2.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test075");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        sensor2.notifyObservers(badge7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test076");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        sensor2.notifyObservers(badge7);
        main.Badge badge9 = null;
        sensor2.notifyObservers(badge9);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test077");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.Room room3 = null;
        roomList0.addRoom(room3);
        main.RoomIterator roomIterator5 = roomList0.createIterator();
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test078");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        java.lang.Class<?> wildcardClass7 = sensor2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test079");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        main.RoomIterator roomIterator7 = roomList0.createIterator();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test080");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("hi!", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test081");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean4 = roomListIterator3.hasMore();
        main.Room room5 = roomListIterator3.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(room5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test082");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        main.RoomIterator roomIterator7 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass8 = roomIterator7.getClass();
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test083");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        boolean boolean7 = roomListIterator3.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test084");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test085");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean5 = roomListIterator4.hasMore();
        boolean boolean6 = roomListIterator4.hasMore();
        boolean boolean7 = roomListIterator4.hasMore();
        java.lang.Class<?> wildcardClass8 = roomListIterator4.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test086");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.RoomIterator roomIterator5 = roomList0.createIterator();
        main.Room room6 = null;
        roomList0.addRoom(room6);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test087");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.Room room2 = null;
        roomList0.addRoom(room2);
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass5 = roomList0.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test088");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.Badge badge11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test089");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        sensor2.notifyObservers(badge7);
        main.Badge badge9 = null;
        sensor2.notifyObservers(badge9);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test090");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        java.lang.Class<?> wildcardClass4 = roomIterator3.getClass();
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test091");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.Badge badge5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test092");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.Room room5 = null;
        roomList0.addRoom(room5);
        main.Room room7 = null;
        roomList0.addRoom(room7);
        java.lang.Class<?> wildcardClass9 = roomList0.getClass();
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test093");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        java.lang.Class<?> wildcardClass11 = sensor2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test094");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.Room room4 = null;
        roomList0.addRoom(room4);
        main.RoomIterator roomIterator6 = roomList0.createIterator();
        main.RoomIterator roomIterator7 = roomList0.createIterator();
        main.RoomIterator roomIterator8 = roomList0.createIterator();
        main.Room room9 = null;
        roomList0.addRoom(room9);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test095");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test096");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test097");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        main.Room room8 = roomListIterator3.getNext();
        boolean boolean9 = roomListIterator3.hasMore();
        main.Room room10 = roomListIterator3.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertNull(room8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(room10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test098");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.Badge badge7 = null;
        sensor2.notifyObservers(badge7);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test099");
        main.RoomList roomList0 = new main.RoomList();
        main.RoomIterator roomIterator1 = roomList0.createIterator();
        main.RoomIterator roomIterator2 = roomList0.createIterator();
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.Room room5 = null;
        roomList0.addRoom(room5);
        main.Room room7 = null;
        roomList0.addRoom(room7);
        main.Room room9 = null;
        roomList0.addRoom(room9);
        org.junit.Assert.assertNotNull(roomIterator1);
        org.junit.Assert.assertNotNull(roomIterator2);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test100");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        boolean boolean8 = roomListIterator3.hasMore();
        boolean boolean9 = roomListIterator3.hasMore();
        main.Room room10 = roomListIterator3.getNext();
        main.Room room11 = roomListIterator3.getNext();
        boolean boolean12 = roomListIterator3.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(room10);
        org.junit.Assert.assertNull(room11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test101");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.Badge badge7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test102");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean4 = roomListIterator3.hasMore();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test103");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room5 = roomListIterator4.getNext();
        main.Room room6 = roomListIterator4.getNext();
        main.Room room7 = roomListIterator4.getNext();
        main.Room room8 = roomListIterator4.getNext();
        boolean boolean9 = roomListIterator4.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertNull(room6);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertNull(room8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test104");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator5 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator6 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator7 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room8 = roomListIterator7.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test105");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test106");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.Badge badge9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.scanBadge(badge9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Badge.getBadgeId()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test107");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        boolean boolean8 = roomListIterator3.hasMore();
        boolean boolean9 = roomListIterator3.hasMore();
        main.Room room10 = roomListIterator3.getNext();
        boolean boolean11 = roomListIterator3.hasMore();
        boolean boolean12 = roomListIterator3.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(room10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test108");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.Badge badge3 = null;
        sensor2.notifyObservers(badge3);
        main.Badge badge5 = null;
        sensor2.notifyObservers(badge5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.findOccupancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test109");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean5 = roomListIterator4.hasMore();
        main.Room room6 = roomListIterator4.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(room6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test110");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        boolean boolean5 = roomListIterator4.hasMore();
        boolean boolean6 = roomListIterator4.hasMore();
        main.Room room7 = roomListIterator4.getNext();
        main.Room room8 = roomListIterator4.getNext();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertNull(room8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test111");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.Room room5 = null;
        roomList0.addRoom(room5);
        main.Room room7 = null;
        roomList0.addRoom(room7);
        main.Room room9 = null;
        roomList0.addRoom(room9);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test112");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator4 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.RoomListIterator roomListIterator5 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room6 = roomListIterator5.getNext();
        boolean boolean7 = roomListIterator5.hasMore();
        boolean boolean8 = roomListIterator5.hasMore();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test113");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.SensorObserver sensorObserver11 = null;
        sensor2.addObserver(sensorObserver11);
        main.SensorObserver sensorObserver13 = null;
        sensor2.addObserver(sensorObserver13);
        main.Badge badge15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.notifyObservers(badge15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.SensorObserver.update(main.Badge)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test114");
        main.Room room1 = null;
        main.Sensor sensor2 = new main.Sensor("", room1);
        main.SensorObserver sensorObserver3 = null;
        sensor2.addObserver(sensorObserver3);
        main.SensorObserver sensorObserver5 = null;
        sensor2.addObserver(sensorObserver5);
        main.SensorObserver sensorObserver7 = null;
        sensor2.addObserver(sensorObserver7);
        main.SensorObserver sensorObserver9 = null;
        sensor2.addObserver(sensorObserver9);
        main.SensorObserver sensorObserver11 = null;
        sensor2.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            sensor2.sendData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.getRoomNumber()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test115");
        main.RoomList roomList0 = new main.RoomList();
        main.Room room1 = null;
        roomList0.addRoom(room1);
        main.RoomIterator roomIterator3 = roomList0.createIterator();
        main.RoomIterator roomIterator4 = roomList0.createIterator();
        main.Room room5 = null;
        roomList0.addRoom(room5);
        main.RoomIterator roomIterator7 = roomList0.createIterator();
        main.Room room8 = null;
        roomList0.addRoom(room8);
        main.Room room10 = null;
        roomList0.addRoom(room10);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AHRegressionTest0.test116");
        main.Room[] roomArray0 = new main.Room[] {};
        java.util.ArrayList<main.Room> roomList1 = new java.util.ArrayList<main.Room>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<main.Room>) roomList1, roomArray0);
        main.RoomListIterator roomListIterator3 = new main.RoomListIterator((java.util.List<main.Room>) roomList1);
        main.Room room4 = roomListIterator3.getNext();
        boolean boolean5 = roomListIterator3.hasMore();
        boolean boolean6 = roomListIterator3.hasMore();
        main.Room room7 = roomListIterator3.getNext();
        boolean boolean8 = roomListIterator3.hasMore();
        boolean boolean9 = roomListIterator3.hasMore();
        java.lang.Class<?> wildcardClass10 = roomListIterator3.getClass();
        org.junit.Assert.assertNotNull(roomArray0);
        org.junit.Assert.assertArrayEquals(roomArray0, new main.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(room7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

