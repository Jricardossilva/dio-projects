package br.dev.jeffersonricardo.sistemaponto.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.jeffersonricardo.sistemaponto.model.JornadaTrabalho;
import br.dev.jeffersonricardo.sistemaponto.service.JornadaService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	
	@Autowired
	JornadaService jornadaService;
	
	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaService.saveJornada(jornadaTrabalho);
	}
	
	@GetMapping
	public List<JornadaTrabalho> getJornadaList(){
		return jornadaService.findAll();
	}
	
	@GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @SuppressWarnings("unchecked")
	@DeleteMapping ("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteJornadaByID(@PathVariable("idJornada") Long idJornada) {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

	
	
	
	
	
	
	
	
	
}
