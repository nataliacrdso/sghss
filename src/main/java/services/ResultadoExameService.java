package services;

import models.ResultadoExame;
import repository.ResultadoExameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultadoExameService {

    private final ResultadoExameRepository resultadoExameRepository;

    public ResultadoExameService(ResultadoExameRepository resultadoExameRepository) {
        this.resultadoExameRepository = resultadoExameRepository;
    }

    public List<ResultadoExame> findAll() {
        return resultadoExameRepository.findAll();
    }

    public ResultadoExame findById(Long id) {
        return resultadoExameRepository.findById(id).orElse(null);
    }

    public ResultadoExame create(ResultadoExame resultado) {
        return resultadoExameRepository.save(resultado);
    }

    public ResultadoExame update(Long id, ResultadoExame resultado) {
        ResultadoExame existing = resultadoExameRepository.findById(id).orElse(null);
        if (existing == null) return null;
        resultado.setId(id);
        return resultadoExameRepository.save(resultado);
    }

    public void delete(Long id) {
        resultadoExameRepository.deleteById(id);
    }
}

