package com.sgh.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable{
	
	@Id @GeneratedValue(generator = "claveProvisoria")//name of the primary key generator
	@GenericGenerator(name = "claveProvisoria", strategy = "foreign", parameters = {@Parameter(value = "persona", name = "property")})
	private int idpersona;
	
	@Column
	private String codigo_cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idpersona")
	private Persona persona;
	
	public Cliente(){}
	
	public Cliente(int idpersona, String codigo_cliente) {
		super();
		this.idpersona = idpersona;
		this.codigo_cliente = codigo_cliente;
	}



	public int getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}	
	
	
	
	public String getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(String codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	
		
	
}
