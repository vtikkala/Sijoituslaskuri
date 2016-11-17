package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.logiikka.Instrumentti;
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
public class InstrumenttiTest {
    static Instrumentti i;
    
    @Before
    public void setUp() {
        i = new Instrumentti("Rahasto", "Rahastonimi 1", 10.00, 2.00, 1.00, 100.00);
    }

    @Test
    public void konstruktoriAsettaaTunnuksen() {
        assertEquals("Rahasto", i.getTunnus());
    }
    
    @Test
    public void konstruktoriAsettaaNimen() {
        assertEquals("Rahastonimi 1", i.getNimi());
    }
    
    @Test
    public void konstruktoriAsettaaTuoton() {
        assertTrue(i.getTuotto() == 10.00);
    }
    
    @Test
    public void konstruktoriAsettaaMerkintapalkkion() {
        assertTrue(i.getMerkintaPalkkio() == 2.00);
    }
    
    @Test
    public void konstruktoriAsettaaLunastuspalkkion() {
        assertTrue(i.getLunastusPalkkio() == 1.00);
    }
    
    @Test
    public void konstruktoriAsettaaOsuuden() {
        assertTrue(i.getOsuus() == 100.00);
    } 
    
}
