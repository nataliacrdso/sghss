package services;

import models.Leito;
import repository.LeitoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeitoService {

    private final LeitoRepository leitoRepository;

    public LeitoService(LeitoRepository leitoRepository) {
        this.leitoRepository = leitoRepository;
    }

    public List<Leito> findAll() {
        return leitoRepository.findAll();
    }

    public Leito findById(Long id) {
        return leitoRepository.findById(id).orElse(null);
    }

    public Leito create(Leito leito) {
        return leitoRepository.save(leito);
    }

    public Leito update(Long id, Leito leito) {
        Leito existing = leitoRepository.findById(id).orElse(null);
        if (existing == null) return null;
        leito.setId(id);
        return leitoRepository.save(leito);
    }

    public void delete(Long id) {
        leitoRepository.deleteById(id);
    }
}

