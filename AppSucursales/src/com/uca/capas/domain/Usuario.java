package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(generator="usuario_codigo_usuario_seq", strategy = GenerationType.AUTO)//genero una sec para ir llenado
	@SequenceGenerator(name = "usuario_codigo_usuario_seq", sequenceName = "public.usuario_codigo_usuario_seq")//el campo
	@Column(name = "id_usuario")
	private Integer id_usuario;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "contraseña")
	private String contraseña;

	//Creo sus setters y getters
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	//Coloco sus constructores
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id_usuario, String usuario, String contraseña) {
		super();
		this.id_usuario = id_usuario;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	
}
