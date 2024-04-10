package com.scoarta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scoarta.entities.Domanda;

@Repository
public interface DomandaRepo extends JpaRepository<Domanda, Integer> {

}
