package controllers;

import models.Prontuario;
import services.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @GetMapping
    public List<Prontuario> getAll() {
        return prontuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Prontuario getById(@PathVariable Long id) {
        return prontuarioService.findById(id);
    }

    @PostMapping
    public Prontuario create(@RequestBody Prontuario prontuario) {
        return prontuarioService.create(prontuario);
    }

    @PutMapping("/{id}")
    public Prontuario update(@PathVariable Long id, @RequestBody Prontuario prontuario) {
        return prontuarioService.update(id, prontuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        prontuarioService.delete(id);
    }
}

