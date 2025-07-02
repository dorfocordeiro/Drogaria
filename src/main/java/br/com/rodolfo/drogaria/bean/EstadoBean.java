package br.com.rodolfo.drogaria.bean;

import br.com.rodolfo.drogaria.dao.EstadoDao;
import br.com.rodolfo.drogaria.domain.Estado;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {
    private Estado estado;
    private List<Estado> estados;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    @PostConstruct
    public void listar() {
        try {
            EstadoDao estadoDao = new EstadoDao();
            estados = estadoDao.listar();

        } catch (RuntimeException erro) {
            Messages.addGlobalError("Ocorreu um erro ao tentar listar estados");
            erro.printStackTrace();
        }
    }


    public void salvar () {

        try {
            EstadoDao estadoDao = new EstadoDao();
            estadoDao.merge(estado);
            System.out.println(estado.getNome());
            Messages.addGlobalInfo("Estado " + estado.getNome() + " salvo com sucesso");

            novo();
            estados = estadoDao.listar();

        } catch (RuntimeException erro) {
            Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado");
            erro.printStackTrace();
        }
    }

    public void excluir(ActionEvent event) {
        try {
            estado = (Estado) event.getComponent().getAttributes().get("estadoSelecionado");

            EstadoDao estadoDao = new EstadoDao();
            estadoDao.excluir(estado);

            Messages.addGlobalInfo("Estado " + estado.getNome() + " excluido com sucesso");

            estados = estadoDao.listar();


        }
        catch (RuntimeException erro) {
            Messages.addGlobalError("Ocorreu um erro ao tentar excluir o estado");
            erro.printStackTrace();

        }

    }

    public void editar(ActionEvent event) {
        estado = (Estado) event.getComponent().getAttributes().get("estadoSelecionado");
        EstadoDao estadoDao = new EstadoDao();
        estadoDao.merge(estado);

    }

    public void novo () {
            estado = new Estado();
    }
}


