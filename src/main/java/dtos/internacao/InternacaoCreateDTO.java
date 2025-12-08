package dtos.internacao;

import lombok.Data;

@Data
public class InternacaoCreateDTO {
    private Long pacienteId;
    private Long leitoId;
    private String dataEntrada;
    private String motivo;
}

