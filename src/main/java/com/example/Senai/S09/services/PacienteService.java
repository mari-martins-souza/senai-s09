package com.example.Senai.S09.services;

import com.example.Senai.S09.model.Paciente;
import com.example.Senai.S09.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente update(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void delete(Long id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente findById(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
}
