package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;
import java.time.Period;


public class Usuario {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("cpf no padrão incorreto!");
        }
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;

        int idade = Period.between(nascimento, LocalDate.now()).getYears();

        // Verifica se a idade é inferior a 18 anos e lança uma exceção se for
        if (idade < 18) {
            throw new IllegalArgumentException("Usuário deve ter pelo menos 18 anos de idade!");
        }

    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
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

    private String email;
}