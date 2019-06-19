package com.uca.service;

import java.util.List;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;

public interface EmpleadoService {
	
	public List<Empleado> findAll(); //Comienzo a crear el método que implementará el que ya posee lógica pre-cargada (el de jpa)
	/*
	public List<Empleado> findOne(Sucursal codigo_sucursal); //de igual manera con este*/

}
