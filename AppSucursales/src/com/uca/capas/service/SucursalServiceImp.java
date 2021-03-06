package com.uca.capas.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImp implements SucursalService {

	//PASO 3, hago el autowired de la interfaz de repositorio
	@Autowired
	SucursalRepository sucursalRepository;
	
	
	//Importo esto para poder hacer lo del save xdxd
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	public List<Sucursal> findAll() {
		// TODO Auto-generated method stub
		return sucursalRepository.findAll(); //PASO 4, En la implementaci�n retorno la funci�n findAll con la l�gica ya de Jpa
	}

	public Sucursal findOne(Integer id) {
		// TODO Auto-generated method stub
		return sucursalRepository.findByCodigoSucursal(id);
	}
	
	
	//Ac� implemento la l�gica del insert...
	@Transactional
	public Sucursal save(Sucursal suc){
		return sucursalRepository.save(suc);
	}
	
	//Ahora va la l�gica para el delete ac�
	@Transactional
	public void deleteById(Integer id) throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("delete from public.sucursal where codigo_sucursal = " + "'" + id + "'");
		Query query = entityManager.createNativeQuery(sb.toString());
		query.executeUpdate();
	}
	
}