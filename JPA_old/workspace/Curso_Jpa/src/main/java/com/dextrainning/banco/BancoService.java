package com.dextrainning.banco;

import javax.persistence.EntityManager;

import com.dextrainning.jpa.EntityManagerUtil;
import com.dextrainning.service.GenericServices;

public class BancoService extends GenericServices<Banco> {

	public BancoService() {
		super(Banco.class);
		
	}
	
}
