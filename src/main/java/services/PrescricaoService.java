package services;

import models.Prescricao;
import repository.PrescricaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrescricaoService {

    private final PrescricaoRepository prescricaoRepository;

    public PrescricaoService(PrescricaoRepository prescricaoRepository) {
        this.prescricaoRepository = prescricaoRepository;
    }

    public List<Prescricao> findAll() {
        return prescricaoRepository.findAll();
    }

    public Prescricao findById(Long id) {
        return prescricaoRepository.findById(id).orElse(null);
    }

    public Prescricao create(Prescricao prescricao) {
        return prescricaoRepository.save(prescricao);
    }

    public Prescricao update(Long id, Prescricao prescricao) {
        Prescricao existing = prescricaoRepository.findById(id).orElse(null);
        if (existing == null) return null;
        prescricao.setId(id);
        return prescricaoRepository.save(prescricao);
    }

    public void delete(Long id) {
        prescricaoRepository.deleteById(id);
    }
}

