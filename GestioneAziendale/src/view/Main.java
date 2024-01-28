package view;

import java.util.Scanner;

import model.Azienda;
import model.Impiegato;

public class Main {
	private static void inputImpiegati(int nr, Azienda az) {
		int nrImpiegati=0;
		int annoNascita=0;
		int stipendio=0;
		for (int j = 0; j < nr; j++) {
			Scanner inputI = new Scanner(System.in); 
			Impiegato imp = new Impiegato();		
			
			System.out.println("Inserica il nome del impiegato " + (j+1) + ": ");
			imp.setNome(inputI.nextLine());;

			System.out.println("Inserica il cognome del impiegato " + (j+1) + ": ");
			imp.setCognome(inputI.nextLine());			
	
			while(true) {
				try {
					System.out.println("Inserica l'anno di nascita del impiegato " + (j+1) + ": ");
					annoNascita = Integer.parseInt(inputI.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Errore! Qualcosa e andata storto! Riprova!");
				}
			}
			imp.setAnnoNascita(annoNascita);
			imp.setId();

			while(true) {
				try {	
					System.out.println("Inserica lo stipendio del impiegato " + (j+1) + ": ");
					stipendio = Integer.parseInt(inputI.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Errore! Qualcosa e andata storto! Riprova!");
				}
			}

			imp.setStipendio(stipendio);
			
			az.addImpiegato(imp);	
			if(j == nrImpiegati - 1) inputI.close();
		}
	}
	public static void main(String[] args) {
		Azienda az = new Azienda();
		Scanner input = new Scanner(System.in); 
		boolean s;
		
		while(true) {
			int nrImpiegati = 0;
		
			System.out.println("Quanti impiegati vuole inserire:");
			nrImpiegati = input.nextInt();
			inputImpiegati(nrImpiegati,az);
			System.out.println("Vuole aggiungere altri impiegati? true/false");
			s = input.nextBoolean();
			if(s == false) break;
		}
		
		az.mostraImpiegati();
		System.out.println("Lo stipendio totale e: " + az.stipendioTot());
		input.close();
	}
}
