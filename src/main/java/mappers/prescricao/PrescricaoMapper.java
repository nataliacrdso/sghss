package mappers.prescricao;

import dtos.prescricao.PrescricaoCreateDTO;
import dtos.prescricao.PrescricaoResponseDTO;
import models.Prescricao;
import models.Paciente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrescricaoMapper {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Prescricao toEntity(PrescricaoCreateDTO dto, Paciente paciente) {
        Prescricao prescricao = new Prescricao();

        prescricao.setDescricao(dto.getDescricao());

        if (dto.getData() != null) {
            prescricao.setDataPrescricao(LocalDateTime.parse(dto.getData(), FORMATTER));
        }

        prescricao.setPaciente(paciente);

        return prescricao;
    }

    public static PrescricaoResponseDTO toResponseDTO(Prescricao prescricao) {
        PrescricaoResponseDTO dto = new PrescricaoResponseDTO();

        dto.setId(prescricao.getId());
        dto.setProntuarioId(
                prescricao.getPaciente() != null ? prescricao.getPaciente().getId() : null
        );
        dto.setDescricao(prescricao.getDescricao());

        if (prescricao.getDataPrescricao() != null) {
            dto.setData(prescricao.getDataPrescricao().format(FORMATTER));
        }

        return dto;
    }
}

