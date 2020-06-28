package com.repositorio.entidades;

import java.io.Serializable;

/*
 * @author daniel.marmitt
 */
public class Jogador implements Serializable {
   
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return "id:"+this.nome + ";Nome:"+this.nome;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
