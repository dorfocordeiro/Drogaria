package br.com.rodolfo.drogaria.bean;

import br.com.rodolfo.drogaria.dao.EstadoDao;
import br.com.rodolfo.drogaria.domain.Estado;
import org.omnifaces.util.Messages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void novo() {
        estado = new Estado();
    }

    public void salvar(){

        try {
            EstadoDao estadoDao = new EstadoDao();
            estadoDao.salvar(estado);

            novo();

            Messages.addGlobalInfo("Estado salvo com sucesso");
        } catch (RuntimeException erro) {
            Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado");
            erro.printStackTrace();
        }
    }

}