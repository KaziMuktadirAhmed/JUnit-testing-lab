import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void rent() {
        testCarRentTrue();
        testCarRentFalse();
        testCarRentMinNumDays();
        testCarRentMaxNumDays();
        testVanRentWithMaintenanceSet();
        testVanRentOverTimeLimit();
        testVanRentWithoutMaintenanceSet();
    }

    @Test
    void testVanRentWithMaintenanceSet() {
        VehicleType type = new VehicleType(15);
        type.setLastMaintenance(new DateTime(1,1,2019));
        Vehicle van = new Van("V_123", 2019, "Pickup", "Toyota", 0, type);
        assertEquals(true, van.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testVanRentOverTimeLimit() {
        VehicleType type = new VehicleType(15);
        type.setLastMaintenance(new DateTime(1,1,2019));
        Vehicle van = new Van("V_123", 2019, "Pickup", "Toyota", 0, type);
        assertEquals(false, van.rent("Cus_123", new DateTime(7, 2, 2018), 25));
    }
    @Test
    void testVanRentWithoutMaintenanceSet() {
        VehicleType type = new VehicleType(15);
        Vehicle van = new Van("V_123", 2019, "Pickup", "Toyota", 0, type);
        assertEquals(false, van.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testCarRentTrue() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertEquals(true, car.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testCarRentFalse() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 1, new VehicleType(4));
        assertEquals(false, car.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testCarRentMinNumDays() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertEquals(false, car.rent("Cus_123", new DateTime(7, 2, 2018), 1));
    }
    @Test
    void testCarRentMaxNumDays() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertEquals(false, car.rent("Cus_123", new DateTime(7, 2, 2018), 19));
    }
}