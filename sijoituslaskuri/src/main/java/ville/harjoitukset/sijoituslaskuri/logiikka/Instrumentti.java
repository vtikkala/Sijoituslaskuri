package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 *
 * @author Ville Tikkala
 */
public abstract class Instrumentti {
//    public Parametrit parametrit; // Sijoituskohteen laskentaparametrit
    private String tunnus; // Sijoituskohteen luokittelu
    private String nimi; // Sijoituskohteen nimi
    private double osuus; // Sijoituskohteen osuus koko portfoliossa (%) POISTETAAN TÄÄLTÄ!
    
    /**
     *
     * @param tunnus
     * @param nimi
     */
    public Instrumentti(String tunnus, String nimi) {           
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    /**
     * Asettaa sijoituskohteelle sen tunnuksen kokonaislukuna (1=tili, 2=rahasto).
     * @param tunnus Sijoituskohteen tunnus
     */
    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }
    
    /**
     * Palauttaa sijoituskohteelta sen tunnuksen kokonaislukuna (1=tili, 2=rahasto).
     * @return sijoituskohteen tunnus
     */
    public String getTunnus() {
        return this.tunnus;
    }
    
    /**
     * Asettaa sijoituskohteelle sen nimen merkkijonona.
     * Esimerkiksi "Amerikka Rahasto A".
     * @param nimi Sijoituskohteen nimi
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    /**
     * Palauttaa sijoituskohteen nimen merkkijonona.
     * Esimerkiksi "Amerikka Rahasto A".
     * @return sijoituskohteen nimi
     */
    public String getNimi() {
        return this.nimi;
    }
    
    /**
     * Asettaa sijoituskohteen osuuden portfoliossa liukulukuna.
     * Esimerkiksi Amerikka Rahasto A:n 50 % osuus portfoliosta annetaan muodossa 50.00.
     * @param osuus Sijoituskohteen osuus portfoliosta
     */
    public void setOsuus(double osuus) {
        this.osuus = osuus;
    }
    
    /**
     * Palauttaa sijoituskohten osuuden portfoliosta liukuluna.
     * Esimerksi palaute "75.00" tarkoittaa, että sijoituskohteen osuus on 75 % portfoliosta.
     * @return sijoituskohteen osuus
     */
    public double getOsuus() {
        return this.osuus;
    }
    
    
}
