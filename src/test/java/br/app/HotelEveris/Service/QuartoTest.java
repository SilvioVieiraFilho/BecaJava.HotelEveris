package br.app.HotelEveris.Service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.app.HotelEveris.request.ComodidadeRequest;
import br.app.HotelEveris.request.QuartoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.service.QuartoService;

@SpringBootTest
public class QuartoTest {
	



		@Autowired
		private QuartoService service;
		
		@Test
	    public void criar() {
			
//	        QuartoRequest request =  new QuartoRequest();
//	        request.setAndar(32);
//
//	        List<ComodidadeRequest> teste = new ArrayList<ComodidadeRequest>();
//	        ComodidadeRequest comodidade = new ComodidadeRequest();
//	     
//	        
//	        comodidade.setId(1L);
//	        teste.add(comodidade);
//
//	        request.setComodidade(teste);
//	        request.setIdtopoquarto(1L);
//	        
//	        
//	        
//	        request.setNquarto(12);
//	        request.setSituacao("Ativo");
//	        
//	        QuartoComodidade quartocom = new  QuartoComodidade(
//	        		
//	        		request.setComodidade(teste),
//	    	        request.setIdtopoquarto(1L),
//	        		
//	        		
//	        		);
//	        
//	        
//	        BaseResponse response = service.inserir(request);
//
//			Assertions.assertEquals(201, response.statusCode);
//			Assertions.assertEquals("Quarto obtido", response.message);
//	    }
		
		
		
		
	
}
}


