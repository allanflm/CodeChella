package br.com.allanflm.codechella.application.usecases;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.allanflm.codechella.domain.entities.usuario.Usuario;

public class AlteralUsuario {
    private final RepositorioDeUsuario repositorioDeUsuario;

    public AlteralUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public Usuario alterarDadosUsuario(String cpf, Usuario usuario){
        return repositorioDeUsuario.alterarUsuario(cpf,usuario);
    }

}
