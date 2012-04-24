package no.Probeus.GrProg.Oblig3.Oppgave3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")	//Eclipse hater meg...
public class StemmeTellerPanel extends JPanel {
	private int stemmerForPondus, stemmerForNemi, stemmerForM;
	private JButton pondus, nemi, m;
	private JLabel etikettPondus, etikettNemi, etikettM, etikettResultat;

	// ----------------------------------------------
	// Setter opp Grensesnittet
	// ----------------------------------------------
	public StemmeTellerPanel() {
		stemmerForPondus = 0;
		stemmerForNemi = 0;
		stemmerForM = 0;

		// Knapp for Pondus
		pondus = new JButton("Stem p� Pondus");
		pondus.addActionListener(new StemmeKnappLytter());

		// Knapp for Nemi
		nemi = new JButton("Stem p� Nemi");
		nemi.addActionListener(new StemmeKnappLytter());

		// Knapp for M
		m = new JButton("Stem p� M");
		m.addActionListener(new StemmeKnappLytter());

		// Legger til etiketter som viser antall stemmer til hver kandidat
		etikettPondus = new JLabel("Stemmer for Pondus: " + stemmerForPondus);
		etikettNemi = new JLabel("Stemmer for Nemi: " + stemmerForNemi);
		etikettM = new JLabel("Stemmer for Mads: " + stemmerForM);

		// Legger til etikett for � vise hvem som leder.
		etikettResultat = new JLabel(" ");

		// Legger til knapp og etikett for Pondus
		add(pondus);
		add(etikettPondus);

		// Legger til knapp og etikett for Nemi
		add(nemi);
		add(etikettNemi);

		// Legger til knapp og etikett for M
		add(m);
		add(etikettM);

		// legger til etikett for resultatet
		add(etikettResultat);

		setPreferredSize(new Dimension(290, 150)); // Setter st�rrelsen p�
													// vinduet
		setBackground(Color.cyan); // Setter bakgrunnsfargen
	}

	// ***************************************************
	// Lytter for knappene
	// ***************************************************
	private class StemmeKnappLytter implements ActionListener {
		// ----------------------------------------------
		// Finner ut av hvilken knapp som er trykt og oppdaterer de rette
		// tallene.
		// ----------------------------------------------
		public void actionPerformed(ActionEvent event) {

			// Knappen for nemi har blitt trykt
			if (event.getSource() == nemi) {
				stemmerForNemi++;
				etikettNemi.setText("Stemmer for Nemi: " + stemmerForNemi);
			}

			// Knappen for pondus har blitt trykt
			if (event.getSource() == pondus) {
				stemmerForPondus++;
				etikettPondus
						.setText("Stemmer for Pondus: " + stemmerForPondus);
			}

			// Knappen for m har blitt trykt
			if (event.getSource() == m) {
				stemmerForM++;
				etikettM.setText("Stemmer for Mads: " + stemmerForM);

			}

			// Oppdaterer tekst hvis nemi leder
			if (stemmerForNemi > stemmerForPondus
					&& stemmerForNemi > stemmerForM) {
				etikettResultat.setText("Nemi Leder!");
			}
			// Hvis ikke s� sjekker den for pondus
			else if (stemmerForPondus > stemmerForNemi
					&& stemmerForPondus > stemmerForM) {
				etikettResultat.setText("Pondus Leder!");
			}
			// Men selvf�lgelig er Mads den beste tegneserien, s� det er denne
			// som vil sl� inn for min del. (hvis mads leder)
			else if (stemmerForM > stemmerForPondus
					&& stemmerForM > stemmerForNemi) {
				etikettResultat.setText("Mads Leder!");
			}
			// Om ikke det heller fungerte, s� er det n�dt til � v�re uavgjort.
			else {
				etikettResultat.setText("Det er Uavgjort");
			}

		}
	}
}

