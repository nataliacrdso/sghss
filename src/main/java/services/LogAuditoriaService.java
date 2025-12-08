package services;

import models.LogAuditoria;
import repository.LogAuditoriaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LogAuditoriaService {

    private final LogAuditoriaRepository logAuditoriaRepository;

    public LogAuditoriaService(LogAuditoriaRepository logAuditoriaRepository) {
        this.logAuditoriaRepository = logAuditoriaRepository;
    }

    public List<LogAuditoria> findAll() {
        return logAuditoriaRepository.findAll();
    }

    public Optional<LogAuditoria> findById(Long id) {
        return logAuditoriaRepository.findById(id);
    }

    public LogAuditoria save(LogAuditoria log) {
        return logAuditoriaRepository.save(log);
    }

    public LogAuditoria save(Long id, LogAuditoria log) {
        LogAuditoria existing = logAuditoriaRepository.findById(id).orElse(null);
        if (existing == null) return null;
        log.setId(id);
        return logAuditoriaRepository.save(log);
    }

    public void delete(Long id) {
        logAuditoriaRepository.deleteById(id);
    }
}

