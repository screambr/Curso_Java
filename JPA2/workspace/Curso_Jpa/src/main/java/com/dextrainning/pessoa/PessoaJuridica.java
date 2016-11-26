package com.dextrainning.pessoa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PJ")
public class PessoaJuridica extends Pessoa{
	private String cnpj;

}
