package services;

import models.Exame;
import repository.ExameRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExameService {

    private final ExameRepository exameRepository;

    public ExameService(ExameRepository exameRepository) {
        this.exameRepository = exameRepository;
    }

    public List<Exame> findAll() {
        return exameRepository.findAll();
    }

    public Optional<Exame> findById(Long id) {
        return exameRepository.findById(id);
    }

    public Exame save(Exame exame) {
        return exameRepository.save(exame);
    }

    public Exame save(Long id, Exame exame) {
        Exame existing = exameRepository.findById(id).orElse(null);
        if (existing == null) return null;
        exame.setId(id);
        return exameRepository.save(exame);
    }

    public void delete(Long id) {
        exameRepository.deleteById(id);
    }
}

