package dtos.prontuarioRegistro;

import lombok.Data;

@Data
public class ProntuarioRegistroResponseDTO {
    private Long id;
    private Long prontuarioId;
    private String descricao;
    private String data;
}

