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
        assertEquals("10.00", i.getTuotto());
    }
    
    @Test
    public void konstruktoriAsettaaMerkintapalkkion() {
        assertEquals("2.00", i.getMerkintaPalkkio());
    }
    
    @Test
    public void konstruktoriAsettaaLunastuspalkkion() {
        assertEquals("1.00", i.getLunastusPalkkio());
    }
    
    @Test
    public void konstruktoriAsettaaOsuuden() {
        assertEquals("100.00", i.getOsuus());
    } 
    
}
