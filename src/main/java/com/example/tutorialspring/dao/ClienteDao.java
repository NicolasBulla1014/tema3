package com.example.tutorialspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.tutorialspring.entidad.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
