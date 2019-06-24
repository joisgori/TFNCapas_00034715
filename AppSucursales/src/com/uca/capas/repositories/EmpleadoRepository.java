package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>  {
	
	public Empleado findByIdEmpleado(Integer id); //Este método entiendo que ya forma parte de JpaRepository, es decir, ya resuelve
	//la consulta pra el findAll
	/*
	//Creo un método que solo me busque una lista de empleados por el Id que le pasaré de la sucursal,,,
	public List<Empleado> findByCodigo_sucursal(Sucursal codigo_sucursal);*/
}
