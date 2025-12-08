package mappers.profissional;

import dtos.profissional.ProfissionalSaudeCreateDTO;
import dtos.profissional.ProfissionalSaudeResponseDTO;
import models.ProfissionalDeSaude;
import org.springframework.stereotype.Component;

@Component
public class ProfissionalSaudeMapper {


    public ProfissionalDeSaude toEntity(ProfissionalSaudeCreateDTO dto) {
        ProfissionalDeSaude profissional = new ProfissionalDeSaude();
        profissional.setNome(dto.getNome());
        profissional.setEspecialidade(dto.getEspecialidade());
        profissional.setRegistroProfissional(dto.getRegistroProfissional());
        return profissional;
    }

    public ProfissionalSaudeResponseDTO toResponseDTO(ProfissionalDeSaude profissional) {
        ProfissionalSaudeResponseDTO dto = new ProfissionalSaudeResponseDTO();
        dto.setId(profissional.getId());
        dto.setNome(profissional.getNome());
        dto.setEspecialidade(profissional.getEspecialidade());
        dto.setRegistroProfissional(profissional.getRegistroProfissional());
        return dto;
    }

}
