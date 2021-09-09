package com.utfpr.cliente.apirest.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author agatha paiva
 *
 */

@Service
public class ServiceCidade {
	
	private final String url = "http://maventest.herokuapp.com/mavenTest-1.0-SNAPSHOT/webresources/cidade";
	private RestTemplate restTemplate = new RestTemplate();
	private Object responseCidade;
	
	public ServiceCidade(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public Object getCidades() {
		responseCidade =  this.restTemplate.getForObject(url, List.class);
		System.out.println(responseCidade.toString());
		return responseCidade;
	}
	
}
