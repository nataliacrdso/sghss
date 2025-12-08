package dtos.agenda;

import lombok.Data;

@Data
public class AgendaCreateDTO {
    private Long profissionalId;
    private String descricao;
}

