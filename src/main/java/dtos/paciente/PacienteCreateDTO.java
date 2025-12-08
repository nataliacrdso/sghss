package dtos.paciente;

import lombok.Data;

@Data
public class PacienteCreateDTO {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
}
