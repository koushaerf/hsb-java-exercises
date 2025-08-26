package themenBlock3;

import java.util.LinkedList;

public class HaeufigsteWort extends Thread{
	public HaeufigsteWort(LinkedList<String> list) {
		super();
		this.list = list;
	}

	private LinkedList<String> list;
	@Override
	public void run() {
		int countE =Ecounter(list.get(0));
		String hauefigste = list.get(0);
		for(int i=1;i<list.size();i++) {
			if(Ecounter(list.get(i))>countE) {
				countE=Ecounter(list.get(i));
				hauefigste=list.get(i);
			}
		}
		System.out.println("Wort mit den meisten E/e: "+hauefigste+"--->Anzahl E/e: "+countE);
		
	}
	public int Ecounter(String s) {
		int counter = 0 ;
		for(int i=0; i<s.length();i++) {
			if((s.substring(i, i+1).toLowerCase().equals("e"))) {
				counter++;
			}
		}
		return counter;
	}

}
