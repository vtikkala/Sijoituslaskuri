package ville.harjoitukset.sijoituslaskuri.logiikka;

/**
 *
 * @author Ville Tikkala
 */
public class Parametrit {
    private int omaisuusluokka; // pakollinen tieto
    private int rahastotyyppi; // (1 = kasvu, 2 = tuotto)
    private double tuotto; // pakollinen tieto
    private double merkintapalkkio;
    private double lunastuspalkkio;
    private double hallinnointipalkkio;
    
    public Parametrit(int luokka, double tuotto) {
        this.omaisuusluokka = luokka;
        this.tuotto = tuotto;
    }
    
    public Parametrit(int luokka, int rahastotyyppi, double tuotto, double merkintapalkkio,
            double lunastuspalkkio, double hallinnointipalkkio) {
        this.omaisuusluokka = luokka;
        this.rahastotyyppi = rahastotyyppi;
        this.tuotto = tuotto;
        this.merkintapalkkio = merkintapalkkio;
        this.lunastuspalkkio = lunastuspalkkio;
        this.hallinnointipalkkio = hallinnointipalkkio;
    }
    
    public boolean setOmaisuusluokka(int luokka) {
        this.omaisuusluokka = luokka;
        return true;
    }
    
    public int getOmaisuusluokka() {
        return this.omaisuusluokka;
    }
    
    public boolean setTuotto(double tuotto) {
        this.tuotto = tuotto;
        return true;
    }
    
    public double getTuotto() {
        return this.tuotto;
    }
    
    public boolean setMerkintapalkkio(double merkintapalkkio) {
        this.merkintapalkkio = merkintapalkkio;
        return true;
    }
    
    public double getMerkintapalkkio() {
        return this.merkintapalkkio;
    }
    
    public boolean setLunastuspalkkio(double lunastuspalkkio) {
        this.lunastuspalkkio = lunastuspalkkio;
        return true;
    }
    
    public double getLunastuspalkkio() {
        return this.lunastuspalkkio;
    }
    
    public boolean setHallinnointipalkkio(double hallinnointipalkkio) {
        this.hallinnointipalkkio = hallinnointipalkkio;
        return true;
    }
    
    public double getHallinnointipalkkio() {
        return this.hallinnointipalkkio;
    }
    
}
