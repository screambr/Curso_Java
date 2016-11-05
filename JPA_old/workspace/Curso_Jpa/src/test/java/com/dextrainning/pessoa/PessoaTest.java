package com.dextrainning.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextrainning.banco.Banco;
import com.dextrainning.banco.BancoService;
import com.dextrainning.jpa.EntityManagerUtil;

public class PessoaTest {
	

		@After
		public void close() {
			EntityManagerUtil.fechar();
		}

		@Test
		public void salvarPessoaTeste() throws ParseException {
			PessoaService pessoaService = new PessoaService();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Anderson");
			pessoa.setDataNascimento(dateFormat.parse("08/07/1982"));
			
			pessoaService.salvar(pessoa);
			
			Assert.assertNotNull("Id da pessoa nao pode ser Null", pessoa.getId());
			
		}

		@Test
		public void buscarTodosTest(){
			PessoaService pessoaService = new PessoaService();
			
			Pessoa pessoa = new Pessoa();
			pessoa.setDataNascimento(new Date());
			pessoa.setNome("Anderson");
			pessoaService.salvar(pessoa);
			List<Pessoa> pessoas = pessoaService.buscarTodos();
			Assert.assertEquals(1, pessoas.size());
		}
		

	}


