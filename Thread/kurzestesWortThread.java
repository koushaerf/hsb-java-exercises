package themenBlock3;

import java.util.LinkedList;

public class kurzestesWortThread extends Thread{
	public kurzestesWortThread(LinkedList<String> list) {
		super();
		this.list = list;
	}

	private LinkedList<String>list;
	@Override
	public void run() {
		int lenght =list.get(0).length();
		String kurzestes=list.get(0);
		for(int i =1;i<list.size();i++) {
			if(list.get(i).length()<lenght) {
				lenght=list.get(i).length();
				kurzestes=list.get(i);
			}
		}
		System.out.println("Kürzestes Wort : "+kurzestes+"--->Länge: "+lenght);
	}

}
