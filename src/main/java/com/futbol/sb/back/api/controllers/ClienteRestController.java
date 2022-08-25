package com.futbol.sb.back.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futbol.sb.back.model.dto.Usuario;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	public ClienteRestController() {
		
	}
	
	@GetMapping("/login/{user}/{passwd}")
	public Usuario validaLogin(@PathVariable String user, @PathVariable String passwd) {
		
		System.out.println("Llego a validaLogin() en BAckend");
		
		Usuario usu = new Usuario();
		
		
		if (user.equals("alejoski") && passwd.equals("123")) {
			usu.setName("Alejandro Pardo");
			usu.setExist(true);
			
			
		}else {
			usu.setExist(false);
		}
		
		return usu;
		
	}

	//321
}
