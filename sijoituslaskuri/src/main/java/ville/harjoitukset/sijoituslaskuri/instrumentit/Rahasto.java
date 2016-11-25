package ville.harjoitukset.sijoituslaskuri.instrumentit;

import ville.harjoitukset.sijoituslaskuri.logiikka.*;
import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 *
 * @author Ville Tikkala
 */
public class Rahasto extends Instrumentti implements Simuloitava {
    private Parametrit parametrit;
    
    /**
     *
     * @param tunnus
     * @param nimi
     * @param luokka
     * @param tuotto
     * @param osuus
     * @param tyyppi
     * @param merkintapalkkio
     * @param lunastuspalkkio
     * @param hallinnointipalkkio
     */
    public Rahasto(String tunnus, String nimi, int luokka, double tuotto, double osuus, 
            int tyyppi, double merkintapalkkio, double lunastuspalkkio, double hallinnointipalkkio) {
        super(tunnus, nimi);
        this.parametrit = new Parametrit(luokka, tyyppi, osuus, tuotto, merkintapalkkio,
            lunastuspalkkio, hallinnointipalkkio);
    }
    
    // Osuus poistettava konstruktorilta!!

    /**
     * Asettaa rahastolle sen tyypin (1=kasvuosuus, 2=tuotto-osuus).
     * @param tyyppi Rahaston tyyppi
     */
    
    public void setRahastotyyppi(int tyyppi) {
        this.parametrit.setRahastotyyppi(tyyppi);
    }
    
    /**
     * Palauttaa rahaston tyypin (1=kasvuosuus, 2=tuotto-osuus).
     * @return rahaston tyyppi
     */
    public int getRahastotyyppi() {
        return this.parametrit.getRahastotyyppi();
    }
    
    /**
     * Asettaa rahastolle sen merkintäpalkkion liukulukuna.
     * Esimerkiksi 2 % merkintäpalkkio annetaan muodossa 2.00.
     * @param merkintapalkkio Rahaston merkintäpalkkio
     */
    public void setMerkintaPalkkio(double merkintapalkkio) {
        this.parametrit.setMerkintapalkkio(merkintapalkkio);
    }
    
    /**
     * Palauttaa rahaston merkintäpalkkion liukulukuna.
     * Esimerkiksi palaute 2.00 tarkoittaa 2 % merkintäpalkkiota.
     * @return rahaston merkintäpalkkio
     */
    public double getMerkintapalkkio() {
        return this.parametrit.getMerkintapalkkio();
    }
    
    /**
     * Asettaa rahastolle sen lunastuspalkkion liukulukuna.
     * Esimerkiksi 1,5 % lunastuspalkkio annetaan muodossa 1.50.
     * @param lunastuspalkkio Rahaston lunastuspalkkio
     */
    public void setLunastusPalkkio(double lunastuspalkkio) {
        this.parametrit.setLunastuspalkkio(lunastuspalkkio);
    }
    
    /**
     * Palauttaa rahaston lunastuspalkkion liukulukuna.
     * Esimerkiksi palaute 1.50 tarkoittaa 1,5 % lunastuspalkkiota.
     * @return rahaston lunastuspalkkio
     */
    public double getLunastuspalkkio() {
        return this.parametrit.getLunastuspalkkio();
    }
    
    /**
     * Asettaa rahastolle sen hallinnointipalkkion liukulukuna.
     * Esimerksi 2,25 % hallinnointipalkkio annetaan muodossa 2.25.
     * @param hallinnointipalkkio Rahaston hallinnointipalkkio
     */
    public void setHallinnointipalkkio(double hallinnointipalkkio) {
        this.parametrit.setHallinnointipalkkio(hallinnointipalkkio);
    }
    
    /**
     * Palauttaa rahaston hallinnointipalkkion liukulukuna.
     * Esimerkiksi palaute 2.25 tarkoittaa 2.25 % hallinnointipalkkiota.
     * @return rahaston hallinointipalkkio
     */
    public double getHallinnointipalkkio() {
        return this.parametrit.getHallinnointipalkkio();
    }
    
    /**
     * Palauttaa rahaston simuloinnissa tarvittavat parametrit.
     * @return rahaston simulointiparametrit
     */
    @Override
    public Parametrit getParametrit() {
        return this.parametrit;
    }
    
}
