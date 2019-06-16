package com.uca.service;

import java.util.List;

import com.uca.capas.domain.Empleado;

public interface EmpleadoService {
	
	public List<Empleado> findAll(); //Comienzo a crear el método que implementará el que ya posee lógica pre-cargada (el de jpa)
	
	public Empleado findOne(Integer id); //de igual manera con este

}
