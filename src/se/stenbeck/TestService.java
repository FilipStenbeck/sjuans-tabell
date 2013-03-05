package se.stenbeck;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import se.stenbeck.entity.TestData;


//Sets the path to base URL -  http://localhost/rest/service/test/ 
@Path("/test")
public class TestService {
	
	@GET
	@Produces("application/json")
	public  List<TestData> getTestData() {
		   ArrayList<TestData> list = new ArrayList<TestData>(); 
		   TestData one = new TestData();
		   
		   TestData two = new TestData();
		   two.setName("Test2");
		   two.setSomeData(new String[]{"faa", "fi",  "fo"});
		   list.add(one);
		   list.add(two);
		   return list;
	}
	
	@GET
	@Path("/name/{name}")
	@Produces("application/json")
	public  List<TestData> getOneTestData(@PathParam("name") String name) {
		  ArrayList<TestData> list = new ArrayList<TestData>(); 
		  TestData two = new TestData();
		   two.setName(name);
		   two.setSomeData(new String[]{"faa", "fi",  "fo"});
		   list.add(two);
		  return list;
	
	}
	
	@GET
	@Path("/query")
	@Produces("application/json")
	public  List<TestData> getTestDataFromQuery(@QueryParam("name")  String name) {
		  ArrayList<TestData> list = new ArrayList<TestData>(); 
		  TestData two = new TestData();
		   two.setName(name);
		   two.setSomeData(new String[]{"faa", "fi",  "fo"});
		   list.add(two);
		  return list;
	
	}
	
	
}
