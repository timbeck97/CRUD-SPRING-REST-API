package com.estudo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.entities.Usuario;
import com.estudo.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping
	public ResponseEntity<List<Usuario>> buscaUsuarios(){   //metodo para retornar todos usarios 
		return ResponseEntity.ok().body(usuarioService.buscaUsuarios());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> buscaUsuario(@PathVariable Long id){
		return ResponseEntity.ok().body(usuarioService.buscaUsuario(id));
	}
}
