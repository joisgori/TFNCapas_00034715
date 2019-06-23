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
		return sucursalRepository.findAll(); //PASO 4, En la implementación retorno la función findAll con la lógica ya de Jpa
	}

	public List<Sucursal> findOne(Integer id) {
		// TODO Auto-generated method stub
		return sucursalRepository.findByCodigoSucursal(id);
	}
	
	
	//Acá implemento la lógica del insert...
	@Transactional
	public int save(Sucursal suc, Integer newRow) throws DataAccessException{
		try {
			if(newRow == 1) entityManager.persist(suc); //nueva fila uso persist
			else entityManager.merge(suc); //actualiza datos de una instancia ya existente dentro de la base 
			entityManager.flush(); //Esto me sincroniza con la base de datos
			return 1;
		}catch (Throwable e) {
			e.printStackTrace();
			return 1;
		}
	}
	
	//Ahora va la lógica para el delete acá
	@Transactional
	public void deleteById(Integer id) throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("delete from public.sucursal where codigo_sucursal = " + "'" + id + "'");
		Query query = entityManager.createNativeQuery(sb.toString());
		query.executeUpdate();
	}
	
}