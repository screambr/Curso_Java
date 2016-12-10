package com.pousar.domain.viagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pousar.app.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.jpa.BaseService;

public class ViagemService extends BaseService<Viagem> {

	public ViagemService() {
		super(Viagem.class);
	}

	@Override
	public Viagem salvar(Viagem viagem) {
		if (viagem.getIda() == null) {
			throw new ValidacaoException("A ida eh obrigatorio");
		}
		if (viagem.getVolta() == null) {
			throw new ValidacaoException("A volta eh obrigatorio");
		}
		if (viagem.getPreco() == null)  {
			throw new ValidacaoException("O preco eh obrigatorio");
		}
		return super.salvar(viagem);
	}

	public List<Viagem> buscarPor(String origem, String destino, Date dataSaida, Date dataVolta) {
		/**
		 * TODO: Metodo que deve buscar uma viagem por origem, destino e datas.
		 */
		return new ArrayList<>();
	}
}
