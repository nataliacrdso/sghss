package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "internacoes")
public class Internacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "leito_id", nullable = false)
    private Leito leito;

    @ManyToOne
    @JoinColumn(name = "profissional_id", nullable = false)
    private ProfissionalDeSaude profissionalSaude;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @OneToMany(mappedBy = "internacao")
    private List<Prescricao> prescricoes;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public Leito getLeito() { return leito; }
    public void setLeito(Leito leito) { this.leito = leito; }

    public ProfissionalDeSaude getProfissionalSaude() { return profissionalSaude; }
    public void setProfissionalSaude(ProfissionalDeSaude profissionalSaude) { this.profissionalSaude = profissionalSaude; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public List<Prescricao> getPrescricoes() { return prescricoes; }
    public void setPrescricoes(List<Prescricao> prescricoes) { this.prescricoes = prescricoes; }
}
