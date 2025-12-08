package mappers.agendaEvento;

import models.AgendaEvento;
import dtos.agendaEvento.AgendaEventoCreateDTO;
import dtos.agendaEvento.AgendaEventoResponseDTO;

public class AgendaEventoMapper {

    public static AgendaEventoResponseDTO toResponseDTO(AgendaEvento entity) {
        if (entity == null) return null;

        AgendaEventoResponseDTO dto = new AgendaEventoResponseDTO();
        dto.setId(entity.getId());

        if (entity.getDataHora() != null && entity.getDataHora().contains(" ")) {
            String[] partes = entity.getDataHora().split(" ");
            dto.setDataHora(partes[0]);
            dto.setHorario(partes[1]);
        }

        dto.setDescricao(entity.getDescricao());

        dto.setAgendaId(entity.getAgenda() != null ? entity.getAgenda().getId() : null);

        return dto;
    }


    public static AgendaEvento toEntity(AgendaEventoCreateDTO dto) {
        if (dto == null) return null;

        AgendaEvento entity = new AgendaEvento();

        if (dto.getDataHora() != null && dto.getHorario() != null) {
            entity.setDataHora(dto.getDataHora() + " " + dto.getHorario());
        }

        entity.setDescricao(dto.getDescricao());

        return entity;
    }
}


