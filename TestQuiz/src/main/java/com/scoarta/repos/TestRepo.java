package com.scoarta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scoarta.entities.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {

}
