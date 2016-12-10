package com.dextrainning.pessoa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PJ")
public class PessoaFisica extends Pessoa{
	private String cpf;
}
