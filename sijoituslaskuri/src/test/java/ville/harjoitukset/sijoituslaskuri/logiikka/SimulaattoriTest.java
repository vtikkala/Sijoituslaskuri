/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ville.harjoitukset.sijoituslaskuri.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ville.harjoitukset.sijoituslaskuri.instrumentit.Rahasto;

/**
 *
 * @author yanis
 */
public class SimulaattoriTest {
        static Simulaattori s;
        static Simulaattori s2;
        static Instrumentti i;
        static Portfolio p;
        static Portfolio p2;
        static Suunnitelma su;
    
        public SimulaattoriTest() {
        }
    
    @Before
    public void setUp() {
        Rahasto r = new Rahasto("Rahasto", "Rahastonimi 1", 2, 10.00, 100.00, 1, 2.00, 1.00, 1.00);
        Rahasto r2 = new Rahasto("Ei rahasto", "Rahastonimi 2", 2, 5.00, 100.00, 1, 2.00, 1.00, 1.00);
        p = new Portfolio("Portfolio 1");
        p.lisaaPortfolioon(r);
        p2 = new Portfolio("Portfolio 2");
        p2.lisaaPortfolioon(r2);
        su = new Suunnitelma(30, 0, 1000.00); 
        s = new Simulaattori(p, su);    
        s2 = new Simulaattori(p2, su);
    }

    @Test
    public void testArvoLopussa() {
        assertTrue(s.simuloi() <= 12873 && s.simuloi() >= 12872);
    }
    
    @Test
    public void konstruktoriEiAsetaRahastoa() {
        assertTrue(s2.simuloi() == -1);
    }
    
}
