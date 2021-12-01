package com.estudo.services;

import java.util.List;
import java.util.Optional;

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
	public Usuario buscaUsuario(Long id) {
		Optional<Usuario> usuario=usuarioResource.findById(id);
		return usuario.get();
	}
	public Usuario adicionaUsuario(Usuario u) {
		return usuarioResource.save(u);
	}
	public Usuario atualizaUsuario(Long id, Usuario u) {
		Usuario user = usuarioResource.getById(id);
		user.setNome(u.getNome());
		user.setIdade(u.getIdade());
		user.setCpf(u.getCpf());
		return usuarioResource.save(user);
	}
	public void deletaUsuario(Long id) {
		usuarioResource.deleteById(id);
	}
	
}
