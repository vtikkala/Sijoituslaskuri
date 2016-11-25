package ville.harjoitukset.sijoituslaskuri.instrumentit;

import ville.harjoitukset.sijoituslaskuri.logiikka.*;
import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 *
 * @author Ville Tikkala
 */
public class Rahasto extends Instrumentti implements Simuloitava {
    private Parametrit parametrit;
    
    public Rahasto(String tunnus, String nimi, int luokka, double tuotto, double osuus, 
            int tyyppi, double merkintapalkkio, double lunastuspalkkio, double hallinnointipalkkio) {
        super(tunnus, nimi);
        this.parametrit = new Parametrit(luokka, tyyppi, osuus, tuotto, merkintapalkkio,
            lunastuspalkkio, hallinnointipalkkio);
    }
    
    // Osuus poistettava konstruktorilta!!
    
    public void setRahastotyyppi(int tyyppi) {
        this.parametrit.setRahastotyyppi(tyyppi);
    }
    
    public int getRahastotyyppi() {
        return this.parametrit.getRahastotyyppi();
    }
    
    public void setMerkintaPalkkio(double merkintapalkkio) {
        this.parametrit.setMerkintapalkkio(merkintapalkkio);
    }
    
    public double getMerkintapalkkio() {
        return this.parametrit.getMerkintapalkkio();
    }
    
    public void setLunastusPalkkio(double lunastuspalkkio) {
        this.parametrit.setLunastuspalkkio(lunastuspalkkio);
    }
    
    public double getLunastuspalkkio() {
        return this.parametrit.getLunastuspalkkio();
    }
    
    public void setHallinnointipalkkio(double hallinnointipalkkio) {
        this.parametrit.setHallinnointipalkkio(hallinnointipalkkio);
    }
    
    public double getHallinnointipalkkio() {
        return this.parametrit.getHallinnointipalkkio();
    }
    
    @Override
    public Parametrit getParametrit() {
        return this.parametrit;
    }
    
}
