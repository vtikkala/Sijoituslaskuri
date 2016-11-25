package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

import java.util.*;

/**
 *
 * @author Ville Tikkala
 */
public class Portfolio {
    private ArrayList<Rahasto> portfolio;
    private String portfolioNimi;
    
    public Portfolio(String nimi) {
        this.portfolio = new ArrayList();
        this.portfolioNimi = nimi;
    }
    
    public boolean lisaaPortfolioon(Rahasto kohde) {
        portfolio.add(kohde);
        return true;
    }
    
    public boolean poistaPortfoliosta(String nimi) {
        for (int i = 0; i < portfolio.size(); i++) {
            if (portfolio.get(i).getNimi().equals(nimi)) {
                portfolio.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void setNimi(String nimi) {
        this.portfolioNimi = nimi;
    }
    
    public String getNimi() {
        return this.portfolioNimi;
    }
    
    public ArrayList<Rahasto> getPortfolio() {
        return portfolio;
    }
    
}
