package models;

import javax.persistence.*;

import play.db.ebean.Model;

@Entity
public class Estacion extends Model{
	
	@Id
	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String ubicacion;
	public String posicionLatitud;
	public String posicionLongitud;
	
}
