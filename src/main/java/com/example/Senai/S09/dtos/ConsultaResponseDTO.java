package com.example.Senai.S09.dtos;

import java.time.LocalDateTime;
import java.util.Date;

public class ConsultaResponseDTO {
    private Long consulta_id;
    private Long nutricionista_id;
    private Long paciente_id;
    private Date data_da_consulta;
    private String observacoes;

    public String getNomeNutricionista() {
        return nomeNutricionista;
    }

    public void setNomeNutricionista(String nomeNutricionista) {
        this.nomeNutricionista = nomeNutricionista;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    private String nomeNutricionista;
    private String nomePaciente;

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    private LocalDateTime dataHora;

    public Long getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(Long consulta_id) {
        this.consulta_id = consulta_id;
    }

    public Long getNutricionista_id() {
        return nutricionista_id;
    }

    public void setNutricionista_id(Long nutricionista_id) {
        this.nutricionista_id = nutricionista_id;
    }

    public Long getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Date getData_da_consulta() {
        return data_da_consulta;
    }

    public void setData_da_consulta(Date data_da_consulta) {
        this.data_da_consulta = data_da_consulta;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
