package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Reporte;
import com.example.demo.models.Typedb;
import com.example.demo.repository.ReporteRepository;
import com.example.demo.repository.TypedbRepository;

@Service
public class IReporteImplement implements IReporteService{

	@Autowired
	private ReporteRepository objetoRepository;
	
	@Override
	public List<Reporte> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Reporte>) objetoRepository.findAll();
	}

	@Override
	public void guardar(Reporte objeto) {
		// TODO Auto-generated method stub
		objetoRepository.save(objeto);
	}

	@Override
	public Reporte buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return objetoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		objetoRepository.deleteById(id);
		
	}

}