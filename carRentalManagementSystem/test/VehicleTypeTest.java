import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeTest {

    @Test
    void getSeats() {
        testCarSeats();
        testVanSeats();
    }
    @Test
    void testCarSeats() {
        VehicleType type = new VehicleType(4);
        assertEquals(4,type.getSeats("car"));
    }
    @Test
    void testVanSeats(){
        VehicleType type = new VehicleType(15);
        assertEquals(15, type.getSeats("van"));
    }
    @Test
    void testInvalidVehicleSeats() {
        VehicleType type = new VehicleType(4);
        assertEquals(0, type.getSeats("lawn mower"));
    }

    @Test
    void canBeRentedForMinimumDays() {
        minCarRentDayForWeekend();
        minCarRentDayForNonWeekend();
        minVanRentDay();
    }
    @Test
    void minCarRentDayForNonWeekend() {
        VehicleType type = new VehicleType(4);
        assertEquals(2, type.canBeRentedForMinimumDays(new DateTime(13,2, 2018), "car"));
    }
    @Test
    void minCarRentDayForWeekend() {
        VehicleType type = new VehicleType(4);
        assertEquals(3, type.canBeRentedForMinimumDays(new DateTime(17,2, 2018), "car"));
    }

    @Test
    void minCarRentDayForWeekendFalse() {
        VehicleType type = new VehicleType(4);
        assertEquals(3, type.canBeRentedForMinimumDays(new DateTime(17,2, 2018), "car"));
    }
    @Test
    void minVanRentDay() {
        VehicleType type = new VehicleType(4);
        assertEquals(1, type.canBeRentedForMinimumDays(new DateTime(17,2, 2018), "van"));
    }

    @Test
    void isUnderMaintenance() {
    }
}