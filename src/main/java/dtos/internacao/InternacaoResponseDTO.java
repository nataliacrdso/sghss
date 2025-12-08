package dtos.internacao;

import lombok.Data;

@Data
public class InternacaoResponseDTO {
    private Long id;
    private Long pacienteId;
    private Long leitoId;
    private String dataEntrada;
    private String dataSaida;
    private String motivo;
}

