package br.app.HotelEveris.serivce;

import br.app.HotelEveris.response.TipoQuartoListResponse;
import br.app.HotelEveris.response.TipoQuartoResponse;

public interface TipoQuartoService {

	public TipoQuartoResponse obter(Long id);
	
	public TipoQuartoListResponse listar();
	
}
