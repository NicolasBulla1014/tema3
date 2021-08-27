package com.example.tutorialspring.conrolador;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorialspring.dao.ClienteDao;
import com.example.tutorialspring.dao.TrabajadorDao;
import com.example.tutorialspring.entidad.Cliente;
import com.example.tutorialspring.entidad.Trabajador;

@RestController
public class Controlador {
	
	@Autowired
	private TrabajadorDao trabajadorDao;
	@Autowired
	private ClienteDao clienteDao;
	
	@GetMapping("/hola")
	public String hola() {
		return "Hola desde SpringBoot";
	}
	

	//Metodo para Traer todos los registros de la tabla TRABAJADORES
	@GetMapping("/trabajadores")
	public Iterable<Trabajador> getTrabajadores(){
		return trabajadorDao.findAll();
	}
	
	
	//Metodo para traer un trabajador por ID 
	@GetMapping(value = "/{id}")
	 public Optional<Trabajador> getTrabajadorId(@PathVariable Integer id){
		 
		Optional<Trabajador> trabajador = trabajadorDao.findById(id);
		
		if(null == trabajador) {
			throw new RuntimeException("User id not found -"+ id);
		}
		return trabajador;
		 
	 }
	
	//Metodo para insertar Trabajadores a la Base de datos
	@PostMapping("/add/{id}")
	public Trabajador createTrabajador( @PathVariable("id") Integer id ,@RequestBody Trabajador trabajador) {
		trabajador.setIdtrabajador(id);
		 trabajadorDao.save(trabajador);
		 return trabajador;
	}
	
	//Metodo para Actualizar un Registro IDENTIFICANDO EL ID 
	@PutMapping("{id}")
	public Trabajador updateTrabajador( @PathVariable("id") Integer id , @RequestBody Trabajador trabajador) {	
		trabajador.setIdtrabajador(id);			
		return trabajadorDao.save(trabajador); 
		
	}
	
	//Metodo para Eliminar un registro de la base de datos
	
	@DeleteMapping("{id}")
	public String deleteTrabajador(@PathVariable Integer id) {
		Optional<Trabajador> trabajador = trabajadorDao.findById(id);
		if(trabajador == null) {
			throw new RuntimeException("User id not found -"+id);
		}
		trabajadorDao.deleteById(id);
		return "Se elimino el usuario con el ID" + id;
	}
	
	
		
}
