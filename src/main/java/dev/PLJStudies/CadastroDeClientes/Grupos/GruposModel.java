package dev.PLJStudies.CadastroDeClientes.Grupos;

import dev.PLJStudies.CadastroDeClientes.Cadastros.CadastroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "grupos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GruposModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia que será utilizada para gerar um Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "cadastro")
    private CadastroModel cadastro;

}
