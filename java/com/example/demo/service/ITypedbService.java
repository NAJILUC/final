package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Typedb;


public interface ITypedbService {

	public List<Typedb> listarTodos();
	 public void guardar(Typedb objeto);
	 public Typedb buscarPorId(Long id);
	 public void eliminar(Long id);
}