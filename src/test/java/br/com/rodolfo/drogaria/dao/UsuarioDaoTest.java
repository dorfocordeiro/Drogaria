package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.Pessoa;
import br.com.rodolfo.drogaria.domain.Usuario;
import org.junit.Test;

public class UsuarioDaoTest {

    @Test
    public void salvar() {
        PessoaDao pessoaDao = new PessoaDao();
        Pessoa pessoa = pessoaDao.buscar(1L);
        System.out.println("Pessoa: "  + pessoa.getNome());

        Usuario usuario = new Usuario();
        usuario.setAtivo(true);
        usuario.setPessoa(pessoa);
        usuario.setSenha("q1w2e3r4");
        usuario.setTipo('A');

        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.salvar(usuario);

    }
}
