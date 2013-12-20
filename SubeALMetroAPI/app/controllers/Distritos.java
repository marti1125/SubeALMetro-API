package controllers;

import models.Distrito;
import play.mvc.With;
import controllers.CRUD.For;

@Check("admin")
@With(Secure.class)
@For(Distrito.class)
public class Distritos extends CRUD {

}
