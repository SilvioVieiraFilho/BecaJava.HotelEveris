package br.app.HotelEveris.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.app.HotelEveris.model.Cliente;
import br.app.HotelEveris.repository.ClienteRepository;
import br.app.HotelEveris.request.ClienteRequest;
import br.app.HotelEveris.response.BaseResponse;
import br.app.HotelEveris.response.ClienteResponse;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;

	// CRIAR UM CLIENTE
	public BaseResponse inserir(ClienteRequest request) {
		BaseResponse response = new BaseResponse();
		response.statusCode = 400;

		if (request.getNome().isEmpty()) {
			response.message = "insira um nome  e tente novamente";
			return response;
		}
		if (request.getCpf().isEmpty()) {
			response.message = "insira um cpf e tente novamente";
			return response;
		}
		if (request.getHash().isEmpty()) {
			response.message = "insira um hash e tente novamente";
			return response;
		}

		Cliente cliente = new Cliente();
		cliente.setNome(request.getNome());
		cliente.setCpf(request.getCpf());
		cliente.setHash(request.getHash());

		repository.save(cliente);

		response.message = "Cliente foi criado com sucesso";
		response.statusCode = 201;

		return response;
	}

	// OBTER UM CLIENTE POR POR ID
	public ClienteResponse obter(Long id) {
		Optional<Cliente> cliente = repository.findById(id);

		ClienteResponse response = new ClienteResponse();

		if (cliente.get().getId() == 0 ) {
			response.statusCode = 400;
			response.message = "Id não encontrado.";
			return response;
		}
		
		if (!cliente.isPresent()) {
			response.statusCode = 400;
			response.message = "Id inexistente tente novamente";
			return response;
		}
		
		

		response.setId(cliente.get().getId());
		response.setNome(cliente.get().getNome());
		response.setCpf(cliente.get().getCpf());
		response.statusCode = 200;
		response.message = "Conta obtida com sucesso.";
		return response;
	}
}