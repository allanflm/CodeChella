package br.com.allanflm.codechella.infra.gateways;

import br.com.allanflm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.allanflm.codechella.domain.entities.usuario.Usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarioEmArquivo implements RepositorioDeUsuario {

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario;
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarios;
    }

    public void gravarEmArquivo(String arquivo) {
        FileWriter file = null;
        try {
            file = new FileWriter(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file.write(this.usuarios.toString());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario alterarUsuario(String cpf, Usuario usuario) {
        return null;
    }

    @Override
    public void excluirUsuario(String cpf) {

    }
}
