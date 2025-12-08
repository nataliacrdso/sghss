package controllers;

import models.ProfissionalDeSaude;
import services.ProfissionalSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalSaudeController {

    @Autowired
    private ProfissionalSaudeService profissionalSaudeService;

    @GetMapping
    public List<ProfissionalDeSaude> getAll() {
        return profissionalSaudeService.findAll();
    }

    @GetMapping("/{id}")
    public ProfissionalDeSaude getById(@PathVariable Long id) {
        return profissionalSaudeService.findById(id);
    }

    @PostMapping
    public ProfissionalDeSaude create(@RequestBody ProfissionalDeSaude prof) {
        return profissionalSaudeService.create(prof);
    }

    @PutMapping("/{id}")
    public ProfissionalDeSaude update(@PathVariable Long id, @RequestBody ProfissionalDeSaude prof) {
        return profissionalSaudeService.update(id, prof);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        profissionalSaudeService.delete(id);
    }
}

