import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Adri", 2200);
    }

    @Test
    public void getCustomerName() {
        assertEquals("Adri", customer.getName());
    }

    @Test
    public void getCustomerBudget() {
        assertEquals(2200, customer.getBudget());
    }
}
