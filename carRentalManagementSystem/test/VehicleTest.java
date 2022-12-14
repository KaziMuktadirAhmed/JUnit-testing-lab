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
        assertTrue(van.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testVanRentOverTimeLimit() {
        VehicleType type = new VehicleType(15);
        type.setLastMaintenance(new DateTime(1,1,2019));
        Vehicle van = new Van("V_123", 2019, "Pickup", "Toyota", 0, type);
        assertFalse(van.rent("Cus_123", new DateTime(7, 2, 2018), 25));
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
        assertTrue(car.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testCarRentFalse() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 1, new VehicleType(4));
        assertFalse(car.rent("Cus_123", new DateTime(7, 2, 2018), 5));
    }
    @Test
    void testCarRentMinNumDays() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertFalse(car.rent("Cus_123", new DateTime(17, 2, 2018), 2));
    }
    @Test
    void testCarRentMaxNumDays() {
        Vehicle car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertFalse(car.rent("Cus_123", new DateTime(7, 2, 2018), 19));
    }

    @Test
    void testLateFee() {
        testCarLateFee();
        testVanLateFee();
        testInvalidLateFee();
    }
    @Test
    void testCarLateFee() {
        Car car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertEquals(97.5, car.getLateFee(new DateTime(2,2,2018), new DateTime(1, 2, 2018)));
    }
    @Test
    void testVanLateFee() {
        VehicleType type = new VehicleType(15);
        type.setLastMaintenance(new DateTime(1,1,2019));
        Van van = new Van("V_123", 2019, "Pickup", "Toyota", 0, type);
        assertEquals(299, van.getLateFee(new DateTime(2,2,2018), new DateTime(1, 2, 2018)));
    }

    @Test
    void testInvalidLateFee() {
        Car car = new Car("C_123", 2019, "Sedan", "Toyota", 0, new VehicleType(4));
        assertEquals(0.0, car.getLateFee(new DateTime(1,2,2018), new DateTime(2, 2, 2018)));
    }
}