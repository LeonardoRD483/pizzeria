package com.example.patternspizzeria.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Promocion {
    private String descripcion;
    private Boolean aplica2x1;
    private Boolean entregaGratis;
}