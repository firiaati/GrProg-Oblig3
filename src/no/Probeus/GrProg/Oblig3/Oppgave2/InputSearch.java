package no.Probeus.GrProg.Oblig3.Oppgave2;

import java.util.Scanner;

public class InputSearch {

	public static void main(String[] args) {

		// Leser inn tekststrengen
		Scanner scan = new Scanner(System.in);
		System.out.print("Vennligst skriv inn teksten som skal gjennoms�kes: ");
		String userInput = scan.nextLine();

		// Les inn S�keord
		System.out.print("Vennligst skriv inn ordet du leter etter: ");
		String userQuery = scan.nextLine();

		// Denne vil bli brukt til � vise antallet ganger s�keordet ble funnet.
		int queryReturnTotal = 0;

		// Starter linjen som vil liste opp hvor s�keordet ble funnet.
		System.out.print("S�keordet " + userQuery + " ble funnet p� posisjon");

		// loop som printer ut resultatet
		// Printer ut alle f�rste s�keord etter index+1 som da vil gj�re at den
		// vil lete igjennom hele s�kestrengen og ignorere alle negative
		// responser (-1)
		for (int index = -1; (index = userInput.indexOf(userQuery, index + 1)) != -1;) {
			System.out.print(" " + index + " ");
			queryReturnTotal++; // plusser p� ett resultat i totalvariabelen.
		}

		// Kosmetisk fix for � f� linjen under p� neste linje
		System.out.println();

		// Skriver ut hvor mangen ganger s�keordet ble funnet.
		System.out.println("S�keordet ble funnet totalt " + queryReturnTotal + " ganger i s�keteksten.");

	}

}
