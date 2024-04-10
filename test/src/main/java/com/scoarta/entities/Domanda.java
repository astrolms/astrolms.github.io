package com.scoarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "domande")
public class Domanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String testoDomanda;
	private String rispostaEsatta;

	private int punteggioDomanda;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTestoDomanda() {
		return testoDomanda;
	}

	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}

	public int getPunteggioDomanda() {
		return punteggioDomanda;
	}

	public void setPunteggioDomanda(int punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}

}
