package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 * @author Ville Tikkala
 */

public class Parametrit {
    private int omaisuusluokka; // pakollinen tieto
    private int rahastotyyppi; // (1 = kasvu, 2 = tuotto)
    private double osuus; // pakollinen tieto
    private double tuotto; // pakollinen tieto
    private double merkintapalkkio;
    private double lunastuspalkkio;
    private double hallinnointipalkkio;
    
    // Yleiskonstruktori
    
    public Parametrit(int luokka, double osuus, double tuotto) {
        this.omaisuusluokka = luokka;
        this.osuus = osuus;
        this.tuotto = tuotto;
    }
    
    // Konstruktori rahastolle
    
    public Parametrit(int luokka, int rahastotyyppi, double osuus, double tuotto, 
            double merkintapalkkio, double lunastuspalkkio, double hallinnointipalkkio) {
        this.omaisuusluokka = luokka; // rahastolla aina 2, lisättävä tarkistus
        this.rahastotyyppi = rahastotyyppi;
        this.osuus = osuus;
        this.tuotto = tuotto;
        this.merkintapalkkio = merkintapalkkio;
        this.lunastuspalkkio = lunastuspalkkio;
        this.hallinnointipalkkio = hallinnointipalkkio;
    }
    
    public void setOmaisuusluokka(int luokka) {
        this.omaisuusluokka = luokka;
    }
    
    public int getOmaisuusluokka() {
        return this.omaisuusluokka;
    }
    
    public void setTuotto(double tuotto) {
        this.tuotto = tuotto;
    }
    
    public double getTuotto() {
        return this.tuotto;
    }
    
    public void setMerkintapalkkio(double merkintapalkkio) {
        this.merkintapalkkio = merkintapalkkio;
    }
    
    public double getMerkintapalkkio() {
        return this.merkintapalkkio;
    }
    
    public void setLunastuspalkkio(double lunastuspalkkio) {
        this.lunastuspalkkio = lunastuspalkkio;
    }
    
    public double getLunastuspalkkio() {
        return this.lunastuspalkkio;
    }
    
    public void setHallinnointipalkkio(double hallinnointipalkkio) {
        this.hallinnointipalkkio = hallinnointipalkkio;
    }
    
    public double getHallinnointipalkkio() {
        return this.hallinnointipalkkio;
    }
    
    public void setRahastotyyppi(int tyyppi) {
        this.rahastotyyppi = tyyppi;
    }
    
    public int getRahastotyyppi() {
        return this.rahastotyyppi;
    }
    
    public void setOsuus(double osuus) {
        this.osuus = osuus;
    }
    
    public double getOsuus() {
        return this.osuus;
    }
    
}
