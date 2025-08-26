package themenblock2;


public class Aufgabe2 {

	public static void main(String[] args) {
		
		Konto k1 = new Konto(1,1450, "Kousha", "Erfani");
		
		Konto k2 = new Konto(2,4450, "Alex", "Jones");
		
		Konto k3 = new Konto(3,834, "Tom", "Cruise");
		k1.buchen(10000);
		k1.buchen(2340);
		k1.buchen(-1234);
		k2.buchen(10000);
		k3.buchen(234);
		k3.buchen(-234);
		k1.rueckbuchung();
		k3.rueckbuchung();
		k2.rueckbuchung();
		k1.write("Konto.csv");
		k2.write("Konto.csv");
		k3.write("Konto.csv");
	}

}
