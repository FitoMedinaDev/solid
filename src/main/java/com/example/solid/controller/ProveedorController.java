package com.example.solid.controller;

import com.example.solid.dto.ProveedorCreateDto;
import com.example.solid.dto.ProveedorDto;
import com.example.solid.service.ProveedorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @PostMapping
    public ResponseEntity<ProveedorDto> createProveedor(@Valid @RequestBody ProveedorCreateDto proveedorDto) {
        ProveedorDto createdProveedor = proveedorService.createProveedor(proveedorDto);
        return ResponseEntity.ok(createdProveedor);
    }
}
