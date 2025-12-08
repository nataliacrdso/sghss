package dtos.prontuarioRegistro;

import lombok.Data;

@Data
public class ProntuarioRegistroCreateDTO {
    private Long prontuarioId;
    private String descricao;
    private String data;
}

