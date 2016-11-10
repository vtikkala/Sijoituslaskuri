package ville.harjoitukset.sijoituslaskuri;

import java.util.Scanner;

/**
 *
 * @author Ville Tikkala
 */

public class Main {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Tervetuloa Sijoituslaskuriin!");
        System.out.println("Anna nimi portfoliollesi:");
        String nimi = lukija.nextLine();
        Portfolio portfolio = new Portfolio(nimi);
 
        System.out.println("Määrittele sijoituskohteen tunnus (rahasto)");
        String tunnus = lukija.nextLine();
        System.out.println("Määrittele sijoituskohteen nimi)");
        String sijNimi = lukija.nextLine();
        System.out.println("Määrittele sijoituskohteen tuotto prosenttina");
        double tuotto = Double.parseDouble(lukija.nextLine());
        System.out.println("Määrittele sijoituskohteen merkintäpalkkio prosenttina");
        double merkintapalkkio = Double.parseDouble(lukija.nextLine());
        System.out.println("Määrittele sijoituskohteen lunastuspalkkio prosenttina");
        double lunastuspalkkio = Double.parseDouble(lukija.nextLine());
        System.out.println("Määrittele sijoituskohteen osuus portfoliosta prosenttina");
        double osuus = Double.parseDouble(lukija.nextLine());
        
        Instrumentti instrumentti = new Instrumentti(tunnus, sijNimi, tuotto, merkintapalkkio, lunastuspalkkio, osuus);
        portfolio.lisaaPortfolioon(instrumentti);
    
        System.out.println("Määrittele sijoitusaikasi vuosina");
        int sijoitusaika = Integer.parseInt(lukija.nextLine());
        System.out.println("Määrittele sijoitettava summa eurona");
        double sijoitus = Double.parseDouble(lukija.nextLine());
        int tiheys = 0;
        
        Suunnitelma suunnitelma = new Suunnitelma(sijoitusaika, tiheys, sijoitus);
        
        Simulaattori simulaattori = new Simulaattori(portfolio, suunnitelma);
        
        System.out.println("Portfolion säästö lopussa: " + simulaattori.arvoLopussa());
    }
    
}
