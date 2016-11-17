package ville.harjoitukset.sijoituslaskuri.instrumentit;

import ville.harjoitukset.sijoituslaskuri.logiikka.Instrumentti;
import ville.harjoitukset.sijoituslaskuri.logiikka.*;

/**
 *
 * @author Ville Tikkala
 */
public class Rahasto extends Instrumentti implements Simuloitava {
    private Parametrit parametrit;
    private String rahastotyyppi; // Rahaston tyyppi (kasvu- tai tuotto-osuus)
    
    public Rahasto(String tunnus, String nimi, int luokka, double tuotto, double osuus, 
            int tyyppi, double merkintapalkkio, double lunastuspalkkio, double hallinnointipalkkio){
        super(tunnus, nimi);
        this.parametrit = new Parametrit(luokka, tyyppi, tuotto, merkintapalkkio,
            lunastuspalkkio, hallinnointipalkkio);  
    }
    
    // Osuus poistettava konstruktorilta!!
    
    public boolean setRahastotyyppi(String tyyppi) {
        if (tyyppi.equals("kasvu") || tyyppi.equals("tuotto")) {
            this.rahastotyyppi = tyyppi;
            return true;
        } else {
            return false;
        }
    }
    
    public String getRahastotyyppi() {
        return this.rahastotyyppi;
    }
    
    
    public boolean setMerkintaPalkkio(double merkintapalkkio) {
        this.parametrit.setMerkintapalkkio(merkintapalkkio);
        return true;
    }
    
    public double getMerkintapalkkio() {
        return this.parametrit.getMerkintapalkkio();
    }
    
    public boolean setLunastusPalkkio(double lunastusPalkkio) {
        this.lunastusPalkkio = lunastusPalkkio;
        return true;
    }
    
    public double getLunastusPalkkio() {
        return this.lunastusPalkkio;
    }
    
    public boolean setHallinnointiPalkkio(double hallinnointiPalkkio) {
        this.hallinnointiPalkkio = hallinnointiPalkkio;
        return true;
    }
    
    public double getHallinnointiPalkkio() {
        return this.hallinnointiPalkkio;
    }
    
    private boolean setOmaisuusluokka() {
        super.setOmaisuusluokka(2);
        return true;
    }
    
    public boolean setParametrit(double merkintapalkkio) {
        this.parametrit.setMerkintapalkkio(merkintapalkkio);
        return true;
    }
    
    @Override
    public Parametrit getParametrit() {
        return this.parametrit;
    }
    
}
