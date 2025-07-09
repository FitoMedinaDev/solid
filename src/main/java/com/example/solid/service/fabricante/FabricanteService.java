package com.example.solid.service.fabricante;

import com.example.solid.dto.fabricante.FabricanteCreateDto;
import com.example.solid.dto.fabricante.FabricanteDto;

import java.util.List;

public interface FabricanteService {

    FabricanteDto createFabricante(FabricanteCreateDto fabricanteCreateDto);

    FabricanteDto getFabricanteById(long id);

    List<FabricanteDto> getAllFabricantes();
}
