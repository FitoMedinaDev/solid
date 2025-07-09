package com.example.solid.controller;

import com.example.solid.dto.proveedor.ProveedorCreateDto;
import com.example.solid.dto.proveedor.ProveedorDto;
import com.example.solid.service.proveedor.ProveedorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProveedorDto> getProveedorById(@PathVariable Long id) {
        ProveedorDto proveedor = proveedorService.getProveedorById(id);
        return ResponseEntity.ok(proveedor);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProveedorDto>> getAllProveedores() {
        List<ProveedorDto> proveedores = proveedorService.getAllProveedores();
        return ResponseEntity.ok(proveedores);
    }
}
