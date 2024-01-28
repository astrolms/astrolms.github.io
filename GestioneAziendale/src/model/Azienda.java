package model;

import java.util.ArrayList;

public class Azienda {
	
	ArrayList<Impiegato> impiegati = new ArrayList<Impiegato>();
	
	public void addImpiegato(Impiegato i) {
		this.impiegati.add(i);
	}
	
	public void deleteImpiegato(Impiegato i) {
		this.impiegati.remove(i);
	}
	
	public ArrayList<Impiegato> getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(ArrayList<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}

	public int stipendioTot() {
		int st = 0;
			
		for (Impiegato impiegato : impiegati) {
			st += impiegato.getStipendio();
		}
		return st;
	}

	public Azienda(ArrayList<Impiegato> impiegati) {
		super();
		this.impiegati = impiegati;
	}

	public Azienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public  void mostraImpiegati() {
			System.out.println(impiegati.toString());
	}
}
