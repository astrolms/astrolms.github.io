package com.scoarta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoarta.entities.Utente;
import com.scoarta.repos.UtenteRepo;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private UtenteRepo repo;

	@Override
	public List<Utente> getAll() {

		return repo.findAll();
	}

	@Override
	public void addUtente(Utente u) {

		repo.save(u);
	}

	@Override
	public Utente getByEmail(String email) {

		return repo.findByEmail(email);
	}

	@Override
	public void updateUtente(Utente u) {

		repo.save(u);

	}

	@Override
	public Utente getByPunteggio(int punteggio) {
		return repo.findByPunteggio(punteggio);
	}

}
