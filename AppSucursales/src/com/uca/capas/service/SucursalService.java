package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	//PASO 2, creo la interfaz de servicios, como capa de seguridad, donde haré espacio para llamar los métodos del PASO 1 del CRUD
	public List<Sucursal> findAll();
	
	//public Sucursal findOne(Integer id);
	public Sucursal findOne(Integer id);
	
	
	
	//------Ahora, para hacer los inserts...
	//creo un método save
	public Sucursal save(Sucursal suc);
	
	//Ahora creo el método para el delete...
	public void deleteById(Integer id);

}
