package services;

import models.Agenda;
import repository.AgendaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

   public Optional<Agenda> findById(Long id) {
        return agendaRepository.findById(id);
    }

    public Agenda create(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public Agenda update(Long id, Agenda agenda) {
        Agenda existing = agendaRepository.findById(id).orElse(null);
        if (existing == null) return null;
        agenda.setId(id);
        return agendaRepository.save(agenda);
    }

    public void delete(Long id) {
        agendaRepository.deleteById(id);
    }
}

