package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.persistence.UserEntity;

import java.util.List;

public class JPAUserRepositories implements UserRepository {

    private final UserRepository repository;
    private final UserEntityMapper mapper;

    public JPAUserRepositories(UserRepository repository, UserEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public User registerUser(User user) {
        UserEntity entity = mapper.toEntity(user);
        repository.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<User> listAll() {
//        return List.of();
        return null;
    }
}
