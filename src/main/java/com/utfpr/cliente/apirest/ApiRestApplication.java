package com.utfpr.cliente.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.utfpr.cliente.apirest.service.ServiceCidade;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {	
		ApplicationContext applicationContext = SpringApplication.run(ApiRestApplication.class, args);
		ServiceCidade service = applicationContext.getBean(ServiceCidade.class);
		service.getCidades();
	}

}
