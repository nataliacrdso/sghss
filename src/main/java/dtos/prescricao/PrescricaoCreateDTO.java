package dtos.prescricao;

import lombok.Data;

@Data
public class PrescricaoCreateDTO {
    private Long prontuarioId;
    private String descricao;
    private String data;
}

