package com.repositorio.entidades;

import java.io.Serializable;
import java.util.List;

public class JogadasRealizadas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	Jogador jogador;
	TipoJogada tipoJogada;
	
	List<JogadasRealizadas> listaJogadas;
	
	

	public JogadasRealizadas(Jogador jogador, TipoJogada tipoJogada){
		this.jogador =jogador;
		this.tipoJogada = tipoJogada;
		setListaJogadas(this);
	}
	
	public void setListaJogadas(JogadasRealizadas jog) {
		this.listaJogadas.add(jog);
	}

	public List<JogadasRealizadas> getListaJogadas() {
		return listaJogadas;
	}
	

}
