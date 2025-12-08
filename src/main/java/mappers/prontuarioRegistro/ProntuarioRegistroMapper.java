package mappers.prontuarioRegistro;

import dtos.prontuarioRegistro.ProntuarioRegistroCreateDTO;
import dtos.prontuarioRegistro.ProntuarioRegistroResponseDTO;
import models.ProntuarioRegistro;
import models.Prontuario;
import org.springframework.stereotype.Component;

@Component
public class ProntuarioRegistroMapper {

    public ProntuarioRegistro toEntity(ProntuarioRegistroCreateDTO dto, Prontuario prontuario) {
        ProntuarioRegistro registro = new ProntuarioRegistro();

        registro.setProntuario(prontuario);
        registro.setDescricao(dto.getDescricao());
        registro.setDataRegistro(dto.getData());

        return registro;
    }

    public ProntuarioRegistroResponseDTO toResponseDTO(ProntuarioRegistro registro) {
        ProntuarioRegistroResponseDTO dto = new ProntuarioRegistroResponseDTO();

        dto.setId(registro.getId());
        dto.setProntuarioId(registro.getProntuario().getId());
        dto.setDescricao(registro.getDescricao());
        dto.setData(registro.getDataRegistro());

        return dto;
    }

}

