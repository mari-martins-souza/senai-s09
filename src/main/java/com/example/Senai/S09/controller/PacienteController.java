package com.example.Senai.S09.controller;

import com.example.Senai.S09.model.Paciente;
import com.example.Senai.S09.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public Paciente create(@RequestBody Paciente paciente) {
        return pacienteService.save(paciente);
    }

    @PutMapping("/{id}")
    public Paciente update(@PathVariable Long id, @RequestBody Paciente paciente) {
        paciente.setPaciente_id(id);
        return pacienteService.update(paciente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pacienteService.delete(id);
    }

    @GetMapping("/{id}")
    public Paciente findById(@PathVariable Long id) {
        return pacienteService.findById(id);
    }
}

