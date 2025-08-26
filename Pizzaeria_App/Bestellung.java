package uebung6;

import java.util.LinkedList;

public class Bestellung {
	private LinkedList<Pizza>bestellungen;
	public Bestellung(LinkedList<Pizza> bestellungen) {
		this.bestellungen = bestellungen;
	}

	public LinkedList<Pizza> getBestellungen() {
		return bestellungen;
	}

	public void setBestellungen(LinkedList<Pizza> bestellungen) {
		this.bestellungen = bestellungen;
	}
	public void addPizza(Pizza p) {
		bestellungen.add(p);
	}
	
	public double calculatePreis() {
		double preis = 0;
		for(int i=0;i<bestellungen.size();i++) {
			preis+=bestellungen.get(i).calculatePreis();
		
		}
		preis=Math.round(preis*100.0)/100.0;
		return preis;
		
		
	}
		
	

}
