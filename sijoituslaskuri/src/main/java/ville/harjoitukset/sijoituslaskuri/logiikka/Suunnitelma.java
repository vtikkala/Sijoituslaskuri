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
    
    /**
     *
     * @param aika
     * @param tiheys
     * @param maara
     */
    public Suunnitelma(int aika, int tiheys, double maara) {
        this.sijoitusaika = aika;
        this.tiheys = tiheys;
        this.sijoitus = maara;
    }
    
    /**
     * Asettaa sijoitussuunnitelmalle sijoitusajan vuosina (kokonaisluku).
     * @param aika Sijoitusaika vuosina
     */
    public void setSijoitusaika(int aika) {
        this.sijoitusaika = aika;
    }
    
    /**
     * Palauttaa sijoitussuunnitelman mukaisen sijoitusajan kokonaisina vuosina.
     * @return sijoitusaika vuosina
     */
    public int getSijoitusaika() {
        return this.sijoitusaika;
    }
    
    /**
     * Asettaa sijoitussuunnitelmalle sijoitusten tiheyden kertoina vuodessa.
     * @param tiheys sijoitustiheys krt/vuosi
     */
    public void setTiheys(int tiheys) {
        this.tiheys = tiheys;
    }
    
    /**
     * Palauttaa sijoitussuunnitelman mukaisten sijoitusten tiheyden vuodessa.
     * @return sijoitustiheys
     */
    public int getTiheys() {
        return this.tiheys;
    }
    
    /**
     * Asettaa sijoitussuunnitelmalle sijoitettavan määrän (kerta/jatkuva).
     * @param maara Sijoituksen määrä
     */
    public void setSijoitus(double maara) {
        this.sijoitus = maara;
    }
    
    /**
     * Palauttaa sijoitussuunnitelman mukaisen sijoitettavan määrän (kerta/jatkuva).
     * @return sijoituksen määrä
     */
    public double getSijoitus() {
        return this.sijoitus;
    }
    
}
