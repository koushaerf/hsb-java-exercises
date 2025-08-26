package versuch6;

public class Reise {
	private String startflughafen,reiseziel;
	private int reisedauer;
	private double preis;
	public Reise(String startflughafen, String reiseziel) {
		super();
		this.startflughafen = startflughafen;
		this.reiseziel = reiseziel;
	}
	public Reise(String startflughafen, String reiseziel, int reisedauer) {
		super();
		this.startflughafen = startflughafen;
		this.reiseziel = reiseziel;
		this.reisedauer = reisedauer;
	}
	public String getStartflughafen() {
		return startflughafen;
	}
	public void setStartflughafen(String startflughafen) {
		this.startflughafen = startflughafen;
	}
	public String getReiseziel() {
		return reiseziel;
	}
	public void setReiseziel(String reiseziel) {
		this.reiseziel = reiseziel;
	}
	public int getReisedauer() {
		return reisedauer;
	}
	public void setReisedauer(int reisedauer) {
		this.reisedauer = reisedauer;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	@Override
	public String toString() {
		String ausgabe="Reise nach: "+getReiseziel();
		ausgabe+="\nab "+getStartflughafen();
		ausgabe+="\nReisedauer: "+getReisedauer();
		ausgabe+="\nfuer "+getPreis()+"Euro";
		return ausgabe;
	}
	protected boolean istKurzurlaub() {
		if(getReisedauer()<7) {
			return true;
		}
		else {
			return false;
		}
	}

}
