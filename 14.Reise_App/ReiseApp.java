package versuch6;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class ReiseApp {

	public static void main(String[] args) {
		ReiseX[]announce=new ReiseX[4];
		for(int i=0;i<announce.length;i++) {
			
			String startflughafen=JOptionPane.showInputDialog((i+1)+".Reise: "+"Geben Sie den Startflughafen ein: ");
			String reiseziel=JOptionPane.showInputDialog((i+1)+".Reise: "+"Geben Sie das Reiseziel biite ein: ");
			int dauer=Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Reise: "+"Geben Sie die Reisedauer ein: "));
			double preis=Double.parseDouble(JOptionPane.showInputDialog((i+1)+".Reise: "+"Geben Sie den Preis ein:  "));
			String veranstalter=JOptionPane.showInputDialog("Geben Sie der Veranstalter ein: ");
			announce[i]=new ReiseX(startflughafen, reiseziel, dauer);
			announce[i].setPreis(preis);
			announce[i].setVeranstalter(veranstalter);
		}
		/*for(int i=0;i<announce.length;i++) {
			JOptionPane.showMessageDialog(null,announce[i].toString(),(i+1)+".Reise",JOptionPane.INFORMATION_MESSAGE);
			if(announce[i].istKurzurlaub()) {
				JOptionPane.showMessageDialog(null, "ist kurze Urlaub!");
				
			}
			else {
				JOptionPane.showMessageDialog(null,"lange Urlaub");
			}
		}*/
		for(int i=0;i<announce.length;i++) {
			String ausgabe="";
			if(announce[i].istKurzurlaub()) {
				ausgabe+="Kurzurlaub: "+announce[i].getReisedauer()+" Tage ";
				
			}
			else {
				System.out.println("Reisedauer: "+announce[i].getReisedauer());
				System.out.println("Veanstalter"+announce[i].getVeranstalter());
				ausgabe+=announce[i].getReisedauer()+" Tage ";
			}
			ausgabe+=announce[i].getReiseziel();
			ausgabe+=" ab "+announce[i].getStartflughafen();
			ausgabe+=" fuer "+announce[i].getPreis()+" Euro";
			ausgabe+=" von "+announce[i].getVeranstalter();
			JOptionPane.showMessageDialog(null, ausgabe,(i+1)+".Reise",JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
