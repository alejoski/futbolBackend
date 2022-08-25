package com.futbol.sb.back.model.dto;

public class Usuario {

	public String name;
	public String passwd;
	public boolean exist;
	
	public Usuario() {

		
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}
	
	

}
