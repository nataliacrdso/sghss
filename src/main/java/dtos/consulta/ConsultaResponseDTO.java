package dtos.consulta;

import lombok.Data;

@Data
public class ConsultaResponseDTO {

    private Long id;
    private String data;
    private String motivo;
    private Long pacienteId;
    private Long profissionalId;
}

