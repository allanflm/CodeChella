package br.com.allanflm.codechella.config;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.allanflm.codechella.application.usecases.AlteralUsuario;
import br.com.allanflm.codechella.application.usecases.CriarUsuario;
import br.com.allanflm.codechella.application.usecases.ExcluirUsuario;
import br.com.allanflm.codechella.application.usecases.ListarUsuarios;
import br.com.allanflm.codechella.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.allanflm.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.allanflm.codechella.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioDeUsuario repositorioDeUsuario){
        return new ListarUsuarios(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }

    @Bean
    AlteralUsuario alteralUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new AlteralUsuario(repositorioDeUsuario);
    }

    @Bean
    ExcluirUsuario excluirUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new ExcluirUsuario(repositorioDeUsuario);
    }
}
