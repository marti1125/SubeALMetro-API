package controllers;

import java.lang.reflect.Constructor;

import controllers.CRUD.For;
import controllers.CRUD.ObjectType;
import models.Horario;
import play.data.binding.Binder;
import play.exceptions.TemplateNotFoundException;
import play.mvc.With;

@Check("admin")
@With(Secure.class)
@For(Horario.class)
public class Horarios extends CRUD {
	

}
