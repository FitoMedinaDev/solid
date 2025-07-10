package com.example.solid.usecase.producto;

import com.example.solid.dto.producto.ProductoCreateDto;
import com.example.solid.dto.producto.ProductoDto;
import com.example.solid.entity.Fabricante;
import com.example.solid.entity.Grupo;
import com.example.solid.entity.Producto;
import com.example.solid.entity.Proveedor;
import com.example.solid.mapper.ProductoMapper;
import com.example.solid.repository.ProductoRepository;
import com.example.solid.usecase.fabricante.FindFabricanteById;
import com.example.solid.usecase.grupo.FindGrupoById;
import com.example.solid.usecase.proveedor.FindProveedorById;
import org.springframework.stereotype.Component;

@Component
public class CreateProducto {

    private final FindProveedorById findProveedorById;
    private final FindFabricanteById findFabricanteById;
    private final FindGrupoById findGrupoById;
    private final ProductoRepository productoRepository;
    private final ProductoMapper productoMapper;

    public CreateProducto(FindProveedorById findProveedorById, FindFabricanteById findFabricanteById,
                          FindGrupoById findGrupoById, ProductoRepository productoRepository, ProductoMapper productoMapper) {
        this.findProveedorById = findProveedorById;
        this.findFabricanteById = findFabricanteById;
        this.findGrupoById = findGrupoById;
        this.productoRepository = productoRepository;
        this.productoMapper = productoMapper;
    }

    public ProductoDto execute(ProductoCreateDto dto) {
        Proveedor proveedor = findProveedorById.execute(dto.getProveedorId());
        Fabricante fabricante = findFabricanteById.execute(dto.getFabricanteId());
        Grupo grupo = findGrupoById.execute(dto.getGrupoId());

        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setNombreExtranjero(dto.getNombreExtranjero());
        producto.setPeso(dto.getPeso());
        producto.setUnidadMedida(dto.getUnidadMedida());
        producto.setPrecioLista(dto.getPrecioLista());
        producto.setCodigoBarra(dto.getCodigoBarra());
        producto.setSkuAlternante(dto.getSkuAlternante());
        producto.setActivo(dto.getActivo() != null ? dto.getActivo() : true);
        producto.setProveedor(proveedor);
        producto.setFabricante(fabricante);
        producto.setGrupo(grupo);

        Producto guardado = productoRepository.save(producto);

        return productoMapper.toDto(guardado);

    }
}
