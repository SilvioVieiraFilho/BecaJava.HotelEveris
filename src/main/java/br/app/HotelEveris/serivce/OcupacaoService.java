package br.app.HotelEveris.serivce;

import br.app.HotelEveris.request.OcupacaoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.OcupacaoListResponse;

public interface OcupacaoService {
	
	public BaseResponse inserir(OcupacaoRequest request);
	
	
	public OcupacaoListResponse listar();

}
