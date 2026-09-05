package main;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YMRegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("");
        double double6 = admin5.getHourlyRate();
        java.lang.String str7 = admin5.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky "1) test501(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd106942031" + "'", str7, "cd106942031");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        creditDebit4.setAmount((double) 100);
        creditDebit4.setPaymentId("102paid");
        java.lang.Class<?> wildcardClass9 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator9 = chiefEventCoordinator0.getRoomIterator();
        double double10 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        java.lang.String str11 = admin10.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(admin10);
// flaky "2) test504(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "t92cdLnL" + "'", str11, "t92cdLnL");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
            chiefEventCoordinator0.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        admin9.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertNotNull(roomIterator10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100, "cd104521961", (int) (short) 1, "135paid");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.refund();
        java.lang.String str7 = creditDebit4.getPaymentId();
// flaky "3) test508(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "282paid" + "'", str5, "282paid");
// flaky "1) test508(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "282paid" + "'", str7, "282paid");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator8 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean10 = chiefEventCoordinator0.login("129paid");
        main.RoomIterator roomIterator11 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomIterator11);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        java.lang.String str7 = admin5.getAdminId();
        java.lang.String str8 = admin5.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "4) test510(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd104614389" + "'", str6, "cd104614389");
// flaky "2) test510(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab104614389" + "'", str7, "ab104614389");
// flaky "1) test510(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m@SE21Ik" + "'", str8, "m@SE21Ik");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
            chiefEventCoordinator0.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("");
        creditDebit4.setAmount((double) (short) 0);
        java.lang.String str9 = creditDebit4.getPaymentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setPaymentId("147paid");
        java.lang.String str7 = creditDebit4.getPaymentId();
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "147paid" + "'", str7, "147paid");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "CAhtBeBb", 10, "24paid");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setPaymentId("ab105596188");
        java.lang.String str7 = creditDebit4.getPaymentId();
        java.lang.String str8 = creditDebit4.getPaymentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab105596188" + "'", str7, "ab105596188");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab105596188" + "'", str8, "ab105596188");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chief Event Coordinator" + "'", str8, "Chief Event Coordinator");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        main.RoomIterator roomIterator4 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(roomIterator4);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("ab107837014");
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
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(admin7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chief Event Coordinator" + "'", str8, "Chief Event Coordinator");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setPaymentId("LxigsRo1");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        main.ClosedState closedState0 = new main.ClosedState();
        java.lang.String str1 = closedState0.getStatus();
        java.lang.String str2 = closedState0.getStatus();
        java.lang.String str3 = closedState0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLOSED" + "'", str2, "CLOSED");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        java.lang.String str11 = admin10.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135paid" + "'", str11, "135paid");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        java.lang.String str9 = chiefEventCoordinator0.getAdminId();
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab87654321" + "'", str9, "ab87654321");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        double double7 = creditDebit4.getAmount();
        double double8 = creditDebit4.getAmount();
        creditDebit4.pay();
        creditDebit4.refund();
        creditDebit4.refund();
        creditDebit4.setPaymentId("Q!Z!3nXL");
        creditDebit4.setPaymentId("41paid");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10.0f, "151paid", (int) (short) 0, "");
        creditDebit4.refund();
        creditDebit4.setAmount(0.0d);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = chiefEventCoordinator0.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = admin8.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
        java.lang.String str6 = closedState0.getStatus();
        main.Room room7 = null;
        closedState0.close(room7);
        java.lang.Class<?> wildcardClass9 = closedState0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator9 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 0, "cd108917457", (-1), "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room11);
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        main.Room room3 = null;
        closedState0.close(room3);
        main.Room room5 = null;
        closedState0.close(room5);
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
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getId();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.RoomIterator roomIterator3 = chiefEventCoordinator0.getRoomIterator();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(roomIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("3n5!u6Nc");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        java.lang.String str1 = chiefEventCoordinator0.getRoleName();
        main.RoomIterator roomIterator2 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chief Event Coordinator" + "'", str1, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(roomIterator2);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        java.lang.String str1 = chiefEventCoordinator0.getPassword();
        main.Admin admin3 = chiefEventCoordinator0.generateAdminAcc("111paid");
        main.Room room4 = null;
        admin3.addRoom(room4);
        java.lang.String str6 = admin3.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin3);
// flaky "5) test543(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd103551529" + "'", str6, "cd103551529");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
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
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        java.lang.String str10 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        double double8 = chiefEventCoordinator0.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        java.lang.String str10 = chiefEventCoordinator0.getAdminId();
        main.Room room11 = null;
        chiefEventCoordinator0.addRoom(room11);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ab87654321" + "'", str10, "ab87654321");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.RoomIterator roomIterator6 = chiefEventCoordinator0.getRoomIterator();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        java.lang.String str9 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chief Event Coordinator" + "'", str9, "Chief Event Coordinator");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        java.lang.String str12 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ab87654321" + "'", str12, "ab87654321");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "80paid", 100, "102paid");
        double double5 = creditDebit4.getAmount();
        creditDebit4.refund();
        java.lang.String str7 = creditDebit4.getPaymentId();
        double double8 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
// flaky "6) test551(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "294paid" + "'", str7, "294paid");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        double double13 = chiefEventCoordinator0.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(admin12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        double double6 = creditDebit4.getAmount();
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("Q!Z!3nXL");
// flaky "7) test553(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "295paid" + "'", str5, "295paid");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.setAmount((double) 1.0f);
        creditDebit4.refund();
        double double8 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("ab87654321");
        java.lang.Class<?> wildcardClass11 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        boolean boolean10 = admin8.login("132paid");
        double double11 = admin8.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("101paid");
        main.Admin admin12 = chiefEventCoordinator0.generateAdminAcc("cd103551529");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertNotNull(admin12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getEmail();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        boolean boolean10 = chiefEventCoordinator0.login("68paid");
        java.lang.String str11 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coordinator@yorku.ca" + "'", str7, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        java.lang.String str6 = admin5.getId();
        java.lang.String str7 = admin5.getId();
        double double8 = admin5.getHourlyRate();
        main.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
// flaky "8) test559(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd101432118" + "'", str6, "cd101432118");
// flaky "3) test559(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd101432118" + "'", str7, "cd101432118");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
            chiefEventCoordinator0.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        boolean boolean7 = admin5.isVerified();
        java.lang.String str8 = admin5.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "9) test561(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd101650527" + "'", str8, "cd101650527");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "ab106737522", (int) '4', "xIBz5xAY");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) (short) 1);
        creditDebit4.setPaymentId("147paid");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        boolean boolean7 = chiefEventCoordinator0.login("25paid");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd108917457");
        java.lang.String str10 = chiefEventCoordinator0.getId();
        main.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.closeRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        java.lang.String str6 = chiefEventCoordinator0.getEmail();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setAmount((double) (-1.0f));
// flaky "10) test565(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "298paid" + "'", str5, "298paid");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = chiefEventCoordinator0.booking(room9, localDateTime10, localDateTime11);
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
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        java.lang.String str12 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ab87654321" + "'", str12, "ab87654321");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("135paid");
        creditDebit4.setPaymentId("23paid");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        double double13 = admin12.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(admin12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        closedState0.close(room11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("PMaoyNTw");
// flaky "11) test571(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "300paid" + "'", str5, "300paid");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        boolean boolean9 = chiefEventCoordinator0.login("ab104530562");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str2 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chief Event Coordinator" + "'", str2, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("xIBz5xAY");
        java.lang.String str9 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        main.RoomIterator roomIterator6 = chiefEventCoordinator0.getRoomIterator();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        java.lang.String str9 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        double double7 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str8 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chief Event Coordinator" + "'", str8, "Chief Event Coordinator");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10.0f, "197paid", (int) (byte) 10, "224paid");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str9 = admin8.getEmail();
        main.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin8.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25paid" + "'", str9, "25paid");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.lang.String str11 = chiefEventCoordinator0.getId();
        main.RoomIterator roomIterator12 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cd12345678" + "'", str11, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100, "cd107937503", (int) '#', "cd100640091");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        java.lang.String str9 = admin8.getAdminId();
        admin8.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
// flaky "12) test581(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab103257683" + "'", str9, "ab103257683");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.enableRoom(room2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10, "102paid", (int) (byte) 10, "ab87654321");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str4 = chiefEventCoordinator0.getEmail();
        chiefEventCoordinator0.logout();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coordinator@yorku.ca" + "'", str4, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        java.lang.Class<?> wildcardClass7 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setPaymentId("24paid");
        creditDebit4.refund();
        creditDebit4.setAmount((double) 0L);
        java.lang.String str10 = creditDebit4.getPaymentId();
        java.lang.String str11 = creditDebit4.getPaymentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "24paid" + "'", str10, "24paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24paid" + "'", str11, "24paid");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        boolean boolean13 = admin10.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        boolean boolean13 = admin12.isVerified();
        main.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin12.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.enable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(admin12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        boolean boolean13 = chiefEventCoordinator0.login("135paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1), "24paid", (int) (byte) 100, "");
        creditDebit4.setPaymentId("135paid");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        double double6 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("80paid");
        java.lang.String str9 = creditDebit4.getPaymentId();
// flaky "13) test595(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "307paid" + "'", str5, "307paid");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "80paid" + "'", str9, "80paid");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        boolean boolean11 = chiefEventCoordinator0.isVerified();
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
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean2 = chiefEventCoordinator0.isVerified();
        java.lang.String str3 = chiefEventCoordinator0.getId();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cd12345678" + "'", str3, "cd12345678");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) ' ', "", (int) (short) 0, "hi!");
        creditDebit4.setAmount(0.0d);
        java.lang.String str7 = creditDebit4.getPaymentId();
        java.lang.String str8 = creditDebit4.getPaymentId();
        creditDebit4.setAmount(97.0d);
// flaky "14) test598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "308paid" + "'", str7, "308paid");
// flaky "4) test598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "308paid" + "'", str8, "308paid");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean7 = chiefEventCoordinator0.login("");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.String str9 = chiefEventCoordinator0.getId();
        boolean boolean11 = chiefEventCoordinator0.login("cd101670014");
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
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertNotNull(admin10);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
        boolean boolean11 = chiefEventCoordinator0.login("80paid");
        main.RoomIterator roomIterator12 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str13 = chiefEventCoordinator0.getId();
        boolean boolean15 = chiefEventCoordinator0.login("cd101650527");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(roomIterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cd12345678" + "'", str13, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("23paid");
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "41paid", (int) '4', "25paid");
        creditDebit4.setAmount((double) (byte) -1);
        creditDebit4.pay();
        creditDebit4.refund();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = admin7.getAdminId();
        java.lang.String str9 = admin7.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
// flaky "15) test606(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab107245504" + "'", str8, "ab107245504");
// flaky "5) test606(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ab107245504" + "'", str9, "ab107245504");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        main.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin5.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "16) test607(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd105287681" + "'", str6, "cd105287681");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("102paid");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 10, "109paid", (int) (short) 0, "224paid");
        java.lang.String str5 = creditDebit4.getPaymentId();
// flaky "17) test609(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "310paid" + "'", str5, "310paid");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("102paid");
        java.lang.String str9 = admin8.getPassword();
        main.Room room10 = null;
        admin8.addRoom(room10);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(admin8);
// flaky "18) test610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mtvRQS3O" + "'", str9, "mtvRQS3O");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) 100.0f);
        java.lang.String str8 = creditDebit4.getPaymentId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
// flaky "19) test611(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "311paid" + "'", str8, "311paid");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "hi!", (int) (short) 0, "24paid");
        creditDebit4.setAmount((double) (short) -1);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        main.RoomIterator roomIterator11 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(roomIterator11);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        java.lang.Class<?> wildcardClass2 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        chiefEventCoordinator0.logout();
        java.lang.String str7 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cd12345678" + "'", str7, "cd12345678");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("102paid");
        java.lang.String str9 = admin8.getPassword();
        admin8.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(admin8);
// flaky "20) test618(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IHyy#wjM" + "'", str9, "IHyy#wjM");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "CLOSED", (int) (short) -1, "ab87654321");
        creditDebit4.refund();
        creditDebit4.refund();
        creditDebit4.refund();
        java.lang.String str8 = creditDebit4.getPaymentId();
// flaky "21) test619(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "313paid" + "'", str8, "313paid");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        boolean boolean9 = chiefEventCoordinator0.isVerified();
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        java.lang.String str7 = admin5.getAdminId();
        main.Room room8 = null;
        admin5.addRoom(room8);
        java.lang.String str10 = admin5.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "22) test621(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab103510547" + "'", str7, "ab103510547");
// flaky "6) test621(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd103510547" + "'", str10, "cd103510547");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        java.lang.String str10 = chiefEventCoordinator0.getId();
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd12345678" + "'", str10, "cd12345678");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10L, "cd12345678", (int) (byte) -1, "23paid");
        creditDebit4.setAmount((double) 'a');
        creditDebit4.setPaymentId("coordinator@yorku.ca");
        creditDebit4.setPaymentId("151paid");
        creditDebit4.setPaymentId("254paid");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("ab104530562");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(admin4);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str2 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chief Event Coordinator" + "'", str2, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        main.CreditDebit creditDebit4 = new main.CreditDebit(0.0d, "153paid", (int) '4', "102paid");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "80paid", 100, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("cd108889872");
// flaky "23) test627(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "316paid" + "'", str5, "316paid");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        boolean boolean7 = admin5.isVerified();
        java.lang.Class<?> wildcardClass8 = admin5.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
        java.lang.String str14 = closedState0.getStatus();
        main.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLOSED" + "'", str11, "CLOSED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CLOSED" + "'", str14, "CLOSED");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setPaymentId("hi!");
        double double9 = creditDebit4.getAmount();
        double double10 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("313paid");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        boolean boolean7 = chiefEventCoordinator0.login("hi!");
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        java.lang.String str10 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chief Event Coordinator" + "'", str10, "Chief Event Coordinator");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 100, "85paid", 1, "ab100241182");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        chiefEventCoordinator0.logout();
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("135paid");
        boolean boolean10 = admin9.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        java.lang.String str7 = chiefEventCoordinator0.getPassword();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        java.lang.String str11 = admin7.getEmail();
        admin7.logout();
        java.lang.String str13 = admin7.getPassword();
        admin7.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "24) test635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cd102062357" + "'", str10, "cd102062357");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "7) test635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mQqOEpHa" + "'", str13, "mQqOEpHa");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.refund();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        admin5.logout();
        double double8 = admin5.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1), "151paid", (int) (short) 0, "156paid");
        java.lang.Class<?> wildcardClass5 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        main.Room room13 = null;
        chiefEventCoordinator0.addRoom(room13);
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
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        java.lang.String str5 = closedState0.getStatus();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 0.0f, "Q!Z!3nXL", (int) (byte) 1, "ab106227606");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        main.Admin admin13 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        java.lang.String str14 = admin13.getEmail();
        main.Room room15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking18 = admin13.booking(room15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(admin13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ab87654321" + "'", str14, "ab87654321");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
            admin10.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        main.Room room5 = null;
        chiefEventCoordinator0.addRoom(room5);
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("101paid");
        java.lang.String str11 = admin10.getAdminId();
        admin10.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertNotNull(admin10);
// flaky "25) test646(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab107713104" + "'", str11, "ab107713104");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "24paid", 100, "");
        creditDebit4.pay();
        creditDebit4.refund();
        creditDebit4.setAmount((double) 100L);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
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
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str6 = admin5.getId();
        main.Room room7 = null;
        admin5.addRoom(room7);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "26) test649(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd101826267" + "'", str6, "cd101826267");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        main.Admin admin9 = chiefEventCoordinator0.generateAdminAcc("ab106909221");
        java.lang.String str10 = admin9.getPassword();
        java.lang.String str11 = admin9.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(admin9);
// flaky "27) test650(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hapBDga#" + "'", str10, "hapBDga#");
// flaky "8) test650(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hapBDga#" + "'", str11, "hapBDga#");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        creditDebit4.refund();
        double double8 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("xIBz5xAY");
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("109paid");
        main.Admin admin12 = chiefEventCoordinator0.generateAdminAcc("176paid");
        main.Room room13 = null;
        chiefEventCoordinator0.addRoom(room13);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertNotNull(admin12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
            admin9.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.disable()\" because \"room\" is null");
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
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 10.0f, "151paid", (int) (short) 0, "");
        creditDebit4.refund();
        creditDebit4.setAmount(100.0d);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        main.CreditDebit creditDebit4 = new main.CreditDebit(1.0d, "294paid", 0, "ab107837014");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 'a', "hi!", (int) '4', "hi!");
        creditDebit4.setAmount(0.0d);
        creditDebit4.setPaymentId("hi!");
        double double9 = creditDebit4.getAmount();
        creditDebit4.setAmount((double) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "cd100241182", (int) (short) 0, "101paid");
        creditDebit4.setAmount((double) 'a');
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 1, "cd108917457", (int) ' ', "147paid");
        creditDebit4.pay();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
            chiefEventCoordinator0.closeRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.close()\" because \"room\" is null");
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
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        double double15 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin17 = chiefEventCoordinator0.generateAdminAcc("fObnz9RI");
        main.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin17.enableRoom(room18);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(admin17);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        boolean boolean6 = chiefEventCoordinator0.login("68paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd104521961", (int) (byte) 1, "Chief Event Coordinator");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.pay();
        java.lang.String str7 = creditDebit4.getPaymentId();
        creditDebit4.pay();
        creditDebit4.setPaymentId("185paid");
        creditDebit4.refund();
// flaky "28) test663(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "329paid" + "'", str5, "329paid");
// flaky "9) test663(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "329paid" + "'", str7, "329paid");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getId();
        double double9 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str10 = chiefEventCoordinator0.getEmail();
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coordinator@yorku.ca" + "'", str10, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        main.RoomIterator roomIterator7 = chiefEventCoordinator0.getRoomIterator();
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
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        main.CreditDebit creditDebit4 = new main.CreditDebit(100.0d, "59paid", (int) (byte) -1, "cd101670014");
        creditDebit4.refund();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        double double6 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coordinator@yorku.ca" + "'", str8, "coordinator@yorku.ca");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        creditDebit4.refund();
        java.lang.String str6 = creditDebit4.getPaymentId();
        creditDebit4.setPaymentId("cd103510547");
// flaky "29) test668(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "331paid" + "'", str6, "331paid");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (short) 0, "ab106737522", (int) '4', "xIBz5xAY");
        creditDebit4.pay();
        java.lang.Class<?> wildcardClass6 = creditDebit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        java.lang.String str12 = closedState0.getStatus();
        main.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            closedState0.enable(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.setState(main.RoomState)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLOSED" + "'", str6, "CLOSED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLOSED" + "'", str7, "CLOSED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLOSED" + "'", str8, "CLOSED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CLOSED" + "'", str12, "CLOSED");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 10, "", (int) (short) 10, "hi!");
        creditDebit4.setAmount((double) 100);
        double double7 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("ab105596188");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        double double8 = chiefEventCoordinator0.getHourlyRate();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = chiefEventCoordinator0.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        java.lang.String str7 = chiefEventCoordinator0.getRoleName();
        boolean boolean8 = chiefEventCoordinator0.isVerified();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("101paid");
        main.Room room11 = null;
        chiefEventCoordinator0.addRoom(room11);
        java.lang.String str13 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chief Event Coordinator" + "'", str7, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ab87654321" + "'", str13, "ab87654321");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        boolean boolean6 = chiefEventCoordinator0.login("coordinator@yorku.ca");
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        closedState0.close(room10);
        main.Room room12 = null;
        closedState0.close(room12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        chiefEventCoordinator0.logout();
        main.Admin admin6 = chiefEventCoordinator0.generateAdminAcc("cd12345678");
        main.RoomIterator roomIterator7 = admin6.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin6);
        org.junit.Assert.assertNotNull(roomIterator7);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
        main.Room room7 = null;
        chiefEventCoordinator0.addRoom(room7);
        main.Room room9 = null;
        chiefEventCoordinator0.addRoom(room9);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1.0f), "cd104521961", (int) (byte) 1, "Chief Event Coordinator");
        java.lang.String str5 = creditDebit4.getPaymentId();
        creditDebit4.pay();
        java.lang.String str7 = creditDebit4.getPaymentId();
        creditDebit4.pay();
        creditDebit4.setPaymentId("cd104614389");
// flaky "30) test678(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "335paid" + "'", str5, "335paid");
// flaky "10) test678(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "335paid" + "'", str7, "335paid");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("");
        java.lang.String str8 = chiefEventCoordinator0.getId();
        main.Admin admin10 = chiefEventCoordinator0.generateAdminAcc("ab106737522");
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        boolean boolean13 = chiefEventCoordinator0.login("hi!");
        double double14 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertNotNull(admin10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        main.ClosedState closedState0 = new main.ClosedState();
        main.Room room1 = null;
        closedState0.close(room1);
        java.lang.String str3 = closedState0.getStatus();
        java.lang.String str4 = closedState0.getStatus();
        main.Room room5 = null;
        closedState0.close(room5);
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
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        java.lang.String str11 = chiefEventCoordinator0.getAdminId();
        boolean boolean12 = chiefEventCoordinator0.isVerified();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ab87654321" + "'", str11, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        main.RoomIterator roomIterator5 = chiefEventCoordinator0.getRoomIterator();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str7 = chiefEventCoordinator0.getAdminId();
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab87654321" + "'", str7, "ab87654321");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        main.Room room4 = null;
        chiefEventCoordinator0.addRoom(room4);
        java.lang.String str6 = chiefEventCoordinator0.getId();
        boolean boolean7 = chiefEventCoordinator0.isVerified();
        java.lang.String str8 = chiefEventCoordinator0.getId();
        double double9 = chiefEventCoordinator0.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cd12345678" + "'", str8, "cd12345678");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) -1, "ab87654321", 100, "cd12345678");
        creditDebit4.setAmount((double) (byte) -1);
        java.lang.String str7 = creditDebit4.getPaymentId();
        creditDebit4.pay();
// flaky "31) test685(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336paid" + "'", str7, "336paid");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str2 = chiefEventCoordinator0.getAdminId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab87654321" + "'", str2, "ab87654321");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        java.lang.String str6 = chiefEventCoordinator0.getAdminId();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("14paid");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ab87654321" + "'", str6, "ab87654321");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        java.lang.String str12 = chiefEventCoordinator0.getPassword();
        java.lang.String str13 = chiefEventCoordinator0.getId();
        java.lang.String str14 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(roomIterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cd12345678" + "'", str13, "cd12345678");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        main.Admin admin4 = chiefEventCoordinator0.generateAdminAcc("cd104521961");
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(admin4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        double double6 = chiefEventCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        boolean boolean11 = chiefEventCoordinator0.login("80paid");
        main.RoomIterator roomIterator12 = chiefEventCoordinator0.getRoomIterator();
        main.RoomIterator roomIterator13 = chiefEventCoordinator0.getRoomIterator();
        java.lang.String str14 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(roomIterator12);
        org.junit.Assert.assertNotNull(roomIterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "cd12345678" + "'", str14, "cd12345678");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) '#', "14paid", (-1), "14paid");
        double double5 = creditDebit4.getAmount();
        java.lang.Class<?> wildcardClass6 = creditDebit4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        main.RoomIterator roomIterator6 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertNotNull(roomIterator6);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        main.CreditDebit creditDebit4 = new main.CreditDebit(10.0d, "275paid", 100, "156paid");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
        boolean boolean14 = admin9.login("");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(admin9);
        org.junit.Assert.assertNotNull(roomIterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setAmount(1.0d);
        creditDebit4.setPaymentId("ab106737522");
        creditDebit4.setAmount(10.0d);
        double double12 = creditDebit4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
        java.lang.String str13 = chiefEventCoordinator0.getRoleName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cd12345678" + "'", str6, "cd12345678");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(admin12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chief Event Coordinator" + "'", str13, "Chief Event Coordinator");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        double double5 = chiefEventCoordinator0.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        chiefEventCoordinator0.logout();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("25paid");
        java.lang.String str9 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coordinator@yorku.ca" + "'", str9, "coordinator@yorku.ca");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        java.lang.String str7 = admin5.getAdminId();
        java.lang.String str8 = admin5.getEmail();
        admin5.logout();
        double double10 = admin5.getHourlyRate();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
// flaky "32) test702(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ab104487799" + "'", str7, "ab104487799");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25paid" + "'", str8, "25paid");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        java.lang.String str5 = chiefEventCoordinator0.getAdminId();
        boolean boolean6 = chiefEventCoordinator0.isVerified();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ab87654321" + "'", str5, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        boolean boolean1 = chiefEventCoordinator0.isVerified();
        main.RoomIterator roomIterator2 = chiefEventCoordinator0.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(roomIterator2);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
        chiefEventCoordinator0.logout();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roomIterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(admin8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (byte) 100, "175paid", (int) '4', "85paid");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean4 = chiefEventCoordinator0.isVerified();
        java.lang.String str5 = chiefEventCoordinator0.getRoleName();
        main.Room room6 = null;
        chiefEventCoordinator0.addRoom(room6);
        java.lang.String str8 = chiefEventCoordinator0.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief Event Coordinator" + "'", str5, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coordinator@yorku.ca" + "'", str8, "coordinator@yorku.ca");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        main.Room room1 = null;
        chiefEventCoordinator0.addRoom(room1);
        double double3 = chiefEventCoordinator0.getHourlyRate();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("ab87654321");
        chiefEventCoordinator0.logout();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("cd100241182");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) 100.0f, "", (int) (byte) -1, "coordinator@yorku.ca");
        double double5 = creditDebit4.getAmount();
        creditDebit4.setPaymentId("41paid");
        // The following exception was thrown during execution in test generation
        try {
            creditDebit4.pay();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [-4, 0) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getId();
        java.lang.String str6 = chiefEventCoordinator0.getPassword();
        chiefEventCoordinator0.logout();
        java.lang.String str8 = chiefEventCoordinator0.getAdminId();
        java.lang.String str9 = chiefEventCoordinator0.getId();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ab87654321" + "'", str8, "ab87654321");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cd12345678" + "'", str9, "cd12345678");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        boolean boolean3 = chiefEventCoordinator0.isVerified();
        main.Admin admin5 = chiefEventCoordinator0.generateAdminAcc("25paid");
        admin5.logout();
        admin5.logout();
        main.RoomIterator roomIterator8 = admin5.getRoomIterator();
        main.RoomIterator roomIterator9 = admin5.getRoomIterator();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(admin5);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertNotNull(roomIterator9);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
        java.lang.String str11 = chiefEventCoordinator0.getRoleName();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomIterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chief Event Coordinator" + "'", str11, "Chief Event Coordinator");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
        java.lang.String str13 = closedState0.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLOSED" + "'", str3, "CLOSED");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CLOSED" + "'", str10, "CLOSED");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLOSED" + "'", str13, "CLOSED");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        java.lang.String str4 = chiefEventCoordinator0.getAdminId();
        boolean boolean5 = chiefEventCoordinator0.isVerified();
        java.lang.String str6 = chiefEventCoordinator0.getAdminId();
        main.Admin admin8 = chiefEventCoordinator0.generateAdminAcc("cd105234132");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ab87654321" + "'", str4, "ab87654321");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ab87654321" + "'", str6, "ab87654321");
        org.junit.Assert.assertNotNull(admin8);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        main.Admin admin7 = chiefEventCoordinator0.generateAdminAcc("CLOSED");
        boolean boolean9 = chiefEventCoordinator0.login("135paid");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertNotNull(admin7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        double double2 = chiefEventCoordinator0.getHourlyRate();
        java.lang.String str3 = chiefEventCoordinator0.getEmail();
        java.lang.String str4 = chiefEventCoordinator0.getRoleName();
        java.lang.String str5 = chiefEventCoordinator0.getId();
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coordinator@yorku.ca" + "'", str3, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chief Event Coordinator" + "'", str4, "Chief Event Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cd12345678" + "'", str5, "cd12345678");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coordinator@yorku.ca" + "'", str6, "coordinator@yorku.ca");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        main.CreditDebit creditDebit4 = new main.CreditDebit((double) (-1L), "", (int) (byte) 10, "");
        java.lang.String str5 = creditDebit4.getPaymentId();
        double double6 = creditDebit4.getAmount();
// flaky "33) test717(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "342paid" + "'", str5, "342paid");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        main.ChiefEventCoordinator chiefEventCoordinator0 = main.ChiefEventCoordinator.getInstance();
        double double1 = chiefEventCoordinator0.getHourlyRate();
        main.Room room2 = null;
        chiefEventCoordinator0.addRoom(room2);
        chiefEventCoordinator0.logout();
        java.lang.String str5 = chiefEventCoordinator0.getEmail();
        java.lang.String str6 = chiefEventCoordinator0.getRoleName();
        chiefEventCoordinator0.logout();
        main.Room room8 = null;
        chiefEventCoordinator0.addRoom(room8);
        main.Admin admin11 = chiefEventCoordinator0.generateAdminAcc("335paid");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "coordinator@yorku.ca" + "'", str5, "coordinator@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chief Event Coordinator" + "'", str6, "Chief Event Coordinator");
        org.junit.Assert.assertNotNull(admin11);
    }
}
