package com.scoarta.services;

import java.util.List;
import java.util.Set;

import com.scoarta.entities.Test;
import com.scoarta.entities.Utente;

public interface TestService {
	
	List<Utente> getAll();

	void addUtente(Utente u);

	void updateUtente(Utente u);

	Utente getByEmail(String email);
	
	List<String> getByPunteggio();
	
	List<Test> getAllTest();

}
