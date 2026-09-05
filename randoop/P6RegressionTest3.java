import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P6RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1501");
        main.Student student5 = new main.Student("Student", "", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1502");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("Staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1503");
        main.Student student4 = new main.Student("Student", "", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1504");
        main.Student student5 = new main.Student("", "Staff", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1505");
        main.Student student5 = new main.Student("Student", "Staff", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1506");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getId();
        double double10 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1507");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1508");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1509");
        main.Student student4 = new main.Student("hi!", "Staff", "Student", (java.lang.Long) 10L);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1510");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", true, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1511");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getId();
        boolean boolean13 = student5.isVerified();
        boolean boolean14 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1512");
        main.Student student4 = new main.Student("", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1513");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getEmail();
        boolean boolean11 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1514");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1515");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        java.lang.String str7 = staff4.getId();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1516");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1517");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1518");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getPassword();
        boolean boolean11 = student4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1519");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1520");
        main.Staff staff5 = new main.Staff("", "hi!", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1521");
        main.Student student4 = new main.Student("", "Student", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1522");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1523");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        staff4.logout();
        java.lang.String str6 = staff4.getEmail();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1524");
        main.Student student5 = new main.Student("", "hi!", "", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1525");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1526");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getEmail();
        java.lang.String str10 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1527");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", true, (java.lang.Long) 0L);
        staff5.logout();
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1528");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getRoleName();
        student5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1529");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        boolean boolean9 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1530");
        main.Staff staff5 = new main.Staff("hi!", "", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1531");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1532");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        double double8 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1533");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        boolean boolean8 = staff4.login("Staff");
        staff4.logout();
        java.lang.String str10 = staff4.getRoleName();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1534");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) 0L);
        student4.logout();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1535");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1536");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1537");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        java.lang.String str7 = student4.getRoleName();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1538");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1539");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", true, (java.lang.Long) (-1L));
        staff5.logout();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1540");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1541");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        staff4.logout();
        staff4.logout();
        java.lang.String str8 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1542");
        main.Staff staff5 = new main.Staff("hi!", "", "Student", false, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1543");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1544");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1545");
        main.Staff staff5 = new main.Staff("", "Staff", "", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1546");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1547");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1548");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1549");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getEmail();
        double double6 = staff4.getHourlyRate();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1550");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1551");
        main.Student student5 = new main.Student("hi!", "hi!", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1552");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1553");
        main.Student student5 = new main.Student("Staff", "Student", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1554");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        java.lang.String str8 = staff5.getEmail();
        boolean boolean10 = staff5.login("Staff");
        boolean boolean12 = staff5.login("Student");
        java.lang.Class<?> wildcardClass13 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1555");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean9 = staff5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1556");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        java.lang.String str7 = staff4.getId();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1557");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", false, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1558");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1559");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean6 = student4.isVerified();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1560");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1561");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getPassword();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1562");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        boolean boolean6 = staff4.isVerified();
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1563");
        main.Student student5 = new main.Student("Student", "hi!", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1564");
        main.Student student4 = new main.Student("Student", "Student", "", (java.lang.Long) 0L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1565");
        main.Staff staff4 = new main.Staff("Staff", "", "Staff", (java.lang.Long) 100L);
        staff4.logout();
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1566");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getEmail();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1567");
        main.Staff staff5 = new main.Staff("Student", "Staff", "hi!", false, (java.lang.Long) 100L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1568");
        main.Student student4 = new main.Student("", "Staff", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1569");
        main.Student student5 = new main.Student("Staff", "", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1570");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getId();
        java.lang.String str7 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1571");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("hi!");
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        boolean boolean15 = student5.login("hi!");
        java.lang.Class<?> wildcardClass16 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1572");
        main.Student student5 = new main.Student("hi!", "", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1573");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getId();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1574");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1575");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        double double9 = student5.getHourlyRate();
        boolean boolean11 = student5.login("");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1576");
        main.Staff staff5 = new main.Staff("hi!", "", "Student", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1577");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1578");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getPassword();
        java.lang.String str11 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1579");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1580");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getRoleName();
        java.lang.String str8 = student5.getId();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1581");
        main.Staff staff5 = new main.Staff("Student", "Student", "Student", false, (java.lang.Long) 10L);
        boolean boolean7 = staff5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1582");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1583");
        main.Staff staff4 = new main.Staff("Staff", "Student", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        java.lang.String str7 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1584");
        main.Student student4 = new main.Student("", "hi!", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1585");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1586");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1587");
        main.Staff staff5 = new main.Staff("hi!", "Student", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1588");
        main.Student student5 = new main.Student("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1589");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        staff4.logout();
        java.lang.Class<?> wildcardClass6 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1590");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1591");
        main.Staff staff4 = new main.Staff("", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1592");
        main.Student student4 = new main.Student("Student", "Student", "", (java.lang.Long) 1L);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1593");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "hi!", true, (java.lang.Long) 10L);
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean8 = staff5.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1594");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getEmail();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getId();
        java.lang.String str14 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1595");
        main.Staff staff5 = new main.Staff("Staff", "", "hi!", true, (java.lang.Long) 10L);
        boolean boolean7 = staff5.login("Staff");
        boolean boolean9 = staff5.login("");
        java.lang.String str10 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1596");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", false, (java.lang.Long) 0L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1597");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1598");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1599");
        main.Student student5 = new main.Student("Staff", "Student", "hi!", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1600");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) 0L);
        student5.logout();
        student5.logout();
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1601");
        main.Staff staff4 = new main.Staff("hi!", "", "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1602");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1603");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1604");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        java.lang.String str7 = staff5.getRoleName();
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1605");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1606");
        main.Student student4 = new main.Student("", "hi!", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1607");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getEmail();
        boolean boolean10 = staff4.login("Staff");
        staff4.logout();
        java.lang.Class<?> wildcardClass12 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1608");
        main.Student student5 = new main.Student("Staff", "Staff", "hi!", true, (java.lang.Long) 0L);
        student5.logout();
        boolean boolean7 = student5.isVerified();
        java.lang.String str8 = student5.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1609");
        main.Student student5 = new main.Student("hi!", "Staff", "Staff", false, (java.lang.Long) 10L);
        student5.logout();
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1610");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1611");
        main.Student student5 = new main.Student("", "Student", "", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1612");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1613");
        main.Student student4 = new main.Student("hi!", "", "", (java.lang.Long) 10L);
        student4.logout();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1614");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str9 = staff5.getEmail();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1615");
        main.Student student5 = new main.Student("Staff", "hi!", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1616");
        main.Student student5 = new main.Student("", "", "Staff", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1617");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getEmail();
        java.lang.Class<?> wildcardClass10 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1618");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1619");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getEmail();
        double double9 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1620");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1621");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmail();
        boolean boolean10 = staff5.login("Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1622");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1623");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        double double7 = student5.getHourlyRate();
        double double8 = student5.getHourlyRate();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1624");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1625");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getRoleName();
        main.Room room10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking13 = staff5.booking(room10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Account is not verified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1626");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        double double14 = student5.getHourlyRate();
        boolean boolean16 = student5.login("");
        double double17 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1627");
        main.Staff staff4 = new main.Staff("", "Staff", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getEmail();
        boolean boolean6 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1628");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1629");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean10 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1630");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        student4.logout();
        java.lang.String str7 = student4.getId();
        boolean boolean8 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1631");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("");
        double double8 = staff5.getHourlyRate();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1632");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        boolean boolean8 = student4.login("");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1633");
        main.Student student5 = new main.Student("", "", "hi!", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1634");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1635");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isVerified();
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1636");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        boolean boolean14 = student5.isVerified();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1637");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Staff", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1638");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1639");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        double double10 = student5.getHourlyRate();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getRoleName();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1640");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1641");
        main.Staff staff5 = new main.Staff("", "Staff", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1642");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        boolean boolean14 = student5.isVerified();
        java.lang.Class<?> wildcardClass15 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1643");
        main.Student student4 = new main.Student("", "hi!", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1644");
        main.Student student4 = new main.Student("", "", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("Staff");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1645");
        main.Student student5 = new main.Student("hi!", "Student", "", false, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1646");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        java.lang.String str8 = staff4.getRoleName();
        double double9 = staff4.getHourlyRate();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1647");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1648");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1649");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean11 = staff4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1650");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1651");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 100L);
        boolean boolean5 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1652");
        main.Staff staff4 = new main.Staff("hi!", "Staff", "", (java.lang.Long) 0L);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1653");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean6 = student4.isVerified();
        boolean boolean8 = student4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1654");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1655");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "hi!", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1656");
        main.Student student5 = new main.Student("Student", "hi!", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1657");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1658");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        boolean boolean8 = staff4.login("hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1659");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1660");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        java.lang.String str8 = staff4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1661");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        boolean boolean7 = staff4.isVerified();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1662");
        main.Staff staff5 = new main.Staff("", "Student", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1663");
        main.Student student5 = new main.Student("hi!", "hi!", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1664");
        main.Student student4 = new main.Student("Student", "Staff", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1665");
        main.Student student4 = new main.Student("Staff", "hi!", "", (java.lang.Long) 1L);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1666");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean7 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1667");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) 100L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1668");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        boolean boolean6 = staff4.login("");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1669");
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
        boolean boolean18 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1670");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1671");
        main.Student student5 = new main.Student("Student", "", "Staff", false, (java.lang.Long) (-1L));
        boolean boolean6 = student5.isVerified();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1672");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Student", (java.lang.Long) 100L);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1673");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "hi!", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1674");
        main.Student student5 = new main.Student("Student", "Staff", "", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1675");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        student5.logout();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isVerified();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1676");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getRoleName();
        staff5.logout();
        boolean boolean10 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1677");
        main.Staff staff4 = new main.Staff("Staff", "", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1678");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1679");
        main.Student student4 = new main.Student("hi!", "hi!", "hi!", (java.lang.Long) 1L);
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1680");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 100L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1681");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        java.lang.String str13 = student5.getRoleName();
        java.lang.String str14 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1682");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        boolean boolean10 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1683");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean7 = student4.isVerified();
        student4.logout();
        java.lang.String str9 = student4.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1684");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1685");
        main.Staff staff4 = new main.Staff("", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        staff4.logout();
        boolean boolean11 = staff4.login("hi!");
        java.lang.String str12 = staff4.getPassword();
        java.lang.String str13 = staff4.getId();
        java.lang.String str14 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1686");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1687");
        main.Staff staff5 = new main.Staff("", "Staff", "", false, (java.lang.Long) 10L);
        boolean boolean7 = staff5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1688");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1689");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1690");
        main.Staff staff4 = new main.Staff("Staff", "", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1691");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
        boolean boolean14 = student5.isVerified();
        boolean boolean16 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1692");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        java.lang.String str10 = staff4.getPassword();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1693");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        double double8 = staff5.getHourlyRate();
        boolean boolean10 = staff5.login("Staff");
        java.lang.String str11 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1694");
        main.Student student5 = new main.Student("hi!", "hi!", "Student", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1695");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1696");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1697");
        main.Staff staff5 = new main.Staff("", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        double double8 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1698");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        boolean boolean9 = staff4.isVerified();
        java.lang.String str10 = staff4.getEmail();
        java.lang.String str11 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1699");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1700");
        main.Staff staff4 = new main.Staff("", "", "Staff", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1701");
        main.Staff staff5 = new main.Staff("", "Staff", "Staff", false, (java.lang.Long) 10L);
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1702");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1703");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean10 = staff5.isVerified();
        java.lang.Class<?> wildcardClass11 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1704");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1705");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        boolean boolean10 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1706");
        main.Student student5 = new main.Student("Staff", "", "Staff", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1707");
        main.Student student4 = new main.Student("Staff", "", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1708");
        main.Staff staff5 = new main.Staff("Student", "Staff", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1709");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean6 = student4.isVerified();
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1710");
        main.Staff staff5 = new main.Staff("", "hi!", "", true, (java.lang.Long) 10L);
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1711");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1712");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 10L);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1713");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1714");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) 100L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1715");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        double double10 = staff4.getHourlyRate();
        java.lang.String str11 = staff4.getRoleName();
        java.lang.String str12 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1716");
        main.Student student5 = new main.Student("", "", "Student", true, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1717");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 0L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1718");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        boolean boolean6 = student4.login("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1719");
        main.Student student5 = new main.Student("hi!", "Student", "", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1720");
        main.Student student5 = new main.Student("Student", "Staff", "Staff", false, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1721");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1722");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getEmail();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1723");
        main.Staff staff5 = new main.Staff("", "Student", "Student", true, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1724");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1725");
        main.Student student5 = new main.Student("hi!", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1726");
        main.Student student5 = new main.Student("Staff", "", "", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1727");
        main.Student student5 = new main.Student("hi!", "Staff", "Student", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1728");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean8 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1729");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("Student");
        java.lang.String str8 = student4.getId();
        double double9 = student4.getHourlyRate();
        double double10 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1730");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1731");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1732");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1733");
        main.Student student5 = new main.Student("hi!", "Staff", "hi!", true, (java.lang.Long) (-1L));
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1734");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        boolean boolean8 = staff4.login("hi!");
        java.lang.String str9 = staff4.getRoleName();
        staff4.logout();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1735");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 100L);
        boolean boolean6 = staff4.login("Student");
        java.lang.String str7 = staff4.getId();
        boolean boolean8 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1736");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1737");
        main.Staff staff5 = new main.Staff("Student", "Student", "", true, (java.lang.Long) 0L);
        staff5.logout();
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1738");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean8 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1739");
        main.Student student4 = new main.Student("Student", "Student", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getPassword();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1740");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.String str10 = staff5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1741");
        main.Staff staff4 = new main.Staff("hi!", "", "Staff", (java.lang.Long) 100L);
        staff4.logout();
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1742");
        main.Staff staff4 = new main.Staff("Staff", "Student", "Student", (java.lang.Long) 1L);
        boolean boolean6 = staff4.login("");
        double double7 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1743");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", true, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1744");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1745");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1746");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1747");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        boolean boolean8 = staff4.isVerified();
        boolean boolean10 = staff4.login("");
        boolean boolean12 = staff4.login("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1748");
        main.Student student4 = new main.Student("hi!", "", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1749");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1750");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        boolean boolean13 = student5.login("Staff");
        student5.logout();
        java.lang.String str15 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1751");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        staff5.logout();
        java.lang.String str9 = staff5.getRoleName();
        boolean boolean11 = staff5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1752");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        boolean boolean11 = student5.isVerified();
        boolean boolean12 = student5.isVerified();
        java.lang.String str13 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1753");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1754");
        main.Student student5 = new main.Student("", "hi!", "Student", true, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        double double7 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1755");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1756");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Staff");
        java.lang.String str7 = student4.getPassword();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1757");
        main.Staff staff5 = new main.Staff("hi!", "", "Staff", false, (java.lang.Long) (-1L));
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1758");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 0L);
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1759");
        main.Student student4 = new main.Student("hi!", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getPassword();
        boolean boolean7 = student4.login("Student");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1760");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1761");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getPassword();
        double double9 = staff4.getHourlyRate();
        java.lang.String str10 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1762");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        boolean boolean12 = student5.login("Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1763");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) 10L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1764");
        main.Student student4 = new main.Student("hi!", "", "Staff", (java.lang.Long) (-1L));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1765");
        main.Student student4 = new main.Student("hi!", "Staff", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        double double6 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1766");
        main.Student student4 = new main.Student("", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        student4.logout();
        double double7 = student4.getHourlyRate();
        student4.logout();
        boolean boolean10 = student4.login("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1767");
        main.Student student5 = new main.Student("", "Staff", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1768");
        main.Staff staff4 = new main.Staff("Student", "Student", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1769");
        main.Student student4 = new main.Student("hi!", "hi!", "", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        double double7 = student4.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1770");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1771");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getEmail();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1772");
        main.Student student5 = new main.Student("Staff", "hi!", "Staff", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1773");
        main.Student student5 = new main.Student("", "Staff", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1774");
        main.Student student4 = new main.Student("Student", "", "", (java.lang.Long) 100L);
        boolean boolean5 = student4.isVerified();
        boolean boolean7 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1775");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        double double6 = student4.getHourlyRate();
        student4.logout();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1776");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        double double10 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1777");
        main.Staff staff4 = new main.Staff("Student", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getPassword();
        java.lang.Class<?> wildcardClass7 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1778");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass5 = staff4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1779");
        main.Staff staff5 = new main.Staff("", "", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1780");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1781");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1782");
        main.Student student5 = new main.Student("", "Staff", "", false, (java.lang.Long) 100L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1783");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Staff");
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        java.lang.String str9 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1784");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1785");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) 10L);
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1786");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        staff5.logout();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getPassword();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1787");
        main.Student student4 = new main.Student("hi!", "Student", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1788");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        boolean boolean8 = staff4.isVerified();
        java.lang.Class<?> wildcardClass9 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1789");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1790");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1791");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Staff", false, (java.lang.Long) 1L);
        boolean boolean7 = staff5.login("Student");
        double double8 = staff5.getHourlyRate();
        boolean boolean9 = staff5.isVerified();
        double double10 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1792");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getPassword();
        boolean boolean7 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1793");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        boolean boolean7 = student4.login("");
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1794");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
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
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1795");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) (-1L));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1796");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        student5.logout();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str13 = student5.getEmail();
        boolean boolean14 = student5.isVerified();
        double double15 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1797");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1798");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        staff5.logout();
        staff5.logout();
        java.lang.String str9 = staff5.getPassword();
        double double10 = staff5.getHourlyRate();
        double double11 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1799");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1800");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        double double7 = staff4.getHourlyRate();
        java.lang.String str8 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1801");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1802");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        java.lang.String str11 = student5.getPassword();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1803");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        student5.logout();
        java.lang.String str11 = student5.getPassword();
        java.lang.String str12 = student5.getRoleName();
        java.lang.String str13 = student5.getRoleName();
        boolean boolean14 = student5.isVerified();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1804");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getPassword();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1805");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean10 = staff4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1806");
        main.Student student5 = new main.Student("hi!", "hi!", "hi!", true, (java.lang.Long) 10L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getId();
        boolean boolean9 = student5.login("Student");
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1807");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1808");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        java.lang.String str7 = staff4.getPassword();
        double double8 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1809");
        main.Staff staff5 = new main.Staff("Staff", "", "", false, (java.lang.Long) 1L);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1810");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean8 = student5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1811");
        main.Staff staff5 = new main.Staff("", "Staff", "", true, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1812");
        main.Student student5 = new main.Student("Student", "", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1813");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getId();
        double double7 = staff5.getHourlyRate();
        boolean boolean9 = staff5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1814");
        main.Staff staff5 = new main.Staff("", "Staff", "Student", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1815");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Staff", (java.lang.Long) 100L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1816");
        main.Student student5 = new main.Student("", "", "Student", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        double double8 = student5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1817");
        main.Student student4 = new main.Student("Staff", "Student", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getId();
        boolean boolean7 = student4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1818");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1819");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
        java.lang.Class<?> wildcardClass11 = staff4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1820");
        main.Student student4 = new main.Student("Student", "hi!", "Staff", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1821");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getId();
        double double7 = student4.getHourlyRate();
        java.lang.String str8 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1822");
        main.Student student5 = new main.Student("Staff", "hi!", "Student", true, (java.lang.Long) 0L);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1823");
        main.Student student4 = new main.Student("", "", "", (java.lang.Long) 100L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1824");
        main.Staff staff4 = new main.Staff("hi!", "Student", "Staff", (java.lang.Long) 0L);
        boolean boolean6 = staff4.login("hi!");
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1825");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "", false, (java.lang.Long) (-1L));
        boolean boolean7 = staff5.login("Staff");
        boolean boolean8 = staff5.isVerified();
        java.lang.String str9 = staff5.getPassword();
        java.lang.String str10 = staff5.getRoleName();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1826");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1827");
        main.Staff staff5 = new main.Staff("Staff", "Staff", "", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1828");
        main.Student student5 = new main.Student("Student", "Student", "Staff", false, (java.lang.Long) 0L);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1829");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getRoleName();
        staff5.logout();
        double double8 = staff5.getHourlyRate();
        double double9 = staff5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1830");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
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
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1831");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1832");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "hi!", false, (java.lang.Long) 10L);
        double double6 = staff5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1833");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1834");
        main.Staff staff4 = new main.Staff("", "", "", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1835");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1836");
        main.Staff staff5 = new main.Staff("Student", "hi!", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        boolean boolean8 = staff5.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1837");
        main.Staff staff4 = new main.Staff("", "hi!", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1838");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean7 = student4.isVerified();
        java.lang.String str8 = student4.getRoleName();
        boolean boolean10 = student4.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1839");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1840");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        boolean boolean9 = student5.isVerified();
        double double10 = student5.getHourlyRate();
        double double11 = student5.getHourlyRate();
        double double12 = student5.getHourlyRate();
        double double13 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1841");
        main.Staff staff5 = new main.Staff("hi!", "", "", true, (java.lang.Long) 0L);
        boolean boolean7 = staff5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1842");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1843");
        main.Student student5 = new main.Student("Student", "Staff", "", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1844");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmail();
        java.lang.String str9 = staff5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1845");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        boolean boolean7 = student4.login("Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1846");
        main.Student student4 = new main.Student("Student", "hi!", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getId();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getRoleName();
        boolean boolean10 = student4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1847");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1848");
        main.Student student4 = new main.Student("Student", "Staff", "Student", (java.lang.Long) 100L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1849");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getId();
        java.lang.String str8 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1850");
        main.Staff staff5 = new main.Staff("Student", "Staff", "Student", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1851");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        double double7 = staff4.getHourlyRate();
        boolean boolean8 = staff4.isVerified();
        java.lang.String str9 = staff4.getRoleName();
        staff4.logout();
        java.lang.String str11 = staff4.getRoleName();
        boolean boolean12 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1852");
        main.Student student5 = new main.Student("Student", "Staff", "", false, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1853");
        main.Staff staff4 = new main.Staff("Student", "Staff", "Staff", (java.lang.Long) 100L);
        double double5 = staff4.getHourlyRate();
        double double6 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1854");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        student4.logout();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1855");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1856");
        main.Staff staff5 = new main.Staff("Staff", "Student", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1857");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 100L);
        java.lang.String str5 = student4.getRoleName();
        boolean boolean6 = student4.isVerified();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1858");
        main.Student student5 = new main.Student("Student", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getId();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1859");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        staff4.logout();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1860");
        main.Staff staff5 = new main.Staff("hi!", "", "hi!", false, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1861");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        staff5.logout();
        staff5.logout();
        boolean boolean8 = staff5.isVerified();
        main.Room room9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.Booking booking12 = staff5.booking(room9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.Room.isAvailable()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1862");
        main.Staff staff4 = new main.Staff("", "hi!", "", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        staff4.logout();
        java.lang.String str7 = staff4.getEmail();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1863");
        main.Student student5 = new main.Student("Staff", "", "hi!", true, (java.lang.Long) 100L);
        boolean boolean6 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1864");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        staff4.logout();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1865");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        java.lang.String str9 = staff5.getId();
        boolean boolean11 = staff5.login("hi!");
        java.lang.String str12 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1866");
        main.Staff staff4 = new main.Staff("hi!", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1867");
        main.Staff staff5 = new main.Staff("Student", "", "", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean8 = staff5.login("Staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1868");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1869");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        double double5 = staff4.getHourlyRate();
        staff4.logout();
        staff4.logout();
        java.lang.String str8 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1870");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getRoleName();
        java.lang.String str8 = staff4.getId();
        java.lang.String str9 = staff4.getEmail();
        java.lang.String str10 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1871");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1872");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        double double11 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1873");
        main.Staff staff5 = new main.Staff("", "hi!", "Staff", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getEmail();
        java.lang.Class<?> wildcardClass9 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1874");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean9 = staff5.login("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1875");
        main.Student student5 = new main.Student("", "", "Student", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1876");
        main.Staff staff5 = new main.Staff("Student", "Student", "Student", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getRoleName();
        boolean boolean7 = staff5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1877");
        main.Student student4 = new main.Student("Student", "Student", "", (java.lang.Long) 10L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1878");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean8 = student4.login("");
        java.lang.String str9 = student4.getRoleName();
        boolean boolean11 = student4.login("Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1879");
        main.Student student4 = new main.Student("", "", "hi!", (java.lang.Long) 0L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1880");
        main.Student student4 = new main.Student("", "Staff", "Student", (java.lang.Long) 0L);
        boolean boolean5 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1881");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getPassword();
        student4.logout();
        java.lang.String str10 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1882");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "", (java.lang.Long) 100L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1883");
        main.Student student5 = new main.Student("", "Student", "Student", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1884");
        main.Staff staff5 = new main.Staff("hi!", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        java.lang.String str7 = staff5.getEmail();
        staff5.logout();
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1885");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1886");
        main.Student student5 = new main.Student("Student", "Student", "Student", true, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1887");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Student", (java.lang.Long) 0L);
        boolean boolean5 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1888");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getEmail();
        double double7 = staff5.getHourlyRate();
        java.lang.String str8 = staff5.getRoleName();
        java.lang.String str9 = staff5.getRoleName();
        java.lang.Class<?> wildcardClass10 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1889");
        main.Student student4 = new main.Student("Staff", "Student", "hi!", (java.lang.Long) (-1L));
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1890");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getPassword();
        java.lang.String str6 = staff4.getEmail();
        java.lang.String str7 = staff4.getEmail();
        double double8 = staff4.getHourlyRate();
        boolean boolean10 = staff4.login("hi!");
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1891");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        double double8 = student5.getHourlyRate();
        boolean boolean10 = student5.login("Student");
        java.lang.String str11 = student5.getId();
        boolean boolean13 = student5.login("Student");
        java.lang.String str14 = student5.getRoleName();
        student5.logout();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1892");
        main.Staff staff4 = new main.Staff("Staff", "", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1893");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        double double13 = student5.getHourlyRate();
        boolean boolean14 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1894");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getId();
        java.lang.String str9 = staff5.getId();
        java.lang.String str10 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1895");
        main.Staff staff5 = new main.Staff("", "", "", false, (java.lang.Long) 0L);
        boolean boolean6 = staff5.isVerified();
        staff5.logout();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1896");
        main.Staff staff5 = new main.Staff("", "", "Student", true, (java.lang.Long) 100L);
        double double6 = staff5.getHourlyRate();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1897");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.Class<?> wildcardClass8 = staff4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1898");
        main.Staff staff4 = new main.Staff("Student", "", "Staff", (java.lang.Long) (-1L));
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
        staff4.logout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1899");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 10L);
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1900");
        main.Student student5 = new main.Student("", "hi!", "Staff", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        student5.logout();
        java.lang.String str8 = student5.getId();
        boolean boolean9 = student5.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1901");
        main.Student student4 = new main.Student("Student", "Student", "Student", (java.lang.Long) 1L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1902");
        main.Student student5 = new main.Student("", "", "Staff", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1903");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getId();
        double double7 = staff4.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1904");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getPassword();
        java.lang.String str6 = student4.getRoleName();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1905");
        main.Staff staff4 = new main.Staff("hi!", "", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1906");
        main.Staff staff4 = new main.Staff("", "Student", "hi!", (java.lang.Long) (-1L));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1907");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getEmail();
        java.lang.String str8 = staff5.getRoleName();
        boolean boolean10 = staff5.login("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1908");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        java.lang.String str7 = staff5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1909");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getId();
        double double9 = student5.getHourlyRate();
        student5.logout();
        java.lang.String str11 = student5.getEmail();
        student5.logout();
        boolean boolean13 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1910");
        main.Student student5 = new main.Student("", "Staff", "Student", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1911");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Student", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1912");
        main.Student student4 = new main.Student("Staff", "Staff", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        double double6 = student4.getHourlyRate();
        java.lang.String str7 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1913");
        main.Student student4 = new main.Student("hi!", "Student", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1914");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getEmail();
        boolean boolean7 = student4.isVerified();
        student4.logout();
        student4.logout();
        java.lang.String str10 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1915");
        main.Student student4 = new main.Student("Staff", "", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1916");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        boolean boolean12 = student5.isVerified();
        boolean boolean14 = student5.login("hi!");
        java.lang.String str15 = student5.getEmail();
        double double16 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1917");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        java.lang.String str6 = student5.getEmail();
        student5.logout();
        java.lang.String str8 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1918");
        main.Student student5 = new main.Student("Staff", "Staff", "", false, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1919");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) 100L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1920");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        java.lang.String str7 = staff5.getRoleName();
        boolean boolean8 = staff5.isVerified();
        boolean boolean9 = staff5.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1921");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1922");
        main.Staff staff5 = new main.Staff("Staff", "", "Student", false, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean7 = staff5.isVerified();
        java.lang.String str8 = staff5.getRoleName();
        staff5.logout();
        java.lang.String str10 = staff5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1923");
        main.Staff staff5 = new main.Staff("Staff", "", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1924");
        main.Student student4 = new main.Student("Staff", "Student", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1925");
        main.Student student5 = new main.Student("Student", "", "hi!", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1926");
        main.Student student4 = new main.Student("", "Staff", "", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1927");
        main.Student student5 = new main.Student("Student", "Student", "hi!", false, (java.lang.Long) 0L);
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1928");
        main.Student student5 = new main.Student("", "Student", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1929");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        staff4.logout();
        double double10 = staff4.getHourlyRate();
        double double11 = staff4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1930");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", false, (java.lang.Long) 0L);
        boolean boolean7 = student5.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1931");
        main.Staff staff5 = new main.Staff("Student", "", "hi!", true, (java.lang.Long) 1L);
        double double6 = staff5.getHourlyRate();
        boolean boolean8 = staff5.login("Staff");
        java.lang.String str9 = staff5.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1932");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        java.lang.String str6 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1933");
        main.Student student5 = new main.Student("Student", "Staff", "hi!", true, (java.lang.Long) 1L);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1934");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        java.lang.String str7 = staff4.getPassword();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getPassword();
        boolean boolean11 = staff4.login("Staff");
        java.lang.String str12 = staff4.getRoleName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Staff" + "'", str12, "Staff");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1935");
        main.Staff staff4 = new main.Staff("", "Student", "", (java.lang.Long) 0L);
        staff4.logout();
        staff4.logout();
        java.lang.String str7 = staff4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1936");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getEmail();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.String str11 = student5.getRoleName();
        boolean boolean12 = student5.isVerified();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getRoleName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1937");
        main.Student student4 = new main.Student("", "hi!", "hi!", (java.lang.Long) 1L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getEmail();
        double double8 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1938");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) 0L);
        java.lang.String str6 = staff5.getPassword();
        staff5.logout();
        boolean boolean9 = staff5.login("hi!");
        java.lang.String str10 = staff5.getRoleName();
        java.lang.String str11 = staff5.getRoleName();
        staff5.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1939");
        main.Student student5 = new main.Student("", "hi!", "", true, (java.lang.Long) 0L);
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
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1940");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        staff4.logout();
        double double6 = staff4.getHourlyRate();
        boolean boolean8 = staff4.login("Staff");
        boolean boolean9 = staff4.isVerified();
        boolean boolean10 = staff4.isVerified();
        java.lang.String str11 = staff4.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1941");
        main.Staff staff4 = new main.Staff("Student", "hi!", "Staff", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1942");
        main.Staff staff5 = new main.Staff("hi!", "hi!", "Staff", false, (java.lang.Long) 100L);
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1943");
        main.Staff staff5 = new main.Staff("", "", "hi!", true, (java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass6 = staff5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1944");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1945");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        double double11 = student5.getHourlyRate();
        boolean boolean12 = student5.isVerified();
        student5.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1946");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", true, (java.lang.Long) 0L);
        student5.logout();
        boolean boolean8 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1947");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("");
        student5.logout();
        java.lang.String str9 = student5.getId();
        boolean boolean11 = student5.login("Student");
        student5.logout();
        boolean boolean13 = student5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1948");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) 1L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        boolean boolean7 = student4.isVerified();
        boolean boolean8 = student4.isVerified();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1949");
        main.Staff staff4 = new main.Staff("Student", "", "Student", (java.lang.Long) 0L);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1950");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getEmail();
        boolean boolean11 = student5.isVerified();
        java.lang.String str12 = student5.getRoleName();
        student5.logout();
        boolean boolean15 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1951");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        java.lang.String str9 = student5.getId();
        java.lang.String str10 = student5.getPassword();
        student5.logout();
        java.lang.String str12 = student5.getRoleName();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getPassword();
        boolean boolean16 = student5.login("Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1952");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean12 = staff4.login("hi!");
        java.lang.String str13 = staff4.getPassword();
        boolean boolean14 = staff4.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1953");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        boolean boolean6 = student4.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1954");
        main.Staff staff5 = new main.Staff("hi!", "Student", "Student", false, (java.lang.Long) 0L);
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1955");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "", (java.lang.Long) (-1L));
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1956");
        main.Student student5 = new main.Student("", "hi!", "Student", false, (java.lang.Long) 10L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1957");
        main.Staff staff4 = new main.Staff("Staff", "Staff", "hi!", (java.lang.Long) (-1L));
        double double5 = staff4.getHourlyRate();
        java.lang.String str6 = staff4.getPassword();
        boolean boolean8 = staff4.login("");
        staff4.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1958");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        boolean boolean10 = student4.login("");
        java.lang.String str11 = student4.getEmail();
        java.lang.String str12 = student4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1959");
        main.Staff staff5 = new main.Staff("Student", "hi!", "hi!", true, (java.lang.Long) (-1L));
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.login("Student");
        boolean boolean9 = staff5.isVerified();
        java.lang.String str10 = staff5.getId();
        staff5.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1960");
        main.Student student4 = new main.Student("Staff", "Staff", "hi!", (java.lang.Long) 0L);
        student4.logout();
        java.lang.String str6 = student4.getRoleName();
        java.lang.String str7 = student4.getId();
        java.lang.String str8 = student4.getId();
        java.lang.String str9 = student4.getRoleName();
        java.lang.String str10 = student4.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1961");
        main.Staff staff5 = new main.Staff("", "Student", "Staff", true, (java.lang.Long) 10L);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1962");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) 10L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1963");
        main.Staff staff4 = new main.Staff("", "Staff", "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1964");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        boolean boolean8 = student5.isVerified();
        boolean boolean9 = student5.isVerified();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getId();
        java.lang.String str12 = student5.getId();
        boolean boolean13 = student5.isVerified();
        java.lang.String str14 = student5.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1965");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1966");
        main.Staff staff4 = new main.Staff("", "", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1967");
        main.Student student5 = new main.Student("", "hi!", "hi!", true, (java.lang.Long) 10L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1968");
        main.Student student4 = new main.Student("", "", "Student", (java.lang.Long) (-1L));
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getEmail();
        java.lang.String str7 = student4.getRoleName();
        java.lang.String str8 = student4.getRoleName();
        double double9 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1969");
        main.Student student5 = new main.Student("Staff", "", "Staff", true, (java.lang.Long) 100L);
        java.lang.String str6 = student5.getRoleName();
        boolean boolean7 = student5.isVerified();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1970");
        main.Staff staff4 = new main.Staff("Staff", "", "", (java.lang.Long) 100L);
        java.lang.String str5 = staff4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1971");
        main.Staff staff5 = new main.Staff("Staff", "", "", true, (java.lang.Long) (-1L));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1972");
        main.Staff staff5 = new main.Staff("hi!", "Staff", "hi!", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1973");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getEmail();
        java.lang.String str6 = staff4.getId();
        staff4.logout();
        double double8 = staff4.getHourlyRate();
        double double9 = staff4.getHourlyRate();
        java.lang.String str10 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Staff" + "'", str10, "Staff");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1974");
        main.Staff staff5 = new main.Staff("Staff", "hi!", "hi!", true, (java.lang.Long) 1L);
        java.lang.String str6 = staff5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1975");
        main.Student student5 = new main.Student("hi!", "Student", "", false, (java.lang.Long) 100L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1976");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getId();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1977");
        main.Student student4 = new main.Student("Staff", "hi!", "Student", (java.lang.Long) 0L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1978");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        java.lang.String str6 = staff4.getRoleName();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getEmail();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1979");
        main.Student student5 = new main.Student("hi!", "Student", "Staff", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1980");
        main.Student student4 = new main.Student("Student", "Student", "hi!", (java.lang.Long) (-1L));
        boolean boolean6 = student4.login("hi!");
        java.lang.String str7 = student4.getPassword();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1981");
        main.Staff staff5 = new main.Staff("Staff", "Student", "", true, (java.lang.Long) (-1L));
        java.lang.String str6 = staff5.getEmail();
        boolean boolean8 = staff5.login("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1982");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getRoleName();
        boolean boolean6 = staff4.isVerified();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        java.lang.String str9 = staff4.getRoleName();
        boolean boolean10 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1983");
        main.Staff staff4 = new main.Staff("hi!", "", "", (java.lang.Long) 10L);
        java.lang.String str5 = staff4.getPassword();
        boolean boolean7 = staff4.login("hi!");
        java.lang.String str8 = staff4.getId();
        double double9 = staff4.getHourlyRate();
        staff4.logout();
        boolean boolean12 = staff4.login("hi!");
        boolean boolean13 = staff4.isVerified();
        staff4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1984");
        main.Student student5 = new main.Student("Student", "Student", "", false, (java.lang.Long) (-1L));
        double double6 = student5.getHourlyRate();
        java.lang.String str7 = student5.getRoleName();
        double double8 = student5.getHourlyRate();
        student5.logout();
        double double10 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1985");
        main.Student student5 = new main.Student("hi!", "", "hi!", true, (java.lang.Long) 1L);
        boolean boolean7 = student5.login("hi!");
        java.lang.String str8 = student5.getRoleName();
        java.lang.String str9 = student5.getRoleName();
        java.lang.String str10 = student5.getRoleName();
        java.lang.String str11 = student5.getEmail();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1986");
        main.Staff staff4 = new main.Staff("", "hi!", "Student", (java.lang.Long) 10L);
        boolean boolean5 = staff4.isVerified();
        java.lang.String str6 = staff4.getId();
        boolean boolean7 = staff4.isVerified();
        java.lang.String str8 = staff4.getRoleName();
        double double9 = staff4.getHourlyRate();
        java.lang.String str10 = staff4.getEmail();
        java.lang.String str11 = staff4.getRoleName();
        double double12 = staff4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Staff" + "'", str8, "Staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Staff" + "'", str11, "Staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1987");
        main.Student student4 = new main.Student("Student", "hi!", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getEmail();
        java.lang.String str6 = student4.getEmail();
        double double7 = student4.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1988");
        main.Student student5 = new main.Student("Student", "", "Student", false, (java.lang.Long) 10L);
        student5.logout();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isVerified();
        double double9 = student5.getHourlyRate();
        boolean boolean10 = student5.isVerified();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1989");
        main.Student student4 = new main.Student("hi!", "", "Student", (java.lang.Long) 10L);
        double double5 = student4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1990");
        main.Student student5 = new main.Student("Staff", "Student", "", true, (java.lang.Long) 1L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1991");
        main.Staff staff4 = new main.Staff("Staff", "hi!", "Student", (java.lang.Long) 0L);
        java.lang.String str5 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Staff" + "'", str5, "Staff");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1992");
        main.Staff staff5 = new main.Staff("Student", "Student", "Staff", true, (java.lang.Long) 100L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1993");
        main.Student student5 = new main.Student("Student", "Staff", "Staff", false, (java.lang.Long) 1L);
        double double6 = student5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1994");
        main.Staff staff5 = new main.Staff("", "", "Student", false, (java.lang.Long) 100L);
        java.lang.String str6 = staff5.getRoleName();
        double double7 = staff5.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Staff" + "'", str6, "Staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1995");
        main.Student student4 = new main.Student("Student", "Staff", "hi!", (java.lang.Long) 1L);
        boolean boolean6 = student4.login("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1996");
        main.Student student5 = new main.Student("Staff", "", "hi!", false, (java.lang.Long) 0L);
        java.lang.String str6 = student5.getRoleName();
        java.lang.String str7 = student5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1997");
        main.Staff staff4 = new main.Staff("hi!", "hi!", "Staff", (java.lang.Long) (-1L));
        java.lang.String str5 = staff4.getId();
        staff4.logout();
        java.lang.String str7 = staff4.getRoleName();
        double double8 = staff4.getHourlyRate();
        java.lang.String str9 = staff4.getRoleName();
        staff4.logout();
        boolean boolean12 = staff4.login("hi!");
        java.lang.String str13 = staff4.getRoleName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Staff" + "'", str7, "Staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Staff" + "'", str9, "Staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Staff" + "'", str13, "Staff");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1998");
        main.Staff staff4 = new main.Staff("Student", "Student", "", (java.lang.Long) 100L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test1999");
        main.Student student4 = new main.Student("Staff", "Staff", "", (java.lang.Long) 0L);
        java.lang.String str5 = student4.getRoleName();
        java.lang.String str6 = student4.getPassword();
        student4.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "P6RegressionTest3.test2000");
        main.Staff staff5 = new main.Staff("Staff", "Student", "hi!", false, (java.lang.Long) 1L);
    }
}

