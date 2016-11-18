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
public class SuunnitelmaTest {
    static Suunnitelma s;
    
    @Before
    public void setUp() {
        s = new Suunnitelma(10, 1, 1000.00);
    }
    
    @Test
    public void konstruktoriAsettaaAjan() {
        assertEquals(10, s.getSijoitusaika());
    }
    
    @Test
    public void konstruktoriAsettaaTiheyden() {
        assertEquals(1, s.getTiheys());
    }
    
    @Test
    public void konstruktoriAsettaaSijoituksen() {
        assertTrue(s.getSijoitus() == 1000.00);
    }

    
}
