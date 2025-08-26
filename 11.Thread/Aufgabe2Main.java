package themenBlock3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Aufgabe2Main {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("list.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			LinkedList<String>myList = new LinkedList<String>();
			while((line=br.readLine())!=null) {
				myList.add(line);
			}
			br.close();
			LaengstesWortThread langste = new LaengstesWortThread(myList);
			kurzestesWortThread kurzeste = new kurzestesWortThread(myList);
			HaeufigsteWort haufigste = new HaeufigsteWort(myList);
			AnfangsEndeThread gleicheAnfangsende = new AnfangsEndeThread(myList);
			langste.start();
			
			kurzeste.start();
			
			haufigste.start();
			
			gleicheAnfangsende.start();
			/*kurzeste.join();
			haufigste.join();
			langste.join();
			gleicheAnfangsende.join();*/
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}

	}

}
