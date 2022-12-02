package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Dependente;
import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.DependenteDTO;
import org.soulcodeacademy.empresa.reporsitories.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependenteService {

    @Autowired
    DependenteRepository dependenteRepository;

    public List<Dependente> listarDependentes(){
        return this.dependenteRepository.findAll();
    }

    public Dependente getDependete(Integer idDependente){
        Optional<Dependente> dependente = this.dependenteRepository.findById(idDependente);

        if(dependente.isEmpty()) {
            throw new RuntimeException("O dependente não foi encontrado!");
        }else{
            return dependente.get();
        }
    }
}
