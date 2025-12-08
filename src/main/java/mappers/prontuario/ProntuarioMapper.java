package mappers.prontuario;

import dtos.prontuario.ProntuarioCreateDTO;
import dtos.prontuario.ProntuarioResponseDTO;
import models.Prontuario;
import models.Paciente;
import org.springframework.stereotype.Component;

@Component
public class ProntuarioMapper {

    public Prontuario toEntity(ProntuarioCreateDTO dto, Paciente paciente) {
        Prontuario prontuario = new Prontuario();
        prontuario.setPaciente(paciente);
        return prontuario;
    }

    public ProntuarioResponseDTO toResponseDTO(Prontuario prontuario) {
        ProntuarioResponseDTO dto = new ProntuarioResponseDTO();

        dto.setId(prontuario.getId());
        dto.setPacienteId(prontuario.getPaciente().getId());
        dto.setObservacoes(null);
        dto.setDataCriacao(null);
        return dto;
    }

}

