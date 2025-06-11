package br.com.rodolfo.drogaria.dao;

import java.util.List;

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
    @Ignore
    public void buscar(){
        Long codigo = 3L;

        FabricanteDao fabricanteDAO = new FabricanteDao();
        Fabricante fabricante = fabricanteDAO.buscar(codigo);

        if(fabricante == null){
            System.out.println("Nenhum registro encontrado");
        }else{
            System.out.println("Registro encontrado:");
            System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
        }
    }

    @Test
//    @Ignore
    public void merge() {
//        Fabricante fabricante = new Fabricante();
//        fabricante.setDescricao("Fabricante A");
//        FabricanteDao fabricanteDAO
//       = new FabricanteDao();
//        fabricanteDAO
//       .merge(fabricante);

        FabricanteDao fabricanteDAO = new FabricanteDao();
        Fabricante fabricante = fabricanteDAO.buscar(11L);
        fabricante.setDescricao("Fabricante B");
        fabricanteDAO.merge(fabricante);

    }
}
