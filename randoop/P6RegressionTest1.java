import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P6RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0501");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0502");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0503");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", true, (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0504");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0505");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) 1L);
        boolean boolean5 = student4.isVerified();
        student4.logout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0506");
        main.Student student4 = new main.Student("Staff", "Student", "", (java.lang.Long) 10L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0507");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0508");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0509");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        java.lang.String str11 = staff5.getEmail();
        boolean boolean12 = staff5.isVerified();
        java.lang.String str13 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0510");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0511");
        main.Staff staff4 = new main.Staff("", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0512");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0513");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0514");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getEmail();
        boolean boolean10 = staff5.login("Staff");
        boolean boolean12 = staff5.login("Student");
        java.lang.String str13 = staff5.getRoleName();
        java.lang.String str14 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0515");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 100L);
        staff4.logout();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0516");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean11 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0517");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0518");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0519");
        main.Staff staff4 = new main.Staff("hi!", "Student", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0520");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        staff5.logout();
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0521");
        main.Student student5 = new main.Student("", "Staff", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0522");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getRoleName();
        boolean boolean9 = staff4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0523");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean6 = student4.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0524");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Student");
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0525");
        main.Student student5 = new main.Student("Staff", "Student", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0526");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0527");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0528");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "hi!", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0529");
        main.Staff staff4 = new main.Staff("", "", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0530");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0531");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0532");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        boolean boolean7 = staff4.login("");
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0533");
        main.Student student4 = new main.Student("Staff", "", "Student", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0534");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0535");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", false, (java.lang.Long) 10L);
        student5.logout();
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0536");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0537");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "Staff", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0538");
        main.Staff staff5 = new main.Staff("hi!", "", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0539");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0540");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0541");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0542");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getPassword();
        boolean boolean8 = staff5.isVerified();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0543");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0544");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0545");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean9 = staff4.isVerified();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0546");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0547");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getRoleName();
        double double8 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0548");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0549");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0550");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0551");
        main.Student student5 = new main.Student("hi!", "Student", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0552");
        main.Student student5 = new main.Student("Staff", "", "Staff", true, (java.lang.Long) 100L);
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0553");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getPassword();
        java.lang.String str9 = staff5.getPassword();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0554");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean9 = student5.login("hi!");
        student5.logout();
        boolean boolean12 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0555");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getEmail();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0556");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0557");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0558");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getPassword();
        double double7 = student5.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0559");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0560");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0561");
        main.Student student4 = new main.Student("", "Student", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0562");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0563");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0564");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        java.lang.String str12 = student5.getPassword();
        boolean boolean14 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0565");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        boolean boolean8 = student4.isVerified();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0566");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        boolean boolean10 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0567");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0568");
        main.Student student5 = new main.Student("", "Student", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        student5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0569");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("hi!");
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0570");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0571");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
        java.lang.String str13 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0572");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0573");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0574");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0575");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0576");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0577");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0578");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0579");
        main.Student student4 = new main.Student("hi!", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0580");
        main.Staff staff5 = new main.Staff("Student", "hi!", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0581");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", false, (java.lang.Long) 10L);
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0582");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", true, (java.lang.Long) 0L);
        staff5.logout();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0583");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPassword();
        boolean boolean8 = student4.isVerified();
        student4.logout();
        boolean boolean11 = student4.login("Student");
        double double12 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0584");
        main.Staff staff5 = new main.Staff("Staff", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0585");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", true, (java.lang.Long) 10L);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0586");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getPassword();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0587");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0588");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0589");
        main.Staff staff5 = new main.Staff("hi!", "Student", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0590");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0591");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0592");
        main.Student student5 = new main.Student("Student", "hi!", "", true, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0593");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 10L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0594");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0595");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "Staff", (java.lang.Long) (-1L));
        staff4.logout();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0596");
        main.Staff staff5 = new main.Staff("Student", "", "Staff", false, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        java.lang.String str8 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0597");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0598");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0599");
        main.Student student4 = new main.Student("Staff", "", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0600");
        main.Staff staff4 = new main.Staff("", "hi!", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0601");
        main.Staff staff5 = new main.Staff("Student", "", "", true, (java.lang.Long) (-1L));
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0602");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getRoleName();
        java.lang.Class<?> wildcardClass14 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0603");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0604");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", true, (java.lang.Long) (-1L));
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0605");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        boolean boolean12 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0606");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0607");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) (-1L));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0608");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        student5.logout();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0609");
        main.Student student4 = new main.Student("hi!", "", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0610");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0611");
        main.Staff staff4 = new main.Staff("Student", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        boolean boolean6 = staff4.isVerified();
        double double7 = staff4.getHourlyRate();
        boolean boolean9 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0612");
        main.Student student4 = new main.Student("Student", "hi!", "Staff", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0613");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0614");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        boolean boolean11 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0615");
        main.Student student5 = new main.Student("Staff", "Staff", "", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0616");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0617");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0618");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        boolean boolean13 = student5.login("");
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0619");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0620");
        main.Student student5 = new main.Student("Staff", "", "Student", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0621");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0622");
        main.Student student5 = new main.Student("Staff", "Student", "Student", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0623");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0624");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0625");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0626");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        boolean boolean9 = student5.login("Student");
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0627");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0628");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0629");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0630");
        main.Student student5 = new main.Student("", "Student", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0631");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0632");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0633");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 100L);
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0634");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0635");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0636");
        main.Student student5 = new main.Student("Student", "Student", "hi!", false, (java.lang.Long) 10L);
        boolean boolean7 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0637");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0638");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0639");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getEmail();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0640");
        main.Student student5 = new main.Student("Staff", "Student", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0641");
        main.Student student5 = new main.Student("", "hi!", "hi!", true, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0642");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0643");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0644");
        main.Student student5 = new main.Student("", "Student", "hi!", true, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0645");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getRoleName();
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0646");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getId();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0647");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        student4.logout();
        java.lang.String str8 = student4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0648");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0649");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 10L);
        student4.logout();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0650");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0651");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.logout();
        java.lang.String str9 = student4.getId();
        java.lang.String str10 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0652");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0653");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        boolean boolean9 = student5.login("Student");
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0654");
        main.Student student5 = new main.Student("", "", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0655");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0656");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0657");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0658");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getId();
        java.lang.String str11 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0659");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0660");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0661");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("hi!");
        boolean boolean7 = staff4.isVerified();
        boolean boolean8 = staff4.isVerified();
        double double9 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0662");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0663");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0664");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0665");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("");
        java.lang.String str7 = student4.getRoleName();
        boolean boolean8 = student4.isVerified();
        java.lang.String str9 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0666");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0667");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0668");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        boolean boolean13 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0669");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getId();
        boolean boolean15 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0670");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0671");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 100L);
        boolean boolean6 = staff4.login("Student");
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0672");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0673");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0674");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0675");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0676");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0677");
        main.Student student5 = new main.Student("Student", "", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0678");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        boolean boolean13 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0679");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0680");
        main.Student student5 = new main.Student("Student", "", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0681");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0682");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0683");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0684");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0685");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0686");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0687");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0688");
        main.Student student4 = new main.Student("Student", "Staff", "hi!", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0689");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0690");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0691");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0692");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0693");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0694");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0695");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        student5.logout();
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0696");
        main.Student student5 = new main.Student("Staff", "hi!", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0697");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0698");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0699");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0700");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        double double10 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0701");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0702");
        main.Staff staff5 = new main.Staff("", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0703");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0704");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", true, (java.lang.Long) 100L);
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0705");
        main.Student student4 = new main.Student("Staff", "", "hi!", (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0706");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0707");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0708");
        main.Student student5 = new main.Student("Student", "", "hi!", false, (java.lang.Long) 10L);
        student5.logout();
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0709");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0710");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", true, (java.lang.Long) 10L);
        boolean boolean7 = staff5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0711");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0712");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0713");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        staff4.logout();
        boolean boolean11 = staff4.login("hi!");
        java.lang.String str12 = staff4.getPassword();
        double double13 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0714");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0715");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0716");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Student", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0717");
        main.Student student5 = new main.Student("", "", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0718");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0719");
        main.Student student5 = new main.Student("hi!", "Staff", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0720");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getId();
        student5.logout();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0721");
        main.Student student5 = new main.Student("hi!", "", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0722");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0723");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0724");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0725");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0726");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0727");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0728");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0729");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0730");
        main.Student student5 = new main.Student("hi!", "", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0731");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0732");
        main.Student student4 = new main.Student("hi!", "Student", "Staff", (java.lang.Long) 1L);
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0733");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0734");
        main.Student student5 = new main.Student("hi!", "Student", "", true, (java.lang.Long) 10L);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0735");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0736");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0737");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        boolean boolean12 = student5.isVerified();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0738");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0739");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0740");
        main.Student student5 = new main.Student("Staff", "", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0741");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean8 = student5.login("hi!");
        boolean boolean10 = student5.login("Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0742");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0743");
        main.Staff staff5 = new main.Staff("", "Student", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0744");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        double double13 = student5.getHourlyRate();
        double double14 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0745");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        boolean boolean13 = student5.isVerified();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0746");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        boolean boolean7 = staff4.login("hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0747");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        double double8 = student5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0748");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        boolean boolean7 = staff5.isVerified();
        main.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking11 = staff5.booking(room8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0749");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Student", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0750");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        double double8 = staff4.getHourlyRate();
        boolean boolean9 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0751");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0752");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0753");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0754");
        main.Staff staff4 = new main.Staff("Student", "", "", (java.lang.Long) (-1L));
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0755");
        main.Student student5 = new main.Student("Student", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0756");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0757");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        boolean boolean7 = staff4.isVerified();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0758");
        main.Staff staff4 = new main.Staff("Student", "Student", "Student", (java.lang.Long) 1L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0759");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("hi!");
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        java.lang.String str14 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0760");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getRoleName();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0761");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        boolean boolean8 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0762");
        main.Student student4 = new main.Student("Student", "Student", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0763");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0764");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0765");
        main.Student student4 = new main.Student("Staff", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0766");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0767");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getId();
        double double14 = student5.getHourlyRate();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0768");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0769");
        main.Student student5 = new main.Student("Student", "hi!", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0770");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 0L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0771");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0772");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        staff4.logout();
        boolean boolean9 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0773");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getRoleName();
        java.lang.String str9 = student4.getRoleName();
        boolean boolean11 = student4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0774");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0775");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getRoleName();
        java.lang.String str9 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0776");
        main.Staff staff5 = new main.Staff("", "Student", "hi!", false, (java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0777");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 10L);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0778");
        main.Student student4 = new main.Student("Student", "Staff", "Staff", (java.lang.Long) 0L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0779");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        student4.logout();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0780");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        student5.logout();
        java.lang.Class<?> wildcardClass13 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0781");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0782");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Staff", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0783");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0784");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getEmail();
        boolean boolean10 = staff5.login("Staff");
        java.lang.String str11 = staff5.getRoleName();
        boolean boolean12 = staff5.isVerified();
        java.lang.String str13 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0785");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getId();
        boolean boolean9 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0786");
        main.Student student5 = new main.Student("Student", "Student", "Student", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0787");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        java.lang.String str8 = student4.getPassword();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0788");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0789");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0790");
        main.Student student5 = new main.Student("hi!", "hi!", "Staff", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0791");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0792");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0793");
        main.Student student5 = new main.Student("Staff", "", "", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0794");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0795");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0796");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0797");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        staff5.logout();
        java.lang.String str9 = staff5.getPassword();
        java.lang.String str10 = staff5.getEmail();
        java.lang.String str11 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0798");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0799");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getPassword();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0800");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean11 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0801");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        double double11 = student5.getHourlyRate();
        java.lang.String str12 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0802");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        java.lang.String str8 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0803");
        main.Student student4 = new main.Student("Staff", "Staff", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0804");
        main.Student student4 = new main.Student("Staff", "hi!", "Student", (java.lang.Long) 10L);
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0805");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        student5.logout();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0806");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0807");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0808");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0809");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        boolean boolean6 = staff4.isVerified();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0810");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0811");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0812");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
        double double8 = staff4.getHourlyRate();
        boolean boolean10 = staff4.login("");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0813");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("");
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getEmail();
        java.lang.String str9 = student4.getId();
        java.lang.String str10 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0814");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        java.lang.String str7 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0815");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        staff4.logout();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0816");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0817");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0818");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0819");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getId();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0820");
        main.Student student5 = new main.Student("hi!", "", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0821");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0822");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Staff", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0823");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        staff4.logout();
        boolean boolean10 = staff4.login("");
        boolean boolean11 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0824");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0825");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        boolean boolean7 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0826");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0827");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getEmail();
        boolean boolean8 = student5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0828");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean11 = student5.login("Staff");
        java.lang.String str12 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0829");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) (-1L));
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0830");
        main.Staff staff5 = new main.Staff("hi!", "Student", "", true, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0831");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getRoleName();
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0832");
        main.Student student5 = new main.Student("Student", "Student", "Staff", true, (java.lang.Long) 0L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0833");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0834");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getPassword();
        student4.logout();
        java.lang.String str9 = student4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0835");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        student5.logout();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0836");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        student4.logout();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0837");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        boolean boolean7 = staff5.isVerified();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0838");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0839");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0840");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0841");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        staff4.logout();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0842");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        staff4.logout();
        staff4.logout();
        java.lang.String str10 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0843");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        java.lang.String str8 = student5.getId();
        boolean boolean10 = student5.login("Staff");
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0844");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0845");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getPassword();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0846");
        main.Student student5 = new main.Student("", "hi!", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0847");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getPassword();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0848");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0849");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0850");
        main.Student student4 = new main.Student("Staff", "hi!", "Staff", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0851");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0852");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getEmail();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0853");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0854");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0855");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0856");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0857");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0858");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Staff");
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0859");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0860");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0861");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0862");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 1L);
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0863");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0864");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0865");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getEmail();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0866");
        main.Student student5 = new main.Student("", "hi!", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0867");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getId();
        double double10 = staff5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0868");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 0L);
        student5.logout();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0869");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0870");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0871");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Student");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0872");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getRoleName();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0873");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getRoleName();
        java.lang.String str11 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0874");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getId();
        java.lang.String str10 = staff4.getPassword();
        java.lang.String str11 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0875");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        staff4.logout();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0876");
        main.Student student5 = new main.Student("hi!", "Student", "Student", true, (java.lang.Long) 100L);
        student5.logout();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0877");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0878");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        student5.logout();
        boolean boolean10 = student5.isVerified();
        boolean boolean12 = student5.login("");
        boolean boolean14 = student5.login("Student");
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0879");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0880");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getPassword();
        java.lang.String str9 = staff5.getPassword();
        java.lang.String str10 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0881");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0882");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        staff4.logout();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0883");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0884");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0885");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getPassword();
        java.lang.String str9 = staff5.getPassword();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0886");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getEmail();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0887");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0888");
        main.Student student5 = new main.Student("Student", "", "Staff", true, (java.lang.Long) 100L);
        student5.logout();
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0889");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        double double9 = staff4.getHourlyRate();
        boolean boolean11 = staff4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0890");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0891");
        main.Student student5 = new main.Student("Staff", "Student", "Student", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("");
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0892");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        double double7 = staff4.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0893");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0894");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0895");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0896");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0897");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        boolean boolean9 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0898");
        main.Staff staff4 = new main.Staff("Student", "", "hi!", (java.lang.Long) 0L);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0899");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) 100L);
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0900");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0901");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0902");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0903");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0904");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 10L);
        student4.logout();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0905");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0906");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
        boolean boolean8 = staff4.login("hi!");
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0907");
        main.Student student4 = new main.Student("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        boolean boolean7 = student4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0908");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        double double8 = student5.getHourlyRate();
        double double9 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0909");
        main.Student student4 = new main.Student("Staff", "Staff", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0910");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0911");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        boolean boolean10 = staff5.login("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0912");
        main.Staff staff5 = new main.Staff("Student", "", "", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0913");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0914");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0915");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getId();
        java.lang.String str15 = student5.getRoleName();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0916");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0917");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getEmail();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0918");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0919");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0920");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) (-1L));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0921");
        main.Student student4 = new main.Student("", "", "Staff", (java.lang.Long) 10L);
        boolean boolean5 = student4.isVerified();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0922");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getPassword();
        java.lang.String str11 = student4.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0923");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0924");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        boolean boolean8 = staff5.isVerified();
        boolean boolean9 = staff5.isVerified();
        staff5.logout();
        boolean boolean12 = staff5.login("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0925");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0926");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0927");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 0L);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0928");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0929");
        main.Student student5 = new main.Student("Staff", "Student", "", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getId();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0930");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Staff", (java.lang.Long) (-1L));
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0931");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0932");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getRoleName();
        double double8 = student5.getHourlyRate();
        student5.logout();
        student5.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0933");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        staff5.logout();
        staff5.logout();
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0934");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        boolean boolean6 = staff4.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0935");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getRoleName();
        student5.logout();
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0936");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0937");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean8 = student4.login("Staff");
        java.lang.String str9 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0938");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        student5.logout();
        boolean boolean14 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0939");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0940");
        main.Student student5 = new main.Student("", "Staff", "hi!", true, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0941");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean12 = student5.login("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0942");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0943");
        main.Student student4 = new main.Student("Staff", "", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0944");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0945");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        student5.logout();
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0946");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0947");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0948");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        double double15 = student5.getHourlyRate();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0949");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getRoleName();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0950");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        student4.logout();
        boolean boolean8 = student4.isVerified();
        double double9 = student4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0951");
        main.Student student4 = new main.Student("hi!", "", "hi!", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0952");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        boolean boolean10 = staff4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0953");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        student4.logout();
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0954");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        double double8 = staff4.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0955");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Student", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0956");
        main.Staff staff5 = new main.Staff("Staff", "", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0957");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0958");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0959");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getId();
        staff4.logout();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0960");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        java.lang.String str12 = student5.getPassword();
        boolean boolean13 = student5.isVerified();
        double double14 = student5.getHourlyRate();
        boolean boolean15 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0961");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", false, (java.lang.Long) 10L);
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0962");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0963");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPassword();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0964");
        main.Staff staff5 = new main.Staff("", "Student", "", false, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0965");
        main.Student student4 = new main.Student("Student", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0966");
        main.Staff staff5 = new main.Staff("Student", "Student", "hi!", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0967");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getRoleName();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0968");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0969");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0970");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0971");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 1L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0972");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        double double9 = student4.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0973");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0974");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getPassword();
        double double8 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0975");
        main.Staff staff4 = new main.Staff("hi!", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0976");
        main.Student student5 = new main.Student("Student", "hi!", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0977");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0978");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        double double10 = student5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0979");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        double double13 = student5.getHourlyRate();
        java.lang.String str14 = student5.getId();
        java.lang.String str15 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0980");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getPassword();
        boolean boolean15 = student5.login("hi!");
        java.lang.String str16 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0981");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getEmail();
        boolean boolean10 = staff5.login("Staff");
        staff5.logout();
        java.lang.Class<?> wildcardClass12 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0982");
        main.Student student4 = new main.Student("Staff", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0983");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0984");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0985");
        main.Staff staff4 = new main.Staff("Student", "", "", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0986");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0987");
        main.Staff staff4 = new main.Staff("Staff", "", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0988");
        main.Student student5 = new main.Student("Staff", "", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0989");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0990");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("Student");
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0991");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        boolean boolean8 = student4.isVerified();
        boolean boolean9 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0992");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) (-1L));
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0993");
        main.Staff staff4 = new main.Staff("hi!", "Student", "", (java.lang.Long) 1L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0994");
        main.Student student4 = new main.Student("", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0995");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0996");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0997");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 10L);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0998");
        main.Student student4 = new main.Student("", "hi!", "", (java.lang.Long) 100L);
        boolean boolean6 = student4.login("Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test0999");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isVerified();
        boolean boolean8 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest1.test1000");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("hi!");
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }
}

