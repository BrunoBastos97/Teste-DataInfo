package br.inf.linsper.treinamento.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto") 
public class ProdutoEntity {
	
	@Id
	private UUID id;
	private String nome;
	private double preco;
	
	public ProdutoEntity() {
		
	}
	
	public ProdutoEntity(UUID id, String nome, double preco) {
		this.id=id;
		this.nome=nome;
		this.preco=preco;
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}

