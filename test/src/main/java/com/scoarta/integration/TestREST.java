package com.scoarta.integration;

import java.util.List;
import java.util.Set;

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

import com.scoarta.entities.Test;
import com.scoarta.entities.Utente;
import com.scoarta.services.TestService;

@RestController
@RequestMapping("api")
public class TestREST {
	
	@Autowired
	private TestService service;
	
	@GetMapping("utenti")
	@CrossOrigin
	public ResponseEntity<List<Utente>> getAll(){
		List<Utente> utenti = service.getAll();
		if(utenti.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(utenti, HttpStatus.OK);
	}
	
	@GetMapping("test")
	@CrossOrigin
	public ResponseEntity<List<Test>> getAllTest(){
		List<Test> test = service.getAllTest();
		if(test.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(test, HttpStatus.OK);
	}
	
	@GetMapping("utenti/email/{email}")
	@CrossOrigin
	public Utente getByEmail(@PathVariable String email){
		return service.getByEmail(email);
	}
	
	@GetMapping("punteggio")
	@CrossOrigin
	public List<String> getByPunteggio(){
		return service.getByPunteggio();
	}
	
	@PostMapping("utenti/add")
	@CrossOrigin
	public void addUtente(@RequestBody Utente u){
		service.addUtente(u);
		
	}
	
	

}
