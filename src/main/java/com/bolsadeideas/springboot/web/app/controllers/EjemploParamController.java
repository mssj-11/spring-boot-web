//	Ejemplo de como enviar parametros mediante URL a nuestros controladores 
package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//	Nuevo controlador
@Controller
@RequestMapping("/params")	//	Ruta base
public class EjemploParamController {
	
	//	Metodo handler
	@GetMapping("/")
	public String index() {
		
		return "params/index";
	}
	
	
	//	Otro Metodo
	@GetMapping("/string")	//	Metodo GET, Mapear con tipo de dato String al controlador
	//	Parametros mediante URL-ruta, Modelo
	public String param(@RequestParam(name="texto", required=false, defaultValue="Texto de por defecto") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: " +texto);
		
		return "params/ver";	//	Carpeta/Plantilla HTML
	}
	
	
	
	
}