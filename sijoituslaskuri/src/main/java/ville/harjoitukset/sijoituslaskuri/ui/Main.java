package ville.harjoitukset.sijoituslaskuri.ui;

//import javax.swing.SwingUtilities;
//import ville.harjoitukset.sijoituslaskuri.logiikka.Suunnitelma;
//import ville.harjoitukset.sijoituslaskuri.logiikka.Simulaattori;
//import ville.harjoitukset.sijoituslaskuri.logiikka.Portfolio;
//import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 * Pääohjelma, jonka avulla hallitaan ohjelman toimintaa kokonaisuutena.
 * Sisältää väliaikaisesti sekä graafisen että komentorivi käyttöliittymän.
 */

public class Main {
    
    /**
     * Main-metodi joka käynnisttää ohjelman.
     * @param args mahdolliset komentoriviargumentit
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kayttoliittyma().setVisible(true);
            }
        });  
    }   
}