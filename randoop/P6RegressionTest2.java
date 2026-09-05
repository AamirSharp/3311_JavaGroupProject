import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P6RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1001");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1002");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1003");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1004");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
        boolean boolean6 = staff4.login("");
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1005");
        main.Staff staff5 = new main.Staff("", "Student", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1006");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1007");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1008");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1009");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1010");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1011");
        main.Student student5 = new main.Student("Student", "", "hi!", false, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1012");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
        boolean boolean6 = staff4.login("");
        staff4.logout();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1013");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1014");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1015");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getRoleName();
        java.lang.String str16 = student5.getPassword();
        boolean boolean17 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1016");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) (-1L));
        student4.logout();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1017");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getId();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1018");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1019");
        main.Student student4 = new main.Student("hi!", "Staff", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1020");
        main.Student student5 = new main.Student("hi!", "", "Student", false, (java.lang.Long) 1L);
        student5.logout();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1021");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1022");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1023");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) 1L);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1024");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1025");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1026");
        main.Student student5 = new main.Student("Student", "", "hi!", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1027");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1028");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getRoleName();
        boolean boolean10 = staff5.login("hi!");
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1029");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1030");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1031");
        main.Staff staff5 = new main.Staff("", "Student", "", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1032");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", true, (java.lang.Long) 1L);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1033");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1034");
        main.Staff staff5 = new main.Staff("", "Student", "", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1035");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean6 = student4.isVerified();
        java.lang.String str7 = student4.getId();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1036");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1037");
        main.Staff staff4 = new main.Staff("", "", "hi!", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1038");
        main.Student student5 = new main.Student("hi!", "Student", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1039");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1040");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1041");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        java.lang.String str15 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1042");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1043");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getId();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1044");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1045");
        main.Staff staff5 = new main.Staff("", "Student", "", false, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
        boolean boolean9 = staff5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1046");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        double double14 = student5.getHourlyRate();
        boolean boolean15 = student5.isVerified();
        double double16 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1047");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getPassword();
        boolean boolean14 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1048");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1049");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1050");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        double double10 = student5.getHourlyRate();
        boolean boolean11 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1051");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1052");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1053");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getPassword();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1054");
        main.Student student5 = new main.Student("", "hi!", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1055");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        boolean boolean8 = student4.login("hi!");
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1056");
        main.Student student4 = new main.Student("hi!", "", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1057");
        main.Staff staff4 = new main.Staff("Student", "Staff", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1058");
        main.Staff staff4 = new main.Staff("Student", "Student", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1059");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        boolean boolean8 = student4.isVerified();
        double double9 = student4.getHourlyRate();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1060");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1061");
        main.Student student5 = new main.Student("hi!", "", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1062");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getPassword();
        java.lang.String str11 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1063");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1064");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("Staff");
        boolean boolean8 = staff5.isVerified();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1065");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1066");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean7 = student5.isVerified();
        boolean boolean8 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1067");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("Student");
        java.lang.String str8 = staff5.getId();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1068");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1069");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1070");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getId();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1071");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) (-1L));
        student4.logout();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1072");
        main.Student student4 = new main.Student("Staff", "", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1073");
        main.Student student5 = new main.Student("Student", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1074");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        student4.logout();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1075");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1076");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        double double13 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1077");
        main.Student student4 = new main.Student("Staff", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1078");
        main.Student student4 = new main.Student("Staff", "", "hi!", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1079");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1080");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1081");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getId();
        java.lang.String str10 = staff5.getRoleName();
        java.lang.String str11 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1082");
        main.Staff staff5 = new main.Staff("", "Staff", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1083");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getId();
        boolean boolean7 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1084");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) 100L);
        student4.logout();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1085");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1086");
        main.Student student5 = new main.Student("hi!", "Student", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1087");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        boolean boolean10 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1088");
        main.Staff staff5 = new main.Staff("", "Student", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1089");
        main.Student student4 = new main.Student("", "Student", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1090");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1091");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1092");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) 10L);
        boolean boolean6 = student4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1093");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Staff", true, (java.lang.Long) (-1L));
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1094");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        boolean boolean9 = student4.login("Student");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1095");
        main.Student student4 = new main.Student("", "hi!", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1096");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getId();
        boolean boolean10 = staff4.isVerified();
        boolean boolean11 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1097");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("Student");
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1098");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1099");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1100");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        boolean boolean13 = student5.login("");
        java.lang.String str14 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1101");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        double double8 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1102");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1103");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1104");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str12 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1105");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 100L);
        student4.logout();
        boolean boolean7 = student4.login("");
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1106");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1107");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        boolean boolean9 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1108");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1109");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getId();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1110");
        main.Student student5 = new main.Student("Student", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        java.lang.String str7 = student5.getRoleName();
        double double8 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1111");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1112");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1113");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1114");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        boolean boolean10 = staff4.login("hi!");
        boolean boolean12 = staff4.login("hi!");
        java.lang.Class<?> wildcardClass13 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1115");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        boolean boolean8 = staff4.isVerified();
        boolean boolean10 = staff4.login("");
        boolean boolean11 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1116");
        main.Student student4 = new main.Student("hi!", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        student4.logout();
        student4.logout();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1117");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1118");
        main.Student student5 = new main.Student("Staff", "Student", "Student", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1119");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1120");
        main.Staff staff5 = new main.Staff("Student", "", "", true, (java.lang.Long) 0L);
        staff5.logout();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1121");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1122");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1123");
        main.Student student5 = new main.Student("Staff", "hi!", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1124");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        boolean boolean13 = student5.isVerified();
        double double14 = student5.getHourlyRate();
        boolean boolean15 = student5.isVerified();
        java.lang.String str16 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1125");
        main.Staff staff4 = new main.Staff("Staff", "", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1126");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        boolean boolean8 = staff5.login("hi!");
        java.lang.String str9 = staff5.getId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1127");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1128");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1129");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1130");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1131");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1132");
        main.Staff staff4 = new main.Staff("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1133");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1134");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1135");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1136");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean6 = staff4.isVerified();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1137");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
        staff4.logout();
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1138");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1139");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        double double8 = staff4.getHourlyRate();
        boolean boolean9 = staff4.isVerified();
        boolean boolean10 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1140");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1141");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1142");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1143");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        student4.logout();
        student4.logout();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1144");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1145");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Staff", false, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getEmail();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1146");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getId();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1147");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1148");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean11 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1149");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1150");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) (-1L));
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1151");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1152");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1153");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1154");
        main.Student student5 = new main.Student("Student", "", "hi!", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1155");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1156");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1157");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        student4.logout();
        student4.logout();
        student4.logout();
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1158");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1159");
        main.Student student5 = new main.Student("Staff", "", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1160");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        double double8 = student5.getHourlyRate();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1161");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1162");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1163");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getEmail();
        boolean boolean11 = staff4.login("hi!");
        boolean boolean12 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1164");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Staff", true, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1165");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1166");
        main.Staff staff4 = new main.Staff("", "", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1167");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1168");
        main.Student student5 = new main.Student("Staff", "Staff", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1169");
        main.Staff staff4 = new main.Staff("Student", "", "Student", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1170");
        main.Staff staff5 = new main.Staff("Student", "Student", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1171");
        main.Student student4 = new main.Student("Student", "Student", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1172");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1173");
        main.Student student5 = new main.Student("", "", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1174");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        boolean boolean12 = student5.login("");
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1175");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 1L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1176");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.getRoleName();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1177");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1178");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getId();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1179");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1180");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1181");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) (-1L));
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1182");
        main.Staff staff4 = new main.Staff("Student", "", "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1183");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1184");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1185");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1186");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1187");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1188");
        main.Staff staff5 = new main.Staff("", "", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1189");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
        boolean boolean7 = student4.login("hi!");
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1190");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getId();
        double double7 = student4.getHourlyRate();
        boolean boolean8 = student4.isVerified();
        boolean boolean9 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1191");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 1L);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1192");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1193");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1194");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1195");
        main.Student student4 = new main.Student("Staff", "hi!", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1196");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1197");
        main.Student student5 = new main.Student("Staff", "Staff", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1198");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1199");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getId();
        boolean boolean7 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1200");
        main.Student student5 = new main.Student("", "hi!", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1201");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1202");
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
        java.lang.String str16 = student5.getId();
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1203");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1204");
        main.Student student5 = new main.Student("Staff", "Student", "Student", false, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1205");
        main.Staff staff4 = new main.Staff("Student", "", "", (java.lang.Long) 100L);
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1206");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1207");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1208");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) 0L);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1209");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getEmail();
        boolean boolean10 = student5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1210");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1211");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1212");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        boolean boolean9 = staff5.isVerified();
        staff5.logout();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1213");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getRoleName();
        java.lang.String str15 = student5.getId();
        double double16 = student5.getHourlyRate();
        double double17 = student5.getHourlyRate();
        boolean boolean18 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1214");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1215");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        student5.logout();
        boolean boolean11 = student5.login("Student");
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1216");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1217");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        boolean boolean12 = student5.login("");
        boolean boolean14 = student5.login("Student");
        boolean boolean16 = student5.login("Student");
        boolean boolean17 = student5.isVerified();
        java.lang.String str18 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1218");
        main.Staff staff4 = new main.Staff("Student", "", "", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1219");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1220");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1221");
        main.Student student4 = new main.Student("Staff", "hi!", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1222");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("Staff");
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1223");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1224");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        student4.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1225");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1226");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1227");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        boolean boolean8 = student5.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1228");
        main.Student student4 = new main.Student("hi!", "Student", "Student", (java.lang.Long) (-1L));
        student4.logout();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1229");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1230");
        main.Student student5 = new main.Student("hi!", "hi!", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1231");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1232");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1233");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        student5.logout();
        java.lang.String str13 = student5.getRoleName();
        double double14 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1234");
        main.Student student4 = new main.Student("hi!", "", "", (java.lang.Long) 10L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1235");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1236");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1237");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1238");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        boolean boolean14 = student5.isVerified();
        java.lang.String str15 = student5.getId();
        java.lang.String str16 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1239");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        boolean boolean7 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1240");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Staff", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1241");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1242");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1243");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 10L);
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1244");
        main.Student student5 = new main.Student("hi!", "", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1245");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1246");
        main.Student student4 = new main.Student("", "", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1247");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Staff", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1248");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getPassword();
        boolean boolean10 = student4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1249");
        main.Staff staff4 = new main.Staff("", "hi!", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1250");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1251");
        main.Student student5 = new main.Student("Student", "Student", "hi!", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1252");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        java.lang.String str8 = student4.getRoleName();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1253");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1254");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        staff4.logout();
        boolean boolean10 = staff4.isVerified();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1255");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1256");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1257");
        main.Student student5 = new main.Student("Staff", "hi!", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1258");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1259");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1260");
        main.Staff staff5 = new main.Staff("Student", "Student", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1261");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1262");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1263");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1264");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1265");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getId();
        double double13 = student5.getHourlyRate();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1266");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1267");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        boolean boolean10 = staff4.isVerified();
        double double11 = staff4.getHourlyRate();
        java.lang.String str12 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1268");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1269");
        main.Student student4 = new main.Student("Staff", "Student", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1270");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1271");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1272");
        main.Student student5 = new main.Student("hi!", "", "", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1273");
        main.Staff staff5 = new main.Staff("Student", "Student", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getId();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1274");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getPassword();
        java.lang.String str12 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1275");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getPassword();
        java.lang.String str12 = staff4.getRoleName();
        java.lang.String str13 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1276");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getId();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1277");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 10L);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1278");
        main.Staff staff5 = new main.Staff("", "Staff", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1279");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1280");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1281");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1282");
        main.Staff staff4 = new main.Staff("", "", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1283");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1284");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        double double8 = student4.getHourlyRate();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1285");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1286");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getPassword();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getRoleName();
        java.lang.String str13 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1287");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        staff4.logout();
        boolean boolean8 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1288");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        boolean boolean13 = student5.login("Student");
        java.lang.String str14 = student5.getRoleName();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1289");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1290");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1291");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        double double8 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1292");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getRoleName();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1293");
        main.Student student5 = new main.Student("", "Staff", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1294");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getPassword();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1295");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1296");
        main.Student student4 = new main.Student("", "Student", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1297");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1298");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1299");
        main.Staff staff4 = new main.Staff("Student", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1300");
        main.Student student5 = new main.Student("Student", "hi!", "Student", true, (java.lang.Long) 1L);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1301");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1302");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1303");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        staff4.logout();
        java.lang.String str8 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1304");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1305");
        main.Student student5 = new main.Student("Student", "Student", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1306");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1307");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1308");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getPassword();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1309");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 10L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1310");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1311");
        main.Student student5 = new main.Student("hi!", "Student", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1312");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1313");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean11 = student5.isVerified();
        double double12 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1314");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) 10L);
        boolean boolean6 = student4.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1315");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1316");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getId();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1317");
        main.Staff staff4 = new main.Staff("Staff", "", "Student", (java.lang.Long) (-1L));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1318");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1319");
        main.Staff staff5 = new main.Staff("", "", "hi!", true, (java.lang.Long) 10L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1320");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        double double8 = student5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1321");
        main.Student student5 = new main.Student("hi!", "Student", "", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1322");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1323");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 10L);
        boolean boolean6 = staff4.login("Staff");
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1324");
        main.Staff staff5 = new main.Staff("", "hi!", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1325");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 0L);
        staff5.logout();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1326");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1327");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", false, (java.lang.Long) 100L);
        staff5.logout();
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1328");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1329");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1330");
        main.Student student5 = new main.Student("Staff", "Student", "", false, (java.lang.Long) 10L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1331");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1332");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1333");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1334");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1335");
        main.Staff staff4 = new main.Staff("", "Staff", "hi!", (java.lang.Long) 10L);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1336");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        java.lang.String str9 = staff5.getPassword();
        boolean boolean11 = staff5.login("Staff");
        java.lang.Class<?> wildcardClass12 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1337");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        student4.logout();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1338");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "hi!", false, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1339");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1340");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getPassword();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1341");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        java.lang.String str12 = student5.getId();
        boolean boolean14 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1342");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1343");
        main.Student student5 = new main.Student("Student", "hi!", "hi!", false, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1344");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1345");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        boolean boolean9 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1346");
        main.Student student4 = new main.Student("Staff", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getPassword();
        boolean boolean8 = student4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1347");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1348");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1349");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Staff", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1350");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        boolean boolean9 = staff4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1351");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1352");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1353");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
        boolean boolean10 = student5.login("hi!");
        boolean boolean12 = student5.login("hi!");
        main.Room room13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking16 = student5.booking(room13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1354");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1355");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Student", false, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1356");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1357");
        main.Student student5 = new main.Student("Staff", "Student", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1358");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isVerified();
        boolean boolean9 = student5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1359");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        boolean boolean8 = staff4.isVerified();
        boolean boolean10 = staff4.login("");
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1360");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1361");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1362");
        main.Student student5 = new main.Student("", "Student", "Staff", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1363");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getEmail();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1364");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1365");
        main.Staff staff4 = new main.Staff("", "Student", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1366");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1367");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getRoleName();
        staff4.logout();
        java.lang.Class<?> wildcardClass13 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1368");
        main.Staff staff5 = new main.Staff("", "Staff", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1369");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1370");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        student4.logout();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1371");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1372");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) 10L);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1373");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1374");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1375");
        main.Student student5 = new main.Student("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1376");
        main.Student student4 = new main.Student("hi!", "Staff", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1377");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getEmail();
        boolean boolean9 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1378");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1379");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        java.lang.String str11 = student4.getEmail();
        student4.logout();
        student4.logout();
        java.lang.String str14 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1380");
        main.Student student5 = new main.Student("", "Staff", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1381");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1382");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1383");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", true, (java.lang.Long) 1L);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1384");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1385");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Student", true, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1386");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Staff", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1387");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        boolean boolean11 = staff4.login("Staff");
        double double12 = staff4.getHourlyRate();
        java.lang.String str13 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1388");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1389");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1390");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("hi!");
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1391");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1392");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1393");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1394");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1395");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1396");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1397");
        main.Student student4 = new main.Student("hi!", "Staff", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1398");
        main.Staff staff5 = new main.Staff("Student", "hi!", "", true, (java.lang.Long) 10L);
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1399");
        main.Staff staff4 = new main.Staff("Staff", "", "hi!", (java.lang.Long) 0L);
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1400");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1401");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1402");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        double double8 = student4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1403");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getEmail();
        double double9 = staff5.getHourlyRate();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1404");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1405");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1406");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        student5.logout();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1407");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean7 = student4.isVerified();
        student4.logout();
        java.lang.String str9 = student4.getEmail();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1408");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1409");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        staff4.logout();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1410");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1411");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1412");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        double double9 = staff4.getHourlyRate();
        boolean boolean11 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1413");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1414");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean7 = staff4.login("");
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1415");
        main.Student student5 = new main.Student("hi!", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1416");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1417");
        main.Staff staff5 = new main.Staff("Student", "", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1418");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1419");
        main.Staff staff5 = new main.Staff("", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1420");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1421");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1422");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getId();
        double double7 = student4.getHourlyRate();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1423");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean8 = student5.login("hi!");
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1424");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1425");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 100L);
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1426");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1427");
        main.Staff staff4 = new main.Staff("", "Student", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1428");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1429");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1430");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getPassword();
        boolean boolean11 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1431");
        main.Staff staff5 = new main.Staff("", "", "Student", false, (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1432");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getRoleName();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1433");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        boolean boolean16 = student5.login("");
        java.lang.String str17 = student5.getRoleName();
        double double18 = student5.getHourlyRate();
        java.lang.String str19 = student5.getEmail();
        student5.logout();
        boolean boolean22 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1434");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getId();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getPassword();
        java.lang.String str12 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1435");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1436");
        main.Student student4 = new main.Student("Staff", "hi!", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1437");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1438");
        main.Student student4 = new main.Student("", "hi!", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1439");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1440");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1441");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1442");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        java.lang.String str10 = student5.getPassword();
        boolean boolean11 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1443");
        main.Student student5 = new main.Student("", "Student", "Staff", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1444");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1445");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1446");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", false, (java.lang.Long) 0L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1447");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 100L);
        boolean boolean6 = student5.isVerified();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1448");
        main.Staff staff5 = new main.Staff("Student", "", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1449");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1450");
        main.Student student4 = new main.Student("hi!", "Staff", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1451");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1452");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1453");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str8 = staff5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1454");
        main.Student student5 = new main.Student("Staff", "Student", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1455");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        java.lang.Class<?> wildcardClass7 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1456");
        main.Student student4 = new main.Student("Staff", "", "Student", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1457");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
        boolean boolean14 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1458");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        boolean boolean7 = staff4.isVerified();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1459");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.logout();
        double double9 = student4.getHourlyRate();
        java.lang.String str10 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1460");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1461");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1462");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        boolean boolean8 = staff5.login("Student");
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1463");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1464");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1465");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Staff", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1466");
        main.Staff staff4 = new main.Staff("Student", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1467");
        main.Student student4 = new main.Student("", "hi!", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1468");
        main.Student student5 = new main.Student("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        boolean boolean7 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1469");
        main.Staff staff4 = new main.Staff("Student", "Staff", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1470");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1471");
        main.Student student5 = new main.Student("", "", "", false, (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1472");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean9 = staff5.login("Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1473");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1474");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1475");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1476");
        main.Staff staff5 = new main.Staff("", "hi!", "", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1477");
        main.Student student4 = new main.Student("Student", "Staff", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1478");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1479");
        main.Student student5 = new main.Student("", "Student", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1480");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        boolean boolean12 = student5.login("");
        boolean boolean14 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1481");
        main.Student student5 = new main.Student("Staff", "Student", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1482");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1483");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1484");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("hi!");
        java.lang.String str7 = student4.getRoleName();
        boolean boolean9 = student4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1485");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getId();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1486");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Student", (java.lang.Long) (-1L));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1487");
        main.Student student5 = new main.Student("", "hi!", "Staff", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1488");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getId();
        student4.logout();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1489");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1490");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getPassword();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1491");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1492");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        student5.logout();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1493");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1494");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1495");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", true, (java.lang.Long) (-1L));
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1496");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1497");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1498");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1499");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest2.test1500");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getPassword();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }
}

