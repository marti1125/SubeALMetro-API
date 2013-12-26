package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import dto.EstacionesConHorariosDto;

import play.mvc.Controller;
import play.mvc.Http.Header;
import util.Util;

public class Rest extends Controller {
	
	public static void listaDeHorariosMasEstaciones() throws Exception {
		response.headers.put("Access-Control-Allow-Origin", new Header("Access-Control-Allow-Origin", "*"));
		String todos = " ";
		Util u = new Util();
		List<EstacionesConHorariosDto> e = u.obtenerHorariosMasEstaciones(todos);
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(e));
	}
	
	public static void listaDeHorariosMasEstacionesLV() throws Exception {
		response.headers.put("Access-Control-Allow-Origin", new Header("Access-Control-Allow-Origin", "*"));
		String lunesAViernes = "lunesAViernes = true and";
		Util u = new Util();
		List<EstacionesConHorariosDto> e = u.obtenerHorariosMasEstaciones(lunesAViernes);
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(e));		
	}
	
	public static void listaDeHorariosMasEstacionesSabados() throws Exception {
		response.headers.put("Access-Control-Allow-Origin", new Header("Access-Control-Allow-Origin", "*"));
		String sabados = "sabados = true and";
		Util u = new Util();
		List<EstacionesConHorariosDto> e = u.obtenerHorariosMasEstaciones(sabados);
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(e));		
	}
	
	public static void listaDeHorariosMasEstacionesDomingosYFeriados() throws Exception {
		response.headers.put("Access-Control-Allow-Origin", new Header("Access-Control-Allow-Origin", "*"));
		String domingosYFeriados = "domingosYFeriados = true and";
		Util u = new Util();
		List<EstacionesConHorariosDto> e = u.obtenerHorariosMasEstaciones(domingosYFeriados);
		org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();		
		renderJSON(mapper.writeValueAsString(e));		
	}
	
}
