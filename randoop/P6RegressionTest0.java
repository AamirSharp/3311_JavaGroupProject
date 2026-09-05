import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P6RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0001");
        main.Booking booking0 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.StaffBookingDecorator staffBookingDecorator1 = new main.StaffBookingDecorator(booking0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0002");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0003");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0004");
        main.Room room0 = null;
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = main.Booking.roomAvailable(room0, localDateTime1, localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0005");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0006");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0007");
        main.Booking booking0 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.StudentBookingDecorator studentBookingDecorator1 = new main.StudentBookingDecorator(booking0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0008");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0009");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0010");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0011");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        boolean boolean9 = student5.isVerified();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0012");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0013");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0014");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        double double8 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0015");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0016");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        double double10 = student5.getHourlyRate();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0017");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0018");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0019");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0020");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0021");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0022");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0023");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0024");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        double double8 = staff4.getHourlyRate();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0025");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0026");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        main.Room room12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking15 = student5.booking(room12, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0027");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0028");
        main.Staff staff4 = new main.Staff("hi!", "", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0029");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("hi!");
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0030");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0031");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0032");
        main.Student student4 = new main.Student("Staff", "", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0033");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0034");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0035");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = student5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0036");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0037");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0038");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0039");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0040");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0041");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0042");
        main.Staff staff4 = new main.Staff("hi!", "Student", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0043");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0044");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0045");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0046");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0047");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0048");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0049");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0050");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0051");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0052");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getRoleName();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0053");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        boolean boolean8 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0054");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0055");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0056");
        main.Staff staff4 = new main.Staff("Student", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0057");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0058");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0059");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getRoleName();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0060");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0061");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean8 = student5.login("hi!");
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0062");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0063");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0064");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0065");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = student5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0066");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        staff4.logout();
        boolean boolean10 = staff4.login("");
        boolean boolean11 = staff4.isVerified();
        java.lang.Class<?> wildcardClass12 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0067");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0068");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        staff5.logout();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0069");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getPassword();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0070");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0071");
        main.Staff staff5 = new main.Staff("Student", "", "Student", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0072");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0073");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0074");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0075");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0076");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0077");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0078");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0079");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        student5.logout();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0080");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        java.lang.String str12 = student5.getPassword();
        main.Room room13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking16 = student5.booking(room13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0081");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0082");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0083");
        main.Student student4 = new main.Student("hi!", "", "Student", (java.lang.Long) 0L);
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = student4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0084");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0085");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0086");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0087");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0088");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean11 = student5.login("Staff");
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0089");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getId();
        boolean boolean12 = student5.login("hi!");
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0090");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0091");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0092");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0093");
        main.Student student5 = new main.Student("", "Staff", "Staff", false, (java.lang.Long) 1L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0094");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0095");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0096");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0097");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0098");
        main.Student student5 = new main.Student("", "hi!", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0099");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        double double11 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0100");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0101");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0102");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = student5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0103");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        double double13 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0104");
        main.Student student4 = new main.Student("", "Student", "Staff", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0105");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0106");
        main.Student student5 = new main.Student("Student", "", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0107");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Staff");
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0108");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        double double14 = student5.getHourlyRate();
        boolean boolean16 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0109");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0110");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Student");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0111");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0112");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getRoleName();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0113");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0114");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getRoleName();
        double double12 = student5.getHourlyRate();
        student5.logout();
        main.Room room14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking17 = student5.booking(room14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0115");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0116");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0117");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0118");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0119");
        main.Staff staff4 = new main.Staff("Student", "Staff", "", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0120");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0121");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean12 = student5.login("hi!");
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0122");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0123");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        student5.logout();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0124");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        boolean boolean13 = student5.login("");
        main.Room room14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking17 = student5.booking(room14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0125");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0126");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0127");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0128");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0129");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        boolean boolean8 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0130");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0131");
        main.Student student5 = new main.Student("", "Staff", "", false, (java.lang.Long) 100L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0132");
        main.Staff staff4 = new main.Staff("", "", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0133");
        main.Staff staff4 = new main.Staff("", "Staff", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0134");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0135");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0136");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Student", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0137");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getPassword();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = staff4.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0138");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        boolean boolean9 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0139");
        main.Student student5 = new main.Student("Student", "Staff", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0140");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        staff4.logout();
        boolean boolean11 = staff4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0141");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0142");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0143");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0144");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = student5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0145");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0146");
        main.Staff staff5 = new main.Staff("Student", "Student", "", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0147");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0148");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0149");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0150");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0151");
        main.Student student5 = new main.Student("Staff", "Staff", "Student", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0152");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0153");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getEmail();
        main.Room room13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking16 = student5.booking(room13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0154");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        boolean boolean11 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0155");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = student4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0156");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) (-1L));
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0157");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        java.lang.String str9 = student5.getRoleName();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = student5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0158");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0159");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0160");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0161");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0162");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0163");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0164");
        main.Student student4 = new main.Student("hi!", "", "Student", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0165");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0166");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0167");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0168");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0169");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0170");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) 100L);
        student5.logout();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0171");
        main.Staff staff4 = new main.Staff("Student", "Staff", "", (java.lang.Long) 1L);
        staff4.logout();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0172");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        main.Room room15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking18 = student5.booking(room15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0173");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0174");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0175");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        boolean boolean12 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0176");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0177");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0178");
        main.Staff staff5 = new main.Staff("", "", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0179");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0180");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0181");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0182");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str11 = student5.getEmail();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0183");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) 100L);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0184");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0185");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0186");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0187");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean8 = student5.login("hi!");
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0188");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0189");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0190");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0191");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0192");
        main.Student student5 = new main.Student("Student", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0193");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0194");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0195");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0196");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0197");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0198");
        main.Staff staff4 = new main.Staff("Student", "hi!", "", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0199");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getRoleName();
        double double12 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0200");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        boolean boolean13 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0201");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 10L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0202");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0203");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0204");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0205");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0206");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getId();
        boolean boolean15 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0207");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        student5.logout();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = student5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0208");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0209");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0210");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0211");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        double double7 = staff4.getHourlyRate();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0212");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0213");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0214");
        main.Staff staff4 = new main.Staff("Staff", "", "hi!", (java.lang.Long) (-1L));
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0215");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0216");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0217");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        staff4.logout();
        staff4.logout();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0218");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0219");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        student5.logout();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isVerified();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = student5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0220");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0221");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getPassword();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0222");
        main.Staff staff4 = new main.Staff("Student", "hi!", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0223");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0224");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0225");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0226");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        boolean boolean9 = staff5.login("Staff");
        boolean boolean10 = staff5.isVerified();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = staff5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0227");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        main.Room room12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking15 = student5.booking(room12, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0228");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0229");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0230");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0231");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0232");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        boolean boolean8 = student4.isVerified();
        student4.logout();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = student4.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0233");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getPassword();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0234");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0235");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Student", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0236");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0237");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0238");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0239");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str11 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0240");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0241");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) (-1L));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0242");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0243");
        main.Student student5 = new main.Student("Staff", "", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0244");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0245");
        main.Student student4 = new main.Student("Student", "Staff", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0246");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean7 = student4.isVerified();
        boolean boolean9 = student4.login("Student");
        java.lang.String str10 = student4.getEmail();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student4.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0247");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        boolean boolean6 = staff4.isVerified();
        boolean boolean8 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0248");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        boolean boolean7 = staff4.login("");
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0249");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0250");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0251");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        boolean boolean8 = student4.isVerified();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0252");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0253");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0254");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        boolean boolean9 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0255");
        main.Student student4 = new main.Student("", "", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0256");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 0L);
        staff5.logout();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0257");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0258");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 10L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0259");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        boolean boolean11 = student5.isVerified();
        double double12 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0260");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0261");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0262");
        main.Staff staff4 = new main.Staff("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0263");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0264");
        main.Student student4 = new main.Student("Student", "", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0265");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        boolean boolean14 = student5.login("");
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0266");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0267");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0268");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0269");
        main.Student student5 = new main.Student("", "hi!", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0270");
        main.Staff staff5 = new main.Staff("", "hi!", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0271");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0272");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean7 = student5.isVerified();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0273");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0274");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        student5.logout();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0275");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0276");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0277");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        boolean boolean14 = student5.login("");
        java.lang.String str15 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0278");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        student4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0279");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        double double11 = student4.getHourlyRate();
        java.lang.String str12 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0280");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        student5.logout();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0281");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", false, (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0282");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        staff4.logout();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0283");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0284");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0285");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        boolean boolean7 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0286");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0287");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0288");
        main.Staff staff4 = new main.Staff("Staff", "", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0289");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0290");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff4.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0291");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0292");
        main.Student student4 = new main.Student("Student", "hi!", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0293");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        staff4.logout();
        boolean boolean10 = staff4.isVerified();
        java.lang.String str11 = staff4.getEmail();
        java.lang.String str12 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0294");
        main.Staff staff5 = new main.Staff("", "", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0295");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0296");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0297");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0298");
        main.Student student5 = new main.Student("Staff", "", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0299");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        student5.logout();
        java.lang.String str15 = student5.getPassword();
        java.lang.String str16 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0300");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0301");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        staff4.logout();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0302");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Staff", true, (java.lang.Long) 10L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0303");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0304");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 1L);
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0305");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getRoleName();
        double double12 = student5.getHourlyRate();
        student5.logout();
        student5.logout();
        java.lang.String str15 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0306");
        main.Student student4 = new main.Student("Student", "", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0307");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0308");
        main.Staff staff5 = new main.Staff("", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0309");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0310");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        staff5.logout();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0311");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getPassword();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student5.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0312");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0313");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0314");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0315");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0316");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0317");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0318");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0319");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0320");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean7 = staff4.login("");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0321");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getPassword();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0322");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0323");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getId();
        main.Room room14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking17 = student5.booking(room14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0324");
        main.Student student5 = new main.Student("Staff", "", "Staff", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0325");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0326");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0327");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0328");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getRoleName();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0329");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getEmail();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0330");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0331");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", false, (java.lang.Long) 1L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0332");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0333");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0334");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0335");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0336");
        main.Student student5 = new main.Student("hi!", "", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0337");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0338");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getId();
        boolean boolean12 = student5.login("hi!");
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0339");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0340");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("hi!");
        boolean boolean10 = staff4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0341");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0342");
        main.Student student4 = new main.Student("Staff", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0343");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0344");
        main.Student student4 = new main.Student("hi!", "Student", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0345");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0346");
        main.Staff staff4 = new main.Staff("Student", "", "", (java.lang.Long) 10L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0347");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0348");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0349");
        main.Student student4 = new main.Student("", "Student", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0350");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        student5.logout();
        java.lang.String str15 = student5.getPassword();
        double double16 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0351");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0352");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0353");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0354");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0355");
        main.Student student5 = new main.Student("Staff", "hi!", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0356");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0357");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0358");
        main.Student student5 = new main.Student("", "Student", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0359");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0360");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0361");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0362");
        main.Staff staff4 = new main.Staff("hi!", "", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0363");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0364");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0365");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0366");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0367");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0368");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) (-1L));
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0369");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        student5.logout();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0370");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        java.lang.String str8 = student5.getEmail();
        boolean boolean10 = student5.login("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0371");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        double double11 = student4.getHourlyRate();
        boolean boolean13 = student4.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0372");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0373");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0374");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0375");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0376");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0377");
        main.Staff staff4 = new main.Staff("", "", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0378");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean10 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0379");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0380");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0381");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        boolean boolean8 = staff5.login("");
        java.lang.String str9 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0382");
        main.Student student4 = new main.Student("Staff", "", "Staff", (java.lang.Long) 10L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0383");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0384");
        main.Staff staff5 = new main.Staff("", "Student", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0385");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0386");
        main.Student student5 = new main.Student("", "Staff", "hi!", true, (java.lang.Long) 1L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0387");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 0L);
        student4.logout();
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student4.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0388");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0389");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", true, (java.lang.Long) 0L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0390");
        main.Staff staff4 = new main.Staff("hi!", "", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0391");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Staff", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0392");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0393");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0394");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getEmail();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0395");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0396");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        staff4.logout();
        double double9 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0397");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getId();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0398");
        main.Student student5 = new main.Student("", "Student", "Staff", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0399");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.Class<?> wildcardClass12 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0400");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        boolean boolean8 = staff5.login("");
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean10 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0401");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0402");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getRoleName();
        java.lang.String str11 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0403");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0404");
        main.Student student5 = new main.Student("hi!", "Student", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0405");
        main.Student student5 = new main.Student("hi!", "Student", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0406");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0407");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0408");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0409");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        double double6 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0410");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0411");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        boolean boolean13 = student5.isVerified();
        double double14 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0412");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Staff", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0413");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0414");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        main.Room room11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking14 = student5.booking(room11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0415");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0416");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0417");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0418");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0419");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0420");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0421");
        main.Student student5 = new main.Student("", "Staff", "", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0422");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0423");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0424");
        main.Student student5 = new main.Student("Staff", "Staff", "Student", true, (java.lang.Long) 100L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0425");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        boolean boolean8 = staff4.login("Staff");
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0426");
        main.Staff staff5 = new main.Staff("", "hi!", "Student", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0427");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0428");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getEmail();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff4.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0429");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getRoleName();
        student4.logout();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0430");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0431");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        java.lang.String str11 = student4.getEmail();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0432");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff4.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0433");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) 10L);
        student5.logout();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0434");
        main.Staff staff4 = new main.Staff("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0435");
        main.Student student4 = new main.Student("", "Staff", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0436");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        staff4.logout();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = staff4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0437");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0438");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        boolean boolean14 = student5.login("hi!");
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0439");
        main.Student student4 = new main.Student("Student", "", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0440");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0441");
        main.Student student4 = new main.Student("hi!", "", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0442");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        boolean boolean8 = student4.login("Student");
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0443");
        main.Staff staff5 = new main.Staff("", "Student", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0444");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0445");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0446");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Staff", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0447");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0448");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0449");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        staff4.logout();
        main.Room room12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking15 = staff4.booking(room12, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0450");
        main.Student student4 = new main.Student("", "Student", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0451");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0452");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0453");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = staff5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0454");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0455");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0456");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0457");
        main.Student student5 = new main.Student("", "hi!", "Student", true, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        boolean boolean8 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0458");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0459");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0460");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        student5.logout();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0461");
        main.Student student4 = new main.Student("Student", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0462");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        boolean boolean11 = staff5.login("Staff");
        boolean boolean13 = staff5.login("Staff");
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0463");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0464");
        main.Student student5 = new main.Student("hi!", "Student", "Student", false, (java.lang.Long) (-1L));
        main.Room room6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking9 = student5.booking(room6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0465");
        main.Staff staff4 = new main.Staff("Student", "Student", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0466");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0467");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0468");
        main.Student student5 = new main.Student("", "Student", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0469");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", false, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0470");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0471");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = student4.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0472");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getRoleName();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0473");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
        student5.logout();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0474");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0475");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0476");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0477");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0478");
        main.Student student5 = new main.Student("", "hi!", "", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0479");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        double double6 = student4.getHourlyRate();
        main.Room room7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking10 = student4.booking(room7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0480");
        main.Student student4 = new main.Student("Staff", "", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0481");
        main.Staff staff5 = new main.Staff("", "hi!", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0482");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        java.lang.String str12 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0483");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        boolean boolean7 = staff4.login("hi!");
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0484");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        boolean boolean12 = staff5.login("");
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0485");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) 10L);
        boolean boolean7 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0486");
        main.Staff staff5 = new main.Staff("", "", "Staff", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0487");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0488");
        main.Student student5 = new main.Student("Student", "Student", "Staff", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0489");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) (-1L));
        main.Room room5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking8 = staff4.booking(room5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0490");
        main.Student student4 = new main.Student("", "", "", (java.lang.Long) 10L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0491");
        main.Student student5 = new main.Student("", "", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0492");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getPassword();
        boolean boolean14 = student5.isVerified();
        boolean boolean15 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0493");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0494");
        main.Student student4 = new main.Student("", "Student", "", (java.lang.Long) 100L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0495");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0496");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0497");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        java.lang.String str12 = student5.getPassword();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0498");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getRoleName();
        boolean boolean8 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0499");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest0.test0500");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        java.lang.String str8 = student4.getId();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = student4.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }
}

