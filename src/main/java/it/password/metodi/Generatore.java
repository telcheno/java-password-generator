package it.password.metodi;

public class Generatore {
	//creo le variabile per generare la pasword
	String nome;
	String cognome;
	String colorePreferito;
	int giorno;
	int mese;
	int anno;
	
	//creo il metodo per generare la parte del testo della pasword
	String testoPassword() {
		String testo = nome + "-" + cognome + "-" + colorePreferito + "-";
		return testo;
	}
	
	//creo il metodo per generare la parte numerica della pasword
	int numeriPassword() {
		int numeri = giorno + mese + anno;
		return numeri;
	}
	
	//genero la pasword con i valori dei metodi
//	String paswordGenerata = testo + numeri;
	
}