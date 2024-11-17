package com.example.patternspizzeria.application.usecase;

import com.example.patternspizzeria.domain.Pizza;
import com.example.patternspizzeria.infrastructure.repository.PizzaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrearPizzaUseCase {
    private final PizzaRepository pizzaRepository;

    public CrearPizzaUseCase(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza crearPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }
}
