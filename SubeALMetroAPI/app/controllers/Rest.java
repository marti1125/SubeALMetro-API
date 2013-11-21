package controllers;

import java.io.IOException;
import java.util.List;

import models.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import play.mvc.Controller;
import play.mvc.Http.Header;

public class Rest extends Controller {
	
	public static void listaDeEstaciones() throws Exception {
		response.headers.put("Access-Control-Allow-Origin", new Header("Access-Control-Allow-Origin", "*"));
		List<Estacion> estaciones = Estacion.findAll();
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(estaciones));		
	}
	
}
