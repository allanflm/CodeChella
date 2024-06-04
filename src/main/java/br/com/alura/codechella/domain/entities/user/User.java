package br.com.alura.codechella.domain.entities.user;

import java.time.LocalDate;

public class User {
    private String name;
    private String cpf;
    private LocalDate birth; // Data de nascimento
    private String email;

    public User(String name, String cpf, LocalDate birth, String email) {
        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("cpf nao encontrado!");
        }
        this.name = name;
        this.cpf = cpf;
        this.birth = birth;
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
