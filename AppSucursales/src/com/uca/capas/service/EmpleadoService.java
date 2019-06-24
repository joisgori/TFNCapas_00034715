package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Empleado;

public interface EmpleadoService {
	
	public Empleado findByIdEmpleado(Integer id); //Comienzo a crear el m�todo que implementar� el que ya posee l�gica pre-cargada (el de jpa)
	
	//Para guardar
	public Empleado save(Empleado emp);
	
	//Para borrar
	//Ahora creo el m�todo para el delete...
	public void deleteById(Integer id);
	
}
