package com.BD2.TP_BD2.models;

import java.util.List;

public class Sucursal {

	private int idSucursal;
	private Domicilio domicilio;
	private String puntoDeVenta;
	private List<Empleado> empleados;

	public Sucursal() {
		super();
	}

	public Sucursal(int idSucursal, Domicilio domicilio, String puntoDeVenta) {
		super();
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.puntoDeVenta = puntoDeVenta;
	}
	
	public Sucursal(int idSucursal, Domicilio domicilio, String puntoDeVenta, List<Empleado> empleados) {
		super();
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.puntoDeVenta = puntoDeVenta;
		this.empleados = empleados;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getPuntoDeVenta() {
		return puntoDeVenta;
	}

	public void setPuntoDeVenta(String puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", domicilio=" + domicilio + ", puntoDeVenta=" + puntoDeVenta
				+ "]";
	}

}
