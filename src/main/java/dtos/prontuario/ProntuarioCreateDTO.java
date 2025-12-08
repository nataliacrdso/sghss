package dtos.prontuario;

import lombok.Data;

@Data
public class ProntuarioCreateDTO {
    private Long pacienteId;
    private String observacoes;
}

