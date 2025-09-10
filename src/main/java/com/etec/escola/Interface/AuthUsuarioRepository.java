package com.etec.escola.Interface;

import com.etec.escola.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsernameAndSenha(String username, String senha);
}
