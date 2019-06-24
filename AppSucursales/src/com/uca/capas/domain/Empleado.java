package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * En este paquete Domain, creo las clases que se trasnformarán en entidades para representar las entidades de mi
 * base de datos*/

@Entity //Le indico que funcionará como entidad
@Table(schema="public", name = "empleado") //Indico el schema del que proviene, a su vez indico el nombre de la tabla
public class Empleado {
	
	@Id //Indico que éste campo será el id
	@GeneratedValue(generator="empleado_codigo_empleado_seq", strategy = GenerationType.AUTO)//genero una sec para ir llenado
	@SequenceGenerator(name = "empleado_codigo_empleado_seq", sequenceName = "public.empleado_codigo_empleado_seq", allocationSize = 1)//el campo
	@Column(name = "codigo_empleado")//indico el nombre de la columna, tal cuál lo cree en Postgress
	private Integer idEmpleado; //creo una variable para almecenar el campo/los campos (en el resto de esta clase

	@Column(name = "nombre_empleado")
	private String nombreEmpleado;
	
	@Column(name = "edad_empleado")
	private Integer edadEmpleado;
	
	@Column(name = "genero_empleado")
	private String generoEmpleado;
	
	@Column(name = "estado_empleado")
	private Boolean estadoEmpleado;
	
	//Acá, ya que hay muchos empleados a una sucursal, tenemos una relación de muchos a uno
	@ManyToOne(fetch = FetchType.EAGER) //Investigar qué es eager y lazy...
	@JoinColumn(name = "codigo_sucursal")
	private Sucursal codigo_sucursal;
	//Creo mis métodos setters and getters.

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public Integer getEdadEmpleado() {
		return edadEmpleado;
	}

	public void setEdadEmpleado(Integer edadEmpleado) {
		this.edadEmpleado = edadEmpleado;
	}

	public String getGeneroEmpleado() {
		return generoEmpleado;
	}

	public void setGeneroEmpleado(String generoEmpleado) {
		this.generoEmpleado = generoEmpleado;
	}

	public Boolean getEstadoEmpleado() {
		return estadoEmpleado;
	}

	public void setEstadoEmpleado(Boolean estadoEmpleado) {
		this.estadoEmpleado = estadoEmpleado;
	}

	public Sucursal getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(Sucursal codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}

	public Empleado(Integer idEmpleado, String nombreEmpleado, Integer edadEmpleado, String generoEmpleado,
			Boolean estadoEmpleado, Sucursal codigo_sucursal) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.edadEmpleado = edadEmpleado;
		this.generoEmpleado = generoEmpleado;
		this.estadoEmpleado = estadoEmpleado;
		this.codigo_sucursal = codigo_sucursal;
	}

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
