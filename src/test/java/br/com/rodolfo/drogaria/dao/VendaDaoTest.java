package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.Cliente;
import br.com.rodolfo.drogaria.domain.Usuario;
import br.com.rodolfo.drogaria.domain.Venda;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VendaDaoTest {

    @Test
    //@Ignore
    public void salvar() {
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = clienteDao.buscar(1L);

        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = usuarioDao.buscar(1L);

        // Criar venda
        Venda venda = new Venda();
        venda.setHorario(new Date());
        venda.setValorTotal(new BigDecimal("350.99"));
        venda.setCliente(cliente);
        venda.setUsuario(usuario);

        // Salvar venda
        VendaDao vendaDao = new VendaDao();
        vendaDao.salvar(venda);
    }
}
