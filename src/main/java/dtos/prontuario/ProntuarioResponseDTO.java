package dtos.prontuario;

import lombok.Data;

@Data
public class ProntuarioResponseDTO {
    private Long id;
    private Long pacienteId;
    private String observacoes;
    private String dataCriacao;
}

