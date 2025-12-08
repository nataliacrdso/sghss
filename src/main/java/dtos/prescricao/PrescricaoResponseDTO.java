package dtos.prescricao;

import lombok.Data;

@Data
public class PrescricaoResponseDTO {
    private Long id;
    private Long prontuarioId;
    private String descricao;
    private String data;
}
