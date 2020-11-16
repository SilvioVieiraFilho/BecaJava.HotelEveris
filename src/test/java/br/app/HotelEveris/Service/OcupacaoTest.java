package br.app.HotelEveris.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.app.HotelEveris.request.OcupacaoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.ComodidadeResponse;
import br.app.HotelEveris.service.OcupacaoService;

@SpringBootTest
public class OcupacaoTest {
	@Autowired
	private OcupacaoService service;

	@Test
	void inserirOcupacaoinserir() {

		OcupacaoRequest request = new OcupacaoRequest();

		request.setData("18-18-2019");
		request.setIdcliente(1l);
		request.setIdquarto(1l);
		request.setQtdiarias(2);
		request.setSituacao("N");

		BaseResponse response = service.inserir(request);

		Assertions.assertEquals(201, response.statusCode);
		Assertions.assertEquals("Ocupacao inserida com sucesso", response.message);

	}

	@Test
	void inserirOcupacaoinserirerro() {

		OcupacaoRequest request = new OcupacaoRequest();

		request.setData("");
		request.setIdcliente(1l);
		request.setIdquarto(1l);
		request.setQtdiarias(2);
		request.setSituacao("N");

		BaseResponse response = service.inserir(request);

		Assertions.assertEquals(400, response.statusCode);
		Assertions.assertEquals("insira um data", response.message);

	}

	@Test
	void inserirOcupacaoinserirerro1() {

		OcupacaoRequest request = new OcupacaoRequest();

		request.setData("12-20-2018");
		request.setIdcliente(1l);
		request.setIdquarto(0L);
		request.setQtdiarias(2);
		request.setSituacao("N");

		BaseResponse response = service.inserir(request);

		Assertions.assertEquals(400, response.statusCode);
		Assertions.assertEquals("insira um id de quarto existente", response.message);

	}
	
	


	@Test
	void naoobterComodidadeporid() {

		ComodidadeResponse response = new ComodidadeResponse();

		service.listar();

		Assertions.assertEquals(200, response.statusCode);
		Assertions.assertEquals("Serviços obtidos com sucesso.", response.message);

	}

}
