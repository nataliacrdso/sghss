package mappers.resultadoExame;

import dtos.resultadoExame.ResultadoExameCreateDTO;
import dtos.resultadoExame.ResultadoExameResponseDTO;
import models.ResultadoExame;
import models.Exame;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ResultadoExameMapper {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ResultadoExame toEntity(ResultadoExameCreateDTO dto, Exame exame) {
        ResultadoExame resultado = new ResultadoExame();

        resultado.setExame(exame);
        resultado.setResultado(dto.getResultado());

        if (dto.getData() != null) {
            resultado.setDataResultado(LocalDate.parse(dto.getData(), FORMATTER));
        }

        return resultado;
    }

    public ResultadoExameResponseDTO toResponseDTO(ResultadoExame resultado) {
        ResultadoExameResponseDTO dto = new ResultadoExameResponseDTO();

        dto.setId(resultado.getId());
        dto.setExameId(resultado.getExame().getId());
        dto.setResultado(resultado.getResultado());

        if (resultado.getDataResultado() != null) {
            dto.setData(resultado.getDataResultado().format(FORMATTER));
        }

        return dto;
    }

}

