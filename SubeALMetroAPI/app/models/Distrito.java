package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.jpa.GenericModel;

@Entity
public class Distrito extends GenericModel{
	
	@Id
	public String codigoPostal;
	
	public String nombreDelDistrito;
	
}
