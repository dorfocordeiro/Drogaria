package br.com.rodolfo.drogaria.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.rodolfo.drogaria.dao.FabricanteDao;
import br.com.rodolfo.drogaria.dao.ProdutoDao;
import br.com.rodolfo.drogaria.domain.Fabricante;
import br.com.rodolfo.drogaria.domain.Produto;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ProdutoBean implements Serializable {
    private Produto  produto;
    private List<Produto> produtos;
    private List<Fabricante> fabricantes;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(List<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    @PostConstruct
    public void listar() {
        try {
            ProdutoDao produtoDao = new ProdutoDao();
            produtos = produtoDao.listar();
        } catch (RuntimeException erro) {
            Messages.addGlobalError("Ocorreu um erro ao tentar listar os produtos");
            erro.printStackTrace();
        }
    }

    public void novo() {
        try {
            produto = new Produto();

            FabricanteDao fabricanteDao = new FabricanteDao();
            fabricantes = fabricanteDao.listar();
        } catch (RuntimeException erro) {
            Messages.addFlashGlobalError("Ocorreu um erro ao tentar gerar um novo produto");
            erro.printStackTrace();
        }
    }

    public void editar(ActionEvent evento){
        try {
            produto = (Produto) evento.getComponent().getAttributes().get("produtoSelecionado");

            FabricanteDao fabricanteDao = new FabricanteDao();
            fabricantes = fabricanteDao.listar();
        } catch (RuntimeException erro) {
            Messages.addFlashGlobalError("Ocorreu um erro ao tentar selecionar um produto");
            erro.printStackTrace();
        }
    }

    public void salvar() {
        try {
            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.merge(produto);

            produto = new Produto();

            FabricanteDao fabricanteDao = new FabricanteDao();
            fabricantes = fabricanteDao.listar();

            produtos = produtoDao.listar();

            Messages.addGlobalInfo("Produto salvo com sucesso");
        } catch (RuntimeException erro) {
            Messages.addFlashGlobalError("Ocorreu um erro ao tentar salvar o produto");
            erro.printStackTrace();
        }
    }

    public void excluir(ActionEvent evento) {
        try {
            produto = (Produto) evento.getComponent().getAttributes().get("produtoSelecionado");

            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.excluir(produto);

            produtos = produtoDao.listar();

            Messages.addGlobalInfo("Produto removido com sucesso");
        } catch (RuntimeException erro) {
            Messages.addFlashGlobalError("Ocorreu um erro ao tentar remover o produto");
            erro.printStackTrace();
        }
    }
}