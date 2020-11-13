package br.app.HotelEveris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.app.HotelEveris.model.Quarto;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Long>{

}
