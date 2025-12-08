package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "profissionais_saude")

public class ProfissionalDeSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "profissionalDeSaude")
    private List<Prescricao> prescricoes;

    @OneToMany(mappedBy = "profissionalDeSaude")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "profissionalDeSaude")
    private List<Internacao> internacoes;

    @OneToMany(mappedBy = "profissionalDeSaude")
    private List<AgendaEvento> agendaEventos;

    private String nome;
    private String especialidade;
    private String registroProfissional; // CRM, CRO, COREN, etc.


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public List<Prescricao> getPrescricoes() { return prescricoes; }

    public void setPrescricoes(List<Prescricao> prescricoes) { this.prescricoes = prescricoes; }

    public List<Consulta> getConsultas() { return consultas; }

    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }

    public List<Internacao> getInternacoes() { return internacoes; }

    public void setInternacoes(List<Internacao> internacoes) { this.internacoes = internacoes; }

    public List<AgendaEvento> getAgendaEventos() { return agendaEventos; }

    public void setAgendaEventos(List<AgendaEvento> agendaEventos) { this.agendaEventos = agendaEventos; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getRegistroProfissional() { return registroProfissional; }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
