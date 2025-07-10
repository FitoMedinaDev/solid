package com.example.solid.service.producto;

import com.example.solid.dto.producto.ProductoCreateDto;
import com.example.solid.dto.producto.ProductoDto;

import java.util.List;

public interface ProductoService {

    ProductoDto createProducto(ProductoCreateDto productoCreateDto);

    ProductoDto getProductoById(long id);

    List<ProductoDto> getAllProducto();
}
