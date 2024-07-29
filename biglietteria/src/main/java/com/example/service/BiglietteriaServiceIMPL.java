package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Replica;
import com.example.entities.Spettacolo;
import com.example.entities.Teatro;
import com.example.repos.ReplicaDAO;
import com.example.repos.SpettacoloDAO;
import com.example.repos.TeatroDAO;

@Service
public class BiglietteriaServiceIMPL implements BiglietteriaService {

	
	@Autowired
	private ReplicaDAO rDAO;
	

	@Autowired
	private SpettacoloDAO sDAO;
	

	@Autowired
	private TeatroDAO tDAO;
	
	
	@Override
	public List<Teatro> getTeatri() {
		// TODO Auto-generated method stub
		return tDAO.findAll();
	}

	@Override
	public List<Spettacolo> getSpettacoli() {
		// TODO Auto-generated method stub
		return sDAO.findAll();
	}

	@Override
	public List<Replica> getRepliche() {
		// TODO Auto-generated method stub
		return rDAO.findAll();
	}

	@Override
	public Teatro addTeatro(Teatro t) {
		// TODO Auto-generated method stub
		return tDAO.save(t);
	}

	@Override
	public Spettacolo addSpettacolo(Spettacolo s) {
		// TODO Auto-generated method stub
		return sDAO.save(s);
	}

	@Override
	public Replica addReplica(Replica r) {
		// TODO Auto-generated method stub
		return rDAO.save(r);
	}

}
