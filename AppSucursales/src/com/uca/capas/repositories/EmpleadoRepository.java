package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>  {
	
	public List<Empleado> findAll(); //Este m�todo entiendo que ya forma parte de JpaRepository, es decir, ya resuelve
	//la consulta pra el findAll

}
