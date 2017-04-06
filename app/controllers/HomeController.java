package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

  private FormFactory formFactory;

	@Inject
	public HomeController(FormFactory f) {
		this.formFactory = f;
	}

  public Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public Result flights() {
    List<Flight> flightsList = Flight.findAll();
    return ok(list.render(flightsList));
  }

  public Result addFlight(){
		Form<Flight> addFlightForm = formFactory.form(Flight.class);
		return ok(addFlight.render(addFlightForm));
  }

	public Result addFlightSubmit(){
		Form<Flight> newFlightForm = formFactory.form(Product.class).bindFromRequest();
		if(newFormFactory
	}
  /*private User getUserFromSession() {
	  return User.getUserById(session().get("email"));
  }*/

}




