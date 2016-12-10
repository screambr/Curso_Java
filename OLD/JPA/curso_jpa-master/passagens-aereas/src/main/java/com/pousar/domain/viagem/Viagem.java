package com.pousar.domain.viagem;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.pousar.jpa.Entidade;

@Entity
public class Viagem extends Entidade {
	@Column
	private Voo ida;
	
	@Column
	private Voo volta;
	
	@Column
	private Double preco;

	public Voo getIda() {
		return ida;
	}

	public void setIda(Voo ida) {
		this.ida = ida;
	}

	public Voo getVolta() {
		return volta;
	}

	public void setVolta(Voo volta) {
		this.volta = volta;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
