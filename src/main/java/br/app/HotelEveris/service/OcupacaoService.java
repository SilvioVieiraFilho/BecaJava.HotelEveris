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

	public BaseResponse inserir(OcupacaoRequest ocupacaor) {

		BaseResponse response = new BaseResponse();

		Ocupacao ocupacao = new Ocupacao();

		Quarto quarto = new Quarto();
		Cliente cliente = new Cliente();

		ocupacao.setQtdiarias(ocupacaor.getQtdiarias());
		ocupacao.setData(ocupacao.getData());
		ocupacao.setSituacao("N");

		quarto.setId(ocupacaor.getIdquartooo());
		ocupacao.setQuarto(quarto);

		cliente.setId(ocupacaor.getIdclientee());
		ocupacao.setCliente(cliente);

		repository.save(ocupacao);

		response.message = "Ocupacao inserida com sucesso";

		response.statusCode = 201;
		return response;

	}

	public OcupacaoListResponse listar() {

		List<Ocupacao> lista = repository.findAll();

		OcupacaoListResponse response = new OcupacaoListResponse();

		response.statusCode = 200;
		response.message = "Serviços obtidos com sucesso.";

		return response;

	}
}
