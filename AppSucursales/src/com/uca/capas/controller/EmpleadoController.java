package com.uca.capas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpleadoController {
	
	
	
	/*
	 * 
	 * 
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
