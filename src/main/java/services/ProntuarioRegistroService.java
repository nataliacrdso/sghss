package services;

import models.ProntuarioRegistro;
import repository.ProntuarioRegistroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProntuarioRegistroService {

    private final ProntuarioRegistroRepository prontuarioRegistroRepository;

    public ProntuarioRegistroService(ProntuarioRegistroRepository prontuarioRegistroRepository) {
        this.prontuarioRegistroRepository = prontuarioRegistroRepository;
    }

    public List<ProntuarioRegistro> findAll() {
        return prontuarioRegistroRepository.findAll();
    }

    public ProntuarioRegistro findById(Long id) {
        return prontuarioRegistroRepository.findById(id).orElse(null);
    }

    public ProntuarioRegistro create(ProntuarioRegistro registro) {
        return prontuarioRegistroRepository.save(registro);
    }

    public ProntuarioRegistro update(Long id, ProntuarioRegistro registro) {
        ProntuarioRegistro existing = prontuarioRegistroRepository.findById(id).orElse(null);
        if (existing == null) return null;
        registro.setId(id);
        return prontuarioRegistroRepository.save(registro);
    }

    public void delete(Long id) {
        prontuarioRegistroRepository.deleteById(id);
    }
}

