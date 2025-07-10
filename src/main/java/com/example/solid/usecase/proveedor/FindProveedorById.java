package com.example.solid.usecase.proveedor;

import com.example.solid.entity.Proveedor;
import com.example.solid.repository.ProveedorRepository;
import org.springframework.stereotype.Component;

@Component
public class FindProveedorById {

    private final ProveedorRepository proveedorRepository;

    public FindProveedorById(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public Proveedor execute(Long id) {
        return proveedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor not found with id: " + id));
    }

}
