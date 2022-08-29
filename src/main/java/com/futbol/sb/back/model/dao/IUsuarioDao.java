package com.futbol.sb.back.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.futbol.sb.back.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	/*public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	public Usuario findByCorreoAndContrasena(String correo, String passwd);*/
	
	
}
