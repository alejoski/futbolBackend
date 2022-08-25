package com.futbol.sb.back.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.futbol.sb.back.model.dao.IUsuarioDao;

@Controller
public class UsuarioController {

	private IUsuarioDao usuarioDao;
	
	@RequestMapping(value="/crearUsuario", method = RequestMethod.GET)
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Crear Usuario");
		model.addAttribute("clientes", usuarioDao.findAll());
		return "crearUsuario";
	}

}
//117
//133

//DONE SE CREO EL FORFMULARIO DE USUARIO Y SE RECIBEN LOS DATOS
//DONE COMPLEMENTAR OBJETO PAISES
//TODO Identificar como pasar datos desde Angular hasta el backend para crear usuarios
//TODO Grabar registro del usuario en la BD 
//TODO Implementar mecanismo de segueridad de usuarios
//TODO Loguear el usuario que se acaba de crear 
