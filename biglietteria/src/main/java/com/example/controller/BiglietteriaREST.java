package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Replica;
import com.example.entities.Spettacolo;
import com.example.entities.Teatro;
import com.example.service.BiglietteriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class BiglietteriaREST {

	@Autowired 
	private BiglietteriaService service;
	
	@GetMapping("repliche")
	public ResponseEntity<List<Replica>> repliche() {
		
		return new ResponseEntity<>(service.getRepliche(), HttpStatus.OK);
	}
	
	@GetMapping("spettacoli")
	public ResponseEntity<List<Spettacolo>> spettacoli() {
		
		return new ResponseEntity<>(service.getSpettacoli(), HttpStatus.OK);
	}
	
	@GetMapping("teatri")
	public ResponseEntity<List<Teatro>> tetri() {
		
		return new ResponseEntity<>(service.getTeatri(), HttpStatus.OK);
	}
	
	
	
	//post
	@PostMapping("repliche")
	public ResponseEntity<Replica> addRepliche(@RequestBody Replica r) {
		
		return new ResponseEntity<>(service.addReplica(r), HttpStatus.CREATED);
	}
	
	@PostMapping("spettacoli")
	public ResponseEntity<Spettacolo> addSpettacoli(@RequestBody Spettacolo s) {
		
		return new ResponseEntity<>(service.addSpettacolo(s), HttpStatus.CREATED);
	}
	
	@PostMapping("teatri")
	public ResponseEntity<Teatro> addTetri(@RequestBody Teatro t) {
		
		return new ResponseEntity<>(service.addTeatro(t), HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
	
	
}
