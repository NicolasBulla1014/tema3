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
@Table(name = "trabajador")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "idtrabajador")
	private Integer idtrabajador;
	//@Column(name = "nombreTrabajador")
		private String nombretrabajador;
		//@Column(name = "apellidoTrabajador")
		private String apellidotrabajador;
		//@Column(name = "telefonoTrabajador")
		private String telefonotrabajador;
		//@Column(name = "emailTrabajador")
		private String emailtrabajador;
		
		//Getters y Setters
		public Integer getIdtrabajador() {
			return idtrabajador;
		}
		public void setIdtrabajador(Integer idtrabajador) {
			this.idtrabajador = idtrabajador;
		}
		public String getNombretrabajador() {
			return nombretrabajador;
		}
		public void setNombretrabajador(String nombretrabajador) {
			this.nombretrabajador = nombretrabajador;
		}
		public String getApellidotrabajador() {
			return apellidotrabajador;
		}
		public void setApellidotrabajador(String apellidotrabajador) {
			this.apellidotrabajador = apellidotrabajador;
		}
		public String getTelefonotrabajador() {
			return telefonotrabajador;
		}
		public void setTelefonotrabajador(String telefonotrabajador) {
			this.telefonotrabajador = telefonotrabajador;
		}
		public String getEmailtrabajador() {
			return emailtrabajador;
		}
		public void setEmailtrabajador(String emailtrabajador) {
			this.emailtrabajador = emailtrabajador;
		}
		
		//Getters y Setters
		
	
	
	
	
	
	
	
	
	

}
