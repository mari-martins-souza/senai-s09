package com.example.Senai.S09.services;

import com.example.Senai.S09.model.Consulta;
import com.example.Senai.S09.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta save(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Consulta update(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public void delete(Long id) {
        consultaRepository.deleteById(id);
    }

    public Consulta findById(Long id) {
        return consultaRepository.findById(id).orElse(null);
    }

    public List<Consulta> listConsultas() {
        return consultaRepository.findAll();
    }

}