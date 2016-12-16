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
    
    @Test
    public void setteriAsettaaRahastotyypin() {
        r.setRahastotyyppi(2);
        assertEquals(2, r.getRahastotyyppi());
    }
    
    @Test
    public void setteriAsettaaMerkintapalkkion() {
        r.setMerkintaPalkkio(10.00);
        assertTrue(r.getMerkintapalkkio() == 10.00);
    }
    
    @Test
    public void setteriAsettaaLunastuspalkkion() {
        r.setLunastusPalkkio(15.00);
        assertTrue(r.getLunastuspalkkio() == 15.00);
    }
    
    @Test
    public void setteriAsettaaHallinnointipalkkion() {
        r.setHallinnointipalkkio(5.00);
        assertTrue(r.getHallinnointipalkkio() == 5.00);
    }
    
    @Test
    public void setteriAsettaaTunnuksen() {
        r.setTunnus("Rahasto");
        assertEquals("Rahasto", r.getTunnus());
        
    }
    
    @Test
    public void setteriAsettaaNimen() {
        r.setNimi("Rahasto 2");
        assertEquals("Rahasto 2", r.getNimi());
    }
    
    @Test
    public void setteriAsettaaOsuuden() {
        r.setOsuus(50.00);
        assertTrue(r.getParametrit().getOsuus() == 50.00);
    }
    
    @Test
    public void getteriHakeeOsuuden() {
        r.setOsuus(75.00);
        assertTrue(r.getOsuus() == 75.00);
    }
    
    
    
}
