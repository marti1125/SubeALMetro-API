package controllers;

import models.*;
import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import static play.data.Form.*;

public class Application extends Controller {

	public static class Login {
		public String usuario;
		public String contrasenha;

		public String validate() {
			if (Usuario.authenticate(usuario, contrasenha) == null) {
				return "Usuario o contraseña invalida";
			}
			return null;
		}

	}
	
	@Security.Authenticated(Seguridad.class)
	public static Result index() {
		return ok(index.render());
	}

	public static Result login() {
		return ok(login.render(form(Login.class)));
	}

	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			session().clear();
			session("usuario", loginForm.get().usuario);
			return redirect(routes.Application.index());
		}
	}
	
	public static Result logout() {
	    session().clear();
	    flash("success", "Sesion terminada");
	    return redirect(
	        routes.Application.login()
	    );
	}

}
