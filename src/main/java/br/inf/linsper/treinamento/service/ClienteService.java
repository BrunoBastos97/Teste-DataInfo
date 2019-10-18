package br.inf.linsper.treinamento.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inf.linsper.treinamento.entity.ClienteEntity;
import br.inf.linsper.treinamento.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void insert(ClienteEntity entity) {
		clienteRepository.save(entity);
	}
	
	public ClienteEntity findById(UUID id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	
	
}
