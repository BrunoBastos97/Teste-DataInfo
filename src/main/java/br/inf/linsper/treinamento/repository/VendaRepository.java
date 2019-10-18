package br.inf.linsper.treinamento.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.inf.linsper.treinamento.entity.VendaEntity;

@Repository
public interface VendaRepository  extends CrudRepository<VendaEntity, UUID> {
	
	public Optional<VendaEntity> findById(UUID id);
}
