package controllers.geoportal.modules.$application_name$;

import controllers.Abstract;



import play.mvc.*;

import utils.StringUtils;
import views.html.geoportal.modules.$application_name$.*;


public class Application extends Abstract {
	public static Result index() {
		return ok(index.render("GeoPortal"));
	}
}
