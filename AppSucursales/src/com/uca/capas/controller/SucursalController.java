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
import com.uca.capas.repositories.SucursalRepository;
import com.uca.capas.service.SucursalService;

@Controller
public class SucursalController {
	
	@Autowired
	SucursalRepository sucursalRepository;
	
	//Esto va para el save...
	@Autowired
	SucursalService sucursalService;
	
	//esto para el usuario
	@Autowired
	
	
	//PASO 6, creo el controlador :V -- llegado este punto, ya me está devolviendo lo que hay en mi base de datos...
	
	//Objeto Logger
	static Logger log = Logger.getLogger(MainController.class.getName());
	
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
		Sucursal sucursal = null;
 		try {
 			sucursal = sucursalRepository.findByCodigoSucursal(codigo_sucursal);
 			empleados = sucursal.getEmpleados();
 			
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
	
	/* continúo con los métodos save, update y delete ---
	 * para el caso, a continuación va el save */
	//Creo un controlador que me mande a la jsp del formulario para guardar una nueva Sucursal
	@RequestMapping("/insertSucusal")
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal()); //ojo acá
		mav.setViewName("formSucursales");
		return mav;
	}
	
	@RequestMapping(value = "/guardarSucursal")
	public ModelAndView save(@ModelAttribute Sucursal suc) { //acá no sé si debe tener el mismo nombre que el del form...
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursal = null;
		
		try {
			log.info("Agregando nueva sucursal");
			sucursalService.save(suc);//El uno representa que es una nueva instancia
			}catch(Exception e) {
				log.info("Error"+e.toString());
			}
		sucursal = sucursalRepository.findAll();
		//ahora lo mando todo a la pág principal de sucursales
		mav.addObject("tablaJSPSucursales", sucursal);
		//acontinuación nombre de la view
		mav.setViewName("sucursales");
		return mav;
	}
	
	//-------> hoy sí, acá voy con editar xd
	@RequestMapping("/EditarSuc")
	public ModelAndView editar(
			@RequestParam Integer codigo_sucursal) {
		ModelAndView mav = new ModelAndView();
		//con el id hago un nuevo find one y creo un objeto de tipo sucursal, y con el addObject relleno mi formulario pasado xd
		Sucursal suc = sucursalRepository.findByCodigoSucursal(codigo_sucursal);
		mav.addObject("sucursal", suc);
		mav.setViewName("formSucursales");
		return mav;
	}
	
	//Ahora crearé los controladores para el delete...
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

}
