package themenBlock3;

import java.util.LinkedList;

public class AnfangsEndeThread extends Thread{
	public AnfangsEndeThread(LinkedList<String> list) {
		super();
		this.list = list;
	}

	private LinkedList<String>list;
	@Override
	public void run() {
		for(int i=0;i<list.size();i++) {
			String current=list.get(i).toLowerCase();
			String anfang = current.substring(0,1);
			String ende = current.substring(current.length()-1,current.length());
			if(anfang.equals(ende)) {
				System.out.println("Wort mit dem gleichen Anfgangs-ende :"+list.get(i));
			}
			
		}
	}

}
