package br.inf.linsper.treinamento.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inf.linsper.treinamento.entity.ProdutoEntity;
import br.inf.linsper.treinamento.repository.ProdutoRepository;

@Service
public class ProdutoService{
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void insert(ProdutoEntity entity) {
		produtoRepository.save(entity);
	}
	
	public ProdutoEntity findById(UUID id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public  List<ProdutoEntity> consultaProdutoPorNome(String nome) {
		return produtoRepository.findByNome(nome);
	}
	
	public List<ProdutoEntity> buscaMaiorQue10() {
		return produtoRepository.findAllPrecoMaiorQue10();
		
	}

	
}
