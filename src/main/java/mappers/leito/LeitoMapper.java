package mappers.leito;

import dtos.leito.LeitoCreateDTO;
import dtos.leito.LeitoResponseDTO;
import models.Leito;
import org.springframework.stereotype.Component;

@Component
public class LeitoMapper {

    public Leito toEntity(LeitoCreateDTO dto) {
        Leito leito = new Leito();

        leito.setCodigo(dto.getNumero());
        leito.setTipo(dto.getTipo());
        leito.setOcupado(dto.isOcupado());
        return leito;
    }

    public LeitoResponseDTO toResponseDTO(Leito leito) {
        LeitoResponseDTO dto = new LeitoResponseDTO();

        dto.setId(leito.getId());
        dto.setNumero(leito.getCodigo());
        dto.setTipo(leito.getTipo());
        dto.setOcupado(leito.isOcupado());
        return dto;
    }
}
