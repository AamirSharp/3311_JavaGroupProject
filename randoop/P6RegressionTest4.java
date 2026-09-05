import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P6RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2001");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str11 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2002");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2003");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2004");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2005");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2006");
        main.Student student5 = new main.Student("", "Staff", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2007");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getRoleName();
        double double8 = student4.getHourlyRate();
        boolean boolean9 = student4.isVerified();
        boolean boolean10 = student4.isVerified();
        boolean boolean12 = student4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2008");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        double double7 = student4.getHourlyRate();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2009");
        main.Staff staff5 = new main.Staff("hi!", "", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2010");
        main.Student student4 = new main.Student("Staff", "hi!", "Student", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2011");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2012");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getPassword();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2013");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2014");
        main.Student student4 = new main.Student("Student", "Staff", "hi!", (java.lang.Long) 100L);
        boolean boolean6 = student4.login("");
        java.lang.String str7 = student4.getRoleName();
        boolean boolean9 = student4.login("hi!");
        java.lang.String str10 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2015");
        main.Staff staff5 = new main.Staff("Student", "", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2016");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2017");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2018");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2019");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getEmail();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2020");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Student");
        java.lang.String str8 = staff5.getPassword();
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean11 = staff5.login("Student");
        java.lang.String str12 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2021");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2022");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2023");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getRoleName();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2024");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 1L);
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2025");
        main.Student student4 = new main.Student("hi!", "", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        student4.logout();
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
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2026");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2027");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2028");
        main.Student student5 = new main.Student("Staff", "hi!", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2029");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 100L);
        student4.logout();
        boolean boolean7 = student4.login("");
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2030");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getPassword();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2031");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        staff4.logout();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2032");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 100L);
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2033");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2034");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2035");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str12 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2036");
        main.Student student4 = new main.Student("", "", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2037");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        staff4.logout();
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2038");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2039");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2040");
        main.Student student5 = new main.Student("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2041");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        boolean boolean16 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2042");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getEmail();
        double double13 = student5.getHourlyRate();
        boolean boolean14 = student5.isVerified();
        java.lang.String str15 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2043");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getRoleName();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2044");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", true, (java.lang.Long) 10L);
        staff5.logout();
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2045");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2046");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getEmail();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2047");
        main.Student student5 = new main.Student("Staff", "", "hi!", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2048");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2049");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2050");
        main.Staff staff5 = new main.Staff("Student", "", "Student", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2051");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        boolean boolean6 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2052");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        boolean boolean8 = student4.login("hi!");
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2053");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2054");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getRoleName();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2055");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2056");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2057");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2058");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2059");
        main.Staff staff5 = new main.Staff("", "", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2060");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        boolean boolean9 = staff4.login("");
        boolean boolean10 = staff4.isVerified();
        boolean boolean12 = staff4.login("hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2061");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 0L);
        student5.logout();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2062");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2063");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        boolean boolean11 = student5.isVerified();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2064");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2065");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2066");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2067");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 0L);
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2068");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2069");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2070");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2071");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2072");
        main.Staff staff5 = new main.Staff("", "", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2073");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str9 = staff4.getRoleName();
        staff4.logout();
        boolean boolean12 = staff4.login("");
        java.lang.String str13 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2074");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2075");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2076");
        main.Staff staff4 = new main.Staff("", "Staff", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2077");
        main.Student student4 = new main.Student("Staff", "Staff", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2078");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        java.lang.String str11 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2079");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getId();
        java.lang.String str14 = student5.getRoleName();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2080");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        staff4.logout();
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2081");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2082");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2083");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getId();
        java.lang.String str11 = student5.getId();
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2084");
        main.Student student4 = new main.Student("hi!", "hi!", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2085");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2086");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2087");
        main.Student student5 = new main.Student("Student", "Student", "Student", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2088");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getEmail();
        java.lang.String str11 = staff4.getEmail();
        boolean boolean12 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2089");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2090");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getEmail();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2091");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2092");
        main.Staff staff5 = new main.Staff("Student", "Student", "", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2093");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getPassword();
        boolean boolean12 = student4.login("Staff");
        java.lang.String str13 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2094");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2095");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2096");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2097");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2098");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
        java.lang.String str7 = student4.getId();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2099");
        main.Student student4 = new main.Student("hi!", "hi!", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2100");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2101");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Student");
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2102");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2103");
        main.Student student5 = new main.Student("Student", "Staff", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2104");
        main.Student student5 = new main.Student("Staff", "Student", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getId();
        boolean boolean8 = student5.login("hi!");
        double double9 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2105");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Student", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2106");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2107");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2108");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2109");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2110");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2111");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2112");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", true, (java.lang.Long) 100L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2113");
        main.Staff staff5 = new main.Staff("Student", "Student", "Student", false, (java.lang.Long) 0L);
        staff5.logout();
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2114");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2115");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2116");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2117");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getId();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2118");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        boolean boolean8 = student4.isVerified();
        boolean boolean10 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2119");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2120");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2121");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getEmail();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2122");
        main.Student student4 = new main.Student("", "hi!", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2123");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        java.lang.String str10 = student5.getRoleName();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2124");
        main.Student student5 = new main.Student("Staff", "hi!", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2125");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getEmail();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getPassword();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2126");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("Student");
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2127");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2128");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 0L);
        student5.logout();
        double double7 = student5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2129");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getEmail();
        java.lang.String str11 = staff4.getPassword();
        java.lang.String str12 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2130");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2131");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2132");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2133");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2134");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) 100L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2135");
        main.Student student5 = new main.Student("Staff", "hi!", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2136");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", false, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2137");
        main.Student student4 = new main.Student("", "hi!", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2138");
        main.Staff staff5 = new main.Staff("", "Staff", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2139");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2140");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) 100L);
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2141");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2142");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2143");
        main.Staff staff4 = new main.Staff("", "", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2144");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        student5.logout();
        student5.logout();
        student5.logout();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2145");
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
        java.lang.String str19 = student5.getRoleName();
        main.Room room20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking23 = student5.booking(room20, localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2146");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2147");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        student5.logout();
        student5.logout();
        boolean boolean9 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2148");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2149");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2150");
        main.Student student5 = new main.Student("Staff", "hi!", "", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2151");
        main.Staff staff5 = new main.Staff("", "Staff", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2152");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2153");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2154");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean10 = staff5.isVerified();
        boolean boolean11 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2155");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        staff4.logout();
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2156");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        boolean boolean11 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2157");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2158");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2159");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2160");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        boolean boolean8 = student4.isVerified();
        java.lang.String str9 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2161");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("Student");
        boolean boolean10 = staff4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2162");
        main.Student student4 = new main.Student("Staff", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("Staff");
        boolean boolean10 = student4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2163");
        main.Student student5 = new main.Student("Staff", "hi!", "Staff", true, (java.lang.Long) 0L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2164");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        boolean boolean14 = student5.login("");
        boolean boolean16 = student5.login("");
        java.lang.String str17 = student5.getRoleName();
        java.lang.Class<?> wildcardClass18 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2165");
        main.Student student5 = new main.Student("", "Staff", "Student", false, (java.lang.Long) 0L);
        boolean boolean6 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2166");
        main.Staff staff4 = new main.Staff("Staff", "", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2167");
        main.Staff staff5 = new main.Staff("Student", "", "Student", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2168");
        main.Student student4 = new main.Student("Staff", "hi!", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2169");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2170");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2171");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2172");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2173");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2174");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2175");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2176");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2177");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        java.lang.String str12 = student5.getId();
        double double13 = student5.getHourlyRate();
        double double14 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2178");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2179");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2180");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getPassword();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2181");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2182");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean7 = student4.isVerified();
        student4.logout();
        student4.logout();
        boolean boolean10 = student4.isVerified();
        double double11 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2183");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2184");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        boolean boolean9 = staff5.isVerified();
        staff5.logout();
        java.lang.String str11 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2185");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        boolean boolean12 = student5.login("");
        boolean boolean14 = student5.login("Student");
        boolean boolean16 = student5.login("Student");
        boolean boolean17 = student5.isVerified();
        double double18 = student5.getHourlyRate();
        java.lang.String str19 = student5.getEmail();
        student5.logout();
        double double21 = student5.getHourlyRate();
        boolean boolean22 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2186");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2187");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        boolean boolean7 = staff5.isVerified();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getId();
        staff5.logout();
        boolean boolean11 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2188");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2189");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2190");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getId();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2191");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2192");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2193");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2194");
        main.Student student4 = new main.Student("hi!", "Staff", "Student", (java.lang.Long) 10L);
        student4.logout();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2195");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2196");
        main.Student student5 = new main.Student("", "Student", "Student", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2197");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2198");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) 100L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2199");
        main.Staff staff5 = new main.Staff("hi!", "", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2200");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2201");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2202");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2203");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        boolean boolean8 = staff5.login("");
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2204");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2205");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getId();
        java.lang.String str9 = student5.getRoleName();
        student5.logout();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2206");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2207");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2208");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2209");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("Student");
        java.lang.String str11 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2210");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        boolean boolean7 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2211");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2212");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2213");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2214");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Student", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2215");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        student5.logout();
        student5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2216");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("Student");
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2217");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean8 = student5.login("hi!");
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2218");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        staff4.logout();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2219");
        main.Staff staff4 = new main.Staff("", "Staff", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2220");
        main.Student student4 = new main.Student("Student", "Staff", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2221");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getId();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2222");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2223");
        main.Staff staff5 = new main.Staff("", "Staff", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2224");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2225");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2226");
        main.Student student4 = new main.Student("Student", "Staff", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2227");
        main.Student student5 = new main.Student("", "Staff", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2228");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2229");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2230");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2231");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2232");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str9 = staff4.getId();
        boolean boolean10 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2233");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2234");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getPassword();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2235");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2236");
        main.Student student5 = new main.Student("Student", "Student", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2237");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2238");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2239");
        main.Student student5 = new main.Student("hi!", "hi!", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2240");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2241");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2242");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2243");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean8 = staff5.isVerified();
        double double9 = staff5.getHourlyRate();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2244");
        main.Student student5 = new main.Student("", "Student", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2245");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2246");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 100L);
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2247");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2248");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 100L);
        staff4.logout();
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2249");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2250");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2251");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2252");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        student5.logout();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2253");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2254");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        java.lang.String str9 = student5.getRoleName();
        boolean boolean11 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2255");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2256");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) 100L);
        student4.logout();
        boolean boolean7 = student4.login("");
        student4.logout();
        java.lang.String str9 = student4.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2257");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 10L);
        boolean boolean6 = staff4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2258");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Staff", false, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2259");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2260");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getId();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2261");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getPassword();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2262");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2263");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2264");
        main.Staff staff4 = new main.Staff("Student", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2265");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2266");
        main.Student student5 = new main.Student("", "hi!", "Staff", true, (java.lang.Long) 0L);
        boolean boolean6 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2267");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getPassword();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2268");
        main.Student student5 = new main.Student("Student", "Student", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2269");
        main.Student student5 = new main.Student("", "Student", "Staff", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2270");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getRoleName();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2271");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        staff4.logout();
        staff4.logout();
        java.lang.String str11 = staff4.getId();
        staff4.logout();
        java.lang.String str13 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2272");
        main.Staff staff5 = new main.Staff("Student", "hi!", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2273");
        main.Student student4 = new main.Student("", "Student", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2274");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", true, (java.lang.Long) 0L);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2275");
        main.Student student5 = new main.Student("hi!", "Student", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2276");
        main.Staff staff4 = new main.Staff("Student", "Staff", "", (java.lang.Long) 100L);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2277");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2278");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2279");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2280");
        main.Staff staff4 = new main.Staff("Student", "hi!", "", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2281");
        main.Student student5 = new main.Student("Student", "Staff", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2282");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isVerified();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2283");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
        java.lang.String str7 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2284");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", true, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2285");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getEmail();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2286");
        main.Student student5 = new main.Student("Student", "hi!", "Staff", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2287");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getRoleName();
        boolean boolean10 = student5.isVerified();
        boolean boolean12 = student5.login("hi!");
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2288");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Student", false, (java.lang.Long) 10L);
        staff5.logout();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2289");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getPassword();
        double double9 = staff4.getHourlyRate();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2290");
        main.Student student5 = new main.Student("hi!", "Student", "hi!", false, (java.lang.Long) (-1L));
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2291");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        student5.logout();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2292");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2293");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2294");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean11 = staff4.login("Staff");
        java.lang.String str12 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2295");
        main.Student student4 = new main.Student("", "", "", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2296");
        main.Student student5 = new main.Student("", "hi!", "hi!", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2297");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        student5.logout();
        student5.logout();
        student5.logout();
        boolean boolean18 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2298");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2299");
        main.Staff staff5 = new main.Staff("", "hi!", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2300");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2301");
        main.Staff staff4 = new main.Staff("Student", "Student", "Student", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2302");
        main.Staff staff5 = new main.Staff("Student", "", "", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("hi!");
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2303");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2304");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getEmail();
        boolean boolean14 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2305");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2306");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        boolean boolean10 = staff4.isVerified();
        java.lang.String str11 = staff4.getPassword();
        staff4.logout();
        boolean boolean13 = staff4.isVerified();
        java.lang.String str14 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2307");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        double double10 = staff4.getHourlyRate();
        boolean boolean11 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2308");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2309");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Staff", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2310");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getPassword();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getRoleName();
        double double13 = staff4.getHourlyRate();
        double double14 = staff4.getHourlyRate();
        boolean boolean15 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2311");
        main.Student student5 = new main.Student("", "Staff", "Student", false, (java.lang.Long) 0L);
        boolean boolean6 = student5.isVerified();
        boolean boolean8 = student5.login("hi!");
        double double9 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2312");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2313");
        main.Student student5 = new main.Student("hi!", "Student", "", true, (java.lang.Long) 1L);
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2314");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        student4.logout();
        boolean boolean9 = student4.isVerified();
        java.lang.String str10 = student4.getId();
        java.lang.String str11 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2315");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        boolean boolean7 = student4.isVerified();
        boolean boolean9 = student4.login("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2316");
        main.Student student4 = new main.Student("Staff", "", "hi!", (java.lang.Long) (-1L));
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2317");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2318");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2319");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2320");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2321");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2322");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2323");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2324");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2325");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Staff", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2326");
        main.Student student4 = new main.Student("Staff", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2327");
        main.Student student4 = new main.Student("", "Student", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2328");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2329");
        main.Student student4 = new main.Student("hi!", "Student", "", (java.lang.Long) 0L);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2330");
        main.Student student5 = new main.Student("Staff", "Student", "Staff", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2331");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2332");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("");
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2333");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getRoleName();
        java.lang.String str11 = staff5.getId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2334");
        main.Student student5 = new main.Student("", "", "", false, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2335");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) 10L);
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2336");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) (-1L));
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2337");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2338");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        java.lang.String str8 = staff4.getEmail();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2339");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getId();
        boolean boolean7 = student4.isVerified();
        boolean boolean9 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2340");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2341");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2342");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        java.lang.String str11 = student4.getEmail();
        student4.logout();
        double double13 = student4.getHourlyRate();
        boolean boolean15 = student4.login("Student");
        java.lang.String str16 = student4.getRoleName();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2343");
        main.Student student5 = new main.Student("Student", "", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2344");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        staff4.logout();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2345");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.logout();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getRoleName();
        student4.logout();
        java.lang.String str12 = student4.getPassword();
        double double13 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2346");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Student", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2347");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        staff4.logout();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2348");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2349");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        double double9 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2350");
        main.Student student4 = new main.Student("", "Student", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2351");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2352");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getId();
        java.lang.String str10 = staff5.getId();
        boolean boolean12 = staff5.login("Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2353");
        main.Student student4 = new main.Student("hi!", "Student", "", (java.lang.Long) 10L);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2354");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean7 = staff4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2355");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2356");
        main.Staff staff5 = new main.Staff("", "Student", "Student", true, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2357");
        main.Student student4 = new main.Student("Student", "", "Staff", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2358");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2359");
        main.Student student5 = new main.Student("hi!", "hi!", "Student", true, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2360");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("Student");
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2361");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Staff", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2362");
        main.Student student5 = new main.Student("", "", "Student", true, (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2363");
        main.Student student5 = new main.Student("Staff", "hi!", "hi!", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2364");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2365");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2366");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        boolean boolean14 = student5.isVerified();
        boolean boolean16 = student5.login("Staff");
        double double17 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2367");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getId();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2368");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2369");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.logout();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getRoleName();
        student4.logout();
        java.lang.String str12 = student4.getPassword();
        java.lang.String str13 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2370");
        main.Student student5 = new main.Student("Staff", "Staff", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2371");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2372");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getId();
        staff5.logout();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2373");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        boolean boolean10 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2374");
        main.Student student4 = new main.Student("hi!", "", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2375");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2376");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        java.lang.String str10 = staff4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2377");
        main.Student student4 = new main.Student("Staff", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        boolean boolean6 = student4.isVerified();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2378");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 10L);
        student4.logout();
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2379");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Student", true, (java.lang.Long) 100L);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2380");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Student");
        boolean boolean7 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2381");
        main.Staff staff4 = new main.Staff("", "Staff", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2382");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2383");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2384");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2385");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2386");
        main.Student student5 = new main.Student("hi!", "hi!", "Staff", true, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2387");
        main.Staff staff4 = new main.Staff("Staff", "Student", "", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2388");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2389");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("Staff");
        boolean boolean10 = student5.login("");
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2390");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", false, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2391");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2392");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        java.lang.String str9 = staff5.getId();
        java.lang.String str10 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2393");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2394");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        boolean boolean8 = staff4.login("");
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2395");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getEmail();
        java.lang.Class<?> wildcardClass13 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2396");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getRoleName();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2397");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2398");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getPassword();
        java.lang.String str15 = student5.getPassword();
        main.Room room16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking19 = student5.booking(room16, localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2399");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2400");
        main.Student student5 = new main.Student("Student", "Staff", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2401");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2402");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2403");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2404");
        main.Student student5 = new main.Student("", "", "", false, (java.lang.Long) 100L);
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
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2405");
        main.Student student4 = new main.Student("", "Student", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2406");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        staff4.logout();
        java.lang.String str11 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2407");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2408");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getRoleName();
        java.lang.String str11 = staff4.getRoleName();
        boolean boolean13 = staff4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2409");
        main.Staff staff5 = new main.Staff("Staff", "", "", false, (java.lang.Long) 10L);
        boolean boolean7 = staff5.login("");
        boolean boolean9 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2410");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2411");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) (-1L));
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
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2412");
        main.Staff staff5 = new main.Staff("", "Staff", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2413");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getEmail();
        java.lang.String str15 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2414");
        main.Student student5 = new main.Student("Student", "Student", "Student", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getPassword();
        boolean boolean9 = student5.login("Student");
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2415");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2416");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Staff", (java.lang.Long) 1L);
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2417");
        main.Student student5 = new main.Student("", "Student", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2418");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2419");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2420");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getId();
        double double14 = student5.getHourlyRate();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2421");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2422");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        boolean boolean8 = student5.login("Staff");
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2423");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2424");
        main.Student student4 = new main.Student("", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getPassword();
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
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2425");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2426");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        staff4.logout();
        boolean boolean11 = staff4.login("hi!");
        java.lang.String str12 = staff4.getPassword();
        java.lang.String str13 = staff4.getRoleName();
        double double14 = staff4.getHourlyRate();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2427");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        staff5.logout();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2428");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2429");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getRoleName();
        java.lang.String str9 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2430");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        boolean boolean15 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2431");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        staff4.logout();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2432");
        main.Student student4 = new main.Student("hi!", "", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2433");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", false, (java.lang.Long) (-1L));
        staff5.logout();
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2434");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        student5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2435");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getEmail();
        double double13 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2436");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getEmail();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2437");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        staff5.logout();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2438");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean12 = staff4.login("hi!");
        java.lang.String str13 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2439");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2440");
        main.Student student5 = new main.Student("Staff", "", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2441");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2442");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getId();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2443");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getId();
        boolean boolean10 = staff5.login("Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2444");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2445");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2446");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2447");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getId();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2448");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2449");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2450");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        boolean boolean7 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2451");
        main.Student student5 = new main.Student("", "Student", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2452");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Student", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2453");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str10 = staff4.getPassword();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2454");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) (-1L));
        student4.logout();
        student4.logout();
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2455");
        main.Student student4 = new main.Student("", "Student", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2456");
        main.Student student5 = new main.Student("Staff", "Staff", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2457");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getRoleName();
        double double9 = staff4.getHourlyRate();
        boolean boolean11 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2458");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str11 = student5.getEmail();
        student5.logout();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2459");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2460");
        main.Student student4 = new main.Student("", "hi!", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2461");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2462");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2463");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        staff5.logout();
        boolean boolean9 = staff5.login("hi!");
        boolean boolean11 = staff5.login("Staff");
        java.lang.String str12 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2464");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "Student", (java.lang.Long) 10L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2465");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Staff", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2466");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getPassword();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2467");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2468");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("Student");
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getPassword();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2469");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2470");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2471");
        main.Student student5 = new main.Student("Student", "hi!", "Staff", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2472");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", true, (java.lang.Long) 10L);
        staff5.logout();
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2473");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2474");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2475");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        boolean boolean8 = student4.login("Staff");
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2476");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2477");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getId();
        student4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2478");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 1L);
        student5.logout();
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2479");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        student5.logout();
        java.lang.String str12 = student5.getEmail();
        boolean boolean14 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2480");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2481");
        main.Student student5 = new main.Student("", "", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2482");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2483");
        main.Student student5 = new main.Student("", "Student", "hi!", true, (java.lang.Long) 10L);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2484");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2485");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        student5.logout();
        boolean boolean11 = student5.login("Student");
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getId();
        java.lang.String str14 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2486");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2487");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2488");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2489");
        main.Staff staff5 = new main.Staff("Student", "", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2490");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2491");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2492");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        double double9 = staff4.getHourlyRate();
        java.lang.String str10 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2493");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getRoleName();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2494");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str9 = staff4.getRoleName();
        staff4.logout();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2495");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2496");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean10 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2497");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getEmail();
        boolean boolean10 = staff4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2498");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        boolean boolean6 = staff4.isVerified();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2499");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest4.test2500");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getPassword();
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }
}

