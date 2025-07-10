package com.example.solid.usecase.producto;

import com.example.solid.entity.Producto;
import com.example.solid.repository.ProductoRepository;
import org.springframework.stereotype.Component;

@Component
public class FindProductoById {

    private final ProductoRepository productoRepository;

    public FindProductoById(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto execute(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto not found with id: " + id));
    }

}
