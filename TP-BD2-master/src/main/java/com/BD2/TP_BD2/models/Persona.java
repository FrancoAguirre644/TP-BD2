package com.BD2.TP_BD2.models;

public class Persona {

	protected int idPersona;
	protected String apellido;
	protected String nombre;
	protected long dni;
	protected Domicilio domicilio;
	protected int nroAfiliado;
	protected ObraSocial obraSocial;

	public Persona() {
		super();
	}

	public Persona(int idPersona, String apellido, String nombre, long dni, Domicilio domicilio,
			ObraSocial obraSocial) {
		super();
		this.idPersona = idPersona;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", domicilio=" + domicilio + ", nroAfiliado=" + nroAfiliado + ", obraSocial=" + obraSocial + "]";
	}

}
