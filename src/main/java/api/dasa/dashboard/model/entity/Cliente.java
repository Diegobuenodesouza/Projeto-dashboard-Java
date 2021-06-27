package api.dasa.dashboard.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String tipo;
    private String situacao;
    private String estado;
    private String cidade;
    private String regiao;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<FaturaMensalCliente> listFatura = new ArrayList<>();

  }
