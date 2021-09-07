package com.utfpr.cliente.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utfpr.cliente.apirest.models.Cliente;

/**
 * 
 * @author Agatha Paiva
 *
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findByid(long id);
}
