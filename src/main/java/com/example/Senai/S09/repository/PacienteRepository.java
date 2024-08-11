package com.example.Senai.S09.repository;

import com.example.Senai.S09.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
