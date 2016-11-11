package ville.harjoitukset.sijoituslaskuri.sovelluslogiikka;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ville.harjoitukset.sijoituslaskuri.sovelluslogiikka.Instrumentti;

/**
 *
 * @author Ville Tikkala
 */
public class PortfolioTest {
    static Portfolio p;
    
    @Before
    public void setUp() {
        p = new Portfolio("Portfolio 1");
    }

    @Test
    public void konstruktoriAsettaaNimen() {
        assertEquals("Portfolio 1", p.getNimi());
    }
    
    @Test
    public void setteriLisaaInstrumentin() {
        Instrumentti i = new Instrumentti("Rahasto", "Rahastonimi 1", 10.00, 2.00, 1.00, 100.00);     
        p.lisaaPortfolioon(i);
        assertEquals("Rahastonimi 1", p.getPortfolio().get(0).getNimi());
    }
    
    @Test
    public void setteriPoistaaInstrumentin() {
        Instrumentti i = new Instrumentti("Rahasto", "Rahastonimi 1", 10.00, 2.00, 1.00, 100.00);     
        p.lisaaPortfolioon(i);
        p.poistaPortfoliosta("Rahastonimi 1");
        assertTrue(p.getPortfolio().isEmpty());
    }

}
