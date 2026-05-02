package dev.PLJStudies.CadastroDeClientes.Grupos;

import dev.PLJStudies.CadastroDeClientes.Cadastros.CadastroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "grupos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GruposModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia que será utilizada para gerar um Id
    private Integer id;

    @Column(unique = true)
    private String name;

    @OneToMany (mappedBy = "grupos")
    private List<CadastroModel> cadastro;

}
