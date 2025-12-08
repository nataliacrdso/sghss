package dtos.paciente;

import lombok.Data;

@Data
public class PacienteResponseDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
}

