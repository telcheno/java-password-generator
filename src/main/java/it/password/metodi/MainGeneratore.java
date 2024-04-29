package it.password.metodi;

import java.util.Scanner;

public class MainGeneratore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Verra generata la tua password");
		
		//inporto iò metodo scanner
		Scanner input = new Scanner(System.in);
		
		//richiamo il generatore
		Generatore generatore = new Generatore();
		
		//chiedo al utente i suoi datti per generare la pasword
		System.out.println("Inserisce il tuo nome!");
		//asegno il valore del input alla variabile richiamata dal metodo del generatore
		generatore.nome = input.nextLine();
//		System.out.println(generatore.nome);

		System.out.println("Inserisce il tuo cognome!");
		generatore.cognome = input.nextLine();
//		System.out.println(generatore.cognome);
		
		System.out.println("Inserisce il tuo colore preferito!");
		generatore.colorePreferito = input.nextLine();
//		System.out.println(generatore.colorePreferito);
		
		System.out.println("Inserisce il tuo giorno di nascita!");
		generatore.giorno = input.nextInt();
//		System.out.println(generatore.giorno);
		
		System.out.println("Inserisce il tuo mese di nescita!");
		generatore.mese = input.nextInt();
//		System.out.println(generatore.mese);
		
		System.out.println("Inserisce il tuo anno di nascita!");
		generatore.anno = input.nextInt();
//		System.out.println(generatore.anno);
		
		String testo = generatore.testoPassword();
		int numeri = generatore.numeriPassword();
		
		String paswworGenerata = testo + numeri;
		System.out.println("La tua  nuova password generata con i metodi java è: " + paswworGenerata);
		
	}

}
