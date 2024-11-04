package br.com.alura.sm_frases.controller;

import br.com.alura.sm_frases.dto.FraseDTO;
import br.com.alura.sm_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("series/frases")
    private FraseDTO frases() {
        return fraseService.obterFrases();
    }
}
