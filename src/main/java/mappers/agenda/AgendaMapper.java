package mappers.agenda;

import dtos.agenda.AgendaCreateDTO;
import dtos.agenda.AgendaResponseDTO;
import models.Agenda;
import org.springframework.stereotype.Component;

@Component
public class AgendaMapper {


    public Agenda toEntity(AgendaCreateDTO dto) {
        Agenda agenda = new Agenda();
        agenda.setDescricao(dto.getDescricao());
        return agenda;
    }

    public AgendaResponseDTO toResponseDTO(Agenda agenda) {
        AgendaResponseDTO dto = new AgendaResponseDTO();
        dto.setId(agenda.getId());
        dto.setDescricao(agenda.getDescricao());
        return dto;
    }


}

