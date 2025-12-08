package controllers;

import models.Internacao;
import services.InternacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internacoes")
public class InternacaoController {

    private final InternacaoService service;

    public InternacaoController(InternacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Internacao> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Internacao> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Internacao create(@RequestBody Internacao internacao) {
        return service.save(internacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Internacao> update(@PathVariable Long id, @RequestBody Internacao internacao) {
        return service.findById(id)
                .map(existing -> {
                    internacao.setId(id);
                    return ResponseEntity.ok(service.save(internacao));
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

