package ville.harjoitukset.sijoituslaskuri.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ville Tikkala
 */
public class SimulaattoriTest {
    static Simulaattori s;
    static Instrumentti i;
    static Portfolio p;
    static Suunnitelma su;
    
    @Before
    public void setUp() {
        i = new Instrumentti("Rahasto", "Rahastonimi 1", 10.00, 2.00, 1.00, 100.00);
        p = new Portfolio("Portfolio 1");
        p.lisaaPortfolioon(i);
        su = new Suunnitelma(10, 0, 10000.00); 
        s = new Simulaattori(p, su);     
    }

    @Test
    public void laskeaanArvoLopussa() {
        assertTrue(s.arvoLopussa() > 10000);
    }
    
}
