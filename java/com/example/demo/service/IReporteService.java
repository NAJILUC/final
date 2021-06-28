package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Reporte;


public interface IReporteService {

	public List<Reporte> listarTodos();
	 public void guardar(Reporte objeto);
	 public Reporte buscarPorId(Long id);
	 public void eliminar(Long id);
}