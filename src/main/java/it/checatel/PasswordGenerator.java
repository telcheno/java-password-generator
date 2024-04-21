package it.checatel;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Caio Password!");
		
		System.out.println("Verra generata una password");
		//uso "Scanner" per ricevere gl'imput 
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Inserisci il tuo nome");
		//dichiaro la variabile come "string" e assegno il valore di "scan"
		String nome = scan.nextLine();
		
		System.out.println("Inserisci il tuo cognome");	
		//dichiaro la variabile come "string" e assegno il valore di "scan"
		String cognome = scan.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");	
		//dichiaro la variabile come "string" e assegno il valore di "scan"
		String colorePreferito = scan.nextLine();
		
		//dichiaro la variabile come "int" e assegno il valore di "scan"
		System.out.println("Inserisci il tuo giorno di nascita");	
		int giorno = scan.nextInt();
		System.out.println("Inserisci il tuo mese di nascita");	
		int mese = scan.nextInt();
		System.out.println("Inserisci il tuo anno di nascita");	
		int anno = scan.nextInt();
		
		//dichiaro la variabile e assegno i valori degl'imput ricebutti da "scan"
		String passwordGenerata = nome + "-" + cognome + "-" + colorePreferito + (giorno + mese + anno);
		
		//stampo "passwordGenerata"
		System.out.println("La tua password è " + passwordGenerata);
		
		
	}

}
