package se.stenbeck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {
	
	
	// http://localhost/rest/service/hello/
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("greet",  "Hello World!!!");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj.toString();
	}
	
	// http://localhost/rest/service/hello/bye
	@GET
	@Path("/bye")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextGoodbye() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("greet",  "Goodbye cruel world");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj.toString();
	}
	
	//  http://localhost/rest/service/hello/whoareyou/Filip%20Stenbeck
	@GET
	@Path("/whoareyou/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String howareyou(@PathParam("name") String name) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("greet",  name);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj.toString();
	}
	
}
