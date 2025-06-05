package br.com.rodolfo.drogaria.dao;

import org.junit.Test;

import br.com.rodolfo.drogaria.domain.Estado;

public class EstadoDaoTest {
	@Test
	public void salvar() {
		Estado estado = new Estado();
		
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		
		
		EstadoDao estadoDao = new EstadoDao();
		
		estadoDao.salvar(estado);
	}

}
