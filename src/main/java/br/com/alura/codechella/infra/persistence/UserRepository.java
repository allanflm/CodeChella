package br.com.alura.codechella.infra.persistence;

import br.com.alura.codechella.domain.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    User registerUser(User usuario);

    List<User> listAll();
}
