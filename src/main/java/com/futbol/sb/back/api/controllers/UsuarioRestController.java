package com.futbol.sb.back.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.futbol.sb.back.model.entity.Usuario;
import com.futbol.sb.back.model.services.IUsuarioServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	
	@Autowired
	private IUsuarioServices usuarioService;
	
	/*private IUsuarioDao usuarioDao;
	
	
	@RequestMapping(value="/crearUsuario", method = RequestMethod.GET)
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Crear Usuario");
		model.addAttribute("clientes", usuarioDao.findAll());
		return "crearUsuario";
	}*/
	
	
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		
		return usuarioService.findAll();
		
	}
	
	@PostMapping("/createUser")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		
		System.out.println("Llego a back SAVE()" + usuario);
		
		return usuarioService.save(usuario);
		
	}

}

