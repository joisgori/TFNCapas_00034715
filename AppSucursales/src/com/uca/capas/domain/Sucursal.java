package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "SUCURSAL")
public class Sucursal {
	
	@Id //Indico que éste campo será el id
	@GeneratedValue(generator="sucursal_codigo_sucursal_seq", strategy = GenerationType.AUTO)//genero una sec para ir llenado
	@SequenceGenerator(name = "sucursal_codigo_sucursal_seq", sequenceName = "public.sucursal_codigo_sucursal_seq")//el campo
	@Column(name = "codigo_sucursal")//indico el nombre de la columna, tal cuál lo cree en Postgress
	private Integer codigo_sucursal;
	
	@Column(name = "nombre_sucursal")
	private String nombre_sucursal;
	
	@Column(name = "ubicacion_sucursal")
	private String ubicacion_sucursal;
	
	@Column(name = "horario_apertura")
	private String horario_apertura;
	
	@Column(name = "horario_cierre")
	private String horario_cierre;
	
	@Column(name = "numero_mesas")
	private Integer numero_mesas;
	
	@Column(name = "nombre_gerente")
	private String nombre_gerente;
	
	//Ahora creo una variable que no está en mi base de datos, para terminar la relación, a pesar que no es N:N y 
	//que no tengo tablas cruzadas.
	@OneToMany(mappedBy = "SUCURSAL", fetch = FetchType.LAZY)
	private List<Empleado> empleados;
	
	//ahora van los setters y getters

	public Integer getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(Integer codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}

	public String getNombre_sucursal() {
		return nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}

	public String getUbicacion_sucursal() {
		return ubicacion_sucursal;
	}

	public void setUbicacion_sucursal(String ubicacion_sucursal) {
		this.ubicacion_sucursal = ubicacion_sucursal;
	}

	public String getHorario_apertura() {
		return horario_apertura;
	}

	public void setHorario_apertura(String horario_apertura) {
		this.horario_apertura = horario_apertura;
	}

	public String getHorario_cierre() {
		return horario_cierre;
	}

	public void setHorario_cierre(String horario_cierre) {
		this.horario_cierre = horario_cierre;
	}

	public Integer getNumero_mesas() {
		return numero_mesas;
	}

	public void setNumero_mesas(Integer numero_mesas) {
		this.numero_mesas = numero_mesas;
	}

	public String getNombre_gerente() {
		return nombre_gerente;
	}

	public void setNombre_gerente(String nombre_gerente) {
		this.nombre_gerente = nombre_gerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	//Acá están los dos constructores...
	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sucursal(Integer codigo_sucursal, String nombre_sucursal, String ubicacion_sucursal, String horario_apertura,
			String horario_cierre, Integer numero_mesas, String nombre_gerente, List<Empleado> empleados) {
		super();
		this.codigo_sucursal = codigo_sucursal;
		this.nombre_sucursal = nombre_sucursal;
		this.ubicacion_sucursal = ubicacion_sucursal;
		this.horario_apertura = horario_apertura;
		this.horario_cierre = horario_cierre;
		this.numero_mesas = numero_mesas;
		this.nombre_gerente = nombre_gerente;
		this.empleados = empleados;
	}

	
}
