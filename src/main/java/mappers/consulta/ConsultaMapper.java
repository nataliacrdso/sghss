package mappers.consulta;

import dtos.consulta.ConsultaCreateDTO;
import dtos.consulta.ConsultaResponseDTO;
import models.Consulta;
import models.Paciente;
import models.ProfissionalDeSaude;
import org.springframework.stereotype.Component;

@Component
public class ConsultaMapper {

    public Consulta toEntity(
            ConsultaCreateDTO dto,
            Paciente paciente,
            ProfissionalDeSaude profissional
    ) {
        Consulta consulta = new Consulta();

        consulta.setDataConsulta(dto.getData());
        consulta.setMotivo(dto.getMotivo());
        consulta.setPaciente(paciente);
        consulta.setProfissional(profissional);
        return consulta;
    }

    public ConsultaResponseDTO toResponseDTO(Consulta consulta) {
        ConsultaResponseDTO dto = new ConsultaResponseDTO();

        dto.setId(consulta.getId());
        dto.setData(consulta.getDataConsulta());
        dto.setMotivo(consulta.getMotivo());

        dto.setPacienteId(
                consulta.getPaciente() != null ? consulta.getPaciente().getId() : null
        );

        dto.setProfissionalId(
                consulta.getProfissional() != null ? consulta.getProfissional().getId() : null
        );

        return dto;
    }
}

