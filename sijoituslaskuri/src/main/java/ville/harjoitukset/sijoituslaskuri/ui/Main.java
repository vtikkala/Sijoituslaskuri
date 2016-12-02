package ville.harjoitukset.sijoituslaskuri.ui;

import javax.swing.SwingUtilities;
import ville.harjoitukset.sijoituslaskuri.logiikka.Suunnitelma;
import ville.harjoitukset.sijoituslaskuri.logiikka.Simulaattori;
import ville.harjoitukset.sijoituslaskuri.logiikka.Portfolio;
import ville.harjoitukset.sijoituslaskuri.instrumentit.*;
import java.util.Scanner;

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
        Scanner lukija = new Scanner(System.in);
        Rahasto rahasto;
        
        while (true) {
            System.out.println("Tervetuloa Sijoituslaskuriin!");
            System.out.println("Valitse 1=graafinen, muuten komentorivi");
            int valinta = Integer.parseInt(lukija.nextLine());
            
            if (valinta == 1) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Kayttoliittyma().setVisible(true);
                    }
                });
                break;
            }
            
            System.out.println("Anna nimi portfoliollesi:");
            String nimi = lukija.nextLine();
            Portfolio portfolio = new Portfolio(nimi);
            
            System.out.println("Määrittele sijoituskohteen tunnus (2 = rahasto)");
            int tunnus = Integer.parseInt(lukija.nextLine());
            if (tunnus == 2) {
                System.out.println("Määrittele rahaston nimi");
                String rahNimi = lukija.nextLine();
                System.out.println("Määrittele rahaston tuotto prosenttina");
                double tuotto = Double.parseDouble(lukija.nextLine());
                System.out.println("Määrittele sijoituskohteen merkintäpalkkio prosenttina");
                double merkintapalkkio = Double.parseDouble(lukija.nextLine());
                System.out.println("Määrittele sijoituskohteen lunastuspalkkio prosenttina");
                double lunastuspalkkio = Double.parseDouble(lukija.nextLine());
                System.out.println("Määrittele sijoituskohteen hallinnointipalkkio prosenttina");
                double hallinnointipalkkio = Double.parseDouble(lukija.nextLine());
                System.out.println("Määrittele sijoituskohteen osuus portfoliosta prosenttina");
                double osuus = Double.parseDouble(lukija.nextLine());
                
                rahasto = new Rahasto("Rahasto", rahNimi, 2, tuotto, osuus,
                    1, merkintapalkkio, lunastuspalkkio, hallinnointipalkkio);
            } else {
                System.out.println("Näkemiin!");
                break;
            }
            
            portfolio.lisaaPortfolioon(rahasto);
            
            System.out.println("Määrittele sijoitusaikasi vuosina");
            int sijoitusaika = Integer.parseInt(lukija.nextLine());
            System.out.println("Määrittele sijoitettava summa eurona");
            double sijoitus = Double.parseDouble(lukija.nextLine());
            int tiheys = 0;
            
            Suunnitelma suunnitelma = new Suunnitelma(sijoitusaika, tiheys, sijoitus);
            Simulaattori simulaattori = new Simulaattori(portfolio, suunnitelma);
            System.out.println("Portfolion säästö lopussa: " + simulaattori.arvoLopussa());
            break;
        }
        
    }
    
}
