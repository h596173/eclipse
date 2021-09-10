package Oppgaver;
import javax.swing.*;
public class Trinnskatt {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Skriv inn bruttointekt:");
		
		double brutto = Integer.parseInt(input);
		double sats;
		  
		if(brutto<184800){
			sats = brutto * 0;
			JOptionPane.showMessageDialog(null,"Din trinnskatt er:" + sats );
		}
		if(brutto>184800){
			sats = brutto * 0.017;
			JOptionPane.showMessageDialog(null,"Din trinnskatt er:" + sats );
		}
		else if(brutto>260100){
			sats = brutto * 0.04;
			JOptionPane.showMessageDialog(null,"Din trinnskatt er:" + sats );
			}
		else if(brutto>651250){
			sats = brutto * 0.132;
			JOptionPane.showMessageDialog(null,"Din trinnskatt er:" + sats );
		}	
		else if(brutto>1021550){
			sats = brutto * 0.162;
			JOptionPane.showMessageDialog(null,"Din trinnskatt er:" + sats );
		}
	}


}
