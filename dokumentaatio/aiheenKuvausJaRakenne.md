#Sijoituslaskuri

##Aihe:
Sijoituslaskuri on sovellus, jolla käyttäjä pystyy vertailemaan helposti erilaisten sijoituskohteiden tuottoja vaihtoehtoisilla sijoitusstrategioilla. Sovellus näyttää sijoitusten kehityksen ja tunnuslukuja lukuina sekä tulevaisuudessa graafisesti.

##Käyttäjät:
Kaikki sijoittamisesta kiinnostuneet henkilöt, jotka haluavat tehdä vertailua erilaisten sijoitusvaihtoehtojen välillä.


##Käyttäjien toiminnot:
Käyttäjä pystyy määrittelemään sovellukseen:
- Käytettävät sijoituskohteet (mm. pankkitili, rahastot, jvk-lainat)
- Sijoitettavan summan (kertasijoitus ja tulevaisuudessa myös jatkuva sijoittaminen)
- Sijoituskohteiden tunnuslukuja (määritellään sijoituskohteet.txt tiedostoon)

Syötettyjen tietojen pohjalta laskuri antaa tulokset, joiden avulla käyttäjä voi vertailla eri sijoituskohteita ja niiden soveltuvuutta hänen tarpeisiinsa.

##Luokkakaavio:
![Luokkakaavio](https://github.com/vtikkala/Sijoituslaskuri/blob/master/dokumentaatio/luokkakaavio.png "Luokkakaavio")

##Rakennekuvaus:
Ohjelma koostuu seuraavista luokista:
- Main-luokka, jonka tehtävä on käynnistää ohjelman toiminta ja avata graafinen käyttöliittymä.
- Käyttöliittymä-luokka, jonka tehtävänä on piirtää käyttöliittymä ja ottaa käyttäjältä vastaan toimintoja ja ohjata siten ohjelman toimintaa ja muita komponentteja käyttäjän tarpeiden mukaisesti.
- Portfolio-luokka, jonka tehtävänä on säilöt käyttäjän valitsemat sijoitusinstrumentit yhdeksi kokonaisuudeksi eli sijoitusportfolioksi.
- Instrumentti-luokka on eri sijoitusinstrumenttien abstrakti yliluokka.
- Rahasto-luokka on yksi monista (toistaiseksi ainoa) Instrumentti-luokan aliluokista, jonka tehtävänä varastoida kaikki sijoitusrahastolle ominaiset piirteet. Rahasto-luokka toteuttaa rajapinnan Simuloitava.
- Simuloitava on rajapinta, jonka toteuttavat luokat pystytään simuloimaan Simulaattorilla.
- Simulaattori-luokan tehtävä on simuloida käyttäjän määrittelemän sijoitusportfolion ja suunnitelmatietojen pohjalta miten sijoitukset tulisivat kehittymään tulevaisuudessa.
- Suunnitelma-luokka pitää sisällään käyttäjän sijoitussuunnitelmaan liittyviä tietoja kuten sijoitushorisontin ja sijoitusten määrän.
- Parametrit-luokka säilöö simulointia varten kaikki sijoitusinstrumentille ominaiset parametrit.

##Sekvenssikaaviot:

###Sijoitusinstrumentin lisääminen portfolioon
![Sekvenssikaavio](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUgSW5zdHJ1bWVudGluIGxpc8Okw6RtaW5lbiBwb3J0Zm9saW9vbgoKaToAHwp0aS0-ICJwOlAAGQgiOmxpc2FhAAcJb24oACIMIGkpCg&s=default "Sekvenssikaavio")

###Simulointi
![Sekvenssikaavio](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUgU2lqb2l0dXN0ZW4gc2ltdWxvaW50aQoKS8OkeXR0w7ZsaWl0dHltw6QtPipTaW11bGFhdHRvcmk6YXJ2b0xvcHVzc2EoUG9ydGZvbGlvIHAsIFN1dW5uaXRlbG1hIHMpCgApDC0-AEYROnJldHVybiBkb3VibGUKZGVzdHJveSAAXwwKCgoK&s=default "Sekvenssikaavio")


