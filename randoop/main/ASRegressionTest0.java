package main;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ASRegressionTest0 {

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
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        java.lang.Class<?> wildcardClass4 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.UserFactory userFactory0 = new main.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "", "", "hi!", false, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.disable();
        java.lang.Class<?> wildcardClass11 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.Booking booking0 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.PartnerBookingDecorator partnerBookingDecorator1 = new main.PartnerBookingDecorator(booking0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        main.RoomState roomState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("hi!", "hi!", "hi!", "", false, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("hi!", "hi!", "", "", true, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        java.lang.String str7 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "AVAILABLE", "", "hi!", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "AVAILABLE", "", "", true, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "", "AVAILABLE", "hi!", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        main.RoomState roomState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.Room room3 = new main.Room("hi!", "", (int) (short) -1);
        room3.close();
        java.lang.Class<?> wildcardClass5 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        room3.close();
        main.RoomState roomState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room4, localDateTime6, localDateTime7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.disable();
        main.RoomState roomState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.close();
        java.lang.String str11 = room3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLOSED" + "'", str11, "CLOSED");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        main.RoomState roomState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        java.lang.Class<?> wildcardClass12 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        java.lang.String str9 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.Room room3 = new main.Room("", "", 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.Room room3 = new main.Room("hi!", "", (int) (short) -1);
        room3.enable();
        java.lang.Class<?> wildcardClass5 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.enable();
        room3.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        room4.close();
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isAvailable();
        room4.setStatus("DISABLED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.close();
        main.Badge badge7 = null;
        room4.update(badge7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.close();
        room4.close();
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        java.lang.String str11 = room3.getStatus();
        main.RoomState roomState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "", "hi!", "DISABLED", true, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        java.lang.String str7 = room3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = main.Booking.roomAvailable(room3, localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.Room room3 = new main.Room("hi!", "hi!", 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        main.RoomState roomState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        boolean boolean7 = room3.isClosed();
        java.lang.String str8 = room3.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        java.lang.String str5 = room4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AVAILABLE" + "'", str5, "AVAILABLE");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.enable();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        main.RoomState roomState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        java.lang.String str6 = room3.getRoomNumber();
        main.Badge badge7 = null;
        room3.update(badge7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = main.Booking.roomAvailable(room4, localDateTime7, localDateTime8);
        room4.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isClosed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        boolean boolean11 = room3.isClosed();
        java.lang.Class<?> wildcardClass12 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isAvailable();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isClosed();
        room4.setStatus("DISABLED");
        main.RoomState roomState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("CLOSED");
        room3.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "AVAILABLE", "AVAILABLE", "", true, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "hi!", "AVAILABLE", "CLOSED", false, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.Room room3 = new main.Room("hi!", "hi!", (int) (short) 0);
        room3.close();
        main.Badge badge5 = null;
        room3.update(badge5);
        java.lang.Class<?> wildcardClass7 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.Room room3 = new main.Room("AVAILABLE", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.RoomState roomState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        main.Badge badge8 = null;
        room4.update(badge8);
        room4.disable();
        main.Badge badge11 = null;
        room4.update(badge11);
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("hi!", "hi!", "CLOSED", "hi!", false, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("AVAILABLE", "", "hi!", "hi!", false, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.disable();
        boolean boolean5 = room3.isAvailable();
        java.lang.Class<?> wildcardClass6 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.Room room3 = new main.Room("hi!", "", (int) (short) -1);
        room3.close();
        java.lang.String str5 = room3.getRoomNumber();
        room3.disable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "CLOSED", "AVAILABLE", "DISABLED", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isClosed();
        room4.setStatus("DISABLED");
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        java.lang.String str10 = room3.getStatus();
        java.lang.String str11 = room3.getRoomNumber();
        room3.close();
        main.RoomState roomState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.setStatus("AVAILABLE");
        room4.disable();
        room4.disable();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "", "AVAILABLE", "DISABLED", true, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.setStatus("AVAILABLE");
        boolean boolean13 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        java.lang.String str8 = room4.getBuilding();
        int int9 = room4.getCapacity();
        room4.enable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isClosed();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        boolean boolean5 = room3.isClosed();
        java.lang.Class<?> wildcardClass6 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.disable();
        java.lang.String str12 = room3.getStatus();
        int int13 = room3.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DISABLED" + "'", str12, "DISABLED");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        java.lang.Class<?> wildcardClass12 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.disable();
        java.lang.Class<?> wildcardClass12 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "DISABLED", "hi!", "", true, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        boolean boolean6 = room3.isClosed();
        java.lang.Class<?> wildcardClass7 = room3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.Room room3 = new main.Room("hi!", "CLOSED", (int) (byte) -1);
        java.lang.String str4 = room3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.Room room3 = new main.Room("DISABLED", "hi!", (int) (short) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("AVAILABLE", "CLOSED", "CLOSED", "CLOSED", false, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        java.lang.String str10 = room3.getStatus();
        java.lang.String str11 = room3.getRoomNumber();
        main.Badge badge12 = null;
        room3.update(badge12);
        java.lang.String str14 = room3.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        main.RoomState roomState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        boolean boolean7 = room3.isClosed();
        java.lang.String str8 = room3.getStatus();
        room3.close();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAILABLE" + "'", str8, "AVAILABLE");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("hi!", "AVAILABLE", "AVAILABLE", "hi!", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        java.lang.String str12 = room3.getRoomNumber();
        java.lang.String str13 = room3.getStatus();
        main.RoomState roomState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLOSED" + "'", str13, "CLOSED");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        boolean boolean5 = room3.isAvailable();
        room3.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.disable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.close();
        java.lang.String str11 = room3.getBuilding();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = main.Booking.roomAvailable(room3, localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.Room room3 = new main.Room("hi!", "", (int) (short) -1);
        room3.close();
        java.lang.String str5 = room3.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLOSED" + "'", str5, "CLOSED");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = main.Booking.roomAvailable(room4, localDateTime7, localDateTime8);
        room4.disable();
        room4.setStatus("DISABLED");
        java.lang.String str13 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        java.lang.String str12 = room3.getRoomNumber();
        java.lang.String str13 = room3.getStatus();
        boolean boolean14 = room3.isClosed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLOSED" + "'", str13, "CLOSED");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "", "", "hi!", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        main.Badge badge8 = null;
        room4.update(badge8);
        java.lang.String str10 = room4.getBuilding();
        boolean boolean11 = room4.isClosed();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.Room room4 = new main.Room("", "DISABLED", 1, "DISABLED");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        java.lang.String str7 = room3.getBuilding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.lang.String str7 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.disable();
        java.lang.String str5 = room3.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DISABLED" + "'", str5, "DISABLED");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.Room room4 = new main.Room("hi!", "DISABLED", (int) (byte) -1, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.Room room3 = new main.Room("", "DISABLED", (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.Room room3 = new main.Room("DISABLED", "DISABLED", (int) (byte) -1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        boolean boolean12 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.Room room3 = new main.Room("hi!", "hi!", (int) (short) 0);
        room3.close();
        java.lang.String str5 = room3.getBuilding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        int int12 = room3.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.Room room4 = new main.Room("CLOSED", "AVAILABLE", (int) (byte) -1, "AVAILABLE");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.close();
        main.Badge badge6 = null;
        room4.update(badge6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.disable();
        room3.disable();
        java.lang.Class<?> wildcardClass13 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.Room room3 = new main.Room("AVAILABLE", "DISABLED", (int) 'a');
        room3.disable();
        room3.disable();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "CLOSED", "", "AVAILABLE", false, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.RoomState roomState10 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "CLOSED", "", "", true, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        main.RoomState roomState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.lang.String str4 = room3.getStatus();
        main.Badge badge5 = null;
        room3.update(badge5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        boolean boolean5 = room4.isAvailable();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isAvailable();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.close();
        room4.close();
        java.lang.String str8 = room4.getBuilding();
        room4.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        boolean boolean7 = room3.isClosed();
        room3.setStatus("DISABLED");
        room3.setStatus("");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = main.Booking.roomAvailable(room3, localDateTime12, localDateTime13);
        java.lang.Class<?> wildcardClass15 = room3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isAvailable();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = main.Booking.roomAvailable(room4, localDateTime10, localDateTime11);
        boolean boolean13 = room4.isAvailable();
        java.lang.String str14 = room4.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AVAILABLE" + "'", str14, "AVAILABLE");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.Room room4 = new main.Room("", "hi!", (int) (byte) 10, "CLOSED");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        java.lang.String str10 = room3.getStatus();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.disable();
        java.lang.String str5 = room3.getRoomNumber();
        java.lang.String str6 = room3.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.Room room4 = new main.Room("DISABLED", "", (int) (byte) -1, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.Room room3 = new main.Room("", "DISABLED", (int) (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.Room room3 = new main.Room("", "", (int) (short) 10);
        room3.setStatus("");
        boolean boolean6 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.enable();
        room3.disable();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        boolean boolean5 = room3.isClosed();
        room3.close();
        main.RoomState roomState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        boolean boolean7 = room3.isClosed();
        room3.setStatus("DISABLED");
        room3.setStatus("");
        room3.enable();
        java.lang.Class<?> wildcardClass13 = room3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "CLOSED", "CLOSED", "hi!", false, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.lang.String str7 = room4.getBuilding();
        room4.close();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        room4.disable();
        room4.close();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        java.lang.String str4 = room3.getStatus();
        boolean boolean5 = room3.isClosed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("AVAILABLE", "hi!", "hi!", "AVAILABLE", false, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        room4.setStatus("AVAILABLE");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        room3.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.disable();
        main.Badge badge12 = null;
        room3.update(badge12);
        java.lang.String str14 = room3.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        boolean boolean11 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        java.lang.String str5 = room3.getBuilding();
        room3.setStatus("DISABLED");
        int int8 = room3.getCapacity();
        room3.close();
        java.lang.String str10 = room3.getBuilding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        main.Badge badge8 = null;
        room4.update(badge8);
        room4.disable();
        main.Badge badge11 = null;
        room4.update(badge11);
        main.Badge badge13 = null;
        room4.update(badge13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.Room room3 = new main.Room("DISABLED", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.disable();
        boolean boolean11 = room3.isClosed();
        main.Badge badge12 = null;
        room3.update(badge12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        boolean boolean7 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.Room room4 = new main.Room("AVAILABLE", "AVAILABLE", (int) ' ', "CLOSED");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = main.Booking.roomAvailable(room4, localDateTime7, localDateTime8);
        main.Badge badge10 = null;
        room4.update(badge10);
        int int12 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.setStatus("AVAILABLE");
        room4.disable();
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.Room room3 = new main.Room("hi!", "hi!", 100);
        room3.enable();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.Room room4 = new main.Room("hi!", "hi!", 0, "AVAILABLE");
        boolean boolean5 = room4.isClosed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.Room room3 = new main.Room("CLOSED", "hi!", (int) (short) 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        java.lang.String str11 = room3.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = main.Booking.roomAvailable(room3, localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLOSED" + "'", str11, "CLOSED");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.disable();
        room3.setStatus("DISABLED");
        boolean boolean12 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        room3.enable();
        room3.setStatus("AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.disable();
        java.lang.String str12 = room3.getStatus();
        java.lang.String str13 = room3.getBuilding();
        java.lang.String str14 = room3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DISABLED" + "'", str12, "DISABLED");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DISABLED" + "'", str14, "DISABLED");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "", "", "CLOSED", true, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.Room room3 = new main.Room("", "", (int) (short) 10);
        main.Badge badge4 = null;
        room3.update(badge4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.setStatus("AVAILABLE");
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.Room room4 = new main.Room("DISABLED", "AVAILABLE", (int) '4', "DISABLED");
        boolean boolean5 = room4.isClosed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "", "", "DISABLED", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.setStatus("AVAILABLE");
        main.Badge badge13 = null;
        room3.update(badge13);
        room3.disable();
        java.lang.String str16 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        main.RoomState roomState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.Room room3 = new main.Room("hi!", "hi!", 100);
        boolean boolean4 = room3.isAvailable();
        main.RoomState roomState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        room4.disable();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = main.Booking.roomAvailable(room4, localDateTime8, localDateTime9);
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.Room room3 = new main.Room("AVAILABLE", "", 10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        int int7 = room4.getCapacity();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = main.Booking.roomAvailable(room4, localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isAvailable();
        room4.close();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.Room room3 = new main.Room("DISABLED", "CLOSED", (int) (short) 1);
        room3.close();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        java.lang.String str11 = room3.getStatus();
        java.lang.String str12 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        main.RoomState roomState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.disable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        boolean boolean11 = room3.isClosed();
        int int12 = room3.getCapacity();
        java.lang.String str13 = room3.getBuilding();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = main.Booking.roomAvailable(room4, localDateTime7, localDateTime8);
        room4.disable();
        room4.setStatus("DISABLED");
        room4.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.lang.String str7 = room4.getStatus();
        main.RoomState roomState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DISABLED" + "'", str7, "DISABLED");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.Room room3 = new main.Room("AVAILABLE", "", (int) (short) -1);
        room3.setStatus("DISABLED");
        main.Badge badge6 = null;
        room3.update(badge6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.close();
        room4.close();
        room4.enable();
        boolean boolean8 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        main.RoomState roomState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.lang.String str4 = room3.getStatus();
        java.lang.String str5 = room3.getRoomNumber();
        room3.enable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.Room room4 = new main.Room("DISABLED", "", (int) (byte) 10, "CLOSED");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.disable();
        boolean boolean5 = room3.isAvailable();
        int int6 = room3.getCapacity();
        room3.enable();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = main.Booking.roomAvailable(room3, localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        java.lang.String str12 = room3.getRoomNumber();
        java.lang.String str13 = room3.getBuilding();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "AVAILABLE", "", "CLOSED", true, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.setStatus("AVAILABLE");
        boolean boolean13 = room3.isClosed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        main.Badge badge5 = null;
        room3.update(badge5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.setStatus("AVAILABLE");
        java.lang.String str13 = room3.getStatus();
        boolean boolean14 = room3.isClosed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLOSED" + "'", str13, "CLOSED");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.Room room3 = new main.Room("DISABLED", "CLOSED", (int) (short) 1);
        boolean boolean4 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        boolean boolean11 = room3.isClosed();
        java.lang.String str12 = room3.getStatus();
        java.lang.Class<?> wildcardClass13 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AVAILABLE" + "'", str12, "AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.Room room4 = new main.Room("CLOSED", "hi!", (int) '#', "hi!");
        boolean boolean5 = room4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        boolean boolean8 = room4.isClosed();
        java.lang.String str9 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        room3.disable();
        java.lang.String str10 = room3.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.lang.String str4 = room3.getStatus();
        java.lang.String str5 = room3.getRoomNumber();
        boolean boolean6 = room3.isAvailable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isClosed();
        main.Badge badge6 = null;
        room4.update(badge6);
        room4.disable();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.disable();
        java.lang.String str12 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.Room room3 = new main.Room("CLOSED", "DISABLED", (int) ' ');
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.Room room3 = new main.Room("hi!", "", (int) (short) -1);
        room3.close();
        boolean boolean5 = room3.isAvailable();
        room3.setStatus("DISABLED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        java.lang.String str10 = room3.getStatus();
        java.lang.String str11 = room3.getRoomNumber();
        main.Badge badge12 = null;
        room3.update(badge12);
        boolean boolean14 = room3.isClosed();
        main.RoomState roomState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "AVAILABLE", "", "", true, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.Room room3 = new main.Room("AVAILABLE", "DISABLED", (int) '4');
        room3.enable();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.close();
        java.lang.String str11 = room3.getBuilding();
        java.lang.String str12 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.Room room4 = new main.Room("", "", (int) (byte) 100, "DISABLED");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        java.lang.String str12 = room3.getRoomNumber();
        room3.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        main.Badge badge9 = null;
        room3.update(badge9);
        main.RoomState roomState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.disable();
        main.Badge badge12 = null;
        room3.update(badge12);
        room3.disable();
        java.lang.String str15 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.lang.Class<?> wildcardClass9 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.disable();
        room3.close();
        room3.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.Room room3 = new main.Room("", "hi!", (int) ' ');
        java.lang.String str4 = room3.getStatus();
        boolean boolean5 = room3.isClosed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AVAILABLE" + "'", str4, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isAvailable();
        room4.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.Room room3 = new main.Room("hi!", "hi!", (int) 'a');
        main.Badge badge4 = null;
        room3.update(badge4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isAvailable();
        java.lang.String str10 = room4.getStatus();
        boolean boolean11 = room4.isClosed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        main.Badge badge9 = null;
        room3.update(badge9);
        java.lang.Class<?> wildcardClass11 = room3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.Room room4 = new main.Room("AVAILABLE", "CLOSED", (int) (short) 1, "AVAILABLE");
        main.RoomState roomState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        room3.setStatus("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = main.Booking.roomAvailable(room3, localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.Room room3 = new main.Room("", "CLOSED", (int) (short) 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.Room room4 = new main.Room("hi!", "", 10, "");
        main.RoomState roomState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.setStatus("AVAILABLE");
        room4.disable();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DISABLED" + "'", str9, "DISABLED");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.Room room4 = new main.Room("AVAILABLE", "", (int) (byte) 100, "AVAILABLE");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        java.lang.String str5 = room3.getBuilding();
        room3.setStatus("DISABLED");
        room3.setStatus("AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        main.Badge badge11 = null;
        room3.update(badge11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.Room room3 = new main.Room("CLOSED", "hi!", (int) (byte) -1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.Room room3 = new main.Room("CLOSED", "AVAILABLE", (-1));
        room3.close();
        java.lang.Class<?> wildcardClass5 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.Room room3 = new main.Room("AVAILABLE", "", (int) (byte) 10);
        room3.close();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.Room room3 = new main.Room("AVAILABLE", "", (int) (short) -1);
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        room3.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.enable();
        boolean boolean5 = room3.isClosed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isClosed();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = main.Booking.roomAvailable(room4, localDateTime10, localDateTime11);
        main.RoomState roomState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.Room room4 = new main.Room("hi!", "", 1, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        java.lang.String str7 = room3.getStatus();
        int int8 = room3.getCapacity();
        java.lang.String str9 = room3.getStatus();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = main.Booking.roomAvailable(room3, localDateTime10, localDateTime11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AVAILABLE" + "'", str9, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.Room room4 = new main.Room("hi!", "hi!", 0, "AVAILABLE");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        boolean boolean7 = room3.isClosed();
        main.Badge badge8 = null;
        room3.update(badge8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        main.Badge badge8 = null;
        room4.update(badge8);
        room4.disable();
        main.Badge badge11 = null;
        room4.update(badge11);
        int int13 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.lang.String str6 = room3.getRoomNumber();
        boolean boolean7 = room3.isClosed();
        room3.enable();
        int int9 = room3.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.Room room4 = new main.Room("hi!", "", (int) 'a', "hi!");
        room4.disable();
        boolean boolean6 = room4.isClosed();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = main.Booking.roomAvailable(room4, localDateTime7, localDateTime8);
        room4.disable();
        room4.close();
        java.lang.String str12 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("DISABLED", "hi!", "DISABLED", "CLOSED", false, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: DISABLED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        room3.enable();
        java.lang.String str12 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.close();
        room4.close();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.Room room3 = new main.Room("hi!", "", (int) (short) 100);
        room3.disable();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = main.Booking.roomAvailable(room3, localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        int int5 = room3.getCapacity();
        java.lang.String str6 = room3.getRoomNumber();
        main.RoomState roomState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        main.Badge badge10 = null;
        room3.update(badge10);
        java.lang.String str12 = room3.getRoomNumber();
        room3.disable();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        java.lang.String str8 = room4.getBuilding();
        room4.enable();
        java.lang.String str10 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("AVAILABLE", "CLOSED", "CLOSED", "CLOSED", false, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        boolean boolean7 = room3.isClosed();
        main.Badge badge8 = null;
        room3.update(badge8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        room4.close();
        room4.close();
        java.lang.String str8 = room4.getBuilding();
        room4.setStatus("DISABLED");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("hi!", "DISABLED", "hi!", "", false, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("", "", "AVAILABLE", "AVAILABLE", false, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.Room room4 = new main.Room("", "", (int) 'a', "");
        int int5 = room4.getCapacity();
        main.Badge badge6 = null;
        room4.update(badge6);
        room4.close();
        java.lang.String str9 = room4.getStatus();
        room4.enable();
        java.lang.String str11 = room4.getStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLOSED" + "'", str9, "CLOSED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        java.lang.String str12 = room3.getRoomNumber();
        room3.close();
        java.lang.String str14 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.close();
        java.lang.String str11 = room3.getBuilding();
        boolean boolean12 = room3.isClosed();
        boolean boolean13 = room3.isAvailable();
        boolean boolean14 = room3.isClosed();
        java.lang.String str15 = room3.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.Room room3 = new main.Room("DISABLED", "DISABLED", (int) 'a');
        java.lang.Class<?> wildcardClass4 = room3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        main.Badge badge7 = null;
        room3.update(badge7);
        room3.close();
        boolean boolean10 = room3.isAvailable();
        java.lang.String str11 = room3.getStatus();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLOSED" + "'", str11, "CLOSED");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        boolean boolean5 = room4.isClosed();
        main.Badge badge6 = null;
        room4.update(badge6);
        main.RoomState roomState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            room4.setState(roomState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.Room room3 = new main.Room("AVAILABLE", "AVAILABLE", 0);
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = main.Booking.roomAvailable(room3, localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.enable();
        boolean boolean5 = room3.isClosed();
        java.lang.String str6 = room3.getStatus();
        main.RoomState roomState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AVAILABLE" + "'", str6, "AVAILABLE");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.Room room3 = new main.Room("CLOSED", "AVAILABLE", 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.disable();
        java.lang.String str12 = room3.getStatus();
        boolean boolean13 = room3.isClosed();
        boolean boolean14 = room3.isClosed();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DISABLED" + "'", str12, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isClosed();
        room4.close();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        room3.setStatus("CLOSED");
        int int14 = room3.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.disable();
        room3.enable();
        java.lang.String str6 = room3.getBuilding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        room3.disable();
        main.Badge badge10 = null;
        room3.update(badge10);
        room3.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        int int11 = room3.getCapacity();
        java.lang.String str12 = room3.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.Room room3 = new main.Room("DISABLED", "", (int) (short) 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.Room room3 = new main.Room("hi!", "DISABLED", (int) (short) 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        room3.close();
        java.lang.String str11 = room3.getBuilding();
        boolean boolean12 = room3.isClosed();
        java.lang.String str13 = room3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLOSED" + "'", str13, "CLOSED");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        java.lang.String str4 = room3.getRoomNumber();
        room3.disable();
        int int6 = room3.getCapacity();
        room3.disable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getRoomNumber();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isAvailable();
        java.lang.String str10 = room4.getRoomNumber();
        room4.disable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        main.Room room4 = new main.Room("", "hi!", (int) ' ', "hi!");
        room4.setStatus("AVAILABLE");
        room4.enable();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        java.lang.String str10 = room3.getStatus();
        java.lang.String str11 = room3.getRoomNumber();
        main.Badge badge12 = null;
        room3.update(badge12);
        boolean boolean14 = room3.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AVAILABLE" + "'", str10, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.Room room4 = new main.Room("AVAILABLE", "", 0, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        main.Room room4 = new main.Room("", "CLOSED", 10, "hi!");
        room4.close();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        boolean boolean11 = room3.isClosed();
        int int12 = room3.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        room3.setStatus("");
        room3.enable();
        room3.close();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.Room room4 = new main.Room("", "", (int) (byte) 1, "hi!");
        room4.setStatus("hi!");
        java.lang.String str7 = room4.getStatus();
        java.lang.String str8 = room4.getBuilding();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isAvailable();
        java.lang.String str11 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.Room room3 = new main.Room("CLOSED", "DISABLED", (int) (short) 0);
        java.lang.String str4 = room3.getBuilding();
        java.lang.Class<?> wildcardClass5 = room3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DISABLED" + "'", str4, "DISABLED");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        main.Room room4 = new main.Room("CLOSED", "hi!", 1, "DISABLED");
        java.lang.String str5 = room4.getStatus();
        boolean boolean6 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DISABLED" + "'", str5, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.Room room4 = new main.Room("hi!", "DISABLED", (int) (short) 0, "AVAILABLE");
        main.Badge badge5 = null;
        room4.update(badge5);
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.Room room4 = new main.Room("CLOSED", "hi!", (int) '#', "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        boolean boolean6 = room3.isClosed();
        room3.setStatus("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = main.Booking.roomAvailable(room3, localDateTime9, localDateTime10);
        java.lang.String str12 = room3.getRoomNumber();
        java.lang.String str13 = room3.getBuilding();
        boolean boolean14 = room3.isClosed();
        room3.close();
        room3.close();
        room3.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.Room room3 = new main.Room("", "hi!", 0);
        java.lang.String str4 = room3.getRoomNumber();
        room3.enable();
        room3.close();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            main.User user6 = main.UserFactory.createUser("CLOSED", "", "DISABLED", "AVAILABLE", true, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported account type: CLOSED");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        main.Room room4 = new main.Room("", "DISABLED", (int) (byte) 100, "");
        java.lang.String str5 = room4.getBuilding();
        boolean boolean6 = room4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DISABLED" + "'", str5, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.Room room3 = new main.Room("CLOSED", "DISABLED", (int) (short) 0);
        java.lang.String str4 = room3.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLOSED" + "'", str4, "CLOSED");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        main.Room room3 = new main.Room("", "hi!", 0);
        room3.enable();
        room3.close();
        main.RoomState roomState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            room3.setState(roomState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.RoomState.getStatus()\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.Room room3 = new main.Room("hi!", "", (int) 'a');
        room3.setStatus("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = main.Booking.roomAvailable(room3, localDateTime6, localDateTime7);
        boolean boolean9 = room3.isAvailable();
        int int10 = room3.getCapacity();
        boolean boolean11 = room3.isClosed();
        int int12 = room3.getCapacity();
        java.lang.String str13 = room3.getBuilding();
        room3.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

