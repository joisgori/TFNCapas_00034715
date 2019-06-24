package com.uca.capas.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.EmpleadoRepository;

@Service
public class EmpleadoServiceImp implements EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	//Importo esto para poder hacer lo del save xdxd
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	//Este mismo findById me ayudará tanto para el insert como para el update
	public Empleado findByIdEmpleado(Integer id) {
		return empleadoRepository.findByIdEmpleado(id);
	}

	public Empleado save(Empleado emp) {
		return empleadoRepository.save(emp);
	}

	@Transactional
	public void deleteById(Integer id) throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("delete from public.empleado where codigo_empleado = " + "'" + id + "'");
		Query query = entityManager.createNativeQuery(sb.toString());
		query.executeUpdate();
	}
	
}
