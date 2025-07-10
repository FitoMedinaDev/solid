package com.example.solid.usecase.grupo;

import com.example.solid.entity.Grupo;
import com.example.solid.repository.GrupoRepository;
import org.springframework.stereotype.Component;

@Component
public class FindGrupoById {

    private final GrupoRepository grupoRepository;

    public FindGrupoById(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public Grupo execute(Long id) {
        return grupoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Group not found with id: " + id));
    }

}
