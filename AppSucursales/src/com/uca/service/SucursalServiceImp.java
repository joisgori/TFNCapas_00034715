package com.uca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImp implements SucursalService {

	//PASO 3, hago el autowired de la interfaz de repositorio
	@Autowired
	SucursalRepository sucursalRepository;
	
	public List<Sucursal> findAll() {
		// TODO Auto-generated method stub
		return sucursalRepository.findAll(); //PASO 4, En la implementación retorno la función findAll con la lógica ya de Jpa
	}

	public List<Sucursal> findOne(Integer id) {
		// TODO Auto-generated method stub
		return sucursalRepository.findByCodigoSucursal(id);
	}

}
