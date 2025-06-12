package br.com.rodolfo.drogaria.bean;

import br.com.rodolfo.drogaria.dao.CidadeDao;
import br.com.rodolfo.drogaria.dao.EstadoDao;
import br.com.rodolfo.drogaria.domain.Cidade;
import br.com.rodolfo.drogaria.domain.Estado;
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
public class CidadeBean implements Serializable {
    private Cidade cidade;
    private List<Cidade> cidades;
    private List<Estado> estados;


    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }



    @PostConstruct
    public void listar() {
        try{
            CidadeDao cidadeDao = new CidadeDao();
            cidades = cidadeDao.listar();



        }
        catch(RuntimeException erro){
            Messages.addGlobalError("Ocorreu um erro ao tentar listar as cidades.");
            erro.printStackTrace();

        }
    }

    public void salvar(){
        try{
            CidadeDao cidadeDao = new CidadeDao();
            cidadeDao.merge(cidade);
            Messages.addGlobalInfo("Cidade " +  cidade.getNome() + " salvo com sucesso!");

            cidade = new Cidade();

            EstadoDao estadoDao = new EstadoDao();
            estados = estadoDao.listar();
            cidades = cidadeDao.listar();

        }
        catch(RuntimeException erro){
            Messages.addGlobalError("Erro ao tentar salvar a cidade.");
        }
    }


    public void novo(){
        try {
            cidade = new Cidade();
            EstadoDao estadoDao = new EstadoDao();
            estados = estadoDao.listar();
        }
        catch(RuntimeException erro){
            Messages.addGlobalError("Ocorreu um erro ao tentar listar os estados.");
        }
    }

    

}
