package api.dasa.dashboard.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "fatura")
public class FaturaMensalCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "MM/yyyy")
    private LocalDate data;

    private Double receita;

    private Integer volume;

    private Double precoMedio;

    private Double receitaCovid;

    private Integer volumeCovid;

    private Double precoMedioCovid;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;



}
