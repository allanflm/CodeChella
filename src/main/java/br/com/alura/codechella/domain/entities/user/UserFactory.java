package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class UserFactory {
    private User user;

    public User withNameCpfBirth(String name, String cpf, LocalDate birth) {
        this.user = new User(name, cpf, birth, "");
        return this.user;
    }

    public User includedAddress(String cep, Integer number, String complement) {
        this.user.setAddress(new Address(cep, number, complement));
        return this.user;
    }
}
