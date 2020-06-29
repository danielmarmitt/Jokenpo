package com.repositorio.entidades;

/**
 * 
 * @author daniel.marmitt
 * Representa o tipo de jogada que pode ser executada 
 *
 */
public enum TipoJogada {
	PEDRA(1,"Pedra"),PAPEL(2,"Papel"),
	TESOURA(3,"Tesoura"),LAGARTO(4,"Lagarto"),SPOCK(5,"Spock");
	
	private int id;
	private String descricao;
	

	TipoJogada(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
		
	}
	
	public String getDescricao() {
		return descricao;
	}

	
	public int getId() {
		return id;
	}

}
