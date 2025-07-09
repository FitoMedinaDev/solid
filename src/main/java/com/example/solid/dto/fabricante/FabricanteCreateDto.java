package com.example.solid.dto.fabricante;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class FabricanteCreateDto {
    @NotNull
    private String nombre;
}
