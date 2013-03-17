package se.stenbeck;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import se.stenbeck.entity.Seven;
import se.stenbeck.entity.User;

//Sets the path to base URL -  http://localhost/rest/service/data/ 
@Path("/data")
public class Data {
	 
	@GET 
	@Produces("application/json;charset=UTF-8")
	public List<Seven> getSomeData() {
		ArrayList <Seven> sevens = new ArrayList<Seven>();
		for (int i = 0; i < 100; i++) {
			sevens.add(new Seven("7 gånger " + i, Integer.toString(i * 7)));
		}
		return sevens;
	} 
	
	// A more specific service  http://localhost:8080/rest/service/data/100
	@GET 
	@Produces("application/json;charset=UTF-8")
	@Path("{amount}")
	public  List<Seven> getAmountOfData(@PathParam("amount") int amount) {
		ArrayList <Seven> sevens = new ArrayList<Seven>();
			for (int i = 1; i <= amount; i++) {
				sevens.add(new Seven("7 gånger " + i, Integer.toString(i * 7)));
			}
		return sevens;
	}
	

	//test POST
	@POST
	@Consumes("application/json")
	@Path("/user")
	public  String saveUser2(User user)  {
		System.out.println("SAVING USER " + user.getName());
		return "OK";
	}		

	
}
