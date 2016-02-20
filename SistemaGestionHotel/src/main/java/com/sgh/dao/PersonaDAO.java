package com.sgh.dao;

import java.util.List;

import com.sgh.model.Persona;

public interface PersonaDAO {
	
	public void add(Persona persona);
	public void edit(Persona persona);
	public void delete(int idpersona);
	public Persona getPersona(int idpersona);
	public List getAllPersona();

}
