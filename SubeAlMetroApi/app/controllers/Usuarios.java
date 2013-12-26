package controllers;

import play.mvc.With;
import models.Usuario;

@Check("admin")
@With(Secure.class)
public class Usuarios extends CRUD {

}