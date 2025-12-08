package controllers;

import dtos.agendaEvento.AgendaEventoCreateDTO;
import dtos.agendaEvento.AgendaEventoResponseDTO;
import models.AgendaEvento;
import services.AgendaEventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping("/eventos")
public class AgendaEventoController {

    private final AgendaEventoService agendaEventoService;

    private AgendaEvento toEntity(AgendaEventoCreateDTO dto) {
        AgendaEvento e = new AgendaEvento();
        e.setTitulo(dto.getTitulo());
        e.setDescricao(dto.getDescricao());
        e.setDataHora(dto.getDataHora());
        return e;
    }

    private AgendaEventoResponseDTO toDTO(AgendaEvento e) {
        AgendaEventoResponseDTO dto = new AgendaEventoResponseDTO();
        dto.setId(e.getId());
        dto.setTitulo(e.getTitulo());
        dto.setDescricao(e.getDescricao());
        dto.setDataHora(e.getDataHora());
        return dto;
    }


    public AgendaEventoController(AgendaEventoService agendaEventoService) {
        this.agendaEventoService = agendaEventoService;
    }

    @GetMapping
    public List<AgendaEvento> getAll() {
        return agendaEventoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendaEvento> getById(@PathVariable Long id) {
        return agendaEventoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AgendaEvento create(@RequestBody AgendaEvento evento) {
        return agendaEventoService.save(evento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendaEvento> update(@PathVariable Long id, @RequestBody AgendaEvento evento) {
        return agendaEventoService.findById(id)
                .map(existing -> {
                    evento.setId(id);
                    return ResponseEntity.ok(agendaEventoService.save(evento));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (agendaEventoService.findById(id).isPresent()) {
            agendaEventoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
