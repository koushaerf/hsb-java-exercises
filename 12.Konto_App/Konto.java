package themenblock2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Stack;

public class Konto {
	private int kontonummer;
	private double kontostand;
	private String vorname;
	private String nachname;
	private Stack<Double> stack;
	public Konto(int kontonummer, double kontostand, String vorname, String nachname) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.vorname = vorname;
		this.nachname = nachname;
		this.stack = new Stack<Double>();
	}
	public void buchen(double betrag) {
		kontostand+=betrag;
		stack.push(betrag);
	}
	public void rueckbuchung() {
		if(!stack.isEmpty()) {
		double betrag=stack.pop();
		kontostand-=betrag;
		}
		else {
			System.out.println("Sie haben keine aktive Buchung!!");
		}
	}
	
	public void write(String dateiName) {
		try {
			FileWriter fw = new FileWriter(dateiName,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String ausgabe = kontonummer+", "+vorname+", "+nachname+", "+kontostand+"\n";
			bw.write(ausgabe);
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
