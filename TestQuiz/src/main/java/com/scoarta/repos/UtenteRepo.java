package com.scoarta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scoarta.entities.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer>{
	
	Utente findByEmail(String email);
	Utente findByPunteggio(int punteggio);

}
