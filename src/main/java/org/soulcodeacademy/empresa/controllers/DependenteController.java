package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Dependente;
import org.soulcodeacademy.empresa.services.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DependenteController {

    @Autowired
    DependenteService dependenteService;

    @GetMapping("/dependentes")
    public List<Dependente> listarDependentes(){
        return this.dependenteService.listarDependentes();
    }

    @GetMapping("/dependentes/{idDependente}")
    public Dependente getDependente(@PathVariable Integer idDependente){
        return this.dependenteService.getDependete(idDependente);
    }
}
