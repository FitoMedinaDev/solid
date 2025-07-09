package com.example.solid.mapper;

import com.example.solid.dto.fabricante.FabricanteCreateDto;
import com.example.solid.dto.fabricante.FabricanteDto;
import com.example.solid.entity.Fabricante;
import org.springframework.stereotype.Component;

@Component
public class FabricanteMapper {

    public FabricanteDto toDto(Fabricante fabricante) {
        if (fabricante == null) {
            return null;
        }
        FabricanteDto dto = new FabricanteDto();
        dto.setId(fabricante.getId());
        dto.setNombre(fabricante.getNombreFabricante());
        return dto;
    }

    public static Fabricante toEntity(FabricanteCreateDto createDto) {
        if (createDto == null) {
            return null;
        }
        Fabricante fabricante = new Fabricante();
        fabricante.setNombreFabricante(createDto.getNombre());
        return fabricante;
    }
}
