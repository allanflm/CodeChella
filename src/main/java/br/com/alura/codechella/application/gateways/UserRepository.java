package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public interface UserRepository {
    User registerUser(User usuario);

    List<User> listAll();
}