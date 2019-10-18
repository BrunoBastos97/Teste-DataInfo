package br.inf.linsper.treinamento.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto_venda")
public class ProdutoVendaEntity {
	
	@Id
	private UUID id;
	@ManyToOne
	@JoinColumn
	private VendaEntity venda;
	private int quantidade;
	@ManyToOne
	@JoinColumn
	private ProdutoEntity produto;
	private double valor;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public VendaEntity getVenda() {
		return venda;
	}
	public void setVenda(VendaEntity venda) {
		this.venda = venda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public ProdutoEntity getProduto() {
		return produto;
	}
	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
