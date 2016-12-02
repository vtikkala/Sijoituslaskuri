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
        //System.out.println("Sijoitusaika: " + this.sijoitusaika);
        //System.out.println("Tiheys: " + this.tiheys);
        //System.out.println("Sijoitus: " + this.sijoitus);
        
    }
    
    /**
     * Laskee portfolion arvon sijoitusajan lopussa. Toteutus kesken.
     * @return sijoitusten arvo lopussa
     */
    public double arvoLopussa() {
        
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
                
                double sijoitusKesken = ((osuus / 100) * this.sijoitus) * (1 - (merkintapalkkio / 100));
                //System.out.println("Sijoitus alussa: " + sijoitusKesken);
               
                for (int x = 0; x < this.sijoitusaika; x++) {
                    sijoitusKesken = sijoitusKesken * (1 + (tuotto - hallinnointipalkkio) / 100);
                    //System.out.println("Sijoitus vuoden " + x + " lopussa: " + sijoitusKesken);
                }
                
                double sijoitusLopussa = sijoitusKesken * (1 - (lunastuspalkkio / 100));
                //System.out.println("Sijoitus lopussa: " + sijoitusLopussa);
                
                sijoitusYhteensa = sijoitusYhteensa + sijoitusLopussa;
                
                //System.out.println("Sijoitus yhteensä: " + sijoitusYhteensa);

            } else {
                sijoitusYhteensa = -1;
            }
        }
            
        return sijoitusYhteensa;
    }
    
}