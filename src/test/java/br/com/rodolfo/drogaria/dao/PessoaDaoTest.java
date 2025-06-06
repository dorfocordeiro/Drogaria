package br.com.rodolfo.drogaria.dao;

import br.com.rodolfo.drogaria.domain.Cidade;
import br.com.rodolfo.drogaria.domain.Pessoa;
import org.junit.Ignore;
import org.junit.Test;

public class PessoaDaoTest {

    @Test
    //@Ignore
    public void salvar() {
        CidadeDao cidadeDao = new CidadeDao();
        Cidade cidade = cidadeDao.buscar(1L); // ou alterne para outros IDs conforme necessário

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCodigo(1L);
        pessoa1.setNome("João da Silva");
        pessoa1.setCpf("123.456.789-00");
        pessoa1.setRg("12.345.678-9");
        pessoa1.setEndereco("Rua das Flores");
        pessoa1.setNumero(123);
        pessoa1.setBairro("Centro");
        pessoa1.setCep("12345-678");
        pessoa1.setComplemento("Apartamento 101");
        pessoa1.setTelefone("11 2345-6789");
        pessoa1.setCelular("11 91234-5678");
        pessoa1.setEmail("joao.silva@email.com");
        pessoa1.setCidade(cidade);


        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCodigo(2L);
        pessoa2.setNome("Maria Souza");
        pessoa2.setCpf("987.654.321-00");
        pessoa2.setRg("98.765.432-1");
        pessoa2.setEndereco("Av. Brasil");
        pessoa2.setNumero(456);
        pessoa2.setBairro("Jardim América");
        pessoa2.setCep("20000-000");
        pessoa2.setComplemento("Casa");
        pessoa2.setTelefone("21 2233-4455");
        pessoa2.setCelular("21 99876-5432");
        pessoa2.setEmail("maria.souza@email.com");
        pessoa2.setCidade(cidade);

        Pessoa pessoa3 = new Pessoa();

        pessoa3.setCodigo(3L);
        pessoa3.setNome("Carlos Pereira");
        pessoa3.setCpf("456.789.123-99");
        pessoa3.setRg("45.678.912-3");
        pessoa3.setEndereco("Rua Minas");
        pessoa3.setNumero(789);
        pessoa3.setBairro("Bela Vista");
        pessoa3.setCep("30123-456");
        pessoa3.setComplemento("Cobertura");
        pessoa3.setTelefone("31 3344-5566");
        pessoa3.setCelular("31 93456-7890");
        pessoa3.setEmail("carlos.pereira@email.com");
        pessoa3.setCidade(cidade);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setCodigo(4L);
        pessoa4.setNome("Ana Melo");
        pessoa4.setCpf("321.654.987-01");
        pessoa4.setRg("32.165.498-7");
        pessoa4.setEndereco("Rua das Acácias");
        pessoa4.setNumero(321);
        pessoa4.setBairro("Moema");
        pessoa4.setCep("04567-890");
        pessoa4.setComplemento("Sala 204");
        pessoa4.setTelefone("11 5566-7788");
        pessoa4.setCelular("11 95678-1234");
        pessoa4.setEmail("ana.melo@email.com");
        pessoa4.setCidade(cidade);

        Pessoa pessoa5 = new Pessoa();
        pessoa5.setCodigo(5L);
        pessoa5.setNome("Paulo Lima");
        pessoa5.setCpf("654.123.789-11");
        pessoa5.setRg("65.412.378-9");
        pessoa5.setEndereco("Av. Atlântica");
        pessoa5.setNumero(555);
        pessoa5.setBairro("Centro");
        pessoa5.setCep("22000-111");
        pessoa5.setComplemento("Loja 5");
        pessoa5.setTelefone("21 7788-8899");
        pessoa5.setCelular("21 91234-5678");
        pessoa5.setEmail("paulo.lima@email.com");
        pessoa5.setCidade(cidade);

        Pessoa pessoa6 = new Pessoa();
        pessoa6.setCodigo(6L);
        pessoa6.setNome("Lúcia Oliveira");
        pessoa6.setCpf("789.321.654-22");
        pessoa6.setRg("78.932.165-4");
        pessoa6.setEndereco("Rua Goiás");
        pessoa6.setNumero(232);
        pessoa6.setBairro("Santa Efigênia");
        pessoa6.setCep("31000-222");
        pessoa6.setComplemento("Casa");
        pessoa6.setTelefone("31 9988-1122");
        pessoa6.setCelular("31 94567-1234");
        pessoa6.setEmail("lucia.oliveira@email.com");
        pessoa6.setCidade(cidade);

        Pessoa pessoa7 = new Pessoa();
        pessoa7.setCodigo(7L);
        pessoa7.setNome("Bruno Alves");
        pessoa7.setCpf("852.963.741-33");
        pessoa7.setRg("85.296.374-1");
        pessoa7.setEndereco("Rua Vergueiro");
        pessoa7.setNumero(303);
        pessoa7.setBairro("Vila Mariana");
        pessoa7.setCep("04000-333");
        pessoa7.setComplemento("Apto 303");
        pessoa7.setTelefone("11 6677-2233");
        pessoa7.setCelular("11 92345-6789");
        pessoa7.setEmail("bruno.alves@email.com");
        pessoa7.setCidade(cidade);

        Pessoa pessoa8 = new Pessoa();
        pessoa8.setCodigo(8L);
        pessoa8.setNome("Helena Costa");
        pessoa8.setCpf("963.258.147-44");
        pessoa8.setRg("96.325.814-7");
        pessoa8.setEndereco("Rua Copacabana");
        pessoa8.setNumero(888);
        pessoa8.setBairro("Copacabana");
        pessoa8.setCep("22050-444");
        pessoa8.setComplemento("Cobertura");
        pessoa8.setTelefone("21 3344-5566");
        pessoa8.setCelular("21 98987-6543");
        pessoa8.setEmail("helena.costa@email.com");
        pessoa8.setCidade(cidade);

        Pessoa pessoa9 = new Pessoa();
        pessoa9.setCodigo(new Long("9"));
        pessoa9.setNome("Rodrigo Santos");
        pessoa9.setCpf("147.258.369-55");
        pessoa9.setRg("14.725.836-9");
        pessoa9.setEndereco("Av. Contorno");
        pessoa9.setNumero(10);
        pessoa9.setBairro("Savassi");
        pessoa9.setCep("30140-555");
        pessoa9.setComplemento("Sala 10");
        pessoa9.setTelefone("31 4455-6677");
        pessoa9.setCelular("31 97654-3210");
        pessoa9.setEmail("rodrigo.santos@email.com");
        pessoa9.setCidade(cidade);

        Pessoa pessoa10 = new Pessoa();
        pessoa10.setCodigo(10L);
        pessoa10.setNome("Patricia Martins");
        pessoa10.setCpf("159.753.486-66");
        pessoa10.setRg("15.975.348-6");
        pessoa10.setEndereco("Rua dos Pinheiros");
        pessoa10.setNumero(1202);
        pessoa10.setBairro("Pinheiros");
        pessoa10.setCep("05422-666");
        pessoa10.setComplemento("Apto 1202");
        pessoa10.setTelefone("11 7788-8899");
        pessoa10.setCelular("11 96543-2109");
        pessoa10.setEmail("patricia.martins@email.com");
        pessoa10.setCidade(cidade);

        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.salvar(pessoa1);
        pessoaDao.salvar(pessoa2);
        pessoaDao.salvar(pessoa3);
        pessoaDao.salvar(pessoa4);
        pessoaDao.salvar(pessoa5);
        pessoaDao.salvar(pessoa6);
        pessoaDao.salvar(pessoa7);
        pessoaDao.salvar(pessoa8);
        pessoaDao.salvar(pessoa9);
        pessoaDao.salvar(pessoa10);

        System.out.println("10 pessoas salvas com sucesso!");
    }
}