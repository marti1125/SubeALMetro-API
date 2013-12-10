package models;

import java.util.*;
import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;


@Entity
public class Horario extends GenericModel{
	
	@Id
	String codigo;
	@Required
	String rumboAGrau;
	@Required
	String rumboAVes;
	
	@ManyToMany(mappedBy = "horarios")
    public List<Estacion> estaciones = new ArrayList<Estacion>();

}
