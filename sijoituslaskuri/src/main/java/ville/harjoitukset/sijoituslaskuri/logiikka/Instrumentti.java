package ville.harjoitukset.sijoituslaskuri.logiikka;

/**
 *
 * @author Ville Tikkala
 */
public abstract class Instrumentti {
    private String tunnus; // Sijoituskohteen luokittelu
    private String nimi; // Sijoituskohteen nimi
    private String omaisuusluokka; // Sijoituskohteen omaisuusluokka
    private double tuotto; // Sijoituskohteen tuotto-oletus
    private double osuus; // Sijoituskohteen osuus koko portfoliossa (%) POISTETAAN TÄÄLTÄ!
    
    public Instrumentti(String tunnus, String nimi, String luokka, double tuotto, double osuus) {
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.omaisuusluokka = luokka;
        this.tuotto = tuotto;
        this.osuus = osuus;
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
    
    public boolean setOmaisuusluokka(String luokka) {
        this.omaisuusluokka = luokka;
        return true;
    }
    
    public String getOmaisuusluokka() {
        return this.omaisuusluokka;
    }
    
    public boolean setTuotto(double tuotto) {
        this.tuotto = tuotto;
        return true;
    }
    
    public double getTuotto() {
        return this.tuotto;
    }
    
    public boolean setOsuus(double osuus) {
        this.osuus = osuus;
        return true;
    }
    
    public double getOsuus() {
        return this.osuus;
    }
    
}
