import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {
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
        assertEquals("", dateTime.getNameOfDay());
    }
    @Test
    void testSat() {
        DateTime dateTime = new DateTime(3, 9, 2022);
        assertEquals("Saturday", dateTime.getNameOfDay());
    }
    @Test
    void testSun() {
        DateTime dateTime = new DateTime(4, 9, 2022);
        assertEquals("Sunday", dateTime.getNameOfDay());
    }
    @Test
    void testMon() {
        DateTime dateTime = new DateTime(5, 9, 2022);
        assertEquals("Monday", dateTime.getNameOfDay());
    }
    @Test
    void testTue() {
        DateTime dateTime = new DateTime(6, 9, 2022);
        assertEquals("Tuesday", dateTime.getNameOfDay());
    }
    @Test
    void testWed() {
        DateTime dateTime = new DateTime(7, 9, 2022);
        assertEquals("Wednesday", dateTime.getNameOfDay());
    }
    @Test
    void testThu() {
        DateTime dateTime = new DateTime(8, 9, 2022);
        assertEquals("Thursday", dateTime.getNameOfDay());
    }
    @Test
    void testFri() {
        DateTime dateTime = new DateTime(9, 9, 2022);
        assertEquals("Friday", dateTime.getNameOfDay());
    }

    @org.junit.jupiter.api.Test
    void diffDays() {
        testValidDiff();
        testReverseValidDiff();
    }
    @Test
    void testValidDiff() {
        DateTime date1 = new DateTime(15, 2, 2018);
        DateTime date2 = new DateTime(25, 2, 2018);
        assertEquals(10, DateTime.diffDays(date2, date1));
    }
    @Test
    void testReverseValidDiff() {
        DateTime date1 = new DateTime(15, 2, 2018);
        DateTime date2 = new DateTime(25, 2, 2018);
        assertEquals(-10, DateTime.diffDays(date1, date2));
    }
}