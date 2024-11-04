package br.com.alura.sm_frases.service;

import br.com.alura.sm_frases.dto.FraseDTO;
import br.com.alura.sm_frases.model.Frase;
import br.com.alura.sm_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFrases() {
        Frase frase = repository.findRandomFrase();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
