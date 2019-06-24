package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
	
	//PASO 1 (De la l�gica de m�todos de funcionamiento [para CRUD]), mando a llamar el m�todo heredado de JpaRepository
	public List<Sucursal> findAll();//Este m�todo entiendo que ya forma parte de JpaRepository, es decir, ya resuelve
	//la consulta pra el findAll
	
	//Debo hacer una consulta solo por Id ahora;
	public Sucursal findByCodigoSucursal(Integer codigo_sucursal);
}