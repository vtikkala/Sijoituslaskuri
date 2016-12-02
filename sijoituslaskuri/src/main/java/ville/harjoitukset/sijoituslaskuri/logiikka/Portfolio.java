package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

import java.util.*;

/**
 * Luokan tarkoituksena on hallinnoida sijoitusportfolioon liitettyjä sijoituskohteita.
 */
public class Portfolio {
    private ArrayList<Rahasto> portfolio;
    private String portfolioNimi;
    
    /**
     * Konstruktorin avulla lisätään portfoliolle nimi.
     * @param nimi Portfolion nimi merkkijonona
     */
    public Portfolio(String nimi) {
        this.portfolio = new ArrayList();
        this.portfolioNimi = nimi;
    }
    
    /**
     * Asettaa rahastotyyppisen sijoituskohteen portfolioon.
     * @param kohde Portfolioon lisättävä rahasto
     * @return totuusarvo lisäyksen onnistumisesta
     */
    public boolean lisaaPortfolioon(Rahasto kohde) {
        portfolio.add(kohde);
        return true;
    }
    
    /**
     * Poistaa portfoliosta sijoituskohteen sen nimen perusteella.
     * @param nimi Poistettavan sijoituskohteen nimi
     * @return totuusarvo poiston onnistumisesta
     */
    public boolean poistaPortfoliosta(String nimi) {
        for (int i = 0; i < portfolio.size(); i++) {
            if (portfolio.get(i).getNimi().equals(nimi)) {
                portfolio.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Asettaa portfoliolle nimen merkkijonomuodossa.
     * @param nimi Portfolion nimi
     */
    public void setNimi(String nimi) {
        this.portfolioNimi = nimi;
    }
    
    /**
     * Palauttaa portfoliolle annetun nimen merkkijonomuodossa.
     * @return portfolion nimi
     */
    public String getNimi() {
        return this.portfolioNimi;
    }
    
    /**
     * Palauttaa portfolion, joka koostuu rahastotyyppisistä sijoituskohteista.
     * @return rahastotyyppisiä sijoituskohteita sisältävä portfolio
     */
    public ArrayList<Rahasto> getPortfolio() {
        return portfolio;
    }
    
}
