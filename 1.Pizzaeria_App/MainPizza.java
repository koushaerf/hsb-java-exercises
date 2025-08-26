package uebung6;

import java.util.LinkedList;

public class MainPizza {

	public static void main(String[] args) {
		Zutat tomtatensosse= new Zutat("tomatoSauce",0.50);
		Zutat kase =new Zutat("Kase", 0.90);
		Zutat salami = new Zutat("Salami", 1.00);
		Zutat peperoni = new Zutat("Peperoni", 0.35);  
		Zutat schinken = new Zutat("Schinken",1.10);
		LinkedList<Zutat>margherita = new LinkedList<Zutat>();
		margherita.add(tomtatensosse);
		margherita.add(kase);
		LinkedList<Zutat>diavola = new LinkedList<Zutat>();
		diavola.add(tomtatensosse);
		diavola.add(peperoni);
		diavola.add(kase);
		LinkedList<Zutat>special = new LinkedList<Zutat>();
		special.add(tomtatensosse);
		special.add(peperoni);
		special.add(kase);
		special.add(schinken);
		special.add(salami);
		
		Pizza margharita = new Pizza(25,margherita);
		Pizza diavolaa = new Pizza(30, diavola);
		Pizza specialo = new Pizza(35, special);
		LinkedList<Pizza>besteelung1 = new LinkedList<Pizza>();
		besteelung1.add(margharita);
		besteelung1.add(diavolaa);
		LinkedList<Pizza>besteelung2 = new LinkedList<Pizza>();
		besteelung2.add(margharita);
		besteelung2.add(margharita);
		besteelung2.add(diavolaa);
		besteelung2.add(diavolaa);
		besteelung2.add(diavolaa);
		besteelung2.add(specialo);
		besteelung2.add(specialo);
		Bestellung b1 = new Bestellung(besteelung1);
		Bestellung b2 = new Bestellung(besteelung2); 
		System.out.println("Bestellung 1: ");
		System.out.println(b1.calculatePreis()+" Euro");
		System.out.println("Bestellung 2 : ");
		System.out.println(b2.calculatePreis()+" Euro");
		

	}

}
