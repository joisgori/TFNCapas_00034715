package com.uca.service;

import java.util.List;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	//PASO 2, creo la interfaz de servicios, como capa de seguridad, donde har� espacio para llamar los m�todos del PASO 1 del CRUD
	public List<Sucursal> findAll();
	
	//public Sucursal findOne(Integer id);
	public List<Sucursal> findOne(Integer id);

}
