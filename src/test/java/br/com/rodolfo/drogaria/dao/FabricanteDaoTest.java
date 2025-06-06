package br.com.rodolfo.drogaria.dao;

import java.util.List;

import br.com.rodolfo.drogaria.domain.GenericDomain;
import org.junit.Test;
import org.junit.Ignore;

import br.com.rodolfo.drogaria.domain.Fabricante;

public class FabricanteDaoTest {
    @Test
    @Ignore
    public void salvar() {
        Fabricante fabricante = new Fabricante();
        fabricante.setDescricao("Aché");

        FabricanteDao fabricanteDAO = new FabricanteDao();
        fabricanteDAO.salvar(fabricante);
    }

    @Test
    @Ignore
    public void listar() {
        FabricanteDao FabricanteDao = new FabricanteDao();
        List<Fabricante> resultado = FabricanteDao.listar();

        System.out.println("Total de Registros Encontrados: " + resultado.size());

        for (Fabricante fabricante : resultado) {
            System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
        }
    }

    @Test
    public GenericDomain buscar(){
        Long codigo = 3L;

        FabricanteDao fabricanteDAO = new FabricanteDao();
        Fabricante fabricante = fabricanteDAO.buscar(codigo);

        if(fabricante == null){
            System.out.println("Nenhum registro encontrado");
        }else{
            System.out.println("Registro encontrado:");
            System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
        }
        return fabricante;
    }
}
