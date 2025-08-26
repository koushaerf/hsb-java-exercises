package versuch2praktikumbundes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Bundesland {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("echte_staedte_plz.xml");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("Bundesland.txt");
		PrintWriter pw = new PrintWriter(fw);
		String line;
		String name;
		String plz;
		boolean inNrw = false;
		boolean inStadt= false;
		
		while((line=br.readLine())!=null) {
			if(line.contains("<name>")&&line.contains("Nordrhein-Westfalen")) {
				inNrw=true;
				pw.println("Städte in NRW");
				pw.println();
				pw.println();
				pw.println();
			}
			if(line.contains("<stadt>")&&inNrw) {
				inStadt=true;
			
				
				
			}
			if(line.contains("<name>")&&inNrw&&inStadt) {
				name=extractor(line);
				pw.println(name);
			}
			if(line.contains("<plz>")&&inNrw&&inStadt) {
				plz=extractor(line);
				pw.print(plz+",");
			}
			if(line.contains("</stadt>")&&inStadt) {
				pw.println();
				pw.println();
				inStadt=false;
			}
			if(line.contains("</bundesland>")&&inNrw) {
				inNrw=false;
			}
			//pw.println();
		}
		pw.flush();
		pw.close();
		br.close();
		

	}
	public static String extractor(String line ) {
		int start = line.indexOf(">")+1;
		int ende = line.indexOf("<", start);
		String extracted = line.substring(start, ende);
		
		return extracted;
		
	}

}
