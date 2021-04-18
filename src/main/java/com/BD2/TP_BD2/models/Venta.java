package com.BD2.TP_BD2.models;

import java.time.LocalDate;
import java.util.List;

public class Venta {

	private int idVenta;
	private LocalDate fecha;
	private String numeroTicket;
	private float totalVenta;
	private String formaDePago;
	private Empleado vendedor;
	private Empleado cobrador;
	private Sucursal sucursal;
	private Cliente cliente;
	private List<ProductoXVenta> productos;

	public Venta() {
		super();
	}

	public Venta(int idVenta, LocalDate fecha, String numeroTicket, float totalVenta, String formaDePago,
			Empleado vendedor, Empleado cobrador, Sucursal sucursal, List<ProductoXVenta> productos, Cliente cliente) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.numeroTicket = numeroTicket;
		this.totalVenta = totalVenta;
		this.formaDePago = formaDePago;
		this.vendedor = vendedor;
		this.cobrador = cobrador;
		this.sucursal = sucursal;
		this.productos = productos;
		this.cliente = cliente;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public float getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public Empleado getVendedor() {
		return vendedor;
	}

	public void setVendedor(Empleado vendedor) {
		this.vendedor = vendedor;
	}

	public Empleado getCobrador() {
		return cobrador;
	}

	public void setCobrador(Empleado cobrador) {
		this.cobrador = cobrador;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public List<ProductoXVenta> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoXVenta> productos) {
		this.productos = productos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", fecha=" + fecha + ", numeroTicket=" + numeroTicket + ", totalVenta="
				+ totalVenta + ", formaDePago=" + formaDePago + ", vendedor=" + vendedor + ", cobrador=" + cobrador
				+ ", sucursal=" + sucursal + ", cliente=" + cliente + ", productos=" + productos + "]";
	}

	
}
