package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Reporte;
import com.example.demo.models.Token;
import com.example.demo.models.Typedb;
import com.example.demo.models.User;
import com.example.demo.service.IReporteService;
import com.example.demo.service.ITokenService;
import com.example.demo.service.ITypedbService;
//import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.IUserService;




@Controller

//@RequestMapping("/")
public class HomeController {

	@Autowired
	private ITypedbService objetoService;
	
	@Autowired
	private ITokenService objetoService2;
	
	@Autowired
	private IReporteService objetoService3;
	
	@Autowired
	private IUserService objetoService4;
	
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
	
	@GetMapping("/token")
	public String listarToken(Model model) {
		
		List<Token> listadoObjetos = objetoService2.listarTodos();
		model.addAttribute("titulo","Lista de Objetos");
		model.addAttribute("objetos",listadoObjetos);
		
		return "/views/token/listar";
	}
	
	@GetMapping("/new/token")
	public String crearToken(Model model) {
		
		List<Typedb> bases = objetoService.listarTodos();
		List<User> usuarios = objetoService4.listarTodos();
		Token objeto = new Token();
		model.addAttribute("titulo","Formulario: Nuevo Token");
		model.addAttribute("objeto",objeto);
		model.addAttribute("bases",bases);
		model.addAttribute("usuarios",usuarios);
		return "/views/token/frmCrear";
	}
	
	@PostMapping("/save/token")
	public String guardar(@ModelAttribute Token objeto) {
		objetoService2.guardar(objeto);
		System.out.println("datos guardados");
		return "redirect:/";
	}
	

	@GetMapping("/edit/token/{id}")
	public String editarToken(@PathVariable("id") Long idObjeto, Model model) {
		
		Token objeto = objetoService2.buscarPorId(idObjeto);
		model.addAttribute("titulo","Formulario: Editar Objetos");
		model.addAttribute("objeto",objeto);
		return "/views/token/frmCrear";
	}
	
	
	
	
	
	@GetMapping("/reporte")
	public String listarReporte(Model model) {
		
		List<Reporte> listadoObjetos = objetoService3.listarTodos();
		model.addAttribute("titulo","Lista de Objetos");
		model.addAttribute("objetos",listadoObjetos);
		
		return "/views/reporte/listar";
	}
	
	@GetMapping("/new/reporte")
	public String crearReporte(Model model) {
		
		Reporte objeto = new Reporte();
		model.addAttribute("titulo","Formulario: Nueva Base de Datos");
		model.addAttribute("objeto",objeto);
		return "/views/reporte/frmCrear";
	}
	
	@PostMapping("/save/reporte")
	public String guardarReporte(@ModelAttribute Reporte objeto) {
		objetoService3.guardar(objeto);
		System.out.println("datos guardados");
		return "redirect:/";
	}
	

	@GetMapping("/edit/reporte/{id}")
	public String editarTReporte(@PathVariable("id") Long idObjeto, Model model) {
		
		Reporte objeto = objetoService3.buscarPorId(idObjeto);
		model.addAttribute("titulo","Formulario: Editar Objetos");
		model.addAttribute("objeto",objeto);
		return "/views/reporte/frmCrear";
	}
	
	
	
	
	
	
	
	
}
