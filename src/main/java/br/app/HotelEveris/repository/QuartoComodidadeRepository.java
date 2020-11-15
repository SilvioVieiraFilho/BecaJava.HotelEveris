package br.app.HotelEveris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.app.HotelEveris.model.QuartoComodidade;


	
	
	@Repository
	public interface QuartoComodidadeRepository extends JpaRepository<QuartoComodidade, Long>{

	}

	
	
	


