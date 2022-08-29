package com.futbol.sb.back.model.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.futbol.sb.back.model.dao.IUsuarioDao;
import com.futbol.sb.back.model.entity.Usuario;

@Service
public class UsuarioServices implements IUsuarioServices{

	public UsuarioServices() {
		
	}

	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>)usuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		
		usuario.setFechaCreacion(new Date());
		
		return  usuarioDao.save(usuario);

	}

	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findByCorreoAndContrasena(String correo, String contrasena) {
		// TODO Auto-generated method stub //324
		return null;
	}

}
