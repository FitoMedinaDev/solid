package com.example.solid.mapper;

import com.example.solid.dto.producto.ProductoDto;
import com.example.solid.entity.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductoDto toDto(Producto producto) {
        ProductoDto dto = new ProductoDto();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setNombreExtranjero(producto.getNombreExtranjero());
        dto.setPeso(producto.getPeso());
        dto.setUnidadMedida(producto.getUnidadMedida());
        dto.setPrecioLista(producto.getPrecioLista());
        dto.setCodigoBarra(producto.getCodigoBarra());
        dto.setSkuAlternante(producto.getSkuAlternante());
        dto.setActivo(producto.getActivo());

        dto.setProveedorId(producto.getProveedor().getId());
        dto.setProveedorNombre(producto.getProveedor().getNombreProveedor());

        dto.setFabricanteId(producto.getFabricante().getId());
        dto.setFabricanteNombre(producto.getFabricante().getNombreFabricante());

        dto.setGrupoId(producto.getGrupo().getId());
        dto.setGrupoNombre(producto.getGrupo().getNombreGrupo());

        return dto;
    }

}
