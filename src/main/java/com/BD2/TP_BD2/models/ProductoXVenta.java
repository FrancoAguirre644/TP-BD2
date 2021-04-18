package com.BD2.TP_BD2.models;

public class ProductoXVenta {

	private int idProductoXVenta;
	private Producto producto;
	private int cantidad;
	private float total;

	public ProductoXVenta() {
		super();
	}

	public ProductoXVenta(int idProductoXVenta, Producto producto, int cantidad, float total) {
		super();
		this.idProductoXVenta = idProductoXVenta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
	}

	public int getIdProductoXVenta() {
		return idProductoXVenta;
	}

	public void setIdProductoXVenta(int idProductoXVenta) {
		this.idProductoXVenta = idProductoXVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ProductoXVenta [idProductoXVenta=" + idProductoXVenta + ", producto=" + producto + ", cantidad="
				+ cantidad + ", total=" + total + "]";
	}

}
