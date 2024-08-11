package com.example.Senai.S09.dtos;

public class NutricionistaRequestDTO {
    private String matricula;
    private Integer tempo_de_experiencia;
    private Long endereco_id;
    private String crn;
    private String especialidade;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getTempo_de_experiencia() {
        return tempo_de_experiencia;
    }

    public void setTempo_de_experiencia(Integer tempo_de_experiencia) {
        this.tempo_de_experiencia = tempo_de_experiencia;
    }

    public Long getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Long endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
