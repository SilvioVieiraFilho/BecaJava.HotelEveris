package br.app.HotelEveris.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.app.HotelEveris.model.Comodidade;
import br.app.HotelEveris.model.Quarto;
import br.app.HotelEveris.model.QuartoComodidade;
import br.app.HotelEveris.model.TipoQuarto;
import br.app.HotelEveris.repository.ComodidadeRepository;
import br.app.HotelEveris.repository.QuartoComodidadeRepository;
import br.app.HotelEveris.repository.QuartoRepository;
import br.app.HotelEveris.request.ComodidadeRequest;
import br.app.HotelEveris.request.QuartoRequest;
import br.app.HotelEveris.request.SituacaoQuartoRequest;
import br.app.HotelEveris.response.BaseResponse;

import br.app.HotelEveris.response.QuartoResponse;

@Service
public class QuartoService {

	@Autowired
	private ComodidadeRepository repocomo;

	@Autowired
	private QuartoRepository repository;

	@Autowired
	private QuartoComodidadeRepository _repository;

	public BaseResponse inserir(QuartoRequest request) {

		BaseResponse response = new BaseResponse();

		TipoQuarto tipoquarto = new TipoQuarto(request.getTipoquarto().getId());

		Quarto quarto = new Quarto(request.getAndar(), request.getNquarto(), request.getSituacao(), tipoquarto);

		repository.save(quarto);

		response.statusCode = 201;
		response.message = "Quarto obtido";

//		Optional<Quarto> getquarto = repository.findbyQuarto(request.getNquarto());

		Long idQuarto = repository.findBynquarto(request.getNquarto()).get().getId();

		for (ComodidadeRequest item : request.getComodidade()) {

			QuartoComodidade quartocom = new QuartoComodidade(

					new Quarto(idQuarto), new Comodidade(item.getId()));

			_repository.save(quartocom);

		}

		response.statusCode = 201;
		response.message = "Quarto obtido";
		return response;

	}

	public QuartoResponse obter(Long id) {

		Optional<Quarto> lista = repository.findById(id);

		QuartoResponse response = new QuartoResponse();
		
		
		response.setId(lista.get().getId());
		response.setAndar(lista.get().getNquarto());
		response.setNquarto(lista.get().getNquarto());
		response.setSituacao(lista.get().getSituacao());
		response.setQuartoid(lista.get().getTipoquarto().getId());
		

		
		
		response.statusCode = 200;
		response.message = "Clientes obtidos com sucesso.";

		return response;

	}

	public QuartoResponse obterdenovo(Long tipoquartoid) {

		Optional<Quarto> lista = repository.findBuscarQuartos(tipoquartoid);

		QuartoResponse response = new QuartoResponse(

				lista.get().getId(), lista.get().getAndar(), lista.get().getNquarto(), lista.get().getSituacao(),
				lista.get().getTipoquarto());

		response.statusCode = 200;
		response.message = "Clientes obtidos com sucesso.";

		return response;

	}

	public BaseResponse atualizar(Long id, SituacaoQuartoRequest request) {

		Optional<Quarto> quarto = repository.findById(id);

		BaseResponse response = new BaseResponse();

		if (request.getSituacao().isEmpty()) {
			response.statusCode = 400;
			response.message = "Situação do quarto não pode ser vazia";
			return response;

		} else if (quarto.isEmpty() || id <= 0) {
			response.statusCode = 400;
			response.message = "Id do quarto não pode ser zero ou vazio";
			return response;
		}

		quarto.get().setSituacao(request.getSituacao());

		repository.save(quarto.get());

		response.message = "Situação Atulizada Com sucesso ";
		response.statusCode = 200;

		return response;

	}

}
