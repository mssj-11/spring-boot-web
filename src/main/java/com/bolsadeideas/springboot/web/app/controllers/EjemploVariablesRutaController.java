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
	
	
	//	Metodo
	@GetMapping("/string/{texto}")//	Parametro TEXTO
	public String variables(@PathVariable String texto, Model model) {	//	Parametro TEXTO
		model.addAttribute("titulo", "Recibir parametros de la RUTA (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " +texto);
		
		return "variables/ver";
	}
	
	
	
}