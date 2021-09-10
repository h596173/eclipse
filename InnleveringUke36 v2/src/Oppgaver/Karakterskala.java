package Oppgaver;
import javax.swing.*;

public class Karakterskala {

	public static void main(String[] args) {
		int i;
        int poeng; 
        
        for(i=0; i<10; i++) { 
              
        		while(true) {
        			String poengInput = JOptionPane.showInputDialog("Skriv inn poeng:");
        			poeng = Integer.parseInt(poengInput);
        			
        				if (poeng >=0 && poeng <=100) {
        					break;
        				}
        				else {
        					JOptionPane.showMessageDialog(null,"*FEILMELDING*" + "\n" + "Du må bruke positive tall mellom 0 og 100");
        				}
        		
        		}   
        		
        if(poeng<=39)
        	
        {
            System.out.print("Studenten fikk karakter F" + "\n");
        }
        else if(poeng<=49)
        {
           System.out.print("Studenten fikk karakter E" + "\n");
        } 
        else if(poeng<=59)
        {
            System.out.print("Studenten fikk karakter D" + "\n");
        }
        else if(poeng<=79)
        {
            System.out.print("Studenten fikk karakter C" + "\n");
        }
        else if(poeng<=89)
        {
            System.out.print("Studenten fikk karakter B" + "\n");
        }
        else if(poeng<=100)
        {
            System.out.print("Studenten fikk karakter A" + "\n");
        }
        
    }
}
}
