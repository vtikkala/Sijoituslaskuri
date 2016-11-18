/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ville.harjoitukset.sijoituslaskuri.instrumentit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ville.harjoitukset.sijoituslaskuri.logiikka.Parametrit;

/**
 *
 * @author Ville Tikkala
 */
public class RahastoTest {
    static Rahasto r;
    
    @Before
    public void setUp() {
        r = new Rahasto("Rahasto", "Rahastonimi 1", 2, 10.00, 100.00, 1, 2.00, 1.00, 1.50);
    }
    
    
    @Test
    public void konstruktoriAsettaaTunnuksen() {
        assertEquals("Rahasto", r.getTunnus());
    }
    
    @Test
    public void konstruktoriAsettaaNimen() {
        assertEquals("Rahastonimi 1", r.getNimi());
    }
   
    @Test
    public void konstruktoriAsettaaParametrit() {
        assertEquals(2, r.getParametrit().getOmaisuusluokka());
        assertTrue(r.getParametrit().getTuotto() == 10.00);
        assertTrue(r.getParametrit().getOsuus() == 100.00);
        assertTrue(r.getParametrit().getRahastotyyppi() == 1);
        assertTrue(r.getParametrit().getMerkintapalkkio() == 2.00);
        assertTrue(r.getParametrit().getLunastuspalkkio() == 1.00);
        assertTrue(r.getParametrit().getHallinnointipalkkio() == 1.50);
    }

    
}
