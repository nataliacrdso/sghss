package controllers;

import models.ProntuarioRegistro;
import services.ProntuarioRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prontuarios/registros")
public class ProntuarioRegistroController {

    @Autowired
    private ProntuarioRegistroService registroService;

    @GetMapping
    public List<ProntuarioRegistro> getAll() {
        return registroService.findAll();
    }

    @GetMapping("/{id}")
    public ProntuarioRegistro getById(@PathVariable Long id) {
        return registroService.findById(id);
    }

    @PostMapping
    public ProntuarioRegistro create(@RequestBody ProntuarioRegistro registro) {
        return registroService.create(registro);
    }

    @PutMapping("/{id}")
    public ProntuarioRegistro update(@PathVariable Long id, @RequestBody ProntuarioRegistro registro) {
        return registroService.update(id, registro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        registroService.delete(id);
    }
}