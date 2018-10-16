package br.com.workshop.contacorrente.repository;

import br.com.workshop.contacorrente.model.Conta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContaRepository extends MongoRepository<Conta, String> {
}
