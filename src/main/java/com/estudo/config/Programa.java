package com.estudo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudo.entities.Usuario;
import com.estudo.repositories.UsuarioRepositorie;

@Configuration
public class Programa implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorie rep;
	@Override
	public void run(String... args) throws Exception {
		
		//CRIADOS USUARIOS DE TESTE PARA PERSISTIR NO BANCO DE DADOS H2
		
		Usuario u1=new Usuario(null, "Tim", 24, "98646558709");
		Usuario u2=new Usuario(null, "Tom", 20, "87645369876");
		Usuario u3=new Usuario(null, "Ian", 28, "53665894785");
		
		rep.saveAll(Arrays.asList(u1,u2,u3)); //PERSISTIR USUARIOS NO BANCO DE DADOS
	}

}
