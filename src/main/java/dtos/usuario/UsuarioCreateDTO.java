package dtos.usuario;

import lombok.Data;

@Data
public class UsuarioCreateDTO {
    private String nome;
    private String email;
    private String senha;
    private Long perfilId;
}
