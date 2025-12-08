package dtos.resultadoExame;

import lombok.Data;

@Data
public class ResultadoExameCreateDTO {
    private Long exameId;
    private String resultado;
    private String data;
}

