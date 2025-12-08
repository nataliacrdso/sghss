package mappers.logAuditoria;

import dtos.logAuditoria.LogAuditoriaCreateDTO;
import dtos.logAuditoria.LogAuditoriaResponseDTO;
import models.LogAuditoria;
import models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class LogAuditoriaMapper {

    public LogAuditoria toEntity(LogAuditoriaCreateDTO dto, Usuario usuario) {
        LogAuditoria log = new LogAuditoria();
        log.setAcao(dto.getAcao());
        log.setDescricao(dto.getDescricao());
        log.setDataHora(dto.getDataHora());
        log.setUsuario(usuario);
        return log;
    }

    public LogAuditoriaResponseDTO toResponseDTO(LogAuditoria log) {
        LogAuditoriaResponseDTO dto = new LogAuditoriaResponseDTO();

        dto.setId(log.getId());
        dto.setAcao(log.getAcao());
        dto.setDescricao(log.getDescricao());
        dto.setDataHora(log.getDataHora());

        if (log.getUsuario() != null) {
            dto.setUsuarioId(log.getUsuario().getId());
        }

        return dto;
    }
}

