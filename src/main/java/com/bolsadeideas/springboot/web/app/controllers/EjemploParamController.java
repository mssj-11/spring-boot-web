//	Ejemplo de como enviar parametros mediante URL a nuestros controladores 
package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

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
	
	
	//	Metodo, obtener varios parametros de URL con @RequestParam
	@GetMapping("/varios-params")	//	Metodo GET, Mapear con tipo de dato String al controlador
	//	Parametros mediante URL-ruta, Modelo
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "El texto enviado es: '" +saludo+ "' y el numero es '" +numero+ "'");
		
		return "params/ver";	//	Carpeta/Plantilla HTML
	}
	
	
//	Otro Metodo, para obtener varios parametros de URL pero ahora con HttpServletRequest
	@GetMapping("/varios-params-request")	//	Metodo GET, Mapear con tipo de dato String al controlador
	//	Parametros HttpServletRequest, Modelo
	public String param(HttpServletRequest request, Model model) {
		//	Obtenidno el String=saludo y Integer=numero
		String saludo = request.getParameter("saludo");
		
		Integer numero = null;	//	numero inicializado en NULL
		//	Manejo de errores por valores en Cadena y que no son Enteros
		try {
		numero = Integer.parseInt(request.getParameter("numero"));
		}catch(NumberFormatException e) {
			numero = 0;	// Se puede dejar vacio
		}
		
		model.addAttribute("resultado", "El texto enviado es: '" +saludo+ "' y el numero es '" +numero+ "'");
		
		return "params/ver";	//	Carpeta/Plantilla HTML
	}
	
	
	
}