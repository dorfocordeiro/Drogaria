package br.com.rodolfo.drogaria.domain;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	@Column(length = 45, nullable = false)
	private String nome;

	@Column(length = 45, nullable = false)
	private String cpf;

	@Column(length = 45, nullable = false)
	private String rg;

	@Column(length = 100, nullable = false)
	private String endereco;

	@Column(nullable = false)
	private int numero;

	@Column(length = 45, nullable = false)
	private String bairro;

	@Column(length = 15, nullable = false)
	private String cep;

	@Column(length = 30)
	private String complemento;

	@Column(length = 45, nullable = false)
	private String telefone;

	@Column(length = 45, nullable = false)
	private String celular;

	@Column(length = 45, nullable = false)
	private String email;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
