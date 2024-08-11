package com.example.Senai.S09.controller;

import com.example.Senai.S09.model.Endereco;
import com.example.Senai.S09.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public Endereco create(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable Long id, @RequestBody Endereco endereco) {
        endereco.setEndereco_id(id);
        return enderecoService.update(endereco);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        enderecoService.delete(id);
    }

    @GetMapping("/{id}")
    public Endereco findById(@PathVariable Long id) {
        return enderecoService.findById(id);
    }
}
