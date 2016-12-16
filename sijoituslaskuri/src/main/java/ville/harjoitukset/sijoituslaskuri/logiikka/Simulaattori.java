package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 * Luokan tarkoituksena on laskea portfolioon liitettyjen sijoituskohteiden ja
 * sijoitussuunnitelman pohjalta erilaisia tunnuslukuja, kuten sijoitusten määrä
 * sijoitusajan lopuksi.
 */

// Laskee tällä hetkellä vain loppusäästön.

public class Simulaattori {
    private Portfolio portfolio;
    private Rahasto rahasto;
    private int sijoitusaika;
    private int tiheys;
    private double sijoitus;
    private double kulutYhteensa;
    private double tuototYhteensa;
    private double tuottoprosentti;
    private double sijoitusYhteensaKaikki;

    /**
     * Konstruktorin avulla simulaattorille välitetään simuloinnissa käytettävä
     * portfolio ja sijoitussuunnitelma.
     * @param kohteet Sijoitusportfolio
     * @param suunnitelma Sijoitussuunnitelma
     */
    public Simulaattori(Portfolio kohteet, Suunnitelma suunnitelma) {
        this.portfolio = kohteet;
        this.sijoitusaika = suunnitelma.getSijoitusaika();
        this.tiheys = suunnitelma.getTiheys();
        this.sijoitus = suunnitelma.getSijoitus();
        this.kulutYhteensa = 0.00;
        this.tuototYhteensa = 0.00;
        this.tuottoprosentti = 0.00;
        this.sijoitusYhteensaKaikki = 0.00;
        //System.out.println("Sijoitusaika: " + this.sijoitusaika);
        //System.out.println("Tiheys: " + this.tiheys);
        //System.out.println("Sijoitus: " + this.sijoitus);
        
    }
    
    public double getSijoitus() {
        return this.sijoitus;
    }
    
    public double getTuotto() {
        return this.tuototYhteensa;
    }
    
    public double getKulut() {
        return this.kulutYhteensa;
    }
    
    public double getSijoitusLopussa() {
        return this.sijoitusYhteensaKaikki;
    }
    
    /**
     * Laskee portfolion arvon sijoitusajan lopussa. Toteutus kesken.
     * @return sijoitusten arvo lopussa
     */
    public double simuloi() {
        
        double sijoitusYhteensa = 0.00;
        
        for (int i = 0; i < portfolio.getPortfolio().size(); i++) {
            if (portfolio.getPortfolio().get(i).getTunnus().equals("Rahasto")) {
                rahasto = portfolio.getPortfolio().get(i);
                int rahastotyyppi = rahasto.getParametrit().getRahastotyyppi();
                //System.out.println("Rahastotyyppi: " + rahastotyyppi);
                
                double osuus = rahasto.getParametrit().getOsuus();
                //System.out.println("Osuus: " + osuus);
                
                double tuotto = rahasto.getParametrit().getTuotto();
                //System.out.println("Tuotto: " + tuotto);
                
                double merkintapalkkio = rahasto.getParametrit().getMerkintapalkkio();
                //System.out.println("Merkintapalkkio: " + merkintapalkkio);
                
                double lunastuspalkkio = rahasto.getParametrit().getLunastuspalkkio();
                //System.out.println("Lunastuspalkkio: " + lunastuspalkkio);
                
                double hallinnointipalkkio = rahasto.getParametrit().getHallinnointipalkkio();
                //System.out.println("Hallinnointipalkkio: " + hallinnointipalkkio);
                
                double merkintapalkkioEuroa = ((osuus / 100) * this.sijoitus) * (merkintapalkkio / 100);
                this.kulutYhteensa = this.kulutYhteensa + merkintapalkkioEuroa;
                
                double sijoitusKesken = ((osuus / 100) * this.sijoitus) - merkintapalkkioEuroa;
                //System.out.println("Sijoitus alussa: " + sijoitusKesken);
               
                for (int x = 0; x < this.sijoitusaika; x++) {
                    double hallinnointipalkkioEuroa = sijoitusKesken * (hallinnointipalkkio / 100);
                    this.kulutYhteensa = this.kulutYhteensa + hallinnointipalkkioEuroa;
                    
                    double tuottoEuroa = sijoitusKesken * (tuotto / 100);
                    this.tuototYhteensa = this.tuototYhteensa + tuottoEuroa;
                    
                    sijoitusKesken = sijoitusKesken + tuottoEuroa - hallinnointipalkkioEuroa;
                    //System.out.println("Sijoitus vuoden " + x + " lopussa: " + sijoitusKesken);
                }
                 
                double lunastuspalkkioEuroa = sijoitusKesken * (lunastuspalkkio / 100);
                this.kulutYhteensa = this.kulutYhteensa + lunastuspalkkioEuroa;
                
                double sijoitusLopussa = sijoitusKesken - lunastuspalkkioEuroa;
                //System.out.println("Sijoitus lopussa: " + sijoitusLopussa);
                
                sijoitusYhteensa = sijoitusYhteensa + sijoitusLopussa;
                this.sijoitusYhteensaKaikki = sijoitusYhteensa;
                
                //System.out.println("Sijoitus yhteensä: " + sijoitusYhteensa);
                //System.out.println("Tuotot yhteensä: " + this.tuototYhteensa);
                //System.out.println("Kulut yhteensä: " + this.kulutYhteensa);

            } else {
                this.sijoitusYhteensaKaikki = -1;
            }
        }
            
        return sijoitusYhteensa;
    }
    
}