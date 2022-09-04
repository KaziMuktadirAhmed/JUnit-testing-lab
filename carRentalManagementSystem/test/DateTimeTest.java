import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateTimeTest {

    @org.junit.jupiter.api.Test
    void getTime() {
    }

    @org.junit.jupiter.api.Test
    void getNameOfDay() {
        testSat();
        testSun();
        testMon();
        testTue();
        testWed();
        testThu();
        testFri();
        testInvalidDate();
    }
    @Test
    void testInvalidDate() {
        DateTime dateTime = new DateTime(-99, 9, 2022);
        Assertions.assertEquals("", dateTime.getNameOfDay());
    }
    @Test
    void testSat() {
        DateTime dateTime = new DateTime(3, 9, 2022);
        Assertions.assertEquals("Saturday", dateTime.getNameOfDay());
    }
    @Test
    void testSun() {
        DateTime dateTime = new DateTime(4, 9, 2022);
        Assertions.assertEquals("Sunday", dateTime.getNameOfDay());
    }
    @Test
    void testMon() {
        DateTime dateTime = new DateTime(5, 9, 2022);
        Assertions.assertEquals("Monday", dateTime.getNameOfDay());
    }
    @Test
    void testTue() {
        DateTime dateTime = new DateTime(6, 9, 2022);
        Assertions.assertEquals("Tuesday", dateTime.getNameOfDay());
    }
    @Test
    void testWed() {
        DateTime dateTime = new DateTime(7, 9, 2022);
        Assertions.assertEquals("Wednesday", dateTime.getNameOfDay());
    }
    @Test
    void testThu() {
        DateTime dateTime = new DateTime(8, 9, 2022);
        Assertions.assertEquals("Thursday", dateTime.getNameOfDay());
    }
    @Test
    void testFri() {
        DateTime dateTime = new DateTime(9, 9, 2022);
        Assertions.assertEquals("Friday", dateTime.getNameOfDay());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void getCurrentTime() {
    }

    @org.junit.jupiter.api.Test
    void getFormattedDate() {
    }

    @org.junit.jupiter.api.Test
    void getEightDigitDate() {
    }

    @org.junit.jupiter.api.Test
    void diffDays() {
    }

    @org.junit.jupiter.api.Test
    void setAdvance() {
    }
}