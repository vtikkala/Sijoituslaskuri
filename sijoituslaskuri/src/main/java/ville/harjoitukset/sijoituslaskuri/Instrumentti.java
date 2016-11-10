package ville.harjoitukset.sijoituslaskuri;

/**
 *
 * @author Ville Tikkala
 */
public class Instrumentti {
    private String sijTunnus; // Sijoituskohteen luokittelu
    private String sijNimi; // Sijoituskohteen nimi
    private double sijTuotto; // Sijoituskohteen tuotto-oletus
    private double sijMerkintaPalkkio; // Sijoituskohteen merkintäpalkkio (%)
    private double sijLunastusPalkkio; // Sijoituskohteen lunastuspalkkio (%)
    
    public Instrumentti(String tunnus, String nimi, double tuotto, 
            double merkintaPalkkio, double lunastusPalkkio) {
        this.sijTunnus = tunnus;
        this.sijNimi = nimi;
        this.sijTuotto = tuotto;
        this.sijMerkintaPalkkio = merkintaPalkkio;
        this.sijLunastusPalkkio = lunastusPalkkio;
    }
    
    public boolean setTunnus(String tunnus) {
        this.sijTunnus = tunnus;
        return true;
    }
    
    public String getTunnus() {
        return this.sijTunnus;
    }
    
    public boolean setNimi(String nimi) {
        this.sijNimi = nimi;
        return true;
    }
    
    public String getNimi() {
        return this.sijNimi;
    }
    
    public boolean setTuotto(double tuotto) {
        this.sijTuotto = tuotto;
        return true;
    }
    
    public double getTuotto() {
        return this.sijTuotto;
    }
    
    public boolean setMerkintaPalkkio(double merkintaPalkkio) {
        this.sijMerkintaPalkkio = merkintaPalkkio;
        return true;
    }
    
    public double getMerkintaPalkkio() {
        return this.sijMerkintaPalkkio;
    }
    
    public boolean setLunastusPalkkio(double lunastusPalkkio) {
        this.sijLunastusPalkkio = lunastusPalkkio;
        return true;
    }
    
    public double getLunastusPalkkio() {
        return this.sijLunastusPalkkio;
    }
    
    
}
