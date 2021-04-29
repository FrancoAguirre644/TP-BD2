package com.BD2.TP_BD2;

import java.io.File;
import java.io.IOException;

import com.BD2.TP_BD2.models.Domicilio;
import com.BD2.TP_BD2.models.Localidad;
import com.BD2.TP_BD2.models.Producto;
import com.BD2.TP_BD2.models.Provincia;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class testSerialize {
	
	public static void main(String [] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Producto producto = new Producto(1, "Descripcion Producto", "Laboratorio 1", 4000, false);
		
		objectMapper.writeValue(new File("target/producto.json"), producto);
				
		Localidad localidad = new Localidad(1, "Lanús");
		Provincia provincia = new Provincia(1, "Buenos aires");		
		Domicilio domicilio = new Domicilio(1, "Calle", 1, localidad, provincia);
		
		
		objectMapper.writeValue(new File("target/domicilio.json"), domicilio);
		
	}

}
