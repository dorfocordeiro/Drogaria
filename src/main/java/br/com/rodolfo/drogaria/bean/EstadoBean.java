package br.com.rodolfo.drogaria.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "estadoBean")
public class EstadoBean {
    public void salvar(){
        String texto = "Salvo com sucesso";
        System.out.println("passou do salvo com sucesso");
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, texto, texto);
        System.out.println("passou do faces");

        FacesContext contexto = FacesContext.getCurrentInstance();
        System.out.println("passou do context");
        contexto.addMessage(null, message);
    }
}