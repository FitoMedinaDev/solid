package com.example.solid.dto.grupo;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class GrupoCreateDto {
    @NotNull
    private String nombre;
}
