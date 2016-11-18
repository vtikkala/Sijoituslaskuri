package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 * @author Ville Tikkala
 */

// Laskee tällä hetkellä vain loppusäästön.

public class Simulaattori {
    private Portfolio portfolio;
    private Rahasto rahasto;
    private int sijoitusaika;
    private int tiheys;
    private double sijoitus;

    public Simulaattori(Portfolio kohteet, Suunnitelma suunnitelma) {
        this.portfolio = kohteet;
        this.sijoitusaika = suunnitelma.getSijoitusaika();
        this.tiheys = suunnitelma.getTiheys();
        this.sijoitus = suunnitelma.getSijoitus();
    }
    
    public double arvoLopussa() {
        
        double sijoitusYhteensa = 0.00;
        
        for (int i = 0; i < portfolio.getPortfolio().size(); i++) {
            if (portfolio.getPortfolio().get(i).getTunnus().equals("Rahasto")) {
                rahasto = portfolio.getPortfolio().get(i);
                int rahastotyyppi = rahasto.getParametrit().getRahastotyyppi();
                double osuus = rahasto.getParametrit().getOsuus();
                double tuotto = rahasto.getParametrit().getTuotto();
                double merkintapalkkio = rahasto.getParametrit().getMerkintapalkkio();
                double lunastuspalkkio = rahasto.getParametrit().getLunastuspalkkio();
                double hallinnointipalkkio = rahasto.getParametrit().getHallinnointipalkkio();
                
                double sijoitusAlussa = (osuus * sijoitus) * (1 - merkintapalkkio);
               
                for (int x = 0; x < sijoitusaika; x++) {
                    sijoitusAlussa = sijoitusAlussa * (1 + tuotto - hallinnointipalkkio);
                }
                
                double sijoitusLopussa = sijoitusAlussa * (1 - lunastuspalkkio);
                sijoitusYhteensa = sijoitusYhteensa + sijoitusLopussa;

            } else {
                System.out.println("Sijoituskohdetta ei tunnistettu");
            }
        }
            
        return sijoitusYhteensa;
    }
    
}