package mappers.exame;

import dtos.exame.ExameCreateDTO;
import dtos.exame.ExameResponseDTO;
import models.Exame;
import models.Paciente;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class ExameMapper {

    public Exame toEntity(ExameCreateDTO dto, Paciente paciente) {
        Exame exame = new Exame();

        exame.setPaciente(paciente);
        exame.setTipo(dto.getTipo());
        exame.setDataSolicitacao(LocalDate.parse(dto.getData()));
        return exame;
    }

    public ExameResponseDTO toResponseDTO(Exame exame) {
        ExameResponseDTO dto = new ExameResponseDTO();

        dto.setId(exame.getId());
        dto.setPacienteId(exame.getPaciente().getId());
        dto.setTipo(exame.getTipo());
        dto.setData(exame.getDataSolicitacao().toString());
        return dto;
    }
}

