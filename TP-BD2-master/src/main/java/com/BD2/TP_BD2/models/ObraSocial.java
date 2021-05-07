package com.BD2.TP_BD2.models;

public class ObraSocial {

	private int idObraSocial;
	private String nombre;

	public ObraSocial() {
		super();
	}

	public ObraSocial(int idObraSocial, String nombre) {
		super();
		this.idObraSocial = idObraSocial;
		this.nombre = nombre;
	}

	public int getIdObraSocial() {
		return idObraSocial;
	}

	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ObraSocial [idObraSocial=" + idObraSocial + ", nombre=" + nombre + "]";
	}

}
