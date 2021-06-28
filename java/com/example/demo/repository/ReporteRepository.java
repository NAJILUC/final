package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Reporte;
import com.example.demo.models.Typedb;


public interface ReporteRepository extends CrudRepository<Reporte, Long> {


}