package com.example.Senai.S09.repository;

import com.example.Senai.S09.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {
    Nutricionista findByNome(String nome);
}
