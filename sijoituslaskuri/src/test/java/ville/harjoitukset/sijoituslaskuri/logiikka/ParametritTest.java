package ville.harjoitukset.sijoituslaskuri.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ville Tikkala
 */
public class ParametritTest {
    static Parametrit r;
    static Parametrit r2;
    
    @Before
    public void setUp() {
        r = new Parametrit(2, 1, 10.00, 10.00, 1.00, 2.00, 1.50);
        r2 = new Parametrit(1, 100.00, 1.00);
    }
    
    @Test
    public void konstruktoriAsettaaParametrit() {
        assertTrue(r.getOmaisuusluokka() == 2);
        assertTrue(r.getRahastotyyppi() == 1);
        assertTrue(r.getTuotto() == 10.00);
        assertTrue(r.getOsuus() == 10.00);
        assertTrue(r.getMerkintapalkkio() == 1.00);
        assertTrue(r.getLunastuspalkkio() == 2.00);
        assertTrue(r.getHallinnointipalkkio() == 1.50);
        assertTrue(r2.getOmaisuusluokka()== 1);
        assertTrue(r2.getOsuus() == 100.00);
        assertTrue(r2.getTuotto() == 1.00);
    }
    
    @Test
    public void setteriAsettaaOmaisuusluokan() {
        r2.setOmaisuusluokka(2);
        assertEquals(2, r2.getOmaisuusluokka());
    }
    
    @Test
    public void setteriAsettaaTuoton() {
        r2.setTuotto(7.00);
        assertTrue(r2.getTuotto() == 7.00);
    }
    
    @Test
    public void setteriAsettaaOsuuden() {
        r2.setOsuus(75.00);
        assertTrue(r2.getOsuus() == 75.00);
    }
}
