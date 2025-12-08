package mappers.usuario;

import dtos.usuario.UsuarioCreateDTO;
import dtos.usuario.UsuarioResponseDTO;
import models.Perfil;
import models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toEntity(UsuarioCreateDTO dto, Perfil perfil) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.getPerfis().add(perfil);

        return usuario;
    }

    public UsuarioResponseDTO toResponseDTO(Usuario usuario) {
        UsuarioResponseDTO dto = new UsuarioResponseDTO();

        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getEmail());

        Perfil perfil = usuario.getPerfis().stream().findFirst().orElse(null);
        dto.setPerfilId(perfil != null ? perfil.getId() : null);

        return dto;
    }
}
