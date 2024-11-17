package com.example.patternspizzeria.infrastructure.controller;

import com.example.patternspizzeria.application.usecase.CrearPizzaUseCase;
import com.example.patternspizzeria.domain.Pizza;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    private final CrearPizzaUseCase crearPizzaUseCase;

    public PizzaController(CrearPizzaUseCase crearPizzaUseCase) {
        this.crearPizzaUseCase = crearPizzaUseCase;
    }

    @PostMapping
    public Pizza crearPizza(@RequestBody Pizza pizza) {
        return crearPizzaUseCase.crearPizza(pizza);
    }
}
