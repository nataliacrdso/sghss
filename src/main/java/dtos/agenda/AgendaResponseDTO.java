package dtos.agenda;

import lombok.Data;

@Data
public class AgendaResponseDTO {
    private Long id;
    private Long profissionalId;
    private String descricao;
}

