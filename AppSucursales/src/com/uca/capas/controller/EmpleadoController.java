package com.uca.capas.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	//Objeto Logger
	static Logger log = Logger.getLogger(MainController.class.getName());
	
	/*
	 *Ahora creo los métodos editar/actualizar 
	 * eliminar
	 * agregar para el usuario, el findAll() ya lo hago automático en el SucursalController
	 * */
	
	@RequestMapping("/insertEmp")
	public ModelAndView nuevoU() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("empleado", new Empleado());
		mav.setViewName("formEmpleado");
		return mav;
	}
	
	
	@RequestMapping("/guardarEmpleado")
	public ModelAndView save(
			@ModelAttribute Empleado emp) {
		ModelAndView mav = new ModelAndView();
		try {
			log.info("Agregando nuevo empleado");
			empleadoService.save(emp);
		}catch(Exception e) {
			log.info("Error"+e.toString());
		}
		mav.addObject("empleado", new Empleado());
		mav.setViewName("suc_empleados");
		return mav;
	}
	
	//Ahora el método save --------
	
	
	//Ahora el método Eliminar ----------
	@RequestMapping("/ElimEmp")
	public ModelAndView borrar( //pido el id de empleado, similar a la lógica del findOne
			@RequestParam Integer codigo_empleado) { //el nombre de la col de la DB
		ModelAndView mav = new ModelAndView();
		Empleado emp = null;
		try {
			empleadoService.deleteById(codigo_empleado);
		}catch(Exception e) {
			log.info("Error"+e.toString());
		}
		mav.setViewName("redirect:/also");
		return mav;
	}
	
	/* 
	@RequestMapping("/ElimSucyEmp")
	public ModelAndView borrar( //pido el id de sucursal, similar a la lógica del findOne
			@RequestParam Integer codigo_sucursal) {
		ModelAndView mav = new ModelAndView();
		Sucursal suc = null;
		try {
			sucursalService.deleteById(codigo_sucursal);
			} catch(Exception e) {
				log.info("Error"+e.toString());
			}
		mav.setViewName("redirect:/also");
		
		return mav;
	}
	 */
}
