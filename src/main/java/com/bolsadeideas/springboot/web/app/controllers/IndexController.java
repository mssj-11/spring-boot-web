package com.bolsadeideas.springboot.web.app.controllers;
import com.bolsadeideas.springboot.web.app.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;/*
import org.springframework.web.servlet.ModelAndView;*/
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")	//	Rutas de primer nivel: app/usuarior/clientes/etc
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
	
	
	/*	Ejemplo con ModelAndView
	 * @GetMapping({"/index", "/", "/home"})
	public ModelAndView index(ModelAndView modelandview) {
		modelandview.addObject("tituloview", "Titulo con ModelAndView");
		modelandview.setViewName("index");
		return modelandview;
	}*/
	
	
	/*
	//	Ejemplo muy usado en CRUDs (RequestMapping)
	@GetMapping({"/index", "/", "/home"})	//	Rutas de segunado nivel ("/app/index", "/app/", "/app/home")
	public String index(Model model) {
		model.addAttribute("titulo", "Aprendiendo Spring");
		return "index";
	}*/
	
	
	
	//	TEMA: Objeto Model
	@RequestMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario = new Usuario();	//	Instancia Usuario
		usuario.setNombre("Mike");
		usuario.setApellido("Sanchez");
		usuario.setEmail("mike@sanchez.com");
		
		model.addAttribute("usuario", usuario);	//	Nombre, Objeto-Instancia
		model.addAttribute("titulo", "Perfil del usuario: " .concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		/*	//	Ejemplo con ArrayList
		List<Usuario> usuarios = new ArrayList<>();	//	Arreglo vacio
		//	Evento de la lista
		usuarios.add(new Usuario("Mike", "Sanchez", "mike@sanchez.com"));
		usuarios.add(new Usuario("Francisco", "Perez", "francisco@gmail.com"));
		usuarios.add(new Usuario("Lucas", "Ramirez", "lucas@gmail.com"));
		*/
		
		//	Forma con ARRAYS asList
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Mike", "Sanchez", "mike@sanchez.com"),
				new Usuario("Francisco", "Perez", "francisco@gmail.com"),
				new Usuario("Lucas", "Ramirez", "lucas@gmail.com"),
				new Usuario("Cesar", "Hernandez", "cesar@gmail.com")
		);
		
		model.addAttribute("titulo", "Listado de usuarios: ");
		model.addAttribute("usuarios", usuarios);
		
		return "listar";
	}
	
	
	
}