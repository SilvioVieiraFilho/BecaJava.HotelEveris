package br.app.HotelEveris.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.service.imp.FaturaServiceImp;

@SpringBootTest
public class FaturaTest {

	@Autowired
	private FaturaServiceImp service;

	@Test
	public void Transferencia() {
		BaseResponse response = service.inserir();

		Assertions.assertEquals(200, response.statusCode);
		Assertions.assertEquals("Tranferencia Da Fatura Realizada com sucesso", response.message);

	}

}
