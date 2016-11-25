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
    
    public Instrumentti(String tunnus, String nimi) {           
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void setOsuus(double osuus) {
        this.osuus = osuus;
    }
    
    public double getOsuus() {
        return this.osuus;
    }
    
    
}
