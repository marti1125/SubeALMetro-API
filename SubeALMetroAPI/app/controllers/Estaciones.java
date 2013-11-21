package controllers;

import java.io.IOException;
import java.util.List;

import models.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

import play.mvc.With;

@With(Secure.class)
public class Estaciones extends CRUD {
	
	public static void listaDeEstaciones()
			throws JsonGenerationException, JsonMappingException, IOException {
		List<Estacion> estaciones = Estacion.findAll();
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(estaciones));		
	}

}