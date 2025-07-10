package com.example.solid.service.producto;

import com.example.solid.dto.producto.ProductoCreateDto;
import com.example.solid.dto.producto.ProductoDto;
import com.example.solid.mapper.ProductoMapper;
import com.example.solid.usecase.producto.CreateProducto;
import com.example.solid.usecase.producto.FindAllProducto;
import com.example.solid.usecase.producto.FindProductoById;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoMapper productoMapper;
    private final CreateProducto createProducto;
    private final FindAllProducto findAllProducto;
    private final FindProductoById findProductoById;

    public ProductoServiceImpl(ProductoMapper productoMapper, CreateProducto createProducto, FindAllProducto findAllProducto, FindProductoById findProductoById) {
        this.productoMapper = productoMapper;
        this.createProducto = createProducto;
        this.findAllProducto = findAllProducto;
        this.findProductoById = findProductoById;
    }

    @Override
    public ProductoDto createProducto(ProductoCreateDto productoCreateDto) {
        return createProducto.execute(productoCreateDto);
    }

    @Override
    public ProductoDto getProductoById(long id) {
        return productoMapper.toDto(findProductoById.execute(id));
    }

    @Override
    public List<ProductoDto> getAllProducto() {
        return findAllProducto.execute()
                .stream()
                .map(productoMapper::toDto)
                .toList();
    }
}
