package com.futbol.sb.back.model.dao;

import java.util.List;

import com.futbol.sb.back.model.entity.Usuario;

public interface IUsuarioDao {

	public List<Usuario> findAll();
}
