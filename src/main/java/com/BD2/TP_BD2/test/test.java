package com.BD2.TP_BD2.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bson.Document;

import com.BD2.TP_BD2.adaptors.VentaAdaptor;
import com.BD2.TP_BD2.models.Cliente;
import com.BD2.TP_BD2.models.Domicilio;
import com.BD2.TP_BD2.models.Empleado;
import com.BD2.TP_BD2.models.Localidad;
import com.BD2.TP_BD2.models.ObraSocial;
import com.BD2.TP_BD2.models.Producto;
import com.BD2.TP_BD2.models.ProductoXVenta;
import com.BD2.TP_BD2.models.Provincia;
import com.BD2.TP_BD2.models.Sucursal;
import com.BD2.TP_BD2.models.Venta;
import com.BD2.TP_BD2.utils.Connection;
import com.BD2.TP_BD2.utils.Export;
import com.mongodb.client.MongoCollection;


public class test {

	public static void main(String[] args) {

		Localidad localidad1 = new Localidad(1, "Localidad 1");
		Localidad localidad2 = new Localidad(2, "Localidad 2");
		Localidad localidad3 = new Localidad(2, "Localidad 3");

		Provincia provincia = new Provincia(1, "Provincia 1");

		// Domicilios reservados para las sucursales
		Domicilio domicilio1 = new Domicilio(1, "Calle 1", 1, localidad1, provincia);
		Domicilio domicilio2 = new Domicilio(2, "Calle 2", 2, localidad2, provincia);
		Domicilio domicilio3 = new Domicilio(3, "Calle 3", 2, localidad3, provincia);
		// Domicilios para los clientes
		Domicilio domicilio4 = new Domicilio(4, "Calle 4", 2, localidad3, provincia);
		Domicilio domicilio5 = new Domicilio(5, "Calle 51", 2, localidad2, provincia);
		Domicilio domicilio6 = new Domicilio(6, "Calle 62", 2, localidad1, provincia);
		Domicilio domicilio7 = new Domicilio(7, "Calle 45", 2, localidad2, provincia);
		Domicilio domicilio8 = new Domicilio(8, "Calle 77", 2, localidad2, provincia);
		Domicilio domicilio9 = new Domicilio(9, "Calle 85", 2, localidad3, provincia);
		Domicilio domicilio10 = new Domicilio(10, "Calle 39", 2, localidad3, provincia);
		Domicilio domicilio11 = new Domicilio(11, "Calle 20", 2, localidad1, provincia);
		Domicilio domicilio12 = new Domicilio(12, "Calle 12", 2, localidad3, provincia);
		// Domicilio para los vendedores (3 por sucursal = 9 en total)
		Domicilio domicilio13 = new Domicilio(13, "Calle 11", 2, localidad3, provincia);
		Domicilio domicilio14 = new Domicilio(14, "Calle 13", 2, localidad2, provincia);
		Domicilio domicilio15 = new Domicilio(15, "Calle 14", 2, localidad1, provincia);
		Domicilio domicilio16 = new Domicilio(16, "Calle 15", 2, localidad1, provincia);
		Domicilio domicilio17 = new Domicilio(17, "Calle 16", 2, localidad2, provincia);
		Domicilio domicilio18 = new Domicilio(18, "Calle 17", 2, localidad3, provincia);
		Domicilio domicilio19 = new Domicilio(19, "Calle 49", 2, localidad3, provincia);
		Domicilio domicilio20 = new Domicilio(20, "Calle 40", 2, localidad3, provincia);
		Domicilio domicilio21 = new Domicilio(21, "Calle 6", 2, localidad2, provincia);

		List<Sucursal> sucursales = new ArrayList<Sucursal>();

		sucursales.add(new Sucursal(1, domicilio1, "10000001"));
		sucursales.add(new Sucursal(2, domicilio2, "10000002"));
		sucursales.add(new Sucursal(3, domicilio3, "10000003"));

		List<ObraSocial> obrasSociales = new ArrayList<ObraSocial>();

		for (int i = 1; i <= 6; i++) {
			obrasSociales.add(new ObraSocial(i, "Obra Social " + i));
		}

		MongoCollection<Document> collectionVenta = Connection.getInstance().getMongoDatabase().getCollection("venta");

		List<Empleado> empleados = new ArrayList<Empleado>();
		// Uno de estos 3 tiene que ser encargado
		empleados.add(new Empleado(1, "Vento", "Ulises", 42200251, domicilio19, obrasSociales.get(1), "2042200251",
				sucursales.get(0), true));
		empleados.add(new Empleado(2, "Oero", "Natalia", 42278255, domicilio20, obrasSociales.get(0), "2042278255",
				sucursales.get(0), false));
		empleados.add(new Empleado(3, "Zabaleta", "Agustina", 40001100, domicilio21, obrasSociales.get(3), "2040001100",
				sucursales.get(0), false));
		// Uno de estos 3 tiene que ser encargado
		empleados.add(new Empleado(4, "Aguirre", "Franco", 42200255, domicilio13, obrasSociales.get(2), "2042200255",
				sucursales.get(1), true));
		empleados.add(new Empleado(5, "Lopez", "Norberto", 41223223, domicilio14, obrasSociales.get(1), "2041223223",
				sucursales.get(1), false));
		empleados.add(new Empleado(6, "Monzon", "Gabriela", 43225119, domicilio15, obrasSociales.get(3), "2043225119",
				sucursales.get(1), false));
		// Uno de estos 3 tiene que ser encargado
		empleados.add(new Empleado(7, "Ruiz", "Franco", 40998789, domicilio16, obrasSociales.get(2), "2040998789",
				sucursales.get(2), true));
		empleados.add(new Empleado(8, "Guillon", "German", 37455445, domicilio17, obrasSociales.get(4), "2037455445",
				sucursales.get(2), false));
		empleados.add(new Empleado(9, "Juanes", "Federico", 36632552, domicilio18, obrasSociales.get(4), "2036632552",
				sucursales.get(2), false));

		sucursales.get(0).setEmpleados(empleados.subList(0, 3));
		sucursales.get(1).setEmpleados(empleados.subList(3, 6));
		sucursales.get(2).setEmpleados(empleados.subList(6, 9));

		ObraSocial obrasocial1 = new ObraSocial(1, "IOMA");
		ObraSocial obrasocial2 = new ObraSocial(2, "FEMEBA");
		ObraSocial obrasocial3 = new ObraSocial(3, "IOSE");
		ObraSocial obrasocial4 = new ObraSocial(4, "DOSUBA");
		ObraSocial obrasocial5 = new ObraSocial(5, "SANCOR");

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente(10, "Gonzalez", "Esteban", 42356798, domicilio4, obrasocial1));
		clientes.add(new Cliente(11, "Rojas", "Ariel", 42356798, domicilio5, obrasocial3));
		clientes.add(new Cliente(12, "Manso", "Lucas", 42356798, domicilio6, obrasocial5));
		clientes.add(new Cliente(13, "Garcia", "Franco", 42356798, domicilio7, obrasocial3));
		clientes.add(new Cliente(14, "Gomez", "Roberto", 42356798, domicilio8, null));
		clientes.add(new Cliente(15, "Gomez", "Juliana", 39221583, domicilio8, obrasocial2));
		clientes.add(new Cliente(16, "Perez", "Nicolas", 26004223, domicilio9, obrasocial4));
		clientes.add(new Cliente(17, "Fernandez", "Fabiana", 18223442, domicilio10, obrasocial4));
		clientes.add(new Cliente(18, "Castillo", "Hernan", 37555423, domicilio11, obrasocial2));
		clientes.add(new Cliente(19, "Iglesias", "Ernesto", 29557845, domicilio12, null));

		List<Producto> productos = new ArrayList<Producto>();
		// 7 medicamentos
		productos.add(new Producto(33452, "Jarabe", "STADA", 1250, true));
		productos.add(new Producto(21345, "Ibupirac", "Stiefel", 1100, true));
		productos.add(new Producto(21456, "Ibuprofeno", "Laboratorio Sanchez", 650, true));
		productos.add(new Producto(22114, "Anaflex", "Bago", 630, true));
		productos.add(new Producto(23548, "Mejoralito paracetamol", "GSK", 110, true));
		productos.add(new Producto(56245, "Buconangin FORTE", "Biosintex", 990, true));
		productos.add(new Producto(21346, "Paracetamol", "Bayer", 555, true));
		// 3 perfumes
		productos.add(new Producto(24567, "Crema", "Nadia", 2500, false));
		productos.add(new Producto(76345, "Perfume", "Primor", 2770, false));
		productos.add(new Producto(76350, "Desodorante", "Axe", 150, false));

		// ***********************
		// GENERAR PRODUCTOXVENTAS

		List<ProductoXVenta> productosVenta = new ArrayList<ProductoXVenta>();

		Random rand = new Random();

		// Podemos crear 180 productosXVenta (masomenos) para no tener que preocuparnos
		// por el tema de que cada venta debe tener un promedio minimo de 1,5 productos
		// o que
		// las ventas varien un 20% aprox entre cada sucursal
		for (int i = 0; i < 180; i++) {
			int idProductoAVender = rand.nextInt(productos.size() - 1);
			int cantidadAVender = 1 + rand.nextInt(5);
			float precioProducto = productos.get(idProductoAVender).getPrecio();

			// Para que no haya dos productoXVenta seguidos con el mismo producto
			if (i > 1) {
				while (productos.get(idProductoAVender)
						.equals(productosVenta.get(productosVenta.size() - 1).getProducto())) {
					idProductoAVender = rand.nextInt(productos.size() - 1);
				}
			}

			productosVenta.add(new ProductoXVenta(i, productos.get(idProductoAVender), cantidadAVender,
					precioProducto * cantidadAVender, precioProducto));
		}

		// ***********************

		// ***********************
		// GENERAR VENTAS

		List<Document> ventas = new ArrayList<Document>();

		// NOTA: Cada venta debe tener un promedio minimo de 1,5 productos.
		// Como ejemplo, vamos a generar 90 ventas (cada una con 2 productos)
		for (int i = 0; i < 90; i++) {

			List<ProductoXVenta> infoVentas = new ArrayList<ProductoXVenta>();

			// El remove devuelve el elemento que se elimina
			infoVentas.add(productosVenta.remove(productosVenta.size() - 1));
			infoVentas.add(productosVenta.remove(productosVenta.size() - 1));

			int month = 1 + rand.nextInt(4);
			int dayOfMonth = 1 + rand.nextInt(26);

			// Por poner un numero al azar
			String numeroTicket = String.valueOf(i + 2800);

			float total = 0;
			for (ProductoXVenta p : infoVentas) {
				total += p.getTotal();
			}

			int idSucursal = 0;

			if (i < 28) {
				idSucursal = 0;
			} else if (i >= 28 && i <= 58) {
				idSucursal = 1;
			} else {
				idSucursal = 2;
			}

			Sucursal sucursal = sucursales.get(idSucursal);

			int posVendedor = 1 + rand.nextInt(sucursal.getEmpleados().size() - 1);

			// Vendedor random, cobrador siempre el encargado para simplificar las cosas.
			Empleado vendedor = sucursal.getEmpleados().get(posVendedor);
			Empleado cobrador = sucursal.getEmpleados().get(0);

			int idCliente = rand.nextInt(clientes.size() - 1);
			Cliente cliente = clientes.get(idCliente);

			String formaDePago = "Efectivo";
			if (i % 2 == 0) {
				formaDePago = "Tarjeta de credito";
			}

			ventas.add(VentaAdaptor.toDBObject(new Venta(i + 1, LocalDate.of(2021, month, dayOfMonth), numeroTicket,
					total, formaDePago, vendedor, cobrador, sucursal, cliente, infoVentas)));

		}

		/*****************************/

		//collectionVenta.insertMany(ventas);

		Export.toJson(collectionVenta.find().iterator());
      
		System.out.println("\nProceso terminado");
	}

}
