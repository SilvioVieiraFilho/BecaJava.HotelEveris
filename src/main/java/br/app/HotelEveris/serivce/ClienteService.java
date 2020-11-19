package br.app.HotelEveris.serivce;

import br.app.HotelEveris.request.ClienteRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.ClienteResponse;

public interface ClienteService {

	public BaseResponse inserir(ClienteRequest request);

	public ClienteResponse obter(Long id);

}