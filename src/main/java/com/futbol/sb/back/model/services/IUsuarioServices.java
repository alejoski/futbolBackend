package com.futbol.sb.back.model.services;

import java.util.List;

import com.futbol.sb.back.model.entity.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	public Usuario findByCorreoAndContrasena(String correo, String contrasena);

}
