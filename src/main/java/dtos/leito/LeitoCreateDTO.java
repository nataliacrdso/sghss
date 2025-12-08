package dtos.leito;

import lombok.Data;

@Data
public class LeitoCreateDTO {
    private String numero;
    private String tipo;
    private boolean ocupado;
}

