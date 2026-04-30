package dev.PLJStudies.CadastroDeClientes.Cadastros;

import dev.PLJStudies.CadastroDeClientes.Grupos.GruposModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    private String cpf;

    private String email;

    @ManyToOne
    @JoinColumn(name = "cadastros_id")
    private GruposModel grupos;

}
