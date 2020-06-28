package com.servico;

import org.springframework.web.bind.annotation.RestController;

import com.repositorio.entidades.ResultadoPartida;

/**
 * 
 * @author Daniel Marmitt
 * RestController, expondo API para possibilitar jogadas 
 */
@RestController
public class Jogar {
	
	public void iniciarJogo(int jogador, String tipoJogada) {
		
	}
	
	@GetMapping("/api/iniciarJogo ")
	@ResponseBody
	public ResultadoPartida (@RequestParam(name = "tipoJogada") String tipoJogada, @RequestParam String jogador) {
		return new ResultadoPartida();
	}	
	

}
