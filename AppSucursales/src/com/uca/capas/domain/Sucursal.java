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
@Table(schema = "public", name = "sucursal")
public class Sucursal {
	
	@Id //Indico que éste campo será el id
	@GeneratedValue(generator="sucursal_codigo_sucursal_seq", strategy = GenerationType.AUTO)//genero una sec para ir llenado
	@SequenceGenerator(name = "sucursal_codigo_sucursal_seq", sequenceName = "public.sucursal_codigo_sucursal_seq", allocationSize = 1)//el campo
	@Column(name = "codigo_sucursal")//indico el nombre de la columna, tal cuál lo cree en Postgress
	private Integer codigoSucursal;
	
	@Column(name = "nombre_sucursal")
	private String nombreSucursal;
	
	@Column(name = "ubicacion_sucursal")
	private String ubicacionSucursal;
	
	@Column(name = "horario_apertura")
	private String horarioApertura;
	
	@Column(name = "horario_cierre")
	private String horarioCierre;
	
	@Column(name = "numero_mesas")
	private Integer numeroMesas;
	
	@Column(name = "nombre_gerente")
	private String nombreGerente;
	
	//Ahora creo una variable que no está en mi base de datos, para terminar la relación, a pesar que no es N:N y 
	//que no tengo tablas cruzadas.
	@OneToMany(mappedBy = "codigo_sucursal", fetch = FetchType.EAGER)
	private List<Empleado> empleados;

	public Integer getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(Integer codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public String getUbicacionSucursal() {
		return ubicacionSucursal;
	}

	public void setUbicacionSucursal(String ubicacionSucursal) {
		this.ubicacionSucursal = ubicacionSucursal;
	}

	public String getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public String getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(String horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public Integer getNumeroMesas() {
		return numeroMesas;
	}

	public void setNumeroMesas(Integer numeroMesas) {
		this.numeroMesas = numeroMesas;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sucursal(Integer codigoSucursal, String nombreSucursal, String ubicacionSucursal, String horarioApertura,
			String horarioCierre, Integer numeroMesas, String nombreGerente, List<Empleado> empleados) {
		super();
		this.codigoSucursal = codigoSucursal;
		this.nombreSucursal = nombreSucursal;
		this.ubicacionSucursal = ubicacionSucursal;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.numeroMesas = numeroMesas;
		this.nombreGerente = nombreGerente;
		this.empleados = empleados;
	}
	
}
