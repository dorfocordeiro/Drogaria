package br.com.rodolfo.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ItemVenda extends GenericDomain{
	@Column(nullable = false)
	private short quantidade;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorParcial;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Venda venda;
	

}
