package com.estudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.entities.Usuario;
import com.estudo.repositories.UsuarioRepositorie;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepositorie usuarioResource;
	
	public List<Usuario> buscaUsuarios(){
		return usuarioResource.findAll();
	}
	
}
