import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCar {

    Car car;
    Tyre tyre;
    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("VIVARO", "Diesel");
        tyre = new Tyre("michelin");
        car = new Car("Vauxhall", "Corsa", "mustard", 1800, 2200, 2013, 51212, engine, tyre, 300, 5);
    }

    @Test
    public void getMake() {
        assertEquals("Vauxhall", car.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Corsa", car.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("mustard", car.getColour());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(1800, car.getBuyPrice());
    }

    @Test
    public void getYear() {
        assertEquals(2013, car.getYear());
    }

    @Test
    public void getMileage() {
        assertEquals(51212, car.getMileage());
    }

    @Test
    public void getEngineType() {
        assertEquals("VIVARO", car.getEngine().getMake());
    }

    @Test
    public void getEngineFuelType() {
        assertEquals("Diesel", car.getEngine().getFuelType());
    }

    @Test
    public void getTyreBrand() {
        assertEquals("michelin", car.getTyre().getBrand());
    }

    @Test
    public void getNumberOfDoors() {
        assertEquals(5, car.getDoors());
    }
}
