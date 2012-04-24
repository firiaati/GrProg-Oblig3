Grunnleggende Programmering - Obligatorisk Innlevering 3
========================================================

Kode: Krister Berntsen, Remi Christoffer Henriksen

Obligatorisk innlevering i Grunnleggende Programmering Høst 2011

All kode er lisensiert under BSD Modified. Mer informasjon i LICENSE.md

Opprett et prosjekt for innleveringen og legg inn de  klasser/java-filer som 
opprettes/lastes ned fra oppgaven (se vedlegg).  Lever enten .java filene eller 
pakk dem som en zip-fil og levere denne når dere er  ferdig. Jobb gjerne i grupper 
på 2 eller 3 (ikke flere) og lever sammen.

Oppgave 1
---------

Stein, saks papir (eng. Rock, Paper, Scissors). 
Programmet   Rock.java inneholder skjelettet for spillet Stein, saks, papir. Ta en  kopi av programmet og legg til kode slik at programmet gjør som indikert  i kommentarene til programmet. 
Programmet  skal spørre brukeren om hans valg, generere et tilfeldig valg for  datamaskinen, sammenlikne disse og fortelle hvem som vant (og hvorfor).  Programmet skal gå i løkke inntil brukeren angir q for quit. Er den  valgte verdien fra brukeren ugyldig skal han få beskjed om å velge en ny  lovlig verdi.
En kjøring av programmet kan se slik ut:
$ java Rock
Enter your play: R, P, or S
r
Computer play is S
Rock crushes scissors, you win!
Legg  merke til at brukeren kan gi inn sitt valg både som små og store  bokstaver, gyldige valg er kun en av de tre, du bestemmer selv om du vil  benytte norsk eller engelsk. Brukerens input er lagret som en  tekststreng, det er da enkelt å konvertere denne til store bokstaver.  Bruk et switch uttrykk for å konvertere et tilfeldig generert tall for  datamaskinvalget til en tekststreng.

Oppgave 2
---------

Skriv et komplett Javaprogram som gjør følgende:
Leser inn en tekst
Leser inn et søkeord
Søker etter søkeordet i den innleste teksten og skriver ut posisjonen for HVER gang søkeordet forekommer i teksten. Det vil med andre ord si at for alle forekomster av søkeordet skal posisjonen skrives ut. Du kan benytte String metodene indexOf og lastIndexOf for søking etter en substreng i en streng, legg merke til at for indexOf kan en også angi fra hvilken posisjon i tekststrengen en skal starte søket.

Oppgave 3
---------

Filene StemmeTeller.java og  StemmeTellerPanel.java er litt modifiserte versjoner av eksemplet PushCounter.java og PushCounterPanel.Java   fra kapittel 4 i læreboka. På samme måte som i eksemplet telles det   hvor mange ganger knappen trykkes. Det anntas at hvert trykk er en   stemme for Pondus og knappen og variablene har fått navn etter det.
Last ned filene og legg dem til prosjektet. Kompiller og kjør programmet for å se hvordan det virker.
 
Modifiser programmet slik at det er to kandidater å stemme på – Pondus og Nemi. For å få til dette må du gjøre følgende:

a. Legg til variabler for Nemi – en stemmeteller, en knapp og en etikett(label).
b. Legg knappen og etiketten for Nemi til panelet
c. Modifiser metoden ActionPerformed i klassen StemmeKnappLytter slik at den kan avgjøre hvilken knapp som er trykket og oppdaterer den rette telleren. (Se på eksemplene LeftRight og Quote i kapittel 5 i læreboka for hvordan man skal finne kilden til en hendelse.)
 
Test programmet
 
Modifiser programmet videre slik at det viser en melding som foteller hvem som vinner. For å få til dette må du gjøre følgnede:

a. Instansier (opprett) en ny etikett og legg den til panelet.
b. Legg til en if-setning i ActionPerformed som avgjør hvem som vinner (test også for uavgjort) og setter teksten til etikketten til en passende melding.
 
Legg til en "person" til, som det kan setmmes på.
Kompiler og kjør programmet. Lever inn filene.