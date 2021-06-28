package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Token;



public interface ITokenService {

	public List<Token> listarTodos();
	 public void guardar(Token objeto);
	 public Token buscarPorId(Long id);
	 public void eliminar(Long id);
}