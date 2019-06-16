package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Controller
public class SucursalController {
	
	@Autowired
	SucursalRepository sucursalRepository;
	
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
	/*
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
