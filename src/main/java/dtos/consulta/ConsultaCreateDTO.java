package dtos.consulta;

import lombok.Data;

@Data
public class ConsultaCreateDTO {

    private String data;
    private String motivo;
    private Long pacienteId;
    private Long profissionalId;
}

