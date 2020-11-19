package br.app.HotelEveris.serivce;

import br.app.HotelEveris.request.QuartoRequest;
import br.app.HotelEveris.request.SituacaoQuartoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.QuartoListResponse;
import br.app.HotelEveris.response.QuartoResponse;

public interface QuartoService   {

	
	public BaseResponse inserir(QuartoRequest request);
	public QuartoResponse obter(Long id);
	public QuartoListResponse obterdenovo(Long id);
	public BaseResponse atualizar(Long id, SituacaoQuartoRequest request);
	
}
