package no.Probeus.GrProg.Oblig3.Oppgave1;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	//
	// Initialiserer programmet
	//
	public static void main(String[] args) {
		Boolean loop = true;
		// Artig liten uendelig loop.
		while (loop == true) {
			
			//Litt grafisk tekst for spillet
			System.out.println("******************************");
			System.out.println("Rock Paper Scissor!");
			
			//Noen n�dvendige variabler. (Input, PCens valg, og en int for randomiseren)
			String personPlay = " "; // User's play -- "R", "P", or "S"
			String computerPlay; // Computer's play -- "R", "P", or "S"
			int computerInt; // Randomly generated number used to determine
			
			
			//
			//Dette er en loop for � kontrollere om brukeren har gitt korrekt input.
			//Om dette ikke er tilfelle, vil loopen f�rst gi en feilmelding, s� f�re brukeren tilbake til starten av loopen.
			//N�r brukeren har oppgit en gyldig kommando, avsluttes loopen.
			//
			boolean inputIsValid = false;
			while (inputIsValid == false) {

				Scanner scan = new Scanner(System.in);
				System.out.print("Enter your play: (R/P/S or Q to exit): ");
				personPlay = scan.next().toUpperCase(); //Endrer alt til store bokstaver for � gj�re kodingen lettere senere.

				//Hvis brukeren angir enten RPS, vil spillet g� videre.
				if (personPlay.contentEquals("R")|| personPlay.contentEquals("P")|| personPlay.contentEquals("S"))
					inputIsValid = true; //Avslutter loopen
				// om Q blir angitt, vil programmet avsluttes med en system-kommando. (defor er det ikke s� farlig med den uendelige loopen likevel)
				else if (personPlay.contentEquals("Q")) {
					System.out.println("Thanks for the game!");
					System.exit(0); //Terminerer java-programmet
				} 
				//Om det var en ikke-gyldig kommando, vil en feilmelding dukke opp, og loopen starte p� nytt.
				else
					System.out.println("Not a valid option!");
			}

			// Genererer et tilfeldig tall mellom 0 og 2 (3 tall)
			Random generator = new Random();
			computerInt = generator.nextInt(3);
			// Oversetter til RPS (R = 0, P = 1, S = 2)
			switch (computerInt) {
			case 0:
			default:
				computerPlay = "R";
				break;
			case 1:
				computerPlay = "P";
				break;
			case 2:
				computerPlay = "S";
				break;
			}
			
			// Skriver ut resultatet til b�de spiller og PC
			System.out.println("You played " + personPlay);
			System.out.println("Computer plays " + computerPlay);
			
			// Finner ut hvem som vant.
			if (computerPlay.equals(personPlay)) {
				System.out.println("Its a draw!");
			} else {
				if (personPlay.contentEquals("R")) {
					if (computerPlay.contentEquals("P"))
						System.out.println("Paper entangles Rock. You have lost the match.");

					if (computerPlay.contentEquals("S"))
						System.out.println("Rock destroys Scissors. You have won the match!");
				}

				if (personPlay.contentEquals("P")) {
					if (computerPlay.contentEquals("S"))
						System.out.println("Scissors cuts Paper. You have lost the match.");

					if (computerPlay.contentEquals("R"))
						System.out.println("Paper entangles Rock. You have won the match!");
				}

				if (personPlay.contentEquals("S")) {
					if (computerPlay.contentEquals("R"))
						System.out.println("Rock destroys Scissors. You have lost the match.");

					if (computerPlay.contentEquals("P"))
						System.out.println("Scissors cuts Paper. You have won the match!");
				}
			}
		}
	}
}