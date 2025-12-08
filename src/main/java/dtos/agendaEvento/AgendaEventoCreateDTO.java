package dtos.agendaEvento;

import lombok.Data;

@Data
public class AgendaEventoCreateDTO {
    private Long agendaId;
    private Long profissionalDeSaudeId;
    private String titulo;
    private String descricao;
    private String dataHora;
    private String horario;
}

