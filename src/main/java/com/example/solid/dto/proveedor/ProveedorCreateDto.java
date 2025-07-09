package com.example.solid.dto.proveedor;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class ProveedorCreateDto {
    @NotNull
    private String nombre;
}
