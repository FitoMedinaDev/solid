package com.example.solid.controller;

import com.example.solid.dto.producto.ProductoCreateDto;
import com.example.solid.dto.producto.ProductoDto;
import com.example.solid.service.producto.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public ResponseEntity<ProductoDto> createFabricante(@Valid @RequestBody ProductoCreateDto productoCreateDto) {
        ProductoDto producto = productoService.createProducto(productoCreateDto);
        return ResponseEntity.ok(producto);
    }

    @GetMapping
    public ResponseEntity<List<ProductoDto>> getAllProductos() {
        List<ProductoDto> productos = productoService.getAllProducto();
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDto> getProductoById(@PathVariable long id) {
        ProductoDto producto = productoService.getProductoById(id);
        return ResponseEntity.ok(producto);
    }

}
