package com.example.patternspizzeria.application.usecase;

import com.example.patternspizzeria.domain.Pedido;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class AplicarPromocionUseCase {

    public Pedido aplicarPromocion(Pedido pedido) {
        LocalDate fecha = pedido.getFecha();
        DayOfWeek diaSemana = fecha.getDayOfWeek();

        if (diaSemana == DayOfWeek.TUESDAY || diaSemana == DayOfWeek.WEDNESDAY) {
            pedido.setTotal(pedido.getTotal() / 2); // 2x1
        }

        if (diaSemana == DayOfWeek.THURSDAY) {
            pedido.setTotal(pedido.getTotal()); // Gratis delivery (agrega lógica si el delivery tiene costo)
        }

        return pedido;
    }
}
