package models;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class Estacion extends Model{
	
	@Id
	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String ubicacion;
	public long posicionLatitud;
	public long posicionLongitud;
	
}
