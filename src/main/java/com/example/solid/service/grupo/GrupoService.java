package com.example.solid.service.grupo;

import com.example.solid.dto.grupo.GrupoCreateDto;
import com.example.solid.dto.grupo.GrupoDto;

import java.util.List;

public interface GrupoService {

    GrupoDto createGrupo(GrupoCreateDto grupoCreateDto);

    GrupoDto getGrupoById(long id);

    List<GrupoDto> getAllGrupos();
}
