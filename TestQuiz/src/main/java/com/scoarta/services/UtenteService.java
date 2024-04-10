package com.scoarta.services;

import java.util.List;

import com.scoarta.entities.Utente;

public interface UtenteService {
	
	List<Utente> getAll();

	void addUtente(Utente u);

	void updateUtente(Utente u);

	Utente getByEmail(String email);
	
	Utente getByPunteggio(int punteggio);

}
