package com.scoarta.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoarta.entities.Test;
import com.scoarta.entities.Utente;
import com.scoarta.repos.TestRepo;
import com.scoarta.repos.UtenteRepo;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private UtenteRepo utenteRepo;
	
	@Autowired
	private TestRepo testRepo;

	@Override
	public List<Utente> getAll() {

		return utenteRepo.findAll();
	}

	@Override
	public void addUtente(Utente u) {

		utenteRepo.save(u);
	}

	@Override
	public Utente getByEmail(String email) {

		return utenteRepo.findByEmail(email);
	}

	@Override
	public void updateUtente(Utente u) {

		utenteRepo.save(u);

	}


	@Override
	public List<Test> getAllTest() {
		return testRepo.findAll();
	}

	@Override
	public List<String> getByPunteggio() {
		return utenteRepo.findOrderByPunteggio();
	}

}
