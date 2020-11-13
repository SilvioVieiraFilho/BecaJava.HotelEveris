//package br.app.HotelEveris.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import br.app.HotelEveris.model.Quarto;
//import br.app.HotelEveris.repository.QuartoRepository;
//import br.app.HotelEveris.request.QuartoRequest;
//import br.app.HotelEveris.response.BaseResponse;
//
//@Service
//public class ServiceQuarto {
//
//	@Autowired
//	private QuartoRepository repository;
//
//	@Autowired
//
//	public BaseResponse inserir(QuartoRequest quartorequest) {
//
//		Quarto quarto = new Quarto();
//
//		BaseResponse response = new BaseResponse();
//
//		quarto.setComodidade(quartorequest.getComododidade());
//		quarto.setNquarto(quartorequest.getNquarto());
//		quarto.setSituacao(quartorequest.getSituacao());
//		quarto.setTipoquarto(quartorequest.getTipoquarto());
//		quarto.setComodidade(quartorequest.getComododidade());
//		
//		
//		
//		
//
//		repository.save(quarto);
//
//		response.statusCode = 201;
//		response.message = "Quarto obtido";
//		return response;
//
//	}
//	
//	
//
//}