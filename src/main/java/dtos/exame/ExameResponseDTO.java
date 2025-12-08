package dtos.exame;

import lombok.Data;

@Data
public class ExameResponseDTO {
    private Long id;
    private Long pacienteId;
    private String tipo;
    private String data;
}

