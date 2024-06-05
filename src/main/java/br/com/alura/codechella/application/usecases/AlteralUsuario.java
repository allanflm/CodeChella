package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class AlteralUsuario {
    private final RepositorioDeUsuario repositorioDeUsuario;

    public AlteralUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public Usuario alterarDadosUsuario(String cpf, Usuario usuario){
        return repositorioDeUsuario.alterarUsuario(cpf,usuario);
    }

}
