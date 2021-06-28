package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Token;
import com.example.demo.repository.TokenRepository;

@Service
public class ITokenImplement implements ITokenService{

	@Autowired
	private TokenRepository objetoRepository;
	
	@Override
	public List<Token> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Token>) objetoRepository.findAll();
	}

	@Override
	public void guardar(Token objeto) {
		// TODO Auto-generated method stub
		objetoRepository.save(objeto);
	}

	@Override
	public Token buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return objetoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		objetoRepository.deleteById(id);
		
	}

}

