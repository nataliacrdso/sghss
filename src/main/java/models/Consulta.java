package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "consultas")

public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private ProfissionalDeSaude profissional;

    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private Agenda agenda;

    @OneToOne
    @JoinColumn(name = "prescricao_id")
    private Prescricao prescricao;

    @OneToMany(mappedBy = "consulta")
    private List<Exame> exames;


    private String dataConsulta;
    private String motivo;
    private String diagnostico;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Paciente getPaciente() { return paciente; }

    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfissionalDeSaude getProfissional() { return profissional; }

    public void setProfissional(ProfissionalDeSaude profissional) { this.profissional = profissional; }

    public Agenda getAgenda() { return agenda; }

    public void setAgenda(Agenda agenda) { this.agenda = agenda; }

    public Prescricao getPrescricao() { return prescricao; }

    public void setPrescricao(Prescricao prescricao) { this.prescricao = prescricao; }

    public List<Exame> getExames() { return exames; }

    public void setExames(List<Exame> exames) { this.exames = exames; }

    public String getDataConsulta() { return dataConsulta; }

    public void setDataConsulta(String dataConsulta) { this.dataConsulta = dataConsulta; }

    public String getMotivo() { return motivo; }

    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getDiagnostico() { return diagnostico; }

    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
}
