package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Typedb;
import com.example.demo.models.User;
import com.example.demo.repository.TypedbRepository;
import com.example.demo.repository.UserRepository;

@Service
public class IUserImplement implements IUserService{

	@Autowired
	private UserRepository objetoRepository;
	
	@Override
	public List<User> listarTodos() {
		// TODO Auto-generated method stub
		return (List<User>) objetoRepository.findAll();
	}

	@Override
	public void guardar(User objeto) {
		// TODO Auto-generated method stub
		objetoRepository.save(objeto);
	}

	@Override
	public User buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return objetoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		objetoRepository.deleteById(id);
		
	}

}

