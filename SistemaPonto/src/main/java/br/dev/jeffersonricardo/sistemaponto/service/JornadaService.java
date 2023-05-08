package br.dev.jeffersonricardo.sistemaponto.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.dev.jeffersonricardo.sistemaponto.model.JornadaTrabalho;
import br.dev.jeffersonricardo.sistemaponto.repositories.JornadaRepository;

@Service
public class JornadaService {
	
	JornadaRepository jornadaRepository;

	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}
	
	
	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}
	
	public List<JornadaTrabalho> findAll(){
		return jornadaRepository.findAll();
	}
	
	
	public Optional<JornadaTrabalho> getById(Long idJornada){
		return jornadaRepository.findById(idJornada);
	}
	
	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}
	
	public void deleteJornada(Long idJornada){
		jornadaRepository.deleteById(idJornada);
	}
	
	
	
	
	
	
	
	
	
	
}
