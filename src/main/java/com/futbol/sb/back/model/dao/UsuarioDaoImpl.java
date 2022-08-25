package com.futbol.sb.back.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.futbol.sb.back.model.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

	
	private EntityManager em;
	
	public UsuarioDaoImpl() {

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {

		return em.createQuery("from Usuario").getResultList();
	}

}
