package com.scoarta.repos;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scoarta.entities.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer>{
	
	Utente findByEmail(String email);
	
	
	@Query("select u.nome, u.cognome, u.punteggio from Utente u order by u.punteggio desc limit 10")
	List<String> findOrderByPunteggio();

}
