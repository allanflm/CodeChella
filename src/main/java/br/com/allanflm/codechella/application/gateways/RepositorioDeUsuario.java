package br.com.allanflm.codechella.application.gateways;

import br.com.allanflm.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

    Usuario alterarUsuario(String cpf, Usuario usuario);

    void excluirUsuario(String cpf);
}
