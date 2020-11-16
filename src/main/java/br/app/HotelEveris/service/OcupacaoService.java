package br.app.HotelEveris.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.app.HotelEveris.model.Cliente;
import br.app.HotelEveris.model.Ocupacao;
import br.app.HotelEveris.model.Quarto;
import br.app.HotelEveris.repository.ClienteRepository;
import br.app.HotelEveris.repository.OcupacaoRepository;
import br.app.HotelEveris.repository.QuartoRepository;
import br.app.HotelEveris.request.OcupacaoRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.OcupacaoListResponse;

@Service
public class OcupacaoService {

	@Autowired
	private OcupacaoRepository repository;

	@Autowired
	private ClienteRepository crepository;
	
	@Autowired
	private   QuartoRepository  qrepository ;
	

	public BaseResponse inserir(OcupacaoRequest request) {

		Optional<Cliente> listacliente = crepository.findById(request.getIdcliente());
		Optional<Quarto> listaquarto = qrepository.findById(request.getIdquarto());

		BaseResponse response = new BaseResponse();

		Ocupacao ocupacao = new Ocupacao();

		Ocupacao ocupa = new Ocupacao();

		crepository.findById(request.getIdcliente());
		crepository.findById(request.getIdquarto());

		ocupa.setData(request.getData());
		ocupa.setQtdiarias(request.getQtdiarias());
		ocupa.setSituacao(request.getSituacao());

		if (ocupa.getData() == null) {

			response.message = "insira um data";
			response.statusCode = 400;
			return response;

		}

		if (request.getQtdiarias() == 0) {

			response.message = "insira um  um quantidade valida";
			response.statusCode = 400;
			return response;

		}

		if (ocupa.getSituacao().isEmpty()) {
			ocupacao.setSituacao("N");
		}

		if (!listacliente.isPresent()) {

			response.message = "insira um id de cliente existente";
			response.statusCode = 400;
			return response;

		}
		
		if(!listaquarto.isPresent() ) {
			
			response.message = "insira um id de quarto existente";
			response.statusCode = 400;
			return response;
		
		}

		if (request.getIdquarto() == null || request.getIdquarto() == 0) {

			response.message = "insira um  id valido";
			response.statusCode = 400;
			return response;
		}

		if (request.getIdcliente() == null || request.getIdquarto() == 0) {

			response.message = "insira um  id valido";
			response.statusCode = 400;
			return response;
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
