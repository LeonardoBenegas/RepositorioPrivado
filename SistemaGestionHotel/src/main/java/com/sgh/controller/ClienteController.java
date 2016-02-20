package com.sgh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sgh.model.Persona;
import com.sgh.model.Cliente;
import com.sgh.service.ClienteService;

@Controller
public class ClienteController {
	
	private ClienteService clienteService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Cliente cliente = new Cliente();
		
		map.put("cliente", cliente);
		map.put("clienteLista", clienteService.getAllClientes());
		
		return "cliente";
	}
	
	@RequestMapping(value="/cliente.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Cliente cliente, BindingResult result, 
						  @RequestParam String action, Map<String, Object> map){
		
		
		Cliente clienteResult = new Cliente();
		
		switch (action.toLowerCase()){
		
		case "add":
			clienteService.add(cliente);
			clienteResult = cliente;
			break;
		case "edit":
			clienteService.edit(cliente);
			clienteResult = cliente;
			break;
		case "delete":
			clienteService.delete(cliente.getIdpersona() );//ACA HAY QUE MANIPULAR LOS DATOS CON HERENCIA Y HIBERNATE
			clienteResult = new Cliente();
			break;			
		case "search":
			Cliente searchedCliente = clienteService.getClientes(cliente.getIdpersona());
			clienteResult = searchedCliente != null ? searchedCliente : new Cliente();
			break;
		}
		
		map.put("cliente", clienteResult);
		map.put("clienteList", clienteService.getAllClientes());
		return "cliente";
		
	}

}
