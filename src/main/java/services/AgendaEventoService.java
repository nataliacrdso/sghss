package services;

import models.AgendaEvento;
import repository.AgendaEventoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AgendaEventoService {

    private final AgendaEventoRepository agendaEventoRepository;

    public AgendaEventoService(AgendaEventoRepository agendaEventoRepository) {
        this.agendaEventoRepository = agendaEventoRepository;
    }

    public List<AgendaEvento> findAll() {
        return agendaEventoRepository.findAll();
    }

    public Optional<AgendaEvento> findById(Long id) {
        return agendaEventoRepository.findById(id);
    }

    public AgendaEvento save(AgendaEvento evento) {
        return agendaEventoRepository.save(evento);
    }

    public AgendaEvento save(Long id, AgendaEvento evento) {
        AgendaEvento existing = agendaEventoRepository.findById(id).orElse(null);
        if (existing == null) return null;
        evento.setId(id);
        return agendaEventoRepository.save(evento);
    }

    public void delete(Long id) {
        agendaEventoRepository.deleteById(id);
    }
}
