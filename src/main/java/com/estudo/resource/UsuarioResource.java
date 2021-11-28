package com.estudo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<List<Usuario>> buscaUsuarios(){   //metodo para retornar todos usarios 
		//abaixo foram criados alguns usuarios para testar o endpoint /usuarios
		Usuario u1=new Usuario(1L, "Tim", 24, "986");
		Usuario u2=new Usuario(2L, "Tom", 20, "876");
		Usuario u3=new Usuario(3L, "Ian", 28, "536");
		List<Usuario> lista=Arrays.asList(u1,u2,u3);
		return ResponseEntity.ok().body(lista);
	}
}
