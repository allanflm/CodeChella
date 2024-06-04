package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public class JPAUserRepositories implements UserRepository {

    private final UserRepository repository;

    public JPAUserRepositories(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User registerUser(User user) {

    }

    @Override
    public List<User> listAll() {
        return List.of();
    }
}
