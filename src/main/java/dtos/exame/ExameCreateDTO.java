package dtos.exame;

import lombok.Data;

@Data
public class ExameCreateDTO {
    private Long pacienteId;
    private String tipo;
    private String data;
}

