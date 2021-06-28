package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Typedb;
import com.example.demo.models.User;


public interface IUserService {

	public List<User> listarTodos();
	 public void guardar(User objeto);
	 public User buscarPorId(Long id);
	 public void eliminar(Long id);
}