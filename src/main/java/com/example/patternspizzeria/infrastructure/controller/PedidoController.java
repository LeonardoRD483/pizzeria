package com.example.patternspizzeria.infrastructure.controller;

import com.example.patternspizzeria.application.usecase.AplicarPromocionUseCase;
import com.example.patternspizzeria.domain.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final AplicarPromocionUseCase aplicarPromocionUseCase;

    public PedidoController(AplicarPromocionUseCase aplicarPromocionUseCase) {
        this.aplicarPromocionUseCase = aplicarPromocionUseCase;
    }

    @PostMapping
    public Pedido realizarPedido(@RequestBody Pedido pedido) {
        return aplicarPromocionUseCase.aplicarPromocion(pedido);
    }
}
