package com.scoarta.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scoarta.entities.Utente;
import com.scoarta.services.UtenteService;

@RestController
@RequestMapping("api")
public class UtenteREST {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping("utenti")
	@CrossOrigin
	public ResponseEntity<List<Utente>> getAll(){
		List<Utente> utenti = service.getAll();
		if(utenti.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(utenti, HttpStatus.OK);
	}
	
	@GetMapping("utenti/email/{email}")
	@CrossOrigin
	public Utente getByEmail(@PathVariable String email){
		return service.getByEmail(email);
	}
	
	@GetMapping("utenti/punteggio/{punteggio}")
	@CrossOrigin
	public ResponseEntity<Utente> getByPunteggio(@PathVariable int punteggio){
		Utente u = service.getByPunteggio(punteggio);
		return new ResponseEntity<>(u,HttpStatus.OK);
	}
	
	@PostMapping("utenti/add")
	@CrossOrigin
	public void addUtente(@RequestBody Utente u){
		service.addUtente(u);
		
	}
	
	

}
