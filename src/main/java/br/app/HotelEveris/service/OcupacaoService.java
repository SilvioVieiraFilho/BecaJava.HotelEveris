package br.app.HotelEveris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.app.HotelEveris.model.Cliente;
import br.app.HotelEveris.model.Ocupacao;
import br.app.HotelEveris.model.Quarto;
import br.app.HotelEveris.repository.OcupacaoRepository;
import br.app.HotelEveris.request.OcupacaoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.OcupacaoListResponse;

@Service
public class OcupacaoService {

	@Autowired
	private OcupacaoRepository repository;

	public BaseResponse inserir(OcupacaoRequest request) {

		BaseResponse response = new BaseResponse();

		Ocupacao ocupacao = new Ocupacao();

		Ocupacao ocupa = new Ocupacao();

		ocupa.setData(request.getData());
		ocupa.setQtdiarias(request.getQtdiarias());
		ocupa.setSituacao(request.getSituacao());

		if (ocupa.getSituacao().isEmpty()) {
			ocupacao.setSituacao("N");
		}

		Cliente obj = new Cliente();
		obj.setId(request.getIdcliente());
		ocupa.setCliente(obj);

		Quarto obj2 = new Quarto();
		obj2.setId(request.getIdquarto());
		ocupa.setQuarto(obj2);

		repository.save(ocupacao);

		response.message = "Ocupacao inserida com sucesso";

		response.statusCode = 201;

		return response;

	}

	public OcupacaoListResponse listar() {

		List<Ocupacao> lista = repository.findAll();

		OcupacaoListResponse response = new OcupacaoListResponse();

		response.setOcupacao(lista);

		response.statusCode = 200;
		response.message = "Serviços obtidos com sucesso.";

		return response;

	}
}
