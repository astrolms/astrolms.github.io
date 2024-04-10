package com.scoarta.entities;

import java.util.Set;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	private String cognome;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	@Size(min = 8, max = 12)
	private String password;

	@Column(nullable = true)
	private int punteggio;

	@ManyToMany
	private Set<Test> testi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggtio) {
		this.punteggio = punteggtio;
	}

	public Set<Test> getTesti() {
		return testi;
	}

	public void setTesti(Set<Test> testi) {
		this.testi = testi;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password="
				+ password + ", punteggio=" + punteggio + ", testi=" + testi + "]";
	}

	public Utente(String email, @Size(min = 8, max = 12) String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Utente() {
		super();
	}

	public Utente(int id, String nome, String cognome, String email, @Size(min = 8, max = 12) String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}

	public Utente(int id, String nome, String cognome, String email, @Size(min = 8, max = 12) String password,
			int punteggio, Set<Test> testi) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.punteggio = punteggio;
		this.testi = testi;
	}

	
	

}
