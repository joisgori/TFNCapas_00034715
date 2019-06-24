package com.uca.capas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UsuarioRepository;

public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario findByUsuarioAndContraseña(String us, String co) {
		return usuarioRepository.findByUsuarioAndContraseña(us, co);
	}

}
