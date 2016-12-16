#Sijoituslaskurin käyttöohjeet

##Ohjelman lataaminen koneelle
Lataa sijoituslaskuri.jar-tiedosto koneelle haluamaasi hakemistoon.

##Ohjelman käynnistäminen
Ohjelman saa käynnistettyä komentoriviltä siirtymällä hakemistoon, johon Sijoituslaskuri on tallennettu ja kirjoittamalla komentoriville seuraavan komennon: java -jar sijoituslaskuri.jar

##Ohjelman käyttäminen
Sijoituslaskurin kehitystyö on vielä käynnissä, joten sovelluksen käytössä pitää olla tarkkana!
Ohjelmassa on tarkoituksena rakentaa oma sijoitusportfolio eli sijoitussalkku, jonne voit lisätä erilaisia sijoituskohteita. Voit määritellä sijoituskohteille erilaisia osuuksia sekä määritellä kuinka paljon haluat sijoittaa ja kuinka pitkään. Syöttämiesi tietojen pohjalta ohjelma laskee erilaisia tunnuslukuja sijoituksiesi tuotosta (tässä vaiheessa vasta sijoitusten arvon sijoitusajan lopussa).

###Omaisuusluokka
Valitse sijoituskohteita haluamastasti omaisuusluokasta. Tällä hetkellä vain rahastot ovat valittavissa.

###Sijoituskohde
Sijoituskohdelistaus määräytyy valitsemasi omaisuusluokan perusteella. Tällä hetkellä valittavissa on kolme rahastoa. Rahastot on määritelty erilliseen sijoituskohteet.txt tiedostoon, josta ne ladataan sovelluksen käyttöön.

###Osuus
Määrittele valitsemallesi sijoitusinstrumentille sen osuus koko sijoitussalkusta (saa olla korkeintaa 100 %) ja paina sen jälkeen Lisää. Voit poistaa sijoituskohteen portfoliosta Poista-napilla.

###Suunnitelma
Suunnitelma-osiossa voit määritellä kuinka paljon haluat sijoittaa ja kuinka pitkään (käytä kokonaislukuja tai pistettä desimaalilukujen yhteydessä). Paina lopuksi laske.

###Tulos
Sijoituslaskuri kertoo kuinka paljon sijoituksesi arvo on sijoitusajan lopuksi huomioiden sijoitussalkkusi sisällön, sijoitusinstrumenttien kulut ja tuotot sekä sijoitussuunnitelmasi. Näet myös eriteltynä tuotot ja kulut.

##Ohjelman lopettaminen
Ohjelman suorituksen saa päättymään painamalla oikeassa yläkulmassa olevaa ruksia.
