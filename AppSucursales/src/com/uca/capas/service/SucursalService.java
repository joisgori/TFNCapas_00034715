package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	//PASO 2, creo la interfaz de servicios, como capa de seguridad, donde har� espacio para llamar los m�todos del PASO 1 del CRUD
	public List<Sucursal> findAll();
	
	//public Sucursal findOne(Integer id);
	public Sucursal findOne(Integer id);
	
	
	
	//------Ahora, para hacer los inserts...
	//creo un m�todo save
	public Sucursal save(Sucursal suc);
	
	//Ahora creo el m�todo para el delete...
	public void deleteById(Integer id);

}
