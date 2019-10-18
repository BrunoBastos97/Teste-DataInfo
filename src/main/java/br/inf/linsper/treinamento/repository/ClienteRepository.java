package br.inf.linsper.treinamento.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.inf.linsper.treinamento.entity.ClienteEntity;
import br.inf.linsper.treinamento.entity.ProdutoEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, UUID>{
	
	public Optional<ClienteEntity> findById(UUID id);
}
