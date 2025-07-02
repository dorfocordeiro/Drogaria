package br.com.rodolfo.drogaria.bean;

import br.com.rodolfo.drogaria.dao.EstadoDao;
import br.com.rodolfo.drogaria.dao.PessoaDao;
import br.com.rodolfo.drogaria.dao.ProdutoDao;
import br.com.rodolfo.drogaria.domain.Cidade;
import br.com.rodolfo.drogaria.domain.Estado;
import br.com.rodolfo.drogaria.domain.Pessoa;
import org.jboss.logging.annotations.Pos;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class PessoaBean implements Serializable {
    private Pessoa pessoa;
    private List<Pessoa> pessoas;

    private List<Estado> estados;
    private List<Cidade> cidades;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    @PostConstruct
    public void listar(){
        try {
            PessoaDao pessoaDao = new PessoaDao();
            pessoas = pessoaDao.listar();

        }
        catch (RuntimeException err){
            Messages.addGlobalError("Erro ao tentar listar pessoas");
            err.printStackTrace();
        }
    }

    @PostConstruct
    public void salvar(){
        try{

        }
        catch (RuntimeException err){
            Messages.addGlobalError("Erro ao tentar salvar uma pessoa");
        }

    }

    @PostConstruct
    public void editar(){
        try{

        }
        catch (RuntimeException err){
            Messages.addGlobalError("Erro ao tentar editar uma pessoa");
        }
    }

    @PostConstruct
    public void excluir(){
        try{

        }
        catch (RuntimeException err){
            Messages.addGlobalError("Erro ao tentar excluir uma pessoa");
        }

    }

    public void novo(){
        try{
            pessoa =  new Pessoa();

            EstadoDao estadoDao = new EstadoDao();
            estados = estadoDao.listar();

            cidades  = new ArrayList<Cidade>();
        }
        catch (RuntimeException err){
            Messages.addGlobalError("Ocorreu um erro ao criar uma pessoa");
            err.printStackTrace();
        }


    }


}
