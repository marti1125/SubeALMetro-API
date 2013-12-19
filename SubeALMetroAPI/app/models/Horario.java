package models;

import java.util.*;
import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;


@Entity
public class Horario extends GenericModel{
	
	@ManyToOne
	public Estacion estacion;
	
	@Id
	public String codigo;
	
	public String rumboAGrau;
	
	public String rumboAVes;
	
	public String toString(){
		return this.rumboAGrau + " - " + this.rumboAVes;
	}

}
