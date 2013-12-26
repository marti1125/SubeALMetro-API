package models;

import java.util.*;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.data.validation.*;
import play.db.jpa.*;

@Entity
public class Estacion extends GenericModel{
	
	@Id
	public String codigo;
	public String nombreEstacion;
	@ManyToOne
    public Distrito distrito;
	public String direccion;
	public double posicionLatitud;
	public double posicionLongitud;
	
	@OneToMany(mappedBy = "estacion")
    public List<Horario> horarios;
	
	public String toString(){
		return this.nombreEstacion;
	}
	
}