package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Token;
import com.example.demo.models.Typedb;



public interface TokenRepository extends CrudRepository<Token, Long> {


}