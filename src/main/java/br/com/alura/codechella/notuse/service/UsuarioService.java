package br.com.alura.codechella.notuse.service;

import br.com.alura.codechella.notuse.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
