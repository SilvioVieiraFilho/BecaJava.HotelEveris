package br.app.HotelEveris.Service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.app.HotelEveris.request.ComidadeRequestDoInserir;
import br.app.HotelEveris.request.ComodidadeRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.service.ComodidadeService;

@SpringBootTest
public class ComodidadeTest {

	@Autowired
	private ComodidadeService service;

	@Test
	void inserir() {
		ComidadeRequestDoInserir request = new ComidadeRequestDoInserir();
		request.setNome("Piscina");

		BaseResponse response = service.inserir(request);

		Assertions.assertEquals(201, response.statusCode);
		Assertions.assertEquals("Comodidade feito", response.message);
	}

	@Test
	void inserirSemNome() {
		ComidadeRequestDoInserir request = new ComidadeRequestDoInserir();
		 request.setNome("");

		BaseResponse response = service.inserir(request);

		Assertions.assertEquals(400, response.statusCode);
		Assertions.assertEquals("A comodidade não pode ser vazia", response.message);
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}