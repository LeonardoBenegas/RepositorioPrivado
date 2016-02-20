package com.sgh.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONA")
public class Persona implements Serializable{
	
	@Id
	@Column
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int idpersona;
	@Column
	private String nombre;
	@Column
	private String apaterno;
	@Column
	private String materno;
	@Column
	private String tipo_documento;
	@Column
	private String num_documento;
	@Column
	private String direccion;
	@Column
	private String telefono;
	@Column
	private String email;
	
	public Persona(){}
	
	public Persona(int idpersona, String nombre, String apaterno, String materno, String tipo_documento,
			String num_documento, String direccion, String telefono, String email) {
		super();		
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.materno = materno;
		this.tipo_documento = tipo_documento;
		this.num_documento = num_documento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
