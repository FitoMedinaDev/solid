package com.example.solid.controller;

import com.example.solid.dto.grupo.GrupoCreateDto;
import com.example.solid.dto.grupo.GrupoDto;
import com.example.solid.service.grupo.GrupoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grupo")
public class GrupoController {

    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @PostMapping
    public ResponseEntity<GrupoDto> createFabricante(@Valid @RequestBody GrupoCreateDto grupoCreateDto) {
        GrupoDto grupo = grupoService.createGrupo(grupoCreateDto);
        return ResponseEntity.ok(grupo);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GrupoDto> getFabricanteById(@PathVariable Long id) {
        GrupoDto fabricante = grupoService.getGrupoById(id);
        return ResponseEntity.ok(fabricante);
    }

    @GetMapping("/all")
    public ResponseEntity<List<GrupoDto>> getAllFabricantes() {
        List<GrupoDto> fabricantes = grupoService.getAllGrupos();
        return ResponseEntity.ok(fabricantes);
    }
}
