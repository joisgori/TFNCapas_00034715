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
@Table(schema="public", name = "EMPLEADO") //Indico el schema del que proviene, a su vez indico el nombre de la tabla
public class Empleado {
	
	@Id //Indico que éste campo será el id
	@GeneratedValue(generator="empleado_codigo_empleado_seq", strategy = GenerationType.AUTO)//genero una sec para ir llenado
	@SequenceGenerator(name = "empleado_codigo_empleado_seq", sequenceName = "public.empleado_codigo_empleado_seq")//el campo
	@Column(name = "codigo_empleado")//indico el nombre de la columna, tal cuál lo cree en Postgress
	private Integer id_empleado; //creo una variable para almecenar el campo/los campos (en el resto de esta clase

	@Column(name = "nombre_empleado")
	private String nombre_empleado;
	
	@Column(name = "edad_empleado")
	private Integer edad_empleado;
	
	@Column(name = "genero_empleado")
	private String genero_empleado;
	
	@Column(name = "estado_empleado")
	private Boolean estado_empleado;
	
	//Acá, ya que hay muchos empleados a una sucursal, tenemos una relación de muchos a uno
	@ManyToOne(fetch = FetchType.EAGER) //Investigar qué es eager y lazy...
	@JoinColumn(name = "codigo_sucursal")
	private Integer codigo_sucursal;
	
	//Creo mis métodos setters and getters.
	public Integer getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public Integer getEdad_empleado() {
		return edad_empleado;
	}

	public void setEdad_empleado(Integer edad_empleado) {
		this.edad_empleado = edad_empleado;
	}

	public String getGenero_empleado() {
		return genero_empleado;
	}

	public void setGenero_empleado(String genero_empleado) {
		this.genero_empleado = genero_empleado;
	}

	public Boolean getEstado_empleado() {
		return estado_empleado;
	}

	public void setEstado_empleado(Boolean estado_empleado) {
		this.estado_empleado = estado_empleado;
	}

	public Integer getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(Integer codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}
	
	//Creo los constructores...
	public Empleado(Integer id_empleado, String nombre_empleado, Integer edad_empleado, String genero_empleado,
			Boolean estado_empleado, Integer codigo_sucursal) {
		super();
		this.id_empleado = id_empleado;
		this.nombre_empleado = nombre_empleado;
		this.edad_empleado = edad_empleado;
		this.genero_empleado = genero_empleado;
		this.estado_empleado = estado_empleado;
		this.codigo_sucursal = codigo_sucursal;
	}

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//No sé si debo crear un método delegate para este estado...
	
}
