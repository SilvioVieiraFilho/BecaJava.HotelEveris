package br.app.HotelEveris.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.app.HotelEveris.model.Quarto;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Long> {

	@Query(value = "EXEC sp_consulte :tipoquartoid", nativeQuery = true)
	
	Optional<Quarto> findBuscarQuartos(@Param("tipoquartoid") Long tipoquartoid);

	
	//@Query(value = "EXEC SP_obterOperacoesPorConta :idConta", nativeQuery = true)

    //List<Operacao> findOperacoesPorConta(@Param("idConta") Long idConta);
	
	
	Optional<Quarto> findBynquarto(int nquarto);
	
	

}
