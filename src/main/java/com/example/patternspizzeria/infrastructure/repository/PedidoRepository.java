package com.example.patternspizzeria.infrastructure.repository;

import com.example.patternspizzeria.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
