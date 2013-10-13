package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

public class Seguridad extends Security.Authenticator {
	
	@Override
    public String getUsername(Context ctx) {
        return ctx.session().get("usuario");
    }
	
	@Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }

}
