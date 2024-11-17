package com.example.patternspizzeria.infrastructure.repository;

import com.example.patternspizzeria.domain.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
