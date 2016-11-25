package ville.harjoitukset.sijoituslaskuri.logiikka;

import ville.harjoitukset.sijoituslaskuri.instrumentit.*;

/**
 *
 * @author Ville Tikkala
 */
public interface Simuloitava {

    /**
     * Rajapinta, jonka kautta voidaan hakea sijoituskohteiden simuloinnissa
     * käytettäviä parametreja.
     * @return sijoituskohteen laskentaparametrit
     */
    public Parametrit getParametrit();
        
}
