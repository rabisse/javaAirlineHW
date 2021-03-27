import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewmemberTest {

    private CabinCrewmember cabinCrewmember;

    @Before
    public void before() {
        cabinCrewmember = new CabinCrewmember("Jeff", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewmemberHasName() {
        assertEquals("Jeff", cabinCrewmember.getName());
    }

    @Test
    public void cabinCrewmemberHasRank() {
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewmember.getRank());
    }



}
