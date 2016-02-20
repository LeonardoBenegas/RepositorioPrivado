package com.sgh.dao;

import java.util.List;

import com.sgh.model.Cliente;

public interface ClienteDAO {
	
	public void add(Cliente cliente);
	public void edit(Cliente cliente);
	public void delete(int idpersona);
	public Cliente getClientes(int idpersona);
	public List getAllClientes();

}
