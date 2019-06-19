package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.EmpleadoRepository;
import com.uca.capas.repositories.SucursalRepository;

@Controller
public class SucursalController {
	
	@Autowired
	SucursalRepository sucursalRepository;
	
//	@Autowired
//	EmpleadoRepository empleadoRepository;
	
	//PASO 6, creo el controlador :V -- llegado este punto, ya me está devolviendo lo que hay en mi base de datos...
	
	@RequestMapping("/also")
	public ModelAndView Todos() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucus = null;
		try {
			sucus = sucursalRepository.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("tablaJSPSucursales", sucus);
		//acontinuación nombre de la view
		mav.setViewName("sucursales");
		
		return mav;
	}
	
	
	//enlazo mi ruta con el onClic del botón
	@RequestMapping("/SucEmpleados")
	public ModelAndView empleadosSucur(//pido ahora el valor del id de la sucursal con requestParam
			@RequestParam Integer codigo_sucursal) {
		ModelAndView mav = new ModelAndView();
		List<Empleado> empleados = null;
		List<Sucursal> sucursal = null;
 		try {
 			sucursal = sucursalRepository.findByCodigoSucursal(codigo_sucursal);
 			empleados = sucursalRepository.findAll().get(codigo_sucursal-1).getEmpleados();
 			
 		}catch(Exception e) {
			e.printStackTrace();
		}
 		
 		mav.addObject("DatosSucursal", sucursal);
 		//nombre del objeto empleado
 		mav.addObject("DatosEmpleado", empleados);
		//acontinuación nombre de la view
		mav.setViewName("suc_empleados");
		
		return mav;
	}	
	
	
	/*
	 * csdc sd
	 * 	@RequestMapping("/formData")
	public ModelAndView Todos() {
		ModelAndView mav = new ModelAndView();
		List<Libros> libros = null;
		try {
			libros = librosService.BuscarTodos();
		}catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("resultAutores", librosService.ContarAutores());
		mav.addObject("resultLibros", librosService.ContarLibros());
		mav.addObject("libros", libros);
		mav.setViewName("resultados");
		
		return mav;
	}
	 */

}
