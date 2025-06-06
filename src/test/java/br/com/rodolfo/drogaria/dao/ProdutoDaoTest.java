package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.Fabricante;
import br.com.rodolfo.drogaria.domain.Produto;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoDaoTest {
    @Test
    public void salvar(){
        FabricanteDao fabricanteDao = new FabricanteDao();
        Fabricante fabricante = fabricanteDao.buscar(new Long("3"));

        Produto produto = new Produto();
        produto.setDescricao("Dipirona 50mg 6 Cartelas");
        produto.setFabricante(fabricante);
        produto.setPreco(new BigDecimal("13.70"));
        produto.setQuantidade(new Short("7"));

        ProdutoDao produtoDAO = new ProdutoDao();
        produtoDAO.salvar(produto);

        System.out.println("Produto salvo com sucesso");
    }
}
