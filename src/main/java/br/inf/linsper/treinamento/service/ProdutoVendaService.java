package br.inf.linsper.treinamento.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inf.linsper.treinamento.entity.ProdutoVendaEntity;
import br.inf.linsper.treinamento.repository.ProdutoVendaRepository;

@Service
public class ProdutoVendaService {

	@Autowired
	private ProdutoVendaRepository produtoVendaRepository;
	
	public void insert(ProdutoVendaEntity entity) {
		produtoVendaRepository.save(entity);
	}
	
	public ProdutoVendaEntity findById(UUID id) {
		return produtoVendaRepository.findById(id).orElse(null);
	}

	public List<ProdutoVendaEntity> buscaPorIdVenda(UUID id) {
		List<ProdutoVendaEntity> resultado = (List<ProdutoVendaEntity>) produtoVendaRepository.findAll();
		return resultado;
	}
	
}
