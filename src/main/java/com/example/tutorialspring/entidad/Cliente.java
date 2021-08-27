package com.example.tutorialspring.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclientes;
	public Long getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(Long idclientes) {
		this.idclientes = idclientes;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getApellidocliente() {
		return apellidocliente;
	}
	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}
	private String nombrecliente;
	private String apellidocliente;

}
