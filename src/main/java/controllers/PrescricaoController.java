package controllers;

import models.Prescricao;
import services.PrescricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescricoes")
public class PrescricaoController {

    @Autowired
    private PrescricaoService prescricaoService;

    @GetMapping
    public List<Prescricao> getAll() {
        return prescricaoService.findAll();
    }

    @GetMapping("/{id}")
    public Prescricao getById(@PathVariable Long id) {
        return prescricaoService.findById(id);
    }

    @PostMapping
    public Prescricao create(@RequestBody Prescricao prescricao) {
        return prescricaoService.create(prescricao);
    }

    @PutMapping("/{id}")
    public Prescricao update(@PathVariable Long id, @RequestBody Prescricao prescricao) {
        return prescricaoService.update(id, prescricao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        prescricaoService.delete(id);
    }
}

