package com.example.solid.dto.producto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductoDto {
    private Long id;
    private String nombre;
    private String nombreExtranjero;
    private BigDecimal peso;
    private String unidadMedida;
    private BigDecimal precioLista;
    private String codigoBarra;
    private String skuAlternante;
    private Boolean activo;

    private Long proveedorId;
    private String proveedorNombre;

    private Long fabricanteId;
    private String fabricanteNombre;

    private Long grupoId;
    private String grupoNombre;
}
