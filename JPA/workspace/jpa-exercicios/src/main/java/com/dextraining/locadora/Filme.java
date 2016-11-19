package com.dextraining.locadora;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Filme{
	private String nome;
	private String dataLancamento;
	
	@ManyToMany
	private List<Categorias> categorias;
	
}
	
	