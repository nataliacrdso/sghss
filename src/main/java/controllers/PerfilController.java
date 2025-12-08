package controllers;

import models.Perfil;
import services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<Perfil> getAll() {
        return perfilService.findAll();
    }

    @GetMapping("/{id}")
    public Perfil getById(@PathVariable Long id) {
        return perfilService.findById(id);
    }

    @PostMapping
    public Perfil create(@RequestBody Perfil perfil) {
        return perfilService.save(perfil);
    }

    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id, @RequestBody Perfil perfil) {
        return perfilService.update(id, perfil);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        perfilService.delete(id);
    }
}

