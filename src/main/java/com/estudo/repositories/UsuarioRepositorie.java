package com.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.entities.Usuario;

public interface UsuarioRepositorie extends JpaRepository<Usuario, Long> {

}
