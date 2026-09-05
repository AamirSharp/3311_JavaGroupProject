package main;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YMRegressionTest0 {

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
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.Room room0 = null;
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = main.Booking.roomAvailable(room0, localDateTime1, localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("hi!");
        creditDebit4.setAmount((double) 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking4 = chiefEventCoordinator0.booking(room1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.Class<?> wildcardClass4 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        java.lang.Class<?> wildcardClass7 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        main.Room room3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking6 = chiefEventCoordinator0.booking(room3, localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.Class<?> wildcardClass8 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking7 = chiefEventCoordinator0.booking(room4, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.Class<?> wildcardClass8 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        double double5 = creditDebit4.getAmount();
        double double6 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("hi!");
        double double9 = creditDebit4.getAmount();
        java.lang.Class<?> wildcardClass10 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.Class<?> wildcardClass4 = closedState0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        java.lang.String str1 = chiefEventCoordinator0.getPassword();
        java.lang.String str2 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chief Event Coordinator" + "'", str2, "Chief Event Coordinator");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "CLOSED", (int) (short) -1, "ab87654321");
        creditDebit4.refund();
        creditDebit4.setAmount((double) ' ');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10, "14paid", (int) (byte) -1, "ab106737522");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "cd12345678", 0, "59paid");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.String str9 = admin7.getEmail();
        boolean boolean11 = admin7.login("");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        double double5 = creditDebit4.getAmount();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("");
        boolean boolean12 = admin10.login("");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = chiefEventCoordinator0.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        java.lang.Class<?> wildcardClass7 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getEmail();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coordinator@yorku.ca" + "'", str7, "coordinator@yorku.ca");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean9 = chiefEventCoordinator0.login("23paid");
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = chiefEventCoordinator0.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        creditDebit4.refund();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.Class<?> wildcardClass8 = admin7.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean9 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "hi!", (int) (short) 0, "24paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "1) test094(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "75paid" + "'", str7, "75paid");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "14paid", (int) (short) 0, "ab106737522");
        double double5 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        double double5 = creditDebit4.getAmount();
        java.lang.String str6 = creditDebit4.getPaymentId();
        creditDebit4.setAmount((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
// flaky "2) test097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "80paid" + "'", str6, "80paid");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "3) test098(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83paid" + "'", str5, "83paid");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = admin7.getAdminId();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
// flaky "4) test099(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab106898263" + "'", str8, "ab106898263");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("");
        creditDebit4.setAmount((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        double double5 = creditDebit4.getAmount();
        java.lang.String str6 = creditDebit4.getPaymentId();
        java.lang.Class<?> wildcardClass7 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
// flaky "5) test102(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "85paid" + "'", str6, "85paid");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        creditDebit4.setPaymentId("cd12345678");
        java.lang.Class<?> wildcardClass7 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("41paid");
        java.lang.Class<?> wildcardClass8 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("59paid");
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = chiefEventCoordinator0.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("14paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "6) test117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "91paid" + "'", str5, "91paid");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "hi!", (int) (short) 0, "24paid");
        creditDebit4.setPaymentId("ab87654321");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        main.RoomIterator roomIterator9 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        creditDebit4.pay();
        creditDebit4.refund();
        double double7 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        boolean boolean9 = chiefEventCoordinator0.login("CLOSED");
        java.lang.String str10 = chiefEventCoordinator0.getAdminId();
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ab87654321" + "'", str10, "ab87654321");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("coordinator@yorku.ca");
        java.lang.Class<?> wildcardClass10 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "24paid", (int) (short) 100, "ab106737522");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setAmount((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "7) test127(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100paid" + "'", str5, "100paid");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = chiefEventCoordinator0.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "8) test131(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xIBz5xAY" + "'", str6, "xIBz5xAY");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = chiefEventCoordinator0.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        boolean boolean7 = admin5.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "ab87654321", (int) 'a', "24paid");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        double double8 = admin7.getHourlyRate();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.Class<?> wildcardClass8 = roomIterator7.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        double double7 = creditDebit4.getAmount();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount((double) (short) -1);
        creditDebit4.setAmount((double) (byte) 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        main.Room room11 = null;
        chiefEventCoordinator0.addRoom(room11);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setAmount((-1.0d));
        creditDebit4.setPaymentId("101paid");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (byte) 1, "109paid");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        double double5 = creditDebit4.getAmount();
        double double6 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.Class<?> wildcardClass11 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getPassword();
        boolean boolean7 = chiefEventCoordinator0.login("");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        creditDebit4.pay();
        double double7 = creditDebit4.getAmount();
        creditDebit4.pay();
        creditDebit4.setPaymentId("102paid");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        boolean boolean7 = admin5.login("cd12345678");
        main.Room room8 = null;
        admin5.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.Class<?> wildcardClass4 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        double double4 = chiefEventCoordinator0.getHourlyRate();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd101670014", (int) (byte) 1, "xIBz5xAY");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setAmount((double) (-1));
        java.lang.String str8 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "9) test161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "123paid" + "'", str5, "123paid");
// flaky "1) test161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "123paid" + "'", str8, "123paid");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setAmount((double) 1.0f);
        creditDebit4.refund();
        double double8 = creditDebit4.getAmount();
        double double9 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("59paid");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        java.lang.String str7 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        java.lang.String str3 = chiefEventCoordinator0.getId();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cd12345678" + "'", str3, "cd12345678");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        java.lang.String str9 = closedState0.getStatus();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setAmount((double) 1.0f);
        creditDebit4.refund();
        java.lang.String str8 = creditDebit4.getPaymentId();
// flaky "10) test171(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "129paid" + "'", str8, "129paid");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        double double4 = chiefEventCoordinator0.getHourlyRate();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        java.lang.String str5 = creditDebit4.getPaymentId();
// flaky "11) test173(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "132paid" + "'", str5, "132paid");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getEmail();
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coordinator@yorku.ca" + "'", str7, "coordinator@yorku.ca");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(admin7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) 100.0f);
        java.lang.Class<?> wildcardClass8 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Room room10 = null;
        chiefEventCoordinator0.addRoom(room10);
        boolean boolean12 = chiefEventCoordinator0.isVerified();
        main.Admin admin14 = chiefEventCoordinator0.generateAdminAcc("59paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(admin14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 10, "", (int) (short) 10, "hi!");
        creditDebit4.setAmount((double) 100);
        double double7 = creditDebit4.getAmount();
        double double8 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator10 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean9 = chiefEventCoordinator0.login("cd108917457");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getRoleName();
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.Class<?> wildcardClass5 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chief Event Coordinator" + "'", str3, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.CreditDebit creditDebit4 = new main.CreditDebit(100.0d, "134paid", (int) 'a', "109paid");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("coordinator@yorku.ca");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        creditDebit4.pay();
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("23paid");
        creditDebit4.refund();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("41paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("xIBz5xAY");
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin8.closeRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.CreditDebit creditDebit4 = new main.CreditDebit(10.0d, "25paid", (-1), "129paid");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        double double7 = creditDebit4.getAmount();
        double double8 = creditDebit4.getAmount();
        creditDebit4.pay();
        double double10 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) 100.0f);
        creditDebit4.setAmount((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        main.RoomIterator roomIterator10 = admin9.getRoomIterator();
        main.Room room11 = null;
        admin9.addRoom(room11);
        boolean boolean13 = admin9.isVerified();
        main.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin9.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertNotNull(roomIterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        java.lang.Class<?> wildcardClass7 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.Class<?> wildcardClass9 = admin7.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking5 = chiefEventCoordinator0.booking(room2, localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str10 = chiefEventCoordinator0.getId();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        java.lang.String str2 = chiefEventCoordinator0.getEmail();
        java.lang.String str3 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coordinator@yorku.ca" + "'", str2, "coordinator@yorku.ca");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "CLOSED", (int) (short) -1, "ab87654321");
        creditDebit4.refund();
        creditDebit4.setAmount((double) (byte) 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        double double8 = admin7.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("85paid");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        boolean boolean9 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        java.lang.String str6 = chiefEventCoordinator0.getAdminId();
        java.lang.String str7 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ab87654321" + "'", str6, "ab87654321");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("");
        double double7 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        java.lang.String str9 = closedState0.getStatus();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "85paid", 0, "132paid");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        chiefEventCoordinator0.logout();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        java.lang.String str7 = admin5.getAdminId();
        main.Room room8 = null;
        admin5.addRoom(room8);
        java.lang.Class<?> wildcardClass10 = admin5.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "12) test224(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab100086583" + "'", str7, "ab100086583");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        boolean boolean8 = chiefEventCoordinator0.login("Q!Z!3nXL");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        java.lang.String str10 = admin9.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
// flaky "13) test228(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd108872446" + "'", str10, "cd108872446");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        main.Room room8 = null;
        closedState0.close(room8);
        java.lang.Class<?> wildcardClass10 = closedState0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.Class<?> wildcardClass8 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        java.lang.String str8 = closedState0.getStatus();
        java.lang.String str9 = closedState0.getStatus();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        double double5 = creditDebit4.getAmount();
        creditDebit4.pay();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        boolean boolean9 = chiefEventCoordinator0.login("CLOSED");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        java.lang.String str11 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        java.lang.String str2 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coordinator@yorku.ca" + "'", str2, "coordinator@yorku.ca");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coordinator@yorku.ca" + "'", str8, "coordinator@yorku.ca");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str2 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chief Event Coordinator" + "'", str2, "Chief Event Coordinator");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.Class<?> wildcardClass11 = admin10.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        boolean boolean10 = chiefEventCoordinator0.login("85paid");
        java.lang.String str11 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean10 = chiefEventCoordinator0.login("PMaoyNTw");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        java.lang.String str12 = chiefEventCoordinator0.getEmail();
        main.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coordinator@yorku.ca" + "'", str12, "coordinator@yorku.ca");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = chiefEventCoordinator0.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        boolean boolean9 = chiefEventCoordinator0.login("24paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = admin7.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "cd104521961", 0, "Q!Z!3nXL");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        java.lang.String str5 = creditDebit4.getPaymentId();
        double double6 = creditDebit4.getAmount();
// flaky "14) test250(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "175paid" + "'", str5, "175paid");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("14paid");
        java.lang.String str8 = creditDebit4.getPaymentId();
// flaky "15) test251(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "176paid" + "'", str5, "176paid");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "14paid" + "'", str8, "14paid");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd104521961", (int) (byte) 1, "Chief Event Coordinator");
        double double5 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        main.RoomIterator roomIterator4 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertNotNull(roomIterator4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("135paid");
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        java.lang.String str12 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ab87654321" + "'", str12, "ab87654321");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Admin admin6 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
        java.lang.String str8 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("176paid");
// flaky "16) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "180paid" + "'", str7, "180paid");
// flaky "2) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "180paid" + "'", str8, "180paid");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chief Event Coordinator" + "'", str8, "Chief Event Coordinator");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1), "24paid", (int) (byte) 100, "");
        creditDebit4.setAmount((double) (short) 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Room room10 = null;
        chiefEventCoordinator0.addRoom(room10);
        boolean boolean12 = chiefEventCoordinator0.isVerified();
        main.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        boolean boolean11 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
        java.lang.String str8 = creditDebit4.getPaymentId();
        creditDebit4.setAmount((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "17) test262(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "182paid" + "'", str7, "182paid");
// flaky "3) test262(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "182paid" + "'", str8, "182paid");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("xIBz5xAY");
        java.lang.String str9 = chiefEventCoordinator0.getAdminId();
        java.lang.String str10 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab87654321" + "'", str9, "ab87654321");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        chiefEventCoordinator0.logout();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.String str9 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        java.lang.String str9 = closedState0.getStatus();
        java.lang.String str10 = closedState0.getStatus();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.String str9 = chiefEventCoordinator0.getId();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "175paid", 0, "Q!Z!3nXL");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        double double5 = chiefEventCoordinator0.getHourlyRate();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.String str9 = admin7.getEmail();
        java.lang.String str10 = admin7.getId();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.closeRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "18) test271(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd105639115" + "'", str10, "cd105639115");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10.0f, "cd104521961", (int) 'a', "134paid");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.CreditDebit creditDebit4 = new main.CreditDebit(1.0d, "", 1, "ab105596188");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.RoomIterator roomIterator6 = chiefEventCoordinator0.getRoomIterator();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        boolean boolean9 = chiefEventCoordinator0.login("CLOSED");
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        double double5 = creditDebit4.getAmount();
        java.lang.String str6 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "19) test278(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "190paid" + "'", str6, "190paid");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.CreditDebit creditDebit4 = new main.CreditDebit(1.0d, "24paid", (int) '4', "cd101670014");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.String str9 = chiefEventCoordinator0.getEmail();
        double double10 = chiefEventCoordinator0.getHourlyRate();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = admin7.getPassword();
        java.lang.String str9 = admin7.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
// flaky "20) test285(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kxbsGg%3" + "'", str8, "kxbsGg%3");
// flaky "4) test285(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kxbsGg%3" + "'", str9, "kxbsGg%3");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "80paid", 100, "102paid");
        double double5 = creditDebit4.getAmount();
        creditDebit4.refund();
        double double7 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        creditDebit4.pay();
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("23paid");
        creditDebit4.pay();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        java.lang.String str6 = creditDebit4.getPaymentId();
        double double7 = creditDebit4.getAmount();
// flaky "21) test288(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "197paid" + "'", str6, "197paid");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount((double) 1L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 1, "197paid", 100, "24paid");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("41paid");
        double double8 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.String str9 = chiefEventCoordinator0.getId();
        java.lang.String str10 = chiefEventCoordinator0.getPassword();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        creditDebit4.setPaymentId("cd12345678");
        creditDebit4.setPaymentId("ab87654321");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("101paid");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin10.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.String str9 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setPaymentId("ab105596188");
        creditDebit4.setPaymentId("LxigsRo1");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Room room3 = null;
        chiefEventCoordinator0.addRoom(room3);
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 1, "ab105596188", (int) (byte) 10, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = chiefEventCoordinator0.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        boolean boolean6 = chiefEventCoordinator0.login("cd108917457");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        closedState0.close(room8);
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean9 = chiefEventCoordinator0.login("23paid");
        main.RoomIterator roomIterator10 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        boolean boolean13 = chiefEventCoordinator0.login("101paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomIterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("59paid");
        main.RoomIterator roomIterator11 = admin10.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertNotNull(roomIterator11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("102paid");
        creditDebit4.setPaymentId("");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("102paid");
        double double9 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin8.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount((double) ' ');
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        java.lang.String str12 = chiefEventCoordinator0.getEmail();
        java.lang.String str13 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coordinator@yorku.ca" + "'", str12, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cd12345678" + "'", str13, "cd12345678");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        double double9 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        java.lang.String str6 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("24paid");
// flaky "22) test322(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "210paid" + "'", str6, "210paid");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        chiefEventCoordinator0.logout();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = chiefEventCoordinator0.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Admin admin6 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        java.lang.String str7 = admin6.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin6);
// flaky "23) test325(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab106227606" + "'", str7, "ab106227606");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        double double10 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        java.lang.String str8 = closedState0.getStatus();
        java.lang.String str9 = closedState0.getStatus();
        main.Room room10 = null;
        closedState0.close(room10);
        main.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("hi!");
        java.lang.String str9 = creditDebit4.getPaymentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chief Event Coordinator" + "'", str8, "Chief Event Coordinator");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Room room10 = null;
        chiefEventCoordinator0.addRoom(room10);
        boolean boolean12 = chiefEventCoordinator0.isVerified();
        boolean boolean13 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        creditDebit4.setAmount((double) 10);
        java.lang.Class<?> wildcardClass7 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.String str9 = chiefEventCoordinator0.getPassword();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        closedState0.close(room5);
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean9 = chiefEventCoordinator0.login("24paid");
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = chiefEventCoordinator0.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setPaymentId("24paid");
        creditDebit4.setAmount((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        java.lang.String str7 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coordinator@yorku.ca" + "'", str7, "coordinator@yorku.ca");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setPaymentId("24paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        boolean boolean9 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.RoomIterator roomIterator9 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean11 = chiefEventCoordinator0.login("cd104521961");
        main.Room room12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking15 = chiefEventCoordinator0.booking(room12, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertNotNull(roomIterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getRoleName();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chief Event Coordinator" + "'", str3, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        java.lang.String str9 = admin8.getAdminId();
        java.lang.String str10 = admin8.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
// flaky "24) test347(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab108592740" + "'", str9, "ab108592740");
// flaky "5) test347(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAhtBeBb" + "'", str10, "CAhtBeBb");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        main.Admin admin12 = chiefEventCoordinator0.generateAdminAcc("24paid");
        boolean boolean14 = chiefEventCoordinator0.login("ab107837014");
        main.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(admin12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        main.Admin admin13 = chiefEventCoordinator0.generateAdminAcc("ab106227606");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin13);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str9 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab87654321" + "'", str9, "ab87654321");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        java.lang.String str8 = closedState0.getStatus();
        java.lang.String str9 = closedState0.getStatus();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        double double8 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Room room10 = null;
        chiefEventCoordinator0.addRoom(room10);
        main.Room room12 = null;
        chiefEventCoordinator0.addRoom(room12);
        main.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        double double10 = admin9.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd104521961", (int) (byte) 1, "Chief Event Coordinator");
        java.lang.String str5 = creditDebit4.getPaymentId();
        double double6 = creditDebit4.getAmount();
// flaky "25) test358(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "219paid" + "'", str5, "219paid");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        double double5 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        main.Room room4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking7 = chiefEventCoordinator0.booking(room4, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 1.0f, "153paid", (int) (short) 100, "25paid");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.String str9 = admin7.getEmail();
        java.lang.String str10 = admin7.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(roomIterator8);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "cd12345678", 10, "ab107837014");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setAmount((double) (-1.0f));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        java.lang.String str8 = closedState0.getStatus();
        java.lang.String str9 = closedState0.getStatus();
        java.lang.String str10 = closedState0.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        main.Admin admin6 = chiefEventCoordinator0.generateAdminAcc("80paid");
        boolean boolean7 = admin6.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
        org.junit.Assert.assertNotNull(admin6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
// flaky "26) test371(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "225paid" + "'", str7, "225paid");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.String str9 = admin7.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
// flaky "27) test374(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd105460979" + "'", str9, "cd105460979");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = chiefEventCoordinator0.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.String str9 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        double double5 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        java.lang.String str7 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        java.lang.String str1 = chiefEventCoordinator0.getPassword();
        main.Admin admin3 = chiefEventCoordinator0.generateAdminAcc("111paid");
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = chiefEventCoordinator0.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10L, "cd12345678", (int) (byte) -1, "23paid");
        creditDebit4.setAmount((double) 'a');
        creditDebit4.pay();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        boolean boolean10 = chiefEventCoordinator0.login("85paid");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        main.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "cd100241182", (int) (short) 0, "101paid");
        creditDebit4.refund();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        java.lang.String str6 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setPaymentId("24paid");
        creditDebit4.refund();
        creditDebit4.setPaymentId("");
        creditDebit4.refund();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd104521961", (int) (byte) 1, "Chief Event Coordinator");
        creditDebit4.refund();
        creditDebit4.setPaymentId("ab107837014");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "52paid", 1, "59paid");
        creditDebit4.refund();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        chiefEventCoordinator0.logout();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        java.lang.String str7 = admin5.getAdminId();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "28) test392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd104831544" + "'", str6, "cd104831544");
// flaky "6) test392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab104831544" + "'", str7, "ab104831544");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("25paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        java.lang.Class<?> wildcardClass9 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "kxbsGg%3", (int) (short) 1, "134paid");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        boolean boolean9 = chiefEventCoordinator0.login("CLOSED");
        java.lang.String str10 = chiefEventCoordinator0.getAdminId();
        double double11 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ab87654321" + "'", str10, "ab87654321");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.String str9 = chiefEventCoordinator0.getPassword();
        boolean boolean11 = chiefEventCoordinator0.login("14paid");
        java.lang.String str12 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coordinator@yorku.ca" + "'", str12, "coordinator@yorku.ca");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        java.lang.String str9 = chiefEventCoordinator0.getEmail();
        double double10 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean12 = chiefEventCoordinator0.login("210paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str4 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = admin7.getPassword();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin7.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
// flaky "29) test404(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTDZ7mTI" + "'", str8, "UTDZ7mTI");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        creditDebit4.pay();
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("23paid");
        double double10 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        double double7 = admin5.getHourlyRate();
        admin5.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "30) test406(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd108889872" + "'", str6, "cd108889872");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("102paid");
        creditDebit4.setPaymentId("101paid");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        main.Room room4 = null;
        closedState0.close(room4);
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        java.lang.String str8 = closedState0.getStatus();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "41paid", (int) '4', "25paid");
        creditDebit4.setAmount((double) (byte) -1);
        creditDebit4.pay();
        creditDebit4.setAmount((double) 10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.Class<?> wildcardClass6 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        double double8 = admin7.getHourlyRate();
        java.lang.String str9 = admin7.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        java.lang.String str6 = chiefEventCoordinator0.getAdminId();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        java.lang.String str9 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ab87654321" + "'", str6, "ab87654321");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount((double) (short) -1);
        double double7 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "41paid", (int) '4', "25paid");
        creditDebit4.setAmount((double) (byte) -1);
        java.lang.String str7 = creditDebit4.getPaymentId();
// flaky "31) test418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "242paid" + "'", str7, "242paid");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        double double7 = creditDebit4.getAmount();
        creditDebit4.refund();
        creditDebit4.setPaymentId("ab108592740");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        main.Room room11 = null;
        admin10.addRoom(room11);
        main.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin10.closeRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("");
        creditDebit4.setAmount((double) (short) 0);
        java.lang.Class<?> wildcardClass9 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        double double9 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        main.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        admin7.logout();
        java.lang.String str9 = admin7.getEmail();
        java.lang.String str10 = admin7.getPassword();
        boolean boolean11 = admin7.isVerified();
        main.Room room12 = null;
        admin7.addRoom(room12);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "32) test424(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DO3kiMbJ" + "'", str10, "DO3kiMbJ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        closedState0.close(room8);
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean10 = chiefEventCoordinator0.login("129paid");
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = chiefEventCoordinator0.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        java.lang.String str10 = chiefEventCoordinator0.getId();
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator12 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator12);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        main.RoomIterator roomIterator5 = admin4.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setPaymentId("24paid");
        creditDebit4.refund();
        creditDebit4.pay();
        creditDebit4.refund();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setPaymentId("ab105596188");
        creditDebit4.setPaymentId("cd107937503");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("");
        boolean boolean7 = admin5.login("153paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        java.lang.String str7 = closedState0.getStatus();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "41paid", (int) '4', "25paid");
        creditDebit4.pay();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 10, "", (int) (short) 10, "hi!");
        creditDebit4.setAmount((double) 100);
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("ab105596188");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ab87654321" + "'", str3, "ab87654321");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 10, "cd100640043", (int) (short) -1, "180paid");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        double double5 = creditDebit4.getAmount();
        java.lang.String str6 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("cd104521961");
        java.lang.Class<?> wildcardClass9 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "33) test442(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "254paid" + "'", str6, "254paid");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("14paid");
        double double8 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("cd104101663");
// flaky "34) test444(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "255paid" + "'", str5, "255paid");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("");
        creditDebit4.setAmount((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertNotNull(roomIterator5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        java.lang.String str8 = admin7.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd104521961" + "'", str8, "cd104521961");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setPaymentId("ab105596188");
        creditDebit4.setPaymentId("");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        java.lang.Class<?> wildcardClass8 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        java.lang.String str6 = admin5.getId();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
// flaky "35) test452(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd103985157" + "'", str6, "cd103985157");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        main.Room room3 = null;
        closedState0.close(room3);
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.String str9 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        boolean boolean10 = admin8.login("132paid");
        boolean boolean11 = admin8.isVerified();
        main.Room room12 = null;
        admin8.addRoom(room12);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        double double9 = admin8.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "cd12345678", 10, "ab107837014");
        double double5 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("xIBz5xAY");
        boolean boolean10 = chiefEventCoordinator0.login("kxbsGg%3");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        boolean boolean9 = chiefEventCoordinator0.login("ab87654321");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        java.lang.String str12 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ab87654321" + "'", str12, "ab87654321");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        java.lang.String str7 = admin5.getAdminId();
        java.lang.String str8 = admin5.getEmail();
        main.Room room9 = null;
        admin5.addRoom(room9);
        java.lang.String str11 = admin5.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "36) test462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab100197227" + "'", str7, "ab100197227");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25paid" + "'", str8, "25paid");
// flaky "7) test462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f@*aDA9D" + "'", str11, "f@*aDA9D");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getPassword();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getId();
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        double double7 = creditDebit4.getAmount();
        double double8 = creditDebit4.getAmount();
        creditDebit4.pay();
        creditDebit4.refund();
        creditDebit4.refund();
        creditDebit4.setPaymentId("Q!Z!3nXL");
        creditDebit4.pay();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        closedState0.close(room8);
        java.lang.String str10 = closedState0.getStatus();
        java.lang.String str11 = closedState0.getStatus();
        main.Room room12 = null;
        closedState0.close(room12);
        main.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLOSED" + "'", str11, "CLOSED");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setAmount((double) 1.0f);
        creditDebit4.setPaymentId("59paid");
        creditDebit4.pay();
        creditDebit4.setAmount((double) (short) 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        double double5 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("147paid");
        double double7 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        main.RoomIterator roomIterator11 = chiefEventCoordinator0.getRoomIterator();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(roomIterator11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        boolean boolean7 = admin5.isVerified();
        main.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "37) test476(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd106995395" + "'", str6, "cd106995395");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        chiefEventCoordinator0.logout();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        main.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("coordinator@yorku.ca");
        creditDebit4.setPaymentId("85paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-1, 3) out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setPaymentId("hi!");
        creditDebit4.setAmount(10.0d);
        creditDebit4.setAmount((double) 'a');
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        boolean boolean9 = chiefEventCoordinator0.login("219paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("101paid");
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin10.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setPaymentId("hi!");
        creditDebit4.setPaymentId("Q!Z!3nXL");
        creditDebit4.setPaymentId("68paid");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "52paid", 1, "59paid");
        creditDebit4.setPaymentId("CLOSED");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 10, "", (int) (short) 10, "hi!");
        creditDebit4.setAmount((double) 100);
        double double7 = creditDebit4.getAmount();
        java.lang.String str8 = creditDebit4.getPaymentId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
// flaky "38) test486(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "275paid" + "'", str8, "275paid");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "ab107352423", (int) '4', "210paid");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        main.Room room6 = null;
        closedState0.close(room6);
        main.Room room8 = null;
        closedState0.close(room8);
        java.lang.String str10 = closedState0.getStatus();
        main.Room room11 = null;
        closedState0.close(room11);
        main.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.disable(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "CLOSED", (int) (short) -1, "ab87654321");
        creditDebit4.setAmount((double) (short) -1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        boolean boolean9 = chiefEventCoordinator0.login("135paid");
        boolean boolean10 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        double double8 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        closedState0.close(room5);
        main.Room room7 = null;
        closedState0.close(room7);
        java.lang.String str9 = closedState0.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "", (int) '4', "hi!");
        double double5 = creditDebit4.getAmount();
        java.lang.String str6 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("cd104521961");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "39) test496(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "278paid" + "'", str6, "278paid");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("cd12345678");
        java.lang.String str10 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "40) test497(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "279paid" + "'", str7, "279paid");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coordinator@yorku.ca" + "'", str8, "coordinator@yorku.ca");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        boolean boolean9 = chiefEventCoordinator0.login("135paid");
        main.Admin admin11 = chiefEventCoordinator0.generateAdminAcc("225paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(admin11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getRoleName();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        main.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chief Event Coordinator" + "'", str3, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }
}
