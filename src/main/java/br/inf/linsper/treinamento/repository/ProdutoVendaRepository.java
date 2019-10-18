package br.inf.linsper.treinamento.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.inf.linsper.treinamento.entity.ProdutoVendaEntity;

@Repository
public interface ProdutoVendaRepository extends CrudRepository<ProdutoVendaEntity, UUID>{
	
	public Optional<ProdutoVendaEntity> findById (UUID id);
	
	
}
