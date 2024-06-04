package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;
    private String cpf;
    private LocalDate birth; // Data de nascimento
    private String email;

    private Address address;

    public User(String name, String cpf, LocalDate birth, String email) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("cpf not found!");
        }

        int age = Period.between(birth, LocalDate.now()).getYears();

        if (age < 18) {
            throw new IllegalArgumentException("User must be at least 18 years of age!");
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
