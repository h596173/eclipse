package Oppgaver;

import java.util.Scanner;

public class Fakultet {

	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Skriv inn et nr:");
	      
	      int num = scanner.nextInt();
	      int fak = fakultet(num);
	      
	      System.out.println("Fakultetet av tallet er:" + fak);
	      scanner.close();
	   }
	   static int fakultet(int n)
	   {
	       int skriv;
	       if(n==1){
	         return 1;
	       }
	       skriv = fakultet(n-1)* n;
	       return skriv;
	   }
	}