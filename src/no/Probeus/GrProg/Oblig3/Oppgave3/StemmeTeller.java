package no.Probeus.GrProg.Oblig3.Oppgave3;

import javax.swing.JFrame;

public class StemmeTeller
{
    //----------------------------------------------
    // Oppretter programmets hovedramme.
    //----------------------------------------------
    public static void main(String[] args)
    {
	JFrame frame = new JFrame("StemmeTeller");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(new StemmeTellerPanel()); //Her henter den inn panelet. (Se StemmeTellerPanel.java for videre kommentering)

	frame.pack();
	frame.setVisible(true);
    }
}