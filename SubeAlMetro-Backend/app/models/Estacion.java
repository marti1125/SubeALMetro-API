package models;

import play.db.ebean.Model;

public class Estacion extends Model{

	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String ubicacion;
	public String posicionLatitud;
	public String posicionLongitud;
	
}
