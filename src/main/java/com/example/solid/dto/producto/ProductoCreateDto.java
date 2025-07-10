package com.example.solid.dto.producto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Data
public class ProductoCreateDto {
    @NotNull
    private String nombre;
    @NotNull
    private String nombreExtranjero;
    @NotNull
    private BigDecimal peso;
    @NotNull
    private String unidadMedida;
    @NotNull
    private BigDecimal precioLista;
    @NotNull
    private String codigoBarra;
    @NotNull
    private String skuAlternante;
    @NotNull
    private Boolean activo;
    @NotNull
    private Long proveedorId;
    @NotNull
    private Long fabricanteId;
    @NotNull
    private Long grupoId;
}
