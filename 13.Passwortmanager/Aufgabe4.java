package uebung4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Aufgabe4 {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			String websiteEingabe = JOptionPane.showInputDialog("Geben Sie die website ein: ");
			int passLenght = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Passwortlänge ein: "));
			String generatedPasswort = generatePasswort(passLenght);
			FileWriter fw = new FileWriter("passwords.txt");
			bw =new BufferedWriter(fw);
			bw.write(websiteEingabe+" = "+generatedPasswort);
			bw.flush();
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	private static String generatePasswort(int passLenght) {
		String erlaubteZeichen="qwertzuiopasdfghjklyxcvbnm";
		String zahlen="123456789";
		String alleErlaubte =erlaubteZeichen.toUpperCase()+erlaubteZeichen+zahlen;
		Random rand = new Random();
		String generatedPass="";
		for(int i=0;i<passLenght;i++) {
			generatedPass+=alleErlaubte.charAt(rand.nextInt(alleErlaubte.length()));
		}
		return generatedPass;
	}

}
