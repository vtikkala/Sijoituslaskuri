package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.logiikka.Instrumentti;
import ville.harjoitukset.sijoituslaskuri.logiikka.Portfolio;
import ville.harjoitukset.sijoituslaskuri.logiikka.Suunnitelma;
import ville.harjoitukset.sijoituslaskuri.logiikka.Simulaattori;
import ville.harjoitukset.sijoituslaskuri.instrumentit.*;
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
        Rahasto r = new Rahasto("Rahasto", "Rahastonimi 1", 2, 10.00, 100.00, 1, 2.00, 1.00, 1.00);
        p = new Portfolio("Portfolio 1");
        p.lisaaPortfolioon(r);
        su = new Suunnitelma(10, 0, 10000.00); 
        s = new Simulaattori(p, su);     
    }

    @Test
    public void laskeaanArvoLopussa() {
        assertTrue(s.arvoLopussa() < 10000);
    }
    
}
