package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 *
 * @author Ville Tikkala
 */
public class Suunnitelma {
    private int sijoitusaika;   // sijoitusaika kokonaisina vuosina
    private int tiheys;         // kuinka usein sijoitus tehdään vuoden aikana
    private double sijoitus;    // sijoitettava summa (e)
    
    public Suunnitelma(int aika, int tiheys, double maara) {
        this.sijoitusaika = aika;
        this.tiheys = tiheys;
        this.sijoitus = maara;
    }
    
    public boolean setSijoitusaika(int aika) {
        this.sijoitusaika = aika;
        return true;
    }
    
    public int getSijoitusaika() {
        return this.sijoitusaika;
    }
    
    public boolean setTiheys(int tiheys) {
        this.tiheys = tiheys;
        return true;
    }
    
    public int getTiheys() {
        return this.tiheys;
    }
    
    public boolean setSijoitus(double maara) {
        this.sijoitus = maara;
        return true;
    }
    
    public double getSijoitus() {
        return this.sijoitus;
    }
    
}
