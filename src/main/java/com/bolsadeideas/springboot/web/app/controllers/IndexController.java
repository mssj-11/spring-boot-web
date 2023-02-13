package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;/*
import org.springframework.web.servlet.ModelAndView;*/

@Controller
public class IndexController {
	
	//	Metodos: Siempre publicos
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	@GetMapping({"/index", "/", "/home"})
	//	Datos del controlador a la vista con ( Model, ModelMap, Map )
	public String index(Model model, ModelMap modelmap, Map<String, Object> map) {
		
		//	Agregando Atributos(Nombre, Valor)
		model.addAttribute("titulo", "Aprendiendo Spring");
		modelmap.addAttribute("titulomap", "Este titulo es con ModelMap");
		map.put("javamap", "Ejemplo con la clase Map de Java");
		
		return "index";
	}
	
	
	/*
	 * @GetMapping({"/index", "/", "/home"})
	public ModelAndView index(ModelAndView modelandview) {
		modelandview.addObject("tituloview", "Titulo con ModelAndView");
		modelandview.setViewName("index");
		return modelandview;
	}*/

	
}