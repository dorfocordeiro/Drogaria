package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.Cidade;
import br.com.rodolfo.drogaria.domain.Estado;
import org.junit.Ignore;
import org.junit.Test;

import javax.transaction.Transactional;
import java.sql.SQLOutput;
import java.util.List;

public class CidadeDaoTest {

    @Test
    @Ignore
    public void salvar() {
        EstadoDao estadoDao = new EstadoDao();

        Estado estado = estadoDao.buscar(2L);

        Cidade cidade = new Cidade();
        cidade.setNome("Niterói");
        cidade.setEstado(estado);

        CidadeDao cidadeDao = new CidadeDao();

        cidadeDao.salvar(cidade);
        System.out.println("Cidade salva com sucesso: " +  cidade.getNome());
    }

    @Test
    @Ignore
    public void listar() {
        CidadeDao cidadeDao = new CidadeDao();

        List<Cidade> resultado = cidadeDao.listar();

        for(Cidade cidade : resultado) {
            System.out.println(cidade.getCodigo());
            System.out.println(cidade.getNome());
            System.out.println(cidade.getEstado().getSigla());
            System.out.println(cidade.getEstado().getNome());
        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 9L;

        CidadeDao cidadeDao = new CidadeDao();
        Cidade cidade = cidadeDao.buscar(codigo);

        System.out.println(cidade.getCodigo());
        System.out.println(cidade.getNome());
        System.out.println(cidade.getEstado().getNome() + " " + cidade.getEstado().getSigla());
    }


    @Test
    @Ignore
    public void excluir() {
        Long codigo = 14L;

        CidadeDao cidadeDao = new CidadeDao();
        Cidade cidade = cidadeDao.buscar(codigo);
        cidadeDao.excluir(cidade);

        System.out.println(cidade.getCodigo());
        System.out.println(cidade.getNome());
        System.out.println(cidade.getEstado().getNome() + " " + cidade.getEstado().getSigla());
    }

    @Test
    public void editar() {
        Long codigoCidade = 16L;
        Long codigoEstado = 30L;

        EstadoDao estadoDao = new EstadoDao();
        Estado estado = estadoDao.buscar(codigoEstado);

        CidadeDao cidadeDao = new CidadeDao();
        Cidade cidade = cidadeDao.buscar(codigoCidade);



        cidade.setNome("Palmas");
        cidade.setEstado(estado);

        cidadeDao.editar(cidade);

        System.out.println("Codigo: " + cidade.getCodigo() + " " + cidade.getNome());
        System.out.println(cidade.getEstado().getNome() + " " + cidade.getEstado().getSigla());

    }

}
