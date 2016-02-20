package com.sgh.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Trabajador extends Persona{
	
	@Column
	private Double sueldo;
	@Column
	private String acceso;
	@Column
	private String login;
	@Column
	private String password;
	@Column
	private String estado;
	
	public Trabajador(){}
	
	public Trabajador(Double sueldo, String acceso, String login, String password, String estado) {
		super();
		this.sueldo = sueldo;
		this.acceso = acceso;
		this.login = login;
		this.password = password;
		this.estado = estado;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
