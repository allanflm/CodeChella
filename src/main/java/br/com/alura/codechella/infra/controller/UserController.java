package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.domain.entities.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUser createUser;

    public UserController(CreateUser createUser) {
        this.createUser = createUser;
    }

    @PostMapping
    public UserDTO registerUser(@RequestBody UserDTO dto) {
        User save = createUser.registerUser(new User(dto.cpf(), dto.name(), dto.birth(), dto.email()));
        return new UserDTO(save.getCpf(), save.getName(), save.getBirth(), save.getEmail());
    }
}
