package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public class Usuario extends Model {
	
	@Id
	public String usuario;
	public String nombreCompleto;
	public String contrasenha;
	
	public Usuario(String usuario, String nombreCompleto, String contrasenha){
		this.usuario = usuario;
		this.nombreCompleto = nombreCompleto;
		this.contrasenha = contrasenha;
	}

	public static Finder<String, Usuario> find = new Finder<String, Usuario>(
		String.class, Usuario.class
	);

	public static Usuario authenticate(String usuario, String contrasenha) {
        return find.where().eq("usuario", usuario)
            .eq("contrasenha", contrasenha).findUnique();
    }

}
