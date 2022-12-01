package org.soulcodeacademy.empresa.domain.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EnderecoDTO {

    @NotBlank(message = "Campo cidade é obrigatório.")
    private String cidade;

    @NotBlank(message = "Campo uf é obrigatório.")
    @Max(value = 2, message = "Campo inválido.")
    private String uf;

    @NotNull(message = "IdEmpregado é obrigatório.")
    private Integer idEmpregado;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(Integer idEmpregado) {
        this.idEmpregado = idEmpregado;
    }
}
