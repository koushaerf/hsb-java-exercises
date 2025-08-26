package uebung4;
public class Haus {
	private String strassenname;
	private int hausnummer;
	private int postleitzahl;
	private String stadt;
	private double grundstucflache;
	private double wohnflache;
	private boolean stellplatzVorhanden;
	private double preis;
	public Haus(String strassenname, int hausnummer, int postleitzahl, String stadt, double grundstucflache,
			double wohnflache, boolean stellplatzVorhanden, double preis) {
		super();
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.postleitzahl = postleitzahl;
		this.stadt = stadt;
		this.grundstucflache = grundstucflache;
		this.wohnflache = wohnflache;
		this.stellplatzVorhanden = stellplatzVorhanden;
		this.preis = preis;
	}

	public String getStrassenname() {
		return strassenname;
	}
	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public double getGrundstucflache() {
		return grundstucflache;
	}
	public void setGrundstucflache(double grundstucflache) {
		this.grundstucflache = grundstucflache;
	}
	public double getWohnflache() {
		return wohnflache;
	}
	public void setWohnflache(double wohnflache) {
		this.wohnflache = wohnflache;
	}
	public boolean isStellplatzVorhanden() {
		return stellplatzVorhanden;
	}
	public void setStellplatzVorhanden(boolean stellplatzVorhanden) {
		this.stellplatzVorhanden = stellplatzVorhanden;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Haus [strassenname=" + strassenname + ", hausnummer=" + hausnummer + ", postleitzahl=" + postleitzahl
				+ ", stadt=" + stadt + ", grundstucflache=" + grundstucflache + ", wohnflache=" + wohnflache
				+ ", stellplatzVorhanden=" + stellplatzVorhanden + ", preis=" + preis + "]";
	}
	public String toCsv() {
		String ausgabe=strassenname+","+hausnummer+","+postleitzahl+","+stadt+","+grundstucflache+","+wohnflache+","+stellplatzVorhanden+","+preis;
		return ausgabe;
	}

}
