package controllers;

import models.Leito;
import services.LeitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/leitos")
public class LeitoController {

    @Autowired
    private LeitoService leitoService;

    @GetMapping
    public List<Leito> getAll() {
        return leitoService.findAll();
    }

    @GetMapping("/{id}")
    public Leito getById(@PathVariable Long id) {
        return leitoService.findById(id);
    }

    @PostMapping
    public Leito create(@RequestBody Leito leito) {
        return leitoService.create(leito);
    }

    @PutMapping("/{id}")
    public Leito update(@PathVariable Long id, @RequestBody Leito leito) {
        return leitoService.update(id, leito);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        leitoService.delete(id);
    }
}

