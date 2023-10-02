import org.example.Bike;
import org.example.Car;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TestVehicle {
    Car c1 = new Car("Subaru","WRX", 2007);
    Bike b1 = new Bike("Harley","Devidson",2023);
    @Test
    public void testCarParkOn(){
        c1.park();
        assertEquals(c1.getSpeed(),0);
    }
    @Test
    public void testBikeParkOn(){
        b1.park();
        assertEquals(c1.getSpeed(),0);
    }
    @Test
    public void testCarDriveOn(){
        c1.testDrive();
        assertEquals(c1.getSpeed(),60);
    }
    @Test
    public void testBikeDriveOn(){
        b1.testDrive();
        assertEquals(b1.getSpeed(),75);
    }
    @Test
    public void testCarIsVehicle(){
        assertInstanceOf(Vehicle.class,c1);
    }
    @Test
    public void testBikeIsVehicle(){
        assertInstanceOf(Vehicle.class,b1);
    }

    @Test
    public void testCarCountWheels(){
        assertEquals(c1.getNumWheels(),4);
    }
    @Test
    public void testBikeCountWheels(){
        assertEquals(b1.getNumWheels(),2);
    }
    @Test void testBikeCanStop(){
      b1.testDrive();
      assertEquals(b1.getSpeed(),75);
      b1.park();
      assertEquals(b1.getSpeed(),0);

    }
    @Test void testCarCanStop(){
        c1.testDrive();
        assertEquals(c1.getSpeed(),60);
        c1.park();
        assertEquals(c1.getSpeed(),0);
    }
    @Test void testCarModelNotNull(){
        assertInstanceOf(String.class,c1.getModel().getClass().getName());
        assertInstanceOf(String.class,c1.getCompany().getClass().getName());
    }
    @Test void testBikeModelNotNull(){
        assertInstanceOf(String.class,b1.getModel().getClass().getName());
        assertInstanceOf(String.class,b1.getCompany().getClass().getName());
    }
    @Test void testValidCarYear(){
        assertTrue(c1.getYearRelease() > 1900 && c1.getYearRelease() < new Date().getTime());
    }
    @Test void testValidBikeYear(){
        assertTrue(b1.getYearRelease() > 1900 && b1.getYearRelease() < new Date().getTime());
    }

}
