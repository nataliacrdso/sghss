package controllers;

import models.Exame;
import services.ExameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/exames")
public class ExameController {

    private final ExameService service;

    public ExameController(ExameService service) {
        this.service = service;
    }

    @GetMapping
    public List<Exame> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exame> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Exame create(@RequestBody Exame exame) {
        return service.save(exame);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exame> update(@PathVariable Long id, @RequestBody Exame exame) {
        return service.findById(id)
                .map(existing -> {
                    exame.setId(id);
                    return ResponseEntity.ok(service.save(exame));
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

