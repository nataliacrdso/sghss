package repository;

import models.AgendaEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaEventoRepository extends JpaRepository<AgendaEvento, Long> {
}

