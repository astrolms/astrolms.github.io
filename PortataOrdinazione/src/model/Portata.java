package model;

public class Portata {
	
	private String descrizione;
	private double prezzo;
	private boolean isBevanda;
	
	public Portata(String descrizione, double prezzo, boolean isBevanda) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.isBevanda = isBevanda;
	}
	
	public Portata() {
		super();
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public boolean isBevanda() {
		return isBevanda;
	}
	
	@Override
	public String toString() {
		return descrizione;
	}

}
