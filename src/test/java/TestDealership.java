import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDealership {

    Dealership dealership;
    Car car;
    Tyre tyre;
    Engine engine;

    @Before
    public void setUp() throws Exception {
        dealership = new Dealership("Code Clan Used Car Dealership");

        engine = new Engine("VIVARO", "Diesel");
        tyre = new Tyre("michelin");
        car = new Car("Vauxhall", "Corsa", "mustard", 1800, 2200, 2013, 51212, engine, tyre, 300, 5);
    }

    @Test
    public void getDealershipName() {
        assertEquals("Code Clan Used Car Dealership", dealership.getName());
    }

    @Test
    public void getAmountInTill() {
        assertEquals(10000, dealership.getTill());
    }


    @Test
    public void canBuyCar() {
        dealership.buy(car);
        assertEquals(1, dealership.getVehiclesSize());
        assertEquals(8200, dealership.getTill());
    }

    @Test
    public void canSellCar(){
        dealership.buy(car);
        dealership.sell(car);
        assertEquals(0,dealership.getVehiclesSize());
        assertEquals(10400, dealership.getTill());
    }

    @Test
    public void canOilgetReplaced() {
        assertEquals("Changed oil on Vauxhall", engine.repair(car));
    }

    @Test
    public void canTyresBeInflated() {
        assertEquals("Inflated tyres on Vauxhall", tyre.repair(car));
    }
}
