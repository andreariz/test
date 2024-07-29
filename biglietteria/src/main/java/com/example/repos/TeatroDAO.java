package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Replica;
import com.example.entities.Spettacolo;
import com.example.entities.Teatro;

public interface TeatroDAO extends JpaRepository<Teatro, Integer> {

}
