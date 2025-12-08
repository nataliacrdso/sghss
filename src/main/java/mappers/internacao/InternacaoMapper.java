package mappers.internacao;

import dtos.internacao.InternacaoCreateDTO;
import dtos.internacao.InternacaoResponseDTO;
import models.Internacao;
import models.Paciente;
import models.Leito;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class InternacaoMapper {

    public Internacao toEntity(InternacaoCreateDTO dto, Paciente paciente, Leito leito) {
        Internacao internacao = new Internacao();

        internacao.setPaciente(paciente);
        internacao.setLeito(leito);

        internacao.setDataEntrada(LocalDate.parse(dto.getDataEntrada()));
        internacao.setMotivo(dto.getMotivo());

        return internacao;
    }

    public InternacaoResponseDTO toResponseDTO(Internacao internacao) {
        InternacaoResponseDTO dto = new InternacaoResponseDTO();

        dto.setId(internacao.getId());
        dto.setPacienteId(internacao.getPaciente().getId());
        dto.setLeitoId(internacao.getLeito().getId());

        dto.setDataEntrada(internacao.getDataEntrada().toString());
        dto.setMotivo(internacao.getMotivo());

        dto.setDataSaida(
                internacao.getDataSaida() != null
                        ? internacao.getDataSaida().toString()
                        : null
        );

        return dto;
    }
}

