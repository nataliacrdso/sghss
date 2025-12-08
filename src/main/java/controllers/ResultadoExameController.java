package controllers;

import models.ResultadoExame;
import services.ResultadoExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultados-exame")
public class ResultadoExameController {

    @Autowired
    private ResultadoExameService resultadoExameService;

    @GetMapping
    public List<ResultadoExame> getAll() {
        return resultadoExameService.findAll();
    }

    @GetMapping("/{id}")
    public ResultadoExame getById(@PathVariable Long id) {
        return resultadoExameService.findById(id);
    }

    @PostMapping
    public ResultadoExame create(@RequestBody ResultadoExame resultado) {
        return resultadoExameService.create(resultado);
    }

    @PutMapping("/{id}")
    public ResultadoExame update(@PathVariable Long id, @RequestBody ResultadoExame resultado) {
        return resultadoExameService.update(id, resultado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        resultadoExameService.delete(id);
    }
}

