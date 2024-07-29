package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Replica;

public interface ReplicaDAO extends JpaRepository<Replica, Integer> {

}
