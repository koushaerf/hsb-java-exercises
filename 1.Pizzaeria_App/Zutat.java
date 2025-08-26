package uebung6;

public class Zutat {
	private String zutatName;
	private double preis;
	public Zutat(String zutatName, double preis) {
		this.zutatName = zutatName;
		this.preis = preis;
	}
	public String getZutatName() {
		return zutatName;
	}
	public void setZutatName(String zutatName) {
		this.zutatName = zutatName;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}

}
