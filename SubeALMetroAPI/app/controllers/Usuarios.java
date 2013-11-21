package controllers;

import play.mvc.With;
import models.Usuario;

@With(Secure.class)
public class Usuarios extends CRUD {

}