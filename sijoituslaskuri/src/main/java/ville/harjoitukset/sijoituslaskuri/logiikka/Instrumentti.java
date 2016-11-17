package ville.harjoitukset.sijoituslaskuri.logiikka;

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
    
    public boolean setTunnus(String tunnus) {
        this.tunnus = tunnus;
        return true;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public boolean setNimi(String nimi) {
        this.nimi = nimi;
        return true;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public boolean setOsuus(double osuus) {
        this.osuus = osuus;
        return true;
    }
    
    public double getOsuus() {
        return this.osuus;
    }
    
    
}
