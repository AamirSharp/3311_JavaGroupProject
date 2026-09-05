package main;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test001");
        main.Room room0 = null;
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = main.Booking.roomAvailable(room0, localDateTime1, localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking20 = admin12.booking(room17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking14.editBooking(localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = booking13.extendBooking(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking14.editBooking(localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = admin12.getHourlyRate();
        main.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        main.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.closeRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking13.editBooking(localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getRoleName();
        main.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Admin" + "'", str17, "Admin");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = admin12.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = admin12.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = booking13.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.Class<?> wildcardClass14 = admin12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking13.editBooking(localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking14.editBooking(localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        java.lang.String str21 = admin12.getRoleName();
        main.Room room22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking25 = admin12.booking(room22, localDateTime23, localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Admin" + "'", str21, "Admin");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking14.editBooking(localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        main.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getPassword();
        main.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.closeRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getEmail();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        boolean boolean8 = admin4.login("");
        main.RoomIterator roomIterator9 = admin4.getRoomIterator();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = booking14.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        java.lang.Class<?> wildcardClass14 = booking13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking13.editBooking(localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking13.editBooking(localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.Admin admin4 = new main.Admin("Standard Room Booking (N/A)", "Standard Room Booking (N/A)", "Admin", "");
        boolean boolean5 = admin4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        java.lang.String str16 = admin12.getAdminId();
        main.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.Class<?> wildcardClass3 = availableState0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        double double20 = admin12.getHourlyRate();
        double double21 = admin12.getHourlyRate();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.lang.String str16 = booking13.getBookingId();
        main.Badge badge18 = new main.Badge("Admin");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        java.lang.String str17 = booking14.getBookingId();
        boolean boolean18 = booking14.depositBack();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking14.editBooking(localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.getDeposit();
        java.lang.String str18 = booking13.getBookingId();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        double double15 = booking13.getTotal();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getEndTime();
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking13.extendBooking(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.cost();
        double double18 = booking13.getTotal();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        main.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        double double7 = admin4.getHourlyRate();
        boolean boolean9 = admin4.login("");
        double double10 = admin4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        availableState0.enable(room1);
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) ' ', (double) (short) 1, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking14.editBooking(localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        main.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        main.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getEmail();
        double double6 = admin4.getHourlyRate();
        double double7 = admin4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking13.editBooking(localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(room14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getPassword();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        java.lang.Class<?> wildcardClass16 = admin12.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        booking13.createBooking();
        booking13.createBooking();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        main.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        java.lang.String str16 = admin12.getAdminId();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        java.lang.String str17 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.Class<?> wildcardClass5 = admin4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        java.lang.String str21 = admin12.getRoleName();
        main.RoomIterator roomIterator22 = admin12.getRoomIterator();
        main.RoomIterator roomIterator23 = admin12.getRoomIterator();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Admin" + "'", str21, "Admin");
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertNotNull(roomIterator23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        double double17 = booking14.getDeposit();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        main.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        java.lang.String str19 = admin12.getAdminId();
        main.Room room20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking23 = admin12.booking(room20, localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        java.lang.String str15 = booking14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking14.extendBooking(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Standard Room Booking (N/A)" + "'", str15, "Standard Room Booking (N/A)");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        double double7 = admin4.getHourlyRate();
        java.lang.String str8 = admin4.getEmail();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.getTotal();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime15 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.lang.String str16 = booking13.getBookingId();
        main.Badge badge18 = new main.Badge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        boolean boolean17 = admin12.login("hi!");
        java.lang.String str18 = admin12.getId();
        double double19 = admin12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        main.Room room6 = null;
        admin4.addRoom(room6);
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = admin4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) ' ', (double) (short) 1, localDateTime7, (main.User) admin12);
        java.lang.String str15 = booking14.getBookingId();
        double double16 = booking14.getTotal();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Standard Room Booking (N/A)" + "'", str15, "Standard Room Booking (N/A)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime15 = booking13.getStartTime();
        main.Room room16 = booking13.getRoom();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(room16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        java.lang.String str17 = booking14.getBookingId();
        boolean boolean18 = booking14.depositBack();
        java.lang.String str19 = booking14.getBookingId();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.RoomIterator roomIterator22 = admin20.getRoomIterator();
        main.Room room23 = null;
        admin20.addRoom(room23);
        main.Room room25 = null;
        admin20.addRoom(room25);
        admin20.logout();
        java.lang.String str28 = admin20.getEmail();
        main.Booking booking29 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) (short) 0, (double) (short) 0, localDateTime7, (main.User) admin20);
        java.lang.String str30 = admin20.getId();
        boolean boolean31 = admin20.isVerified();
        main.Room room32 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin20.disableRoom(room32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        main.Payment payment17 = null;
        booking14.setPayment(payment17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking14.editBooking(localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        main.RoomIterator roomIterator6 = admin4.getRoomIterator();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertNotNull(roomIterator6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        java.lang.String str19 = booking13.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking13.extendBooking(localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        main.RoomIterator roomIterator16 = admin12.getRoomIterator();
        java.lang.String str17 = admin12.getPassword();
        main.Room room18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking21 = admin12.booking(room18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(roomIterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        java.lang.String str4 = availableState0.getStatus();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        main.RoomIterator roomIterator16 = admin12.getRoomIterator();
        main.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(roomIterator16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        admin12.logout();
        main.RoomIterator roomIterator17 = admin12.getRoomIterator();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertNotNull(roomIterator17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        main.RoomIterator roomIterator6 = admin4.getRoomIterator();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertNotNull(roomIterator6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.getDeposit();
        boolean boolean18 = booking13.depositBack();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.cost();
        main.Badge badge19 = new main.Badge("hi!");
        java.lang.String str20 = badge19.getBadgeId();
        java.lang.String str21 = badge19.getBadgeId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking13.checkIn(badge19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.Admin admin4 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        admin4.logout();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        main.User user18 = booking13.getBookedBy();
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking13.extendBooking(localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        booking13.createBooking();
        java.lang.Class<?> wildcardClass17 = booking13.getClass();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getEmail();
        java.lang.String str6 = admin4.getId();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        main.User user18 = booking13.getBookedBy();
        java.time.LocalDateTime localDateTime19 = booking13.getStartTime();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        main.User user18 = booking13.getBookedBy();
        java.lang.String str19 = booking13.getBookingId();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        booking13.createBooking();
        java.time.LocalDateTime localDateTime17 = booking13.getStartTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.Badge badge1 = new main.Badge("Admin");
        java.lang.Class<?> wildcardClass2 = badge1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.User user18 = booking13.getBookedBy();
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking13.extendBooking(localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.lang.String str17 = booking13.getDescription();
        main.Payment payment18 = booking13.getPayment();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(payment18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Room room14 = null;
        admin12.addRoom(room14);
        main.Booking booking16 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "", (double) 1L, 0.0d, localDateTime7, (main.User) admin12);
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking20 = admin12.booking(room17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) ' ', (double) (short) 1, localDateTime7, (main.User) admin12);
        boolean boolean16 = admin12.login("Admin");
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking20 = admin12.booking(room17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        java.lang.String str6 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Admin" + "'", str6, "Admin");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        java.lang.String str16 = booking14.getDescription();
        java.lang.String str17 = booking14.getStatus();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Standard Room Booking (N/A)" + "'", str16, "Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        booking13.createBooking();
        java.lang.String str17 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.lang.String str16 = booking13.getBookingId();
        java.lang.String str17 = booking13.getDescription();
        main.Room room18 = booking13.getRoom();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(room18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getEndTime();
        boolean boolean15 = booking13.depositBack();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        boolean boolean20 = admin12.isVerified();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.User user18 = booking13.getBookedBy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getStartTime();
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        booking13.createBooking();
        main.Badge badge18 = new main.Badge("AVAILABLE");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        main.Room room16 = booking14.getRoom();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(room16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = localDateTime17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.Admin admin4 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "Standard Room Booking (N/A)");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.cost();
        java.lang.String str18 = booking13.getBookingId();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.Payment payment22 = booking21.getPayment();
        double double23 = booking21.getDeposit();
        double double24 = booking21.getTotal();
        java.time.LocalDateTime localDateTime25 = booking21.getCheckInTime();
        main.User user26 = booking21.getBookedBy();
        main.Booking booking27 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 100, (double) 0.0f, localDateTime7, user26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = booking27.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.Admin admin4 = new main.Admin("AVAILABLE", "Standard Room Booking (N/A)", "Standard Room Booking (N/A)", "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getEndTime();
        booking13.createBooking();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking13.extendBooking(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        boolean boolean17 = booking13.depositBack();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.lang.String str16 = booking13.getBookingId();
        main.Room room17 = booking13.getRoom();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(room17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        java.lang.String str4 = availableState0.getStatus();
        java.lang.String str5 = availableState0.getStatus();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVAILABLE" + "'", str5, "AVAILABLE");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        java.lang.String str21 = admin12.getEmail();
        java.lang.String str22 = admin12.getPassword();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking13.extendBooking(localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        availableState0.enable(room1);
        main.Room room3 = null;
        availableState0.enable(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        admin12.logout();
        java.lang.String str16 = admin12.getAdminId();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        admin20.logout();
        main.Booking booking22 = new main.Booking("", room9, localDateTime10, localDateTime11, "hi!", (double) '4', (double) 0, localDateTime15, (main.User) admin20);
        java.lang.String str23 = admin20.getEmail();
        main.Booking booking24 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "hi!", 0.0d, (double) (-1L), localDateTime7, (main.User) admin20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        booking13.createBooking();
        java.lang.String str18 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Standard Room Booking (N/A)" + "'", str18, "Standard Room Booking (N/A)");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getDeposit();
        java.lang.String str17 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getEmail();
        double double6 = admin4.getHourlyRate();
        java.lang.String str7 = admin4.getRoleName();
        java.lang.String str8 = admin4.getRoleName();
        main.RoomIterator roomIterator9 = admin4.getRoomIterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Admin" + "'", str7, "Admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Admin" + "'", str8, "Admin");
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        java.lang.Class<?> wildcardClass15 = admin12.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        boolean boolean16 = admin12.isVerified();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        availableState0.enable(room4);
        java.lang.String str6 = availableState0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AVAILABLE" + "'", str6, "AVAILABLE");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime23 = null;
        main.Admin admin28 = new main.Admin("", "hi!", "", "");
        main.Booking booking29 = new main.Booking("hi!", room17, localDateTime18, localDateTime19, "", (double) 'a', (double) 'a', localDateTime23, (main.User) admin28);
        main.RoomIterator roomIterator30 = admin28.getRoomIterator();
        main.Room room31 = null;
        admin28.addRoom(room31);
        main.Room room33 = null;
        admin28.addRoom(room33);
        admin28.logout();
        java.lang.String str36 = admin28.getEmail();
        main.Booking booking37 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "AVAILABLE", (double) (short) 0, (double) (short) 0, localDateTime15, (main.User) admin28);
        java.lang.String str38 = admin28.getId();
        boolean boolean39 = admin28.isVerified();
        main.Booking booking40 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "Admin", (double) (byte) 10, (double) 0, localDateTime7, (main.User) admin28);
        java.time.LocalDateTime localDateTime41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = booking40.extendBooking(localDateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        double double20 = admin12.getHourlyRate();
        boolean boolean21 = admin12.isVerified();
        main.Room room22 = null;
        admin12.addRoom(room22);
        main.Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        main.Badge badge19 = new main.Badge("AVAILABLE");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking13.checkIn(badge19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) ' ', (double) (short) 1, localDateTime7, (main.User) admin12);
        java.lang.String str15 = booking14.getBookingId();
        main.Room room16 = booking14.getRoom();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Standard Room Booking (N/A)" + "'", str15, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(room16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = null;
        booking13.setPayment(payment14);
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        main.Payment payment19 = null;
        booking13.setPayment(payment19);
        java.time.LocalDateTime localDateTime21 = booking13.getEndTime();
        java.time.LocalDateTime localDateTime22 = booking13.getCheckInTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        availableState0.enable(room1);
        main.Room room3 = null;
        availableState0.enable(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        boolean boolean15 = booking13.depositBack();
        main.Badge badge17 = new main.Badge("Standard Room Booking (N/A)");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking13.checkIn(badge17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        boolean boolean16 = booking13.depositBack();
        main.Payment payment17 = booking13.getPayment();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(payment17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        main.Payment payment17 = null;
        booking14.setPayment(payment17);
        java.time.LocalDateTime localDateTime19 = booking14.getStartTime();
        boolean boolean20 = booking14.depositBack();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        java.lang.String str16 = admin12.getRoleName();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Admin" + "'", str16, "Admin");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime23 = null;
        main.Admin admin28 = new main.Admin("", "hi!", "", "");
        main.Booking booking29 = new main.Booking("hi!", room17, localDateTime18, localDateTime19, "", (double) 'a', (double) 'a', localDateTime23, (main.User) admin28);
        main.RoomIterator roomIterator30 = admin28.getRoomIterator();
        main.Room room31 = null;
        admin28.addRoom(room31);
        main.Room room33 = null;
        admin28.addRoom(room33);
        admin28.logout();
        java.lang.String str36 = admin28.getEmail();
        main.Booking booking37 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "AVAILABLE", (double) (short) 0, (double) (short) 0, localDateTime15, (main.User) admin28);
        java.lang.String str38 = admin28.getId();
        boolean boolean39 = admin28.isVerified();
        main.Booking booking40 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "Admin", (double) (byte) 10, (double) 0, localDateTime7, (main.User) admin28);
        java.lang.String str41 = admin28.getAdminId();
        org.junit.Assert.assertNotNull(roomIterator30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.Admin admin4 = new main.Admin("Standard Room Booking (N/A)", "Standard Room Booking (N/A)", "Admin", "");
        main.Room room5 = null;
        admin4.addRoom(room5);
        java.lang.String str7 = admin4.getRoleName();
        java.lang.String str8 = admin4.getId();
        java.lang.String str9 = admin4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Admin" + "'", str7, "Admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Standard Room Booking (N/A)" + "'", str8, "Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Standard Room Booking (N/A)" + "'", str9, "Standard Room Booking (N/A)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        availableState0.enable(room4);
        main.Room room6 = null;
        availableState0.enable(room6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        main.Room room6 = null;
        admin4.addRoom(room6);
        admin4.logout();
        java.lang.String str9 = admin4.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        main.Payment payment17 = null;
        booking14.setPayment(payment17);
        java.time.LocalDateTime localDateTime19 = booking14.getStartTime();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking14.editBooking(localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getEndTime();
        main.User user18 = booking13.getBookedBy();
        java.lang.String str19 = user18.getId();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) ' ', (double) (short) 1, localDateTime7, (main.User) admin12);
        boolean boolean16 = admin12.login("Admin");
        java.lang.String str17 = admin12.getRoleName();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Admin" + "'", str17, "Admin");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        java.lang.String str16 = admin12.getRoleName();
        main.Room room17 = null;
        admin12.addRoom(room17);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Admin" + "'", str16, "Admin");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.Admin admin4 = new main.Admin("Admin", "Admin", "", "AVAILABLE");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.User user18 = booking13.getBookedBy();
        java.lang.Class<?> wildcardClass19 = user18.getClass();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        java.lang.String str16 = booking14.getDescription();
        booking14.createBooking();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Standard Room Booking (N/A)" + "'", str16, "Standard Room Booking (N/A)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime23 = null;
        main.Admin admin28 = new main.Admin("", "hi!", "", "");
        main.Booking booking29 = new main.Booking("hi!", room17, localDateTime18, localDateTime19, "", (double) 'a', (double) 'a', localDateTime23, (main.User) admin28);
        main.RoomIterator roomIterator30 = admin28.getRoomIterator();
        main.Booking booking31 = new main.Booking("Standard Room Booking (N/A)", room9, localDateTime10, localDateTime11, "Admin", (double) 0L, (-1.0d), localDateTime15, (main.User) admin28);
        double double32 = admin28.getHourlyRate();
        main.Booking booking33 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) (byte) 0, (double) (short) 10, localDateTime7, (main.User) admin28);
        org.junit.Assert.assertNotNull(roomIterator30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        java.lang.String str18 = booking13.getBookingId();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        boolean boolean16 = admin12.login("Admin");
        main.RoomIterator roomIterator17 = admin12.getRoomIterator();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(roomIterator17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getEmail();
        main.RoomIterator roomIterator16 = admin12.getRoomIterator();
        java.lang.String str17 = admin12.getId();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(roomIterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.RoomIterator roomIterator22 = admin20.getRoomIterator();
        main.Room room23 = null;
        admin20.addRoom(room23);
        main.Room room25 = null;
        admin20.addRoom(room25);
        admin20.logout();
        java.lang.String str28 = admin20.getEmail();
        main.Booking booking29 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) (short) 0, (double) (short) 0, localDateTime7, (main.User) admin20);
        boolean boolean30 = booking29.depositBack();
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Room room14 = null;
        admin12.addRoom(room14);
        main.Booking booking16 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "", (double) 1L, 0.0d, localDateTime7, (main.User) admin12);
        boolean boolean17 = admin12.isVerified();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.Admin admin4 = new main.Admin("", "Standard Room Booking (N/A)", "", "");
        main.RoomIterator roomIterator5 = admin4.getRoomIterator();
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.Admin admin4 = new main.Admin("AVAILABLE", "hi!", "AVAILABLE", "hi!");
        java.lang.String str5 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = admin12.getHourlyRate();
        boolean boolean16 = admin12.isVerified();
        double double17 = admin12.getHourlyRate();
        java.lang.String str18 = admin12.getAdminId();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getRoleName();
        java.lang.String str18 = admin12.getId();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Admin" + "'", str17, "Admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        main.Payment payment17 = null;
        booking13.setPayment(payment17);
        main.Payment payment19 = booking13.getPayment();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.time.LocalDateTime localDateTime15 = booking13.getEndTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        main.Room room16 = booking14.getRoom();
        java.lang.String str17 = booking14.getStatus();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(room16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        boolean boolean17 = admin12.login("hi!");
        java.lang.String str18 = admin12.getRoleName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Admin" + "'", str18, "Admin");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        admin12.logout();
        double double16 = admin12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        main.Payment payment16 = booking14.getPayment();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(payment16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime15 = booking13.getCheckInTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking13.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        main.Room room16 = null;
        admin12.addRoom(room16);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        main.Payment payment19 = null;
        booking13.setPayment(payment19);
        java.time.LocalDateTime localDateTime21 = booking13.getCheckInTime();
        main.User user22 = booking13.getBookedBy();
        java.time.LocalDateTime localDateTime23 = booking13.getEndTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        double double17 = booking13.getDeposit();
        double double18 = booking13.cost();
        java.lang.String str19 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        boolean boolean17 = admin12.login("Standard Room Booking (N/A)");
        boolean boolean19 = admin12.login("Admin");
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        availableState0.enable(room4);
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        admin12.logout();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        main.Room room16 = null;
        admin12.addRoom(room16);
        main.Room room18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking21 = admin12.booking(room18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.Admin admin4 = new main.Admin("hi!", "", "hi!", "hi!");
        double double5 = admin4.getHourlyRate();
        java.lang.String str6 = admin4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        java.lang.String str15 = admin12.getRoleName();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        java.lang.String str6 = admin4.getAdminId();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = admin4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.User user18 = booking13.getBookedBy();
        main.Payment payment19 = null;
        booking13.setPayment(payment19);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        java.lang.String str21 = admin12.getRoleName();
        java.lang.String str22 = admin12.getId();
        main.Room room23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking26 = admin12.booking(room23, localDateTime24, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Admin" + "'", str21, "Admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        double double20 = admin12.getHourlyRate();
        main.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        java.lang.String str15 = booking14.getDescription();
        main.Payment payment16 = booking14.getPayment();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Standard Room Booking (N/A)" + "'", str15, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(payment16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        double double7 = admin4.getHourlyRate();
        java.lang.String str8 = admin4.getRoleName();
        java.lang.String str9 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Admin" + "'", str8, "Admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Admin" + "'", str9, "Admin");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        main.RoomIterator roomIterator6 = admin4.getRoomIterator();
        admin4.logout();
        boolean boolean9 = admin4.login("Standard Room Booking (N/A)");
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = admin4.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.Admin admin4 = new main.Admin("Admin", "", "Standard Room Booking (N/A)", "Standard Room Booking (N/A)");
        java.lang.Class<?> wildcardClass5 = admin4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime23 = null;
        main.Admin admin28 = new main.Admin("", "hi!", "", "");
        main.Booking booking29 = new main.Booking("hi!", room17, localDateTime18, localDateTime19, "", (double) 'a', (double) 'a', localDateTime23, (main.User) admin28);
        main.RoomIterator roomIterator30 = admin28.getRoomIterator();
        main.Room room31 = null;
        admin28.addRoom(room31);
        main.Room room33 = null;
        admin28.addRoom(room33);
        admin28.logout();
        java.lang.String str36 = admin28.getEmail();
        main.Booking booking37 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "AVAILABLE", (double) (short) 0, (double) (short) 0, localDateTime15, (main.User) admin28);
        java.lang.String str38 = admin28.getId();
        boolean boolean39 = admin28.isVerified();
        main.Booking booking40 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "Admin", (double) (byte) 10, (double) 0, localDateTime7, (main.User) admin28);
        java.lang.Class<?> wildcardClass41 = booking40.getClass();
        org.junit.Assert.assertNotNull(roomIterator30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        availableState0.enable(room1);
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        java.lang.String str19 = admin12.getAdminId();
        main.Room room20 = null;
        admin12.addRoom(room20);
        double double22 = admin12.getHourlyRate();
        boolean boolean23 = admin12.isVerified();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        java.lang.String str17 = booking14.getStatus();
        main.Room room18 = booking14.getRoom();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(room18);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.Payment payment22 = booking21.getPayment();
        double double23 = booking21.getDeposit();
        double double24 = booking21.getTotal();
        java.time.LocalDateTime localDateTime25 = booking21.getCheckInTime();
        main.User user26 = booking21.getBookedBy();
        main.Booking booking27 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 100, (double) 0.0f, localDateTime7, user26);
        main.User user28 = booking27.getBookedBy();
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        main.Payment payment17 = booking13.getPayment();
        java.time.LocalDateTime localDateTime18 = booking13.getEndTime();
        boolean boolean19 = booking13.depositBack();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        java.lang.String str6 = admin4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        main.Payment payment17 = booking13.getPayment();
        java.time.LocalDateTime localDateTime18 = booking13.getEndTime();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking13.editBooking(localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        java.lang.String str7 = admin4.getRoleName();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin4.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Admin" + "'", str7, "Admin");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getAdminId();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        java.lang.String str2 = availableState0.getStatus();
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AVAILABLE" + "'", str2, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        double double7 = admin4.getHourlyRate();
        java.lang.String str8 = admin4.getEmail();
        double double9 = admin4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getEmail();
        main.RoomIterator roomIterator16 = admin12.getRoomIterator();
        boolean boolean17 = admin12.isVerified();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(roomIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        boolean boolean21 = admin12.login("Standard Room Booking (N/A)");
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.Admin admin4 = new main.Admin("hi!", "hi!", "AVAILABLE", "Standard Room Booking (N/A)");
        java.lang.String str5 = admin4.getAdminId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Standard Room Booking (N/A)" + "'", str5, "Standard Room Booking (N/A)");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        java.lang.String str19 = booking13.getDescription();
        main.Room room20 = booking13.getRoom();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(room20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        main.Payment payment17 = booking13.getPayment();
        java.time.LocalDateTime localDateTime18 = booking13.getEndTime();
        main.Room room19 = booking13.getRoom();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(room19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "Standard Room Booking (N/A)", "", "");
        main.Booking booking13 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "Standard Room Booking (N/A)", (double) 100, (double) (-1.0f), localDateTime7, (main.User) admin12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        boolean boolean17 = admin12.login("hi!");
        boolean boolean19 = admin12.login("hi!");
        java.lang.String str20 = admin12.getId();
        java.lang.String str21 = admin12.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        java.lang.String str19 = booking13.getDescription();
        double double20 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime21 = booking13.getEndTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        double double15 = admin12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AVAILABLE" + "'", str14, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        boolean boolean16 = booking13.depositBack();
        double double17 = booking13.getTotal();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.AvailableState availableState0 = new main.AvailableState();
        main.Room room1 = null;
        availableState0.enable(room1);
        java.lang.String str3 = availableState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.close(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        main.Payment payment17 = booking13.getPayment();
        java.time.LocalDateTime localDateTime18 = booking13.getEndTime();
        main.Payment payment19 = booking13.getPayment();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        java.lang.String str17 = booking14.getBookingId();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking14.editBooking(localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getEmail();
        double double6 = admin4.getHourlyRate();
        java.lang.String str7 = admin4.getRoleName();
        double double8 = admin4.getHourlyRate();
        java.lang.String str9 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Admin" + "'", str7, "Admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Admin" + "'", str9, "Admin");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        boolean boolean16 = admin12.login("AVAILABLE");
        boolean boolean18 = admin12.login("Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getEndTime();
        booking13.createBooking();
        main.User user16 = booking13.getBookedBy();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        booking13.createBooking();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        main.Booking booking13 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 'a', 0.0d, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime14 = booking13.getEndTime();
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Room room14 = null;
        admin12.addRoom(room14);
        main.Booking booking16 = new main.Booking("Admin", room1, localDateTime2, localDateTime3, "", (double) 1L, 0.0d, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime17 = booking16.getCheckInTime();
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        main.Payment payment17 = null;
        booking13.setPayment(payment17);
        java.lang.String str19 = booking13.getStatus();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        main.Room room16 = booking14.getRoom();
        boolean boolean17 = booking14.depositBack();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(room16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.time.LocalDateTime localDateTime15 = booking13.getCheckInTime();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        double double5 = admin4.getHourlyRate();
        double double6 = admin4.getHourlyRate();
        main.Room room7 = null;
        admin4.addRoom(room7);
        admin4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        boolean boolean17 = admin12.login("hi!");
        boolean boolean19 = admin12.login("hi!");
        admin12.logout();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = null;
        booking13.setPayment(payment14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking13.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        java.lang.String str5 = admin4.getRoleName();
        main.RoomIterator roomIterator6 = admin4.getRoomIterator();
        main.RoomIterator roomIterator7 = admin4.getRoomIterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.Admin admin4 = new main.Admin("Standard Room Booking (N/A)", "Admin", "", "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        booking13.createBooking();
        main.Payment payment16 = booking13.getPayment();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertNull(payment16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        admin4.logout();
        double double7 = admin4.getHourlyRate();
        double double8 = admin4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getRoleName();
        admin12.logout();
        double double19 = admin12.getHourlyRate();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Admin" + "'", str17, "Admin");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.Class<?> wildcardClass1 = availableState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        main.Room room2 = null;
        availableState0.enable(room2);
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.Room room18 = booking13.getRoom();
        java.time.LocalDateTime localDateTime19 = booking13.getEndTime();
        java.time.LocalDateTime localDateTime20 = booking13.getEndTime();
        double double21 = booking13.cost();
        main.Badge badge23 = new main.Badge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = booking13.checkIn(badge23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(room18);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getDescription();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Standard Room Booking (N/A)" + "'", str15, "Standard Room Booking (N/A)");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        admin20.logout();
        main.Booking booking22 = new main.Booking("", room9, localDateTime10, localDateTime11, "hi!", (double) '4', (double) 0, localDateTime15, (main.User) admin20);
        double double23 = admin20.getHourlyRate();
        boolean boolean24 = admin20.isVerified();
        double double25 = admin20.getHourlyRate();
        double double26 = admin20.getHourlyRate();
        main.Booking booking27 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "hi!", 100.0d, (double) (byte) 0, localDateTime7, (main.User) admin20);
        double double28 = booking27.cost();
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        double double15 = booking14.getDeposit();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        main.Payment payment19 = null;
        booking13.setPayment(payment19);
        java.time.LocalDateTime localDateTime21 = booking13.getStartTime();
        main.User user22 = booking13.getBookedBy();
        double double23 = booking13.getTotal();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        java.lang.String str15 = admin12.getEmail();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        admin20.logout();
        main.Booking booking22 = new main.Booking("", room9, localDateTime10, localDateTime11, "hi!", (double) '4', (double) 0, localDateTime15, (main.User) admin20);
        main.Booking booking23 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "AVAILABLE", (double) 1, (double) (short) 1, localDateTime7, (main.User) admin20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        admin4.logout();
        boolean boolean7 = admin4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getEmail();
        java.lang.String str16 = admin12.getId();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        double double16 = booking14.getTotal();
        booking14.createBooking();
        main.Badge badge19 = new main.Badge("Standard Room Booking (N/A)");
        java.lang.String str20 = badge19.getBadgeId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking14.checkIn(badge19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Standard Room Booking (N/A)" + "'", str20, "Standard Room Booking (N/A)");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.Admin admin4 = new main.Admin("", "Standard Room Booking (N/A)", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getAdminId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        main.Payment payment19 = null;
        booking13.setPayment(payment19);
        main.Payment payment21 = booking13.getPayment();
        main.Room room22 = booking13.getRoom();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(payment21);
        org.junit.Assert.assertNull(room22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.Badge badge1 = new main.Badge("Standard Room Booking (N/A)");
        java.lang.String str2 = badge1.getBadgeId();
        java.lang.String str3 = badge1.getBadgeId();
        java.lang.String str4 = badge1.getBadgeId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Standard Room Booking (N/A)" + "'", str2, "Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Standard Room Booking (N/A)" + "'", str3, "Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Standard Room Booking (N/A)" + "'", str4, "Standard Room Booking (N/A)");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        boolean boolean16 = booking13.depositBack();
        main.Badge badge18 = new main.Badge("");
        java.lang.String str19 = badge18.getBadgeId();
        java.lang.String str20 = badge18.getBadgeId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.Admin admin4 = new main.Admin("hi!", "AVAILABLE", "AVAILABLE", "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        double double14 = admin12.getHourlyRate();
        admin12.logout();
        admin12.logout();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        boolean boolean17 = admin12.login("hi!");
        java.lang.String str18 = admin12.getId();
        main.Room room19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking22 = admin12.booking(room19, localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        java.lang.String str19 = booking13.getDescription();
        java.lang.String str20 = booking13.getBookingId();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.RoomIterator roomIterator22 = admin20.getRoomIterator();
        main.Booking booking23 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "Admin", (double) 0L, (-1.0d), localDateTime7, (main.User) admin20);
        java.lang.String str24 = admin20.getEmail();
        java.lang.Class<?> wildcardClass25 = admin20.getClass();
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        java.lang.String str14 = admin12.getId();
        java.lang.String str15 = admin12.getAdminId();
        java.lang.String str16 = admin12.getAdminId();
        main.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        java.lang.String str17 = admin12.getRoleName();
        main.Room room18 = null;
        admin12.addRoom(room18);
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Admin" + "'", str17, "Admin");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getDeposit();
        main.Badge badge18 = new main.Badge("hi!");
        java.lang.String str19 = badge18.getBadgeId();
        java.lang.String str20 = badge18.getBadgeId();
        java.lang.String str21 = badge18.getBadgeId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getEndTime();
        main.User user18 = booking13.getBookedBy();
        java.time.LocalDateTime localDateTime19 = booking13.getEndTime();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.time.LocalDateTime localDateTime15 = booking13.getStartTime();
        main.User user16 = booking13.getBookedBy();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        java.lang.String str19 = admin12.getId();
        admin12.logout();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        main.RoomIterator roomIterator16 = admin12.getRoomIterator();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
        org.junit.Assert.assertNotNull(roomIterator16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.AvailableState availableState0 = new main.AvailableState();
        java.lang.String str1 = availableState0.getStatus();
        main.Room room2 = null;
        availableState0.enable(room2);
        java.lang.String str4 = availableState0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        main.User user16 = booking14.getBookedBy();
        java.lang.String str17 = booking14.getDescription();
        double double18 = booking14.cost();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard Room Booking (N/A)" + "'", str17, "Standard Room Booking (N/A)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        main.Room room15 = null;
        admin12.addRoom(room15);
        main.Room room17 = null;
        admin12.addRoom(room17);
        admin12.logout();
        java.lang.String str20 = admin12.getEmail();
        java.lang.String str21 = admin12.getRoleName();
        main.RoomIterator roomIterator22 = admin12.getRoomIterator();
        java.lang.String str23 = admin12.getAdminId();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Admin" + "'", str21, "Admin");
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.Admin admin4 = new main.Admin("AVAILABLE", "AVAILABLE", "Admin", "");
        java.lang.String str5 = admin4.getAdminId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.Payment payment22 = booking21.getPayment();
        double double23 = booking21.getDeposit();
        double double24 = booking21.getTotal();
        java.time.LocalDateTime localDateTime25 = booking21.getCheckInTime();
        main.User user26 = booking21.getBookedBy();
        main.Booking booking27 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 100, (double) 0.0f, localDateTime7, user26);
        main.Room room28 = booking27.getRoom();
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(room28);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        admin20.logout();
        main.Booking booking22 = new main.Booking("", room9, localDateTime10, localDateTime11, "hi!", (double) '4', (double) 0, localDateTime15, (main.User) admin20);
        double double23 = admin20.getHourlyRate();
        boolean boolean24 = admin20.isVerified();
        double double25 = admin20.getHourlyRate();
        double double26 = admin20.getHourlyRate();
        main.Booking booking27 = new main.Booking("Standard Room Booking (N/A)", room1, localDateTime2, localDateTime3, "hi!", 100.0d, (double) (byte) 0, localDateTime7, (main.User) admin20);
        main.Room room28 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin20.closeRoom(room28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        boolean boolean15 = booking14.depositBack();
        java.lang.String str16 = booking14.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking14.editBooking(localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Standard Room Booking (N/A)" + "'", str16, "Standard Room Booking (N/A)");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.RoomIterator roomIterator14 = admin12.getRoomIterator();
        admin12.logout();
        admin12.logout();
        java.lang.String str17 = admin12.getPassword();
        double double18 = admin12.getHourlyRate();
        admin12.logout();
        org.junit.Assert.assertNotNull(roomIterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        main.Room room15 = null;
        admin12.addRoom(room15);
        double double17 = admin12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        double double17 = booking13.cost();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getRoleName();
        java.lang.String str16 = admin12.getRoleName();
        main.Room room17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking20 = admin12.booking(room17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Admin" + "'", str15, "Admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Admin" + "'", str16, "Admin");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        main.User user16 = booking14.getBookedBy();
        booking14.createBooking();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.time.LocalDateTime localDateTime16 = booking13.getEndTime();
        java.lang.String str17 = booking13.getStatus();
        main.User user18 = booking13.getBookedBy();
        java.lang.String str19 = user18.getId();
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        java.lang.String str18 = booking13.getStatus();
        java.lang.String str19 = booking13.getDescription();
        double double20 = booking13.getDeposit();
        java.lang.String str21 = booking13.getDescription();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Standard Room Booking (N/A)" + "'", str19, "Standard Room Booking (N/A)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Standard Room Booking (N/A)" + "'", str21, "Standard Room Booking (N/A)");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.Admin admin4 = new main.Admin("", "hi!", "", "");
        admin4.logout();
        java.lang.String str6 = admin4.getEmail();
        java.lang.String str7 = admin4.getRoleName();
        main.RoomIterator roomIterator8 = admin4.getRoomIterator();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Admin" + "'", str7, "Admin");
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        double double16 = booking13.getTotal();
        java.time.LocalDateTime localDateTime17 = booking13.getCheckInTime();
        main.Room room18 = booking13.getRoom();
        java.lang.String str19 = booking13.getBookingId();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(room18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        main.Payment payment17 = booking13.getPayment();
        double double18 = booking13.getTotal();
        main.Payment payment19 = booking13.getPayment();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.time.LocalDateTime localDateTime15 = booking13.getStartTime();
        main.Payment payment16 = null;
        booking13.setPayment(payment16);
        main.Room room18 = booking13.getRoom();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(room18);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking17 = admin12.booking(room14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        java.lang.String str13 = admin12.getEmail();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "Admin", (double) 10, (double) (byte) 1, localDateTime7, (main.User) admin12);
        java.lang.String str15 = admin12.getId();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        java.time.LocalDateTime localDateTime15 = booking14.getStartTime();
        main.Room room16 = booking14.getRoom();
        double double17 = booking14.cost();
        double double18 = booking14.cost();
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(room16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking13.extendBooking(localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Room room14 = booking13.getRoom();
        java.lang.String str15 = booking13.getBookingId();
        java.lang.String str16 = booking13.getBookingId();
        main.Badge badge18 = new main.Badge("");
        java.lang.String str19 = badge18.getBadgeId();
        java.lang.String str20 = badge18.getBadgeId();
        java.lang.String str21 = badge18.getBadgeId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking13.checkIn(badge18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(room14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.Badge badge1 = new main.Badge("Admin");
        java.lang.String str2 = badge1.getBadgeId();
        java.lang.String str3 = badge1.getBadgeId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Admin" + "'", str2, "Admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Admin" + "'", str3, "Admin");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        main.Admin admin4 = new main.Admin("", "", "hi!", "Standard Room Booking (N/A)");
        java.lang.String str5 = admin4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Admin" + "'", str5, "Admin");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        java.lang.String str15 = booking13.getStatus();
        double double16 = booking13.cost();
        double double17 = booking13.cost();
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.editBooking(localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        java.time.LocalDateTime localDateTime16 = booking13.getStartTime();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking13.editBooking(localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        main.Booking booking14 = new main.Booking("", room1, localDateTime2, localDateTime3, "hi!", (double) '4', (double) 0, localDateTime7, (main.User) admin12);
        double double15 = booking14.cost();
        java.time.LocalDateTime localDateTime16 = booking14.getEndTime();
        booking14.createBooking();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        main.Booking booking13 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "", (double) 'a', (double) 'a', localDateTime7, (main.User) admin12);
        main.Payment payment14 = booking13.getPayment();
        double double15 = booking13.getDeposit();
        boolean boolean16 = booking13.depositBack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = booking13.cancelBooking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.Admin admin20 = new main.Admin("", "hi!", "", "");
        main.Booking booking21 = new main.Booking("hi!", room9, localDateTime10, localDateTime11, "", (double) 'a', (double) 'a', localDateTime15, (main.User) admin20);
        main.RoomIterator roomIterator22 = admin20.getRoomIterator();
        main.Room room23 = null;
        admin20.addRoom(room23);
        java.lang.String str25 = admin20.getId();
        main.Booking booking26 = new main.Booking("hi!", room1, localDateTime2, localDateTime3, "hi!", 52.0d, (double) (-1), localDateTime7, (main.User) admin20);
        org.junit.Assert.assertNotNull(roomIterator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.Admin admin12 = new main.Admin("", "hi!", "", "");
        admin12.logout();
        java.lang.String str14 = admin12.getEmail();
        double double15 = admin12.getHourlyRate();
        boolean boolean17 = admin12.login("");
        java.lang.String str18 = admin12.getId();
        boolean boolean20 = admin12.login("AVAILABLE");
        main.Booking booking21 = new main.Booking("AVAILABLE", room1, localDateTime2, localDateTime3, "", (double) (byte) 100, (double) ' ', localDateTime7, (main.User) admin12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

