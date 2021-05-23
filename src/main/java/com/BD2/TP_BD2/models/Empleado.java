package com.BD2.TP_BD2.models;

public class Empleado extends Persona {

	private String cuil;
	private Sucursal sucursal;
	private boolean esEncargado;

	public Empleado() {
		super();
	}

	public Empleado(int idPersona, String apellido, String nombre, long dni, Domicilio domicilio, ObraSocial obraSocial,
			String cuil, Sucursal sucursal, boolean esEncargado) {
		super(idPersona, apellido, nombre, dni, domicilio, obraSocial);
		this.cuil = cuil;
		this.sucursal = sucursal;
		this.esEncargado = esEncargado;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public boolean isEsEncargado() {
		return esEncargado;
	}

	public void setEsEncargado(boolean esEncargado) {
		this.esEncargado = esEncargado;
	}

	@Override
	public String toString() {
		return "Empleado [cuil=" + cuil + ", sucursal=" + sucursal + ", esEncargado=" + esEncargado + "]";
	}

	
}
