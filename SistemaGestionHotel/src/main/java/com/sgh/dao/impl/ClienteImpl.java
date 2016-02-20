package com.sgh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sgh.model.Cliente;
import com.sgh.dao.ClienteDAO;
import com.sgh.model.Cliente;

@Repository
public class ClienteImpl implements ClienteDAO{
	
	@Autowired
	private SessionFactory session;
	

	@Override
	public void add(Cliente cliente) {
		session.getCurrentSession().save(cliente);
	}

	@Override
	public void edit(Cliente cliente) {
		session.getCurrentSession().update(cliente);
	}

	@Override
	public void delete(int idpersona) {		
		session.getCurrentSession().delete(getClientes(idpersona));
	}

	@Override
	public Cliente getClientes(int idpersona) {
		return (Cliente)session.getCurrentSession().get(Cliente.class, idpersona);
	}

	@Override
	public List getAllClientes() {
		return session.getCurrentSession().createQuery("from cliente").list();
	}

	

}
