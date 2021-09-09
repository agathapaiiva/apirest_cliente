package com.utfpr.cliente.apirest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utfpr.cliente.apirest.models.Cliente;
import com.utfpr.cliente.apirest.repository.ClienteRepository;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author Agatha Paiva
 *
 */

@RestController
@RequestMapping(value = "/api")
 @CrossOrigin(value = "*")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	@ApiOperation(value = "Retorna uma lista de clientes")
	public List<Cliente> listaCliente(){
		return clienteRepository.findAll();
		
	}
	
	@GetMapping("/cliente/{id}")
	@ApiOperation(value = "Retorna um cliente pelo ID")
	public Cliente listaUnicoCliente(@PathVariable(value = "id") long id){
		return clienteRepository.findByid(id);
		
	}
	
	@PostMapping("/cliente")
	@ApiOperation(value = "Salva um cliente")
	public Cliente salvaCliente(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
		
	@DeleteMapping("/cliente/{id}")
	@ApiOperation(value = "Deleta um cliente")
	public void deletaUmCliente(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@PutMapping("/cliente")
	@ApiOperation(value = "Atualiza um cliente")
	public Cliente atualizaUmCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
