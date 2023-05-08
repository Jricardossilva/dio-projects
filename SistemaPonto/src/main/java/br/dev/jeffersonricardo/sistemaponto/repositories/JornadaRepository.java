package br.dev.jeffersonricardo.sistemaponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.dev.jeffersonricardo.sistemaponto.model.JornadaTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long>{
	

	
	
}
