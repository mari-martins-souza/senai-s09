package com.example.Senai.S09.services;

import com.example.Senai.S09.model.Nutricionista;
import com.example.Senai.S09.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutricionistaService {
    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Nutricionista save(Nutricionista nutricionista) {
        Nutricionista existeNutricionista = nutricionistaRepository.findByNome(nutricionista.getNome());
        if (existeNutricionista != null) {
            throw new RuntimeException("Nutricionista já existe");
        }
        return nutricionistaRepository.save(nutricionista);
    }

    public Nutricionista update(Nutricionista nutricionista) {
        return nutricionistaRepository.save(nutricionista);
    }

    public void delete(Long id) {
        nutricionistaRepository.deleteById(id);
    }

    public Nutricionista findById(Long id) {
        return nutricionistaRepository.findById(id).orElse(null);
    }

    public Nutricionista addAnoExperiencia(Long id) {
        Nutricionista nutricionista = findById(id);
        if (nutricionista == null) {
            throw new RuntimeException("Nutricionista não encontrado");
        }
        nutricionista.setTempo_de_experiencia(nutricionista.getTempo_de_experiencia() + 1);
        return update(nutricionista);
    }

    public Nutricionista addCertificado(Long id, String certificacao) {
        Nutricionista nutricionista = findById(id);
        if (nutricionista == null) {
            throw new RuntimeException("Nutricionista não encontrado");
        }
        nutricionista.getCertificacoes().add(certificacao);
        return update(nutricionista);
    }
}
