import static org.junit.Assert.*;

import org.junit.Test;


public class BanjoTestsCases {
    public BanjoTestsCases() {
    }

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }

}

