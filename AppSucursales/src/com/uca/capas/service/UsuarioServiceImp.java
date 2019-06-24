package com.uca.capas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;
import com.uca.capas.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario findByUsuarioAndContraseña(String us, String co) {
		return usuarioRepository.findByUsuarioAndContraseña(us, co);
	}

}
