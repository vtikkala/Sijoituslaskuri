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

    /**
     *
     * @param luokka
     * @param osuus
     * @param tuotto
     */
    
    public Parametrit(int luokka, double osuus, double tuotto) {
        this.omaisuusluokka = luokka;
        this.osuus = osuus;
        this.tuotto = tuotto;
    }
    
    // Konstruktori rahastolle

    /**
     *
     * @param luokka
     * @param rahastotyyppi
     * @param osuus
     * @param tuotto
     * @param merkintapalkkio
     * @param lunastuspalkkio
     * @param hallinnointipalkkio
     */
    
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
    
    /**
     * Asettaa sijoituskohteelle sen omaisuusluokan kokonaislukuna.
     * Esimerkiksi 1=tili, 2=rahasto.
     * @param luokka Sijoituskohteen omaisuusluokka
     */
    public void setOmaisuusluokka(int luokka) {
        this.omaisuusluokka = luokka;
    }
    
    /**
     * Palauttaa sijoituskohteen omaisuusluokan kokonaislukuna.
     * Esimerkiksi 1=tili, 2=rahasto.
     * @return
     */
    public int getOmaisuusluokka() {
        return this.omaisuusluokka;
    }
    
    /**
     * Asettaa sijoituskohteelle sen oletustuoton liukulukuna.
     * Esimeriksi 10 % tuotto-oletus annetaan muodossa 10.00.
     * @param tuotto Sijoituskohteen oletustuotto
     */
    public void setTuotto(double tuotto) {
        this.tuotto = tuotto;
    }
    
    /**
     * Palauttaa sijoituskohteen oletustuoton liukulukuna.
     * Esimeriksi arvo 7.00 tarkoittaa 7 % tuotto-oletusta.
     * @return sijoituskohteen oletustuotto
     */
    public double getTuotto() {
        return this.tuotto;
    }
    
    /**
     * Asettaa sijoituskohteelle sen merkintäpalkkion liukulukuna.
     * Esimerkiksi 2 % merkintäpalkkio annetaan muodossa 2.00.
     * @param merkintapalkkio Sijoituskohteen merkintäpalkkia
     */
    public void setMerkintapalkkio(double merkintapalkkio) {
        this.merkintapalkkio = merkintapalkkio;
    }
    
    /**
     * Palauttaa sijoituskohteen merkintäpalkkion liukulukuna.
     * Esimerkiksi palaute 2.00 tarkoittaa 2 % merkintäpalkkiota.
     * @return sijoituskohteen merkintäpalkkio
     */
    public double getMerkintapalkkio() {
        return this.merkintapalkkio;
    }
    
    /**
     * Asettaa sijoituskohteelle sen lunastuspalkkion liukulukuna.
     * Esimerkiksi 1,5 % lunastuspalkkio annetaan muodossa 1.50.
     * @param lunastuspalkkio Sijoituskohteen lunastuspalkkio
     */
    public void setLunastuspalkkio(double lunastuspalkkio) {
        this.lunastuspalkkio = lunastuspalkkio;
    }
    
    /**
     * Palauttaa sijoituskohteen lunastuspalkkion liukulukuna.
     * Esimerkiksi palaute 1.50 tarkoittaa 1,5 % lunastuspalkkiota.
     * @return sijoituskohteen lunastuspalkkio
     */
    public double getLunastuspalkkio() {
        return this.lunastuspalkkio;
    }
    
    /**
     * Asettaa sijoituskohteelle sen hallinnointipalkkion liukulukuna.
     * Esimerksi 2,25 % hallinnointipalkkio annetaan muodossa 2.25.
     * @param hallinnointipalkkio Sijoituskohteen hallinnointipalkkio
     */
    public void setHallinnointipalkkio(double hallinnointipalkkio) {
        this.hallinnointipalkkio = hallinnointipalkkio;
    }
    
    /**
     * Palauttaa sijoituskohteen hallinnointipalkkion liukulukuna.
     * Esimerkiksi palaute 2.25 tarkoittaa 2.25 % hallinnointipalkkiota.
     * @return sijoituskohteen hallinnointipalkkio
     */
    public double getHallinnointipalkkio() {
        return this.hallinnointipalkkio;
    }
    
    /**
     * Asettaa rahastolle sen tyypin (1=kasvuosuus, 2=tuotto-osuus).
     * @param tyyppi Rahaston tyyppi
     */
    public void setRahastotyyppi(int tyyppi) {
        this.rahastotyyppi = tyyppi;
    }
    
    /**
     * Palauttaa rahaston tyypin (1=kasvuosuus, 2=tuotto-osuus).
     * @return rahaston tyyppi
     */
    public int getRahastotyyppi() {
        return this.rahastotyyppi;
    }
    
    /**
     * Asettaa sijoituskohteen osuuden portfoliossa liukulukuna.
     * Esimerkiksi Amerikka Rahasto A:n 50 % osuus portfoliosta annetaan muodossa 50.00.
     * @param osuus Sijoituskohteen osuus
     */
    public void setOsuus(double osuus) {
        this.osuus = osuus;
    }
    
    /**
     * Palauttaa sijoituskohten osuuden portfoliosta liukuluna.
     * Esimerksi palaute "75.00" tarkoittaa, että sijoituskohteen osuus on 75 % portfoliosta.
     * @return sijoituskohteen osuus
     */
    public double getOsuus() {
        return this.osuus;
    }
    
}
