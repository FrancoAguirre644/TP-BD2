package com.BD2.TP_BD2.models;

public class Cliente extends Persona {

	public Cliente() {
		super();
	}

	public Cliente(int idPersona, String apellido, String nombre, long dni, Domicilio domicilio,
			ObraSocial obraSocial) {
		super(idPersona, apellido, nombre, dni, domicilio, obraSocial);
	}

	@Override
	public String toString() {
		return "Cliente [idPersona=" + idPersona + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", domicilio=" + domicilio + "]";
	}

}
