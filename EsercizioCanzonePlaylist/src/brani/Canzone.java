package brani;

public class Canzone {
	public String titolo;
	public int durata;
	public String autore;
	
	//Costruttore
	public Canzone(String titolo, int durata, String autore) {
		this.titolo = titolo;
		this.durata = durata;
		this.autore = autore;	
	}
	
	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", durata=" + durata + ", autore=" + autore + "]";
	}
	
	public boolean haAutore (String c) {
		if (this.autore == c) 
			return true;
		else return false;	
	}
	
	public boolean uguali(Canzone s) {
		if (this.titolo == s.titolo  &&  this.durata == s.durata)
			return true;
		else return false;
	}
}