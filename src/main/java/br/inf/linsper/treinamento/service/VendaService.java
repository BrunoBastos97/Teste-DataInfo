package br.inf.linsper.treinamento.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inf.linsper.treinamento.entity.VendaEntity;
import br.inf.linsper.treinamento.repository.VendaRepository;

@Service
public class VendaService {

		@Autowired
		private VendaRepository vendaRepository;
		
		public void insert(VendaEntity entity) {
			vendaRepository.save(entity);
		}
		
		public VendaEntity findById(UUID id) {
			return vendaRepository.findById(id).orElse(null);
		}
}
