package models;

import java.util.*;
import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;

@Entity
public class Estacion extends Model{
	
	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String ubicacion;
	public double posicionLatitud;
	public double posicionLongitud;
	
}
