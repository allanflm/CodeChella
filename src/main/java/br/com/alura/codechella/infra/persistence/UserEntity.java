package br.com.alura.codechella.infra.persistence;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String name;
    private LocalDate birth;
    private String email;

    public UserEntity(String name, String cpf, LocalDate birth, String email) {
    }

    public UserEntity(String name, String email, String cpf, LocalDate birth) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
