package br.app.HotelEveris.serivce;

import br.app.HotelEveris.request.ComidadeRequestDoInserir;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.ComodidadeResponse;

public interface ComodidadeService {
	
	
	
	public BaseResponse inserir(ComidadeRequestDoInserir request);
	
	
	
	public ComodidadeResponse obter(Long id);
	
	
	
	
	

}
