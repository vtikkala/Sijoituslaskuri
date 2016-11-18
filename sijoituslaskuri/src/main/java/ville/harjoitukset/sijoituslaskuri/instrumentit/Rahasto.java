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
    
    public boolean setRahastotyyppi(int tyyppi) {
        this.parametrit.setRahastotyyppi(tyyppi);
        return true;
    }
    
    public int getRahastotyyppi() {
        return this.parametrit.getRahastotyyppi();
    }
    
    public boolean setMerkintaPalkkio(double merkintapalkkio) {
        this.parametrit.setMerkintapalkkio(merkintapalkkio);
        return true;
    }
    
    public double getMerkintapalkkio() {
        return this.parametrit.getMerkintapalkkio();
    }
    
    public boolean setLunastusPalkkio(double lunastuspalkkio) {
        this.parametrit.setLunastuspalkkio(lunastuspalkkio);
        return true;
    }
    
    public double getLunastuspalkkio() {
        return this.parametrit.getLunastuspalkkio();
    }
    
    public boolean setHallinnointipalkkio(double hallinnointipalkkio) {
        this.parametrit.setHallinnointipalkkio(hallinnointipalkkio);
        return true;
    }
    
    public double getHallinnointipalkkio() {
        return this.parametrit.getHallinnointipalkkio();
    }
    
    private boolean setOmaisuusluokka() {
        this.parametrit.setOmaisuusluokka(2); // rahastolla aina 2.
        return true;
    }
    
    @Override
    public Parametrit getParametrit() {
        return this.parametrit;
    }
    
}
