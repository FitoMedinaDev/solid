package com.example.solid.usecase.producto;

import com.example.solid.entity.Producto;
import com.example.solid.repository.ProductoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllProducto {

    private final ProductoRepository productoRepository;

    public FindAllProducto(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> execute() {
        return productoRepository.findAll();
    }

}
