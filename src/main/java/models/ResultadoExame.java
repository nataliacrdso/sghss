package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "resultados_exame")

public class ResultadoExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultado;

    private LocalDate dataResultado;


    @OneToOne
    @JoinColumn(name = "exame_id", nullable = false, unique = true)
    private Exame exame;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    public LocalDate getDataResultado() { return dataResultado; }
    public void setDataResultado(LocalDate dataResultado) { this.dataResultado = dataResultado; }

    public Exame getExame() { return exame; }
    public void setExame(Exame exame) { this.exame = exame; }
}
