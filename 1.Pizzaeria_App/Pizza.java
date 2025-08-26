package uebung6;

import java.util.LinkedList;

public class Pizza {
	private double durchmesser;
	private LinkedList<Zutat>zutatList;
	public Pizza(double durchmesser, LinkedList<Zutat> zutatList) {
		this.durchmesser = durchmesser;
		this.zutatList = zutatList;
	}
	public void addZutat(Zutat z) {
		zutatList.add(z);
		
	}
	public double getDurchmesser() {
		return durchmesser;
	}
	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}
	public LinkedList<Zutat> getZutatList() {
		return zutatList;
	}
	public void setZutatList(LinkedList<Zutat> zutatList) {
		this.zutatList = zutatList;
	}
	public double calculatePreis() {
		double preis=0;
		 preis += 0.01*((durchmesser/2)*(durchmesser/2)*Math.PI);
		for(int i=0;i<zutatList.size();i++) {
			preis+=zutatList.get(i).getPreis();
		}
		
		return preis;
	}

}
