package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Typedb;
import com.example.demo.repository.TypedbRepository;

@Service
public class ITypedbImplement implements ITypedbService{

	@Autowired
	private TypedbRepository objetoRepository;
	
	@Override
	public List<Typedb> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Typedb>) objetoRepository.findAll();
	}

	@Override
	public void guardar(Typedb objeto) {
		// TODO Auto-generated method stub
		objetoRepository.save(objeto);
	}

	@Override
	public Typedb buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return objetoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		objetoRepository.deleteById(id);
		
	}

}

