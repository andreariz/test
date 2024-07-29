package com.example.service;

import java.util.List;

import com.example.entities.Replica;
import com.example.entities.Spettacolo;
import com.example.entities.Teatro;

public interface BiglietteriaService {

	List<Teatro> getTeatri();
	List<Spettacolo> getSpettacoli();
	List<Replica> getRepliche();
	
	Teatro addTeatro(Teatro t);
	Spettacolo addSpettacolo(Spettacolo s);
	Replica addReplica(Replica r);
	
	
	
	
	
}
