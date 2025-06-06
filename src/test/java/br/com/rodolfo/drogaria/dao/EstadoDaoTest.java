package br.com.rodolfo.drogaria.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rodolfo.drogaria.domain.Estado;

import java.util.List;

public class EstadoDaoTest {
	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		
		
		EstadoDao estadoDao = new EstadoDao();
		
		estadoDao.salvar(estado);
	}

	@Test
	@Ignore
	public void listar(){
		EstadoDao estadoDao = new EstadoDao();
		List<Estado> resultado = estadoDao.listar();

		System.out.println("Lista de estados: " + resultado.size());

		for (Estado estado : resultado) {
			System.out.println(estado.getNome() + " - " + estado.getSigla());;
		}
	}

	@Test
	@Ignore
	public void buscar(){
		Long codigo = 30L;

		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigo);

		System.out.println(estado.getNome() + " - " + estado.getSigla());

	}

	@Test
	@Ignore
	public void excluir(){
		Long codigo = 31L;
		EstadoDao estadoDao = new EstadoDao();

		Estado estado = estadoDao.buscar(codigo);


		if (estado == null){
			System.out.println("Nenhum estado encontrado");
		}
		else{
			System.out.println("Estado encontrado");
			estadoDao.excluir(estado);
			System.out.println(estado.getNome() + " removido com sucesso da base de dados");
		}
	}

	@Test
	public void editar(){
		Long codigo = 30L;

		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigo);
		String dadoAntigo = estado.getSigla();
		System.out.println(dadoAntigo);

		estado.setSigla("TO");

		estadoDao.editar(estado);
		String dadoNovo = estado.getSigla();
		System.out.println(dadoNovo);
		if (dadoAntigo.equals(dadoNovo)){
			System.out.println("O dado " + dadoNovo + " ja era igual o dado antigo: " + dadoAntigo);
		}
		else{
			System.out.println("Alterado em " + estado.getNome() + " o dado " +  dadoAntigo + " para " +  dadoNovo);
		}

	}


}
