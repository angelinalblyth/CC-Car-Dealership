import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDealership {

    Dealership dealership;

    @Before
    public void setUp() throws Exception {
        dealership = new Dealership("Code Clan Used Car Dealership");
    }

    @Test
    public void getDealershipName() {
        assertEquals("Code Clan Used Car Dealership", dealership.getName());
    }

    @Test
    public void getAmountInTill() {
        assertEquals(0, dealership.getTill());
    }
}
