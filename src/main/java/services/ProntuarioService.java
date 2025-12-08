package services;

import models.Prontuario;
import repository.ProntuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProntuarioService {

    private final ProntuarioRepository prontuarioRepository;

    public ProntuarioService(ProntuarioRepository prontuarioRepository) {
        this.prontuarioRepository = prontuarioRepository;
    }

    public List<Prontuario> findAll() {
        return prontuarioRepository.findAll();
    }

    public Prontuario findById(Long id) {
        return prontuarioRepository.findById(id).orElse(null);
    }

    public Prontuario create(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    public Prontuario update(Long id, Prontuario prontuario) {
        Prontuario existing = prontuarioRepository.findById(id).orElse(null);
        if (existing == null) return null;
        prontuario.setId(id);
        return prontuarioRepository.save(prontuario);
    }

    public void delete(Long id) {
        prontuarioRepository.deleteById(id);
    }
}

