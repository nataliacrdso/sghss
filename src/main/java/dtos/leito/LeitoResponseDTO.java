package dtos.leito;

import lombok.Data;

@Data
public class LeitoResponseDTO {
    private Long id;
    private String numero;
    private String tipo;
    private boolean ocupado;
}

