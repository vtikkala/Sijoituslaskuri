package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 * Instrumentti-luokka on abstrakti luokka, joka toimii pohjana muille instrumentti
 * luokille (kuten Rahasto).
 */
public abstract class Instrumentti {
//    public Parametrit parametrit; // Sijoituskohteen laskentaparametrit
    private String tunnus; // Sijoituskohteen luokittelu
    private String nimi; // Sijoituskohteen nimi
    
    /**
     * Konstruktori alustaa luokalle sen pakolliset alkuarvot.
     * @param tunnus Sijoitusinstrumentin tunnus kokonaislukuna (1 = tili, 2 = rahasto)
     * @param nimi Sijoitusinstrumentin nimi merkkijonona
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
}
