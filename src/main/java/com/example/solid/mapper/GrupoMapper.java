package com.example.solid.mapper;

import com.example.solid.dto.grupo.GrupoCreateDto;
import com.example.solid.dto.grupo.GrupoDto;
import com.example.solid.entity.Grupo;
import org.springframework.stereotype.Component;

@Component
public class GrupoMapper {

    public GrupoDto toDto(Grupo grupo) {
        if (grupo == null) {
            return null;
        }
        GrupoDto dto = new GrupoDto();
        dto.setId(grupo.getId());
        dto.setNombre(grupo.getNombreGrupo());
        return dto;
    }

    public static Grupo toEntity(GrupoCreateDto createDto) {
        if (createDto == null) {
            return null;
        }
        Grupo grupo = new Grupo();
        grupo.setNombreGrupo(createDto.getNombre());
        return grupo;
    }
}
