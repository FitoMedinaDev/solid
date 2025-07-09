package com.example.solid.service;

import com.example.solid.dto.ProveedorCreateDto;
import com.example.solid.dto.ProveedorDto;

import java.util.List;

public interface ProveedorService {

    ProveedorDto createProveedor(ProveedorCreateDto proveedorCreateDto);
    ProveedorDto getProveedorById(long id);
    List<ProveedorDto> getAllProveedores();
}
