package br.com.workshop.contacorrente.service;

import br.com.workshop.contacorrente.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaCorrenteService {

    private ContaRepository contaRepo;

    public ContaCorrenteService(ContaRepository contaRepo) {
        this.contaRepo = contaRepo;
    }
}
