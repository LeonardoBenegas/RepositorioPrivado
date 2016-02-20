package com.sgh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgh.dao.ClienteDAO;
import com.sgh.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDAO clienteDAO;

	@Transactional
	public void add(Cliente cliente) {
		
		clienteDAO.add(cliente);
	}

	@Transactional
	public void edit(Cliente cliente) {
		clienteDAO.edit(cliente);
		
	}

	@Transactional
	public void delete(int idpersona) {
		clienteDAO.delete(idpersona);
	}

	@Transactional
	public Cliente getClientes(int idpersona) {
		
		return clienteDAO.getClientes(idpersona);
	}

	@Transactional
	public List getAllClientes() {
		
		return clienteDAO.getAllClientes();
	}

}
