package br.com.allanflm.codechella;

import br.com.allanflm.codechella.domain.entities.usuario.Usuario;
import br.com.allanflm.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-12","Allan",
                LocalDate.parse("2000-09-09"),"allan@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-12","Felipe",
                LocalDate.parse("2000-09-09"),"felipe@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-12","Matheus",
                LocalDate.parse("2000-09-09"),"matheus@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("123.456.789-12","Thais",
                LocalDate.parse("2000-09-09"),"thais@email.com"));

        //System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
        repositorioDeUsuarioEmArquivo.gravarEmArquivo("usuarios.txt");
    }
}
