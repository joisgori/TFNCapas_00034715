package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>  {
	
	public List<Empleado> findAll(); //Este m�todo entiendo que ya forma parte de JpaRepository, es decir, ya resuelve
	//la consulta pra el findAll
	/*
	//Creo un m�todo que solo me busque una lista de empleados por el Id que le pasar� de la sucursal,,,
	public List<Empleado> findByCodigo_sucursal(Sucursal codigo_sucursal);*/
}
