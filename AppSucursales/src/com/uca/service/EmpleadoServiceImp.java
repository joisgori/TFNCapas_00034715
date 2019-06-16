package com.uca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.repositories.EmpleadoRepository;

@Service
public class EmpleadoServiceImp implements EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;

	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	public Empleado findOne(Integer id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id).get();
	}
	
}
