package br.app.HotelEveris.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.app.HotelEveris.config.MessagingConfig;
import br.app.HotelEveris.service.imp.FaturaServiceImp;

@RestController
	@RequestMapping("/fatura")
	public class FaturaController {
	  @Autowired
	    private MessagingConfig config;
	

    @Autowired
    private RabbitTemplate template;
    
    
		@Autowired
		private FaturaServiceImp _service;
		
		@PostMapping
		public ResponseEntity inserir() {
			try {
				_service.inserir();
				template.convertAndSend(config.EXCHANGE,config.ROUTING_KEY,_service.inserir());
				return ResponseEntity.status(200).body("Faturas inseridas com sucesso");
			} catch (Exception e) {
				return ResponseEntity.status(500).body("Erro genérico");
			}		
		}
	
	
	
	

}
