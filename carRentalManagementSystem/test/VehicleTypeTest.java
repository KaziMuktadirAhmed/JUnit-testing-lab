import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeTest {

    @Test
    void getSeats() {
        testCarSeats();
        testVanSeats();
        testInvalidVehicleSeats();
    }
    @Test
    void testCarSeats() {
        VehicleType type = new VehicleType(4);
        assertEquals(4,type.getSeats("car"));
    }
    @Test
    void testVanSeats(){
        VehicleType type = new VehicleType(4);
        assertEquals(15, type.getSeats("van"));
    }
    @Test
    void testInvalidVehicleSeats() {
        VehicleType type = new VehicleType(4);
        assertEquals(0, type.getSeats("lawn mower"));
    }

    @Test
    void canBeRentedForMinimumDays() {
    }

    @Test
    void isUnderMaintenance() {
    }
}