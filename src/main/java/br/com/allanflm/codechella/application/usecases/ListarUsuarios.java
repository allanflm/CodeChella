package br.com.allanflm.codechella.application.usecases;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.allanflm.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositorioDeUsuario repositorio;

    public ListarUsuarios(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> obterTodosUsuario(){
        return this.repositorio.listarTodos();
    }
}
