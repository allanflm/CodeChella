package br.com.allanflm.codechella.application.usecases;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;

public class ExcluirUsuario {
    private final RepositorioDeUsuario repositorioDeUsuario;

    public ExcluirUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public void excluirUsuario(String cpf){
         repositorioDeUsuario.excluirUsuario(cpf);
    }
}
