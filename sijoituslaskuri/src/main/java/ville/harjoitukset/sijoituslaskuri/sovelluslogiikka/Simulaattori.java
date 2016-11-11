package ville.harjoitukset.sijoituslaskuri.sovelluslogiikka;

import ville.harjoitukset.sijoituslaskuri.sovelluslogiikka.Portfolio;

/**
 *
 * @author Ville Tikkala
 */

// Laskee tällä hetkellä vain loppusäästön.
// Getterit ja setterit lisättävä.

public class Simulaattori {
    private Portfolio portfolio;
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
        
        Double sijoitusYhteensa = 0.00;
        
        for (int i = 0; i < portfolio.getPortfolio().size(); i++) {
            Double tuotto = portfolio.getPortfolio().get(i).getTuotto();
            Double merkintapalkkio = portfolio.getPortfolio().get(i).getMerkintaPalkkio();
            Double lunastuspalkkio = portfolio.getPortfolio().get(i).getLunastusPalkkio();
            Double osuus = portfolio.getPortfolio().get(i).getOsuus();
            
            Double sijoitusAlussa = (osuus * sijoitus) * (1 - merkintapalkkio);
            
            for (int x = 0; x < sijoitusaika; x++) {
                sijoitusAlussa = sijoitusAlussa * (1 + tuotto);
            }
            
            Double sijoitusLopussa = sijoitusAlussa * (1 - lunastuspalkkio);
            sijoitusYhteensa = sijoitusYhteensa + sijoitusLopussa;
        }
        
        return sijoitusYhteensa;
    }
    
}