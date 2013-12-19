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
	
	@OneToMany(mappedBy = "estacion")
    public List<Horario> horarios;
	
	public String toString(){
		return this.nombreEstacion;
	}
	
}