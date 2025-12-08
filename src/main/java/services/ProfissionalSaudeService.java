package services;

import models.ProfissionalDeSaude;
import repository.ProfissionalSaudeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfissionalSaudeService {

    private final ProfissionalSaudeRepository profissionalSaudeRepository;

    public ProfissionalSaudeService(ProfissionalSaudeRepository profissionalSaudeRepository) {
        this.profissionalSaudeRepository = profissionalSaudeRepository;
    }

    public List<ProfissionalDeSaude> findAll() {
        return profissionalSaudeRepository.findAll();
    }

    public ProfissionalDeSaude findById(Long id) {
        return profissionalSaudeRepository.findById(id).orElse(null);
    }

    public ProfissionalDeSaude create(ProfissionalDeSaude profissional) {
        return profissionalSaudeRepository.save(profissional);
    }

    public ProfissionalDeSaude update(Long id, ProfissionalDeSaude profissional) {
        ProfissionalDeSaude existing = profissionalSaudeRepository.findById(id).orElse(null);
        if (existing == null) return null;
        profissional.setId(id);
        return profissionalSaudeRepository.save(profissional);
    }

    public void delete(Long id) {
        profissionalSaudeRepository.deleteById(id);
    }
}

