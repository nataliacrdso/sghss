package dtos.resultadoExame;

import lombok.Data;

@Data
public class ResultadoExameResponseDTO {
    private Long id;
    private Long exameId;
    private String resultado;
    private String data;
}

