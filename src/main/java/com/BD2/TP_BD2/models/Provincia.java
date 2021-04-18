package com.BD2.TP_BD2.models;

public class Provincia {

	private int idProvincia;
	private String nombre;

	public Provincia() {
		super();
	}

	public Provincia(int idProvincia, String nombre) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", nombre=" + nombre + "]";
	}

}
