package br.com.alura.codechella.notuse.repository;

import br.com.alura.codechella.notuse.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
