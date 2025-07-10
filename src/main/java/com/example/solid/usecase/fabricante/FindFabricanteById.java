package com.example.solid.usecase.fabricante;

import com.example.solid.entity.Fabricante;
import com.example.solid.repository.FabricanteRepository;
import org.springframework.stereotype.Component;

@Component
public class FindFabricanteById {

    private final FabricanteRepository fabricanteRepository;

    public FindFabricanteById(FabricanteRepository fabricanteRepository) {
        this.fabricanteRepository = fabricanteRepository;
    }

    public Fabricante execute(Long id) {
        return fabricanteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fabricante not found with id: " + id));
    }

}
