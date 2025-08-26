package themenBlock3;

import java.util.LinkedList;

public class LaengstesWortThread extends Thread{
	public LaengstesWortThread(LinkedList<String> list) {
		super();
		this.list = list;
	}

	private LinkedList<String>list;

	public LinkedList<String> getList() {
		return list;
	}

	public void setList(LinkedList<String> list) {
		this.list = list;
	}
	@Override
	public void run() {
		int lenght =list.get(0).length();
		String laengste=list.get(0);
		for(int i =1;i<list.size();i++) {
			if(list.get(i).length()>lenght) {
				lenght=list.get(i).length();
				laengste=list.get(i);
			}
		}
		System.out.println("Längstes Wort : "+laengste+"--->Länge: "+lenght);
		
	}

}
