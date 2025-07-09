package com.example.solid.service;

import com.example.solid.dto.ProveedorCreateDto;
import com.example.solid.dto.ProveedorDto;
import com.example.solid.entity.Proveedor;
import com.example.solid.mapper.ProveedorMapper;
import com.example.solid.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;
    private final ProveedorMapper proveedorMapper;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository,
                                ProveedorMapper proveedorMapper) {
        this.proveedorRepository = proveedorRepository;
        this.proveedorMapper = proveedorMapper;
    }

    @Override
    public ProveedorDto createProveedor(ProveedorCreateDto proveedorCreateDto) {
        Proveedor proveedor = proveedorMapper.toEntity(proveedorCreateDto);
        return proveedorMapper.toDto(proveedorRepository.save(proveedor));
    }

    @Override
    public ProveedorDto getProveedorById(long id) {
        return proveedorRepository.findById(id)
                .map(proveedorMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Proveedor not found with id: " + id));
    }

    @Override
    public List<ProveedorDto> getAllProveedores() {
        return proveedorRepository.findAll()
                .stream()
                .map(proveedorMapper::toDto)
                .toList();
    }
}
