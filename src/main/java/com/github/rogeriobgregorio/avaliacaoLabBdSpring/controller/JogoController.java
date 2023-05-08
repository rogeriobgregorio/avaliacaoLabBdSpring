package com.github.rogeriobgregorio.avaliacaoLabBdSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Jogo;
import com.github.rogeriobgregorio.avaliacaoLabBdSpring.persistence.JogoRepository;

@Controller
@RequestMapping("jogo")
public class JogoController {
	
	@Autowired
	private JogoRepository jogoRepository;

	@GetMapping("/buscarJogosPorData/{data}")
	public ResponseEntity<List<Jogo>> getJogosByDate(@PathVariable(name = "data") String data) {
		List<Jogo> listaJogos = new ArrayList<Jogo>();
		
		listaJogos = jogoRepository.buscarJogo(data);
		
		return ResponseEntity.ok(listaJogos);
	}
	
	@GetMapping("/inserirGols/timeA/{codigoTimeA}/timeB/{codigoTimeB}/golA/{golsTimeA}/golB/{golsTimeB}")
	public ResponseEntity<String> getInsereGols(
			@PathVariable(name = "codigoTimeA") String codigoTimeA, 
			@PathVariable(name = "codigoTimeB") String codigoTimeB, 
			@PathVariable(name = "golsTimeA") int golsTimeA, 
			@PathVariable(name = "golsTimeB") int golsTimeB 
			) {

		Jogo jogo = new Jogo(codigoTimeA, codigoTimeB, golsTimeA, golsTimeB);
		
		jogoRepository.insereGols(jogo);
		
		return ResponseEntity.ok("ok");
	}

}
