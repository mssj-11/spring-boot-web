package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	//	Metodo Redirect
	@GetMapping("/")	//	Anotacion @GetMapping
	public String home() {
		//return "redirect:/app/index";
		//return "redirect:https://www.google.com";	//	A otra Ruta
		return "forward:/app/index";	//	Solo rutas de controladores, no se puede con rutas externas
	}
	
	

}