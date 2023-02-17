package com.bolsadeideas.springboot.web.app.controllers;
//	Anotacion @PathVariable
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	//	Metodo Index, Necesario para el Metodo 2
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parametros de la ruta (@PathVariable)");
		return "variables/index";
	}
	
	
	//	Metodo
	@GetMapping("/string/{texto}")//	Parametro TEXTO
	public String variables(@PathVariable String texto, Model model) {	//	Parametro TEXTO
		model.addAttribute("titulo", "Recibir parametros de la RUTA (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " +texto);
		
		return "variables/ver";
	}

	
	//	Metodo 2: Para obtener varios parametros de la ruta con @PathVariable
	@GetMapping("/string/{texto}/{numero}")//	Parametros (TEXTO, NUMERO)
	public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {	//	Parametro TEXTO
		model.addAttribute("titulo", "Recibir parametros de la RUTA (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " +texto+ " y el numero enviado en el path es: " +numero);
		
		return "variables/ver";
	}
	
	
	
}