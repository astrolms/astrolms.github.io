package model;

public class Prodotto {
	
	private String descrizione;
	private double prezzo;
	boolean isInPromozione;
	
	public Prodotto(String descrizione, double prezzo, boolean isInPromozione) {
		super();
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.isInPromozione = isInPromozione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public boolean isInPromozione() {
		return this.isInPromozione;
	}

	@Override
	public String toString() {
		return this.descrizione;
	}	
	
	

}
