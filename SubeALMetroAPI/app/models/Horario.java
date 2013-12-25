package models;

import java.util.*;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.data.validation.*;
import play.db.jpa.*;


@Entity
public class Horario extends Model{
	
	@JsonIgnore
	@ManyToOne
	public Estacion estacion;	

	public String rumboAGrau;
	public String rumboAVes;
	public boolean lunesAViernes;	
	public boolean sabados;	
	public boolean domingosYFeriados;	
	
	public String toString(){
		return this.rumboAGrau + " - " + this.rumboAVes;
	}

}
