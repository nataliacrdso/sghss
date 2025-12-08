package services;

import models.Internacao;
import repository.InternacaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InternacaoService {

    private final InternacaoRepository internacaoRepository;

    public InternacaoService(InternacaoRepository internacaoRepository) {
        this.internacaoRepository = internacaoRepository;
    }

    public List<Internacao> findAll() {
        return internacaoRepository.findAll();
    }

    public Optional<Internacao> findById(Long id) {
        return internacaoRepository.findById(id);
    }

    public Internacao save(Internacao internacao) {
        return internacaoRepository.save(internacao);
    }

    public Internacao save(Long id, Internacao internacao) {
        Internacao existing = internacaoRepository.findById(id).orElse(null);
        if (existing == null) return null;
        internacao.setId(id);
        return internacaoRepository.save(internacao);
    }

    public void delete(Long id) {
        internacaoRepository.deleteById(id);
    }
}

