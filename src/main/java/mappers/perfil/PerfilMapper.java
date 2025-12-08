package mappers.perfil;

import dtos.perfil.PerfilCreateDTO;
import dtos.perfil.PerfilResponseDTO;
import models.Perfil;
import org.springframework.stereotype.Component;

@Component
public class PerfilMapper {

    public Perfil toEntity(PerfilCreateDTO dto) {
        Perfil perfil = new Perfil();
        perfil.setNome(dto.getNome());
        return perfil;
    }

    public PerfilResponseDTO toResponseDTO(Perfil perfil) {
        PerfilResponseDTO dto = new PerfilResponseDTO();
        dto.setId(perfil.getId());
        dto.setNome(perfil.getNome());
        return dto;
    }
}

