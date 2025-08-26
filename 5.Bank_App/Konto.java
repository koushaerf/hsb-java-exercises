package uebung9;

public class Konto {
	public Konto(double kontostand) {
		super();
		this.kontostand = kontostand;
	}

	private double kontostand;
	
	
	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	public synchronized void  buchen (double buchung) {
		this.kontostand+=buchung;
	}
	

}
