import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMotorbike {

    Motorbike motorbike;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Pit bike", "Diesel");
        tyre = new Tyre("michelin");
        motorbike = new Motorbike("Harley-Davidson" ,"Street Rod", "black and blue", 5000, 6495, 2018, 0, engine, tyre, 500);
    }

    @Test
    public void getMake() {
        assertEquals("Harley-Davidson", motorbike.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Street Rod", motorbike.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("black and blue", motorbike.getColour());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(5000, motorbike.getBuyPrice());
    }

    @Test
    public void getSellPrice() {

        assertEquals(6495, motorbike.getSellPrice());
    }

    @Test
    public void getYear() {
        assertEquals(2018, motorbike.getYear());
    }

    @Test
    public void getMileage() {
        assertEquals(0, motorbike.getMileage());
    }

    @Test
    public void getEngineType() {
        assertEquals("Pit bike", motorbike.getEngine().getMake());
    }

    @Test
    public void getEngineFuelType() {
        assertEquals("Diesel", motorbike.getEngine().getFuelType());
    }

    @Test
    public void getTyreBrand() {
        assertEquals("michelin", motorbike.getTyre().getBrand());
    }
}
