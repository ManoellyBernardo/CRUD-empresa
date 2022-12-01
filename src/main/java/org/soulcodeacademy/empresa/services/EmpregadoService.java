package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.EmpregadoDTO;
import org.soulcodeacademy.empresa.reporsitories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadoService {

    @Autowired
    EmpregadoRepository empregadoRepository;

    public List<Empregado> listarEmpregados(){
        return this.empregadoRepository.findAll();
    }

    public Empregado getEmpregado(Integer idEmpregado){
        Optional<Empregado> empregado = this.empregadoRepository.findById(idEmpregado);

        if (empregado.isEmpty()){
            throw new RuntimeException ("Empregado não foi encontrado!");
        } else {
            return empregado.get();
        }
    }

    public Empregado salvarEmpregado(EmpregadoDTO empregadoDTO){

        Empregado novoEmpregado = new Empregado(null, empregadoDTO.getNome(), empregadoDTO.getEmail(), empregadoDTO.getSalario());

        Empregado empregadoSalvo = this.empregadoRepository.save(novoEmpregado);

        return empregadoSalvo;
    }


}
