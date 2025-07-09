package com.example.solid.controller;

import com.example.solid.dto.fabricante.FabricanteCreateDto;
import com.example.solid.dto.fabricante.FabricanteDto;
import com.example.solid.service.fabricante.FabricanteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fabricante")
public class FabricanteController {

    private final FabricanteService fabricanteService;

    public FabricanteController(FabricanteService fabricanteService) {
        this.fabricanteService = fabricanteService;
    }

    @PostMapping
    public ResponseEntity<FabricanteDto> createFabricante(@Valid @RequestBody FabricanteCreateDto fabricanteCreateDto) {
        FabricanteDto fabricante = fabricanteService.createFabricante(fabricanteCreateDto);
        return ResponseEntity.ok(fabricante);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FabricanteDto> getFabricanteById(@PathVariable Long id) {
        FabricanteDto fabricante = fabricanteService.getFabricanteById(id);
        return ResponseEntity.ok(fabricante);
    }

    @GetMapping("/all")
    public ResponseEntity<List<FabricanteDto>> getAllFabricantes() {
        List<FabricanteDto> fabricantes = fabricanteService.getAllFabricantes();
        return ResponseEntity.ok(fabricantes);
    }
}
