package models;

import java.util.*;
import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;


@Entity
public class Horario extends GenericModel{
	
	@Id
	@Required
	String codigo;
	
	@Required
	String rumboAGrau;
	
	@Required
	String rumboAVes;
	
	public String toString(){
		return this.rumboAGrau + " - " + this.rumboAVes;
	}

}
