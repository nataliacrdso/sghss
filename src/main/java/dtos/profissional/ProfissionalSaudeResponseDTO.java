package dtos.profissional;

import lombok.Data;

@Data
public class ProfissionalSaudeResponseDTO {
    private Long id;
    private String nome;
    private String especialidade;
    private String registroProfissional;
}


