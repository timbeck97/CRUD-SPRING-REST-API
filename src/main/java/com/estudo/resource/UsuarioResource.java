package com.estudo.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	@PostMapping
	public ResponseEntity<Usuario> insereUsuario(@RequestBody Usuario usuario){
		Usuario usuarioInserido=usuarioService.adicionaUsuario(usuario);
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).body(usuario);
	}
}
