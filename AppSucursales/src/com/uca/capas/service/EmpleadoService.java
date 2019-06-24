package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Empleado;

public interface EmpleadoService {
	
	public Empleado findByIdEmpleado(Integer id); //Comienzo a crear el método que implementará el que ya posee lógica pre-cargada (el de jpa)
	
	//Para guardar
	public Empleado save(Empleado emp);
	
	//Para borrar
	//Ahora creo el método para el delete...
	public void deleteById(Integer id);
	
}
