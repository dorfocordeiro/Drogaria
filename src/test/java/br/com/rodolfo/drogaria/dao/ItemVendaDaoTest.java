package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.ItemVenda;
import br.com.rodolfo.drogaria.domain.Produto;
import br.com.rodolfo.drogaria.domain.Venda;
import org.junit.Test;

import java.math.BigDecimal;

public class ItemVendaDaoTest {

    @Test
    public void salvar() {
        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = produtoDao.buscar(1L);

        VendaDao vendaDao = new VendaDao();
        Venda venda = vendaDao.buscar(1L);

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setQuantidade(new Short("2"));
        itemVenda.setValorParcial(new BigDecimal("9.90"));
        itemVenda.setProduto(produto);
        itemVenda.setVenda(venda);

        ItemVendaDao itemVendaDao = new ItemVendaDao();
        itemVendaDao.salvar(itemVenda);
    }
}