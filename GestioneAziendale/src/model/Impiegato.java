package model;

public class Impiegato {
	
	private String nome, cognome, id;
	private int annoNascita, stipendio;
	
	public Impiegato(String nome, String cognome, String id, int annoNascita, int stipendio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.annoNascita = annoNascita;
		this.stipendio = stipendio;
	}	

	public Impiegato() {
		super();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId() {
		this.id = Segreteria.creaID(this.nome, this.cognome, this.annoNascita);
	}
	
	public int getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Impiegato: nome=" + nome + ", cognome=" + cognome + ", id=" + id + ", annoNascita=" + annoNascita
				+ ", stipendio=" + stipendio + "\n";
	}
}
