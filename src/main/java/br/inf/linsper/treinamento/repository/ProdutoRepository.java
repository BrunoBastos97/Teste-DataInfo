package br.inf.linsper.treinamento.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.inf.linsper.treinamento.entity.ProdutoEntity;


@Repository
public interface ProdutoRepository  extends CrudRepository<ProdutoEntity, UUID>{
	
 	public Optional<ProdutoEntity> findById(UUID id);
	
	public List<ProdutoEntity> findByNome(String nome);
	
	@Query("SELECT p FROM ProdutoEntity p WHERE p.preco > 10")
	public List<ProdutoEntity> findAllPrecoMaiorQue10();

}
