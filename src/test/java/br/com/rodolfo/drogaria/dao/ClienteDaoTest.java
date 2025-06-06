package br.com.rodolfo.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.rodolfo.drogaria.dao.ClienteDao;
import br.com.rodolfo.drogaria.dao.PessoaDao;
import br.com.rodolfo.drogaria.domain.Pessoa;
import org.junit.Ignore;
import org.junit.Test;

import br.com.rodolfo.drogaria.domain.Cliente;

public class ClienteDaoTest {
    @Test
    //@Ignore
    public void salvar() throws ParseException {
        PessoaDao pessoaDao = new PessoaDao();
        Pessoa pessoa = pessoaDao.buscar(1L); // Pessoa precisa já existir no banco

        if (pessoa == null) {
            System.out.println("Pessoa com código 1 não encontrada.");
            return;
        }
        Cliente cliente = new Cliente();
        cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2015"));
        cliente.setLiberado(true);
        cliente.setPessoa(pessoa);


        ClienteDao clienteDao = new ClienteDao();
        clienteDao.salvar(cliente);

        System.out.println("Cliente salvo com sucesso!");
    }
}
