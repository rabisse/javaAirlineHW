import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Tony", 2);
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

}
