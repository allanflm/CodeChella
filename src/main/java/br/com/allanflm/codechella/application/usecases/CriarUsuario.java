package br.com.allanflm.codechella.application.usecases;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.allanflm.codechella.domain.entities.usuario.Usuario;

public class CriarUsuario {
    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}
