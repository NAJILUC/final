package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Typedb;


public interface TypedbRepository extends CrudRepository<Typedb, Long> {


}