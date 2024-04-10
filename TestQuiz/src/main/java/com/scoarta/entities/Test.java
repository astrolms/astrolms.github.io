package com.scoarta.entities;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "testi")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date dataTest;

	private String titoloTest;
	
	
	@ManyToMany(mappedBy = "testi")
	@JsonBackReference
	private Set<Utente> utenti;

	@ManyToMany
	 @JoinTable(name = "testodomanda",
     joinColumns = @JoinColumn(name = "test_id"),
     inverseJoinColumns = @JoinColumn(name = "domanda_id"))
	private Set<Domanda> domande;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataTest() {
		return dataTest;
	}

	public void setDataTest(Date dataTest) {
		this.dataTest = dataTest;
	}

	public String getTitoloTest() {
		return titoloTest;
	}

	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}

	public Set<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Set<Utente> utenti) {
		this.utenti = utenti;
	}

	public Set<Domanda> getDomande() {
		return domande;
	}

	public void setDomande(Set<Domanda> domande) {
		this.domande = domande;
	}

	



}
