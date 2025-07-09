package com.example.solid.service.proveedor;

import com.example.solid.dto.proveedor.ProveedorCreateDto;
import com.example.solid.dto.proveedor.ProveedorDto;

import java.util.List;

public interface ProveedorService {

    ProveedorDto createProveedor(ProveedorCreateDto proveedorCreateDto);

    ProveedorDto getProveedorById(long id);

    List<ProveedorDto> getAllProveedores();
}
