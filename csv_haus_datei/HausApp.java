package uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aufgabe2 {

	public static void main(String[] args) {
		Haus h1 = new Haus("Markstrasse", 107, 44803, "Bochum", 240, 120, true, 338);
		Haus h2 = new Haus("LaerholzStrasse", 234, 44802, "Berlin", 489, 234, false, 569);
		Haus h3 = new Haus("Konigstrasse", 10, 34803, "Trier", 2240, 1120, true, 1338);
		Haus[]hausArray = {h1,h2,h3};
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			FileWriter fw = new FileWriter("Häuser.csv",true);
			bw = new BufferedWriter(fw);
		for(int i=0;i<hausArray.length;i++) {
			bw.write(hausArray[i].toCsv()+"\n");
			
		}
		bw.flush();
		FileReader fr = new FileReader("Häuser.csv");
		br=new BufferedReader(fr);
		String line =null;
		int count=0;
		while((line=br.readLine())!=null) {
			String[]hausAttributen = line.split(",");
			hausArray[count].setStrassenname(hausAttributen[0]);
			hausArray[count].setHausnummer(Integer.parseInt(hausAttributen[1]));
			hausArray[count].setPostleitzahl(Integer.parseInt(hausAttributen[2]));
			hausArray[count].setStadt(hausAttributen[3]);
			hausArray[count].setGrundstucflache(Double.parseDouble(hausAttributen[4]));
			hausArray[count].setWohnflache(Double.parseDouble(hausAttributen[5]));
			hausArray[count].setStellplatzVorhanden(Boolean.parseBoolean(hausAttributen[6]));
			hausArray[count].setPreis(Double.parseDouble(hausAttributen[7]));
			
			System.out.println(hausArray[count].toString());
			count++;
		}
		
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
