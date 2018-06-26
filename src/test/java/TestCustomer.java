import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    Customer customer;
    Motorbike motorbike;
    Engine engine;
    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Adri", 10000);

        engine = new Engine("Pit bike", "Diesel");
        tyre = new Tyre("michelin");
        motorbike = new Motorbike("Harley-Davidson", "Street Rod", "black and blue", 5000, 6495, 2018, 0, engine, tyre, 500);
    }

    @Test
    public void getCustomerName() {
        assertEquals("Adri", customer.getName());
    }

    @Test
    public void getCustomerBudget() {
        assertEquals(10000, customer.getBudget());
    }

    @Test
    public void getVehiclesBoughList() {
        assertEquals(0, customer.getVehiclesBought());
    }

    @Test
    public void customerCanBuyCar() {
        customer.buy(motorbike);
        assertEquals(1, customer.getVehiclesBought());
    }

    @Test
    public void customerCanRentCar() {
        customer.rental(motorbike);
        assertEquals(1, customer.getVehiclesBought());
        assertEquals(9500, customer.getBudget());
            }
}
