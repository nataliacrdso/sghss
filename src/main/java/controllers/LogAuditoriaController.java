package controllers;

import models.LogAuditoria;
import services.LogAuditoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/auditorias")
public class LogAuditoriaController {

    private final LogAuditoriaService service;

    public LogAuditoriaController(LogAuditoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<LogAuditoria> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LogAuditoria> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public LogAuditoria create(@RequestBody LogAuditoria auditoria) {
        return service.save(auditoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LogAuditoria> update(@PathVariable Long id, @RequestBody LogAuditoria auditoria) {
        return service.findById(id)
                .map(existing -> {
                    auditoria.setId(id);
                    return ResponseEntity.ok(service.save(auditoria));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isPresent()) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

