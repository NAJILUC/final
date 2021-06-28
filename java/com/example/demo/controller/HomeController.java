package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Typedb;
import com.example.demo.service.ITypedbService;
//import org.springframework.web.bind.annotation.RequestMapping;




@Controller

//@RequestMapping("/")
public class HomeController {

	@Autowired
	private ITypedbService objetoService;
	
	@GetMapping("/")
	public String listar(Model model) {
		
		
		return "/views/menu/home";
	}
	
	
	@GetMapping("/typedb")
	public String listarTypedb(Model model) {
		
		List<Typedb> listadoObjetos = objetoService.listarTodos();
		model.addAttribute("titulo","Lista de Objetos");
		model.addAttribute("objetos",listadoObjetos);
		
		return "/views/typedb/listar";
	}
	
	@GetMapping("/new/typedb")
	public String crear(Model model) {
		
		Typedb objeto = new Typedb();
		model.addAttribute("titulo","Formulario: Nueva Base de Datos");
		model.addAttribute("objeto",objeto);
		return "/views/typedb/frmCrear";
	}
	
	@PostMapping("/save/typedb")
	public String guardar(@ModelAttribute Typedb objeto) {
		objetoService.guardar(objeto);
		System.out.println("datos guardados");
		return "redirect:/";
	}
	
	
	
	
	
}
