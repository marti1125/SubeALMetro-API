package controllers;

import controllers.CRUD.For;
import models.Estacion;
import play.mvc.With;

@Check("admin")
@With(Secure.class)
@For(Estacion.class)
public class Estaciones extends CRUD {
		
}