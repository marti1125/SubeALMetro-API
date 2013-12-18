package models;

import java.util.*;
import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;

@Entity
public class Estacion extends GenericModel{
	
	@Id
	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String direccion;
	public double posicionLatitud;
	public double posicionLongitud;
	
	@ManyToMany(cascade = CascadeType.ALL)
    public List<Horario> horarios = new ArrayList<Horario>();
	
	public String toString(){
		return this.nombreEstacion;
	}
	
}