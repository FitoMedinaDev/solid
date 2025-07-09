package com.example.solid.mapper;

import com.example.solid.dto.proveedor.ProveedorCreateDto;
import com.example.solid.dto.proveedor.ProveedorDto;
import com.example.solid.entity.Proveedor;
import org.springframework.stereotype.Component;

@Component
public class ProveedorMapper {

    public ProveedorDto toDto(Proveedor proveedor) {
        if (proveedor == null) {
            return null;
        }
        ProveedorDto dto = new ProveedorDto();
        dto.setId(proveedor.getId());
        dto.setNombre(proveedor.getNombreProveedor());
        return dto;
    }

    public static Proveedor toEntity(ProveedorCreateDto createDto) {
        if (createDto == null) {
            return null;
        }
        Proveedor proveedor = new Proveedor();
        proveedor.setNombreProveedor(createDto.getNombre());
        return proveedor;
    }
}
