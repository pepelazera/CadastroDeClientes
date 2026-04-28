package dev.PLJStudies.CadastroDeClientes;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente") // Nome da tabela
public class ClientesModel {

    @Id
    // Usado para falar como vamos implementar a tatica de gerar o Id automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Nesse caso, a ESTRATEGIA (strategy) utilizada foi o IDENTITY (identificar por numeros)
    private Long id;
    private String nome;
    private String cpf;
    private String email;

    // No args constructor
    public ClientesModel() {
    }

    // All args constructor
    public ClientesModel(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
