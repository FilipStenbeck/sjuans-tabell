package se.stenbeck;

import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;

public class TestJson {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TestJson t = new  TestJson();
		t.testGenerator();
	}
	
	
	
	public void testGenerator() throws IOException {
		JsonFactory f = new JsonFactory();
	
		JsonGenerator jGenerator = 	f.createJsonGenerator(System.out);
		
		jGenerator.writeStartArray(); // [
	 
		jGenerator.writeStartArray(); // [
		jGenerator.writeString("1141171200000"); // "msg 1"
		jGenerator.writeString("33.3"); // "msg 2"
		jGenerator.writeString("22.3"); // "msg 3"
		jGenerator.writeEndArray(); // ]
		
		jGenerator.writeStartArray(); // [
		jGenerator.writeString("1141171200000"); // "msg 1"
		jGenerator.writeString("33.3"); // "msg 2"
		jGenerator.writeString("22.3"); // "msg 3"
		jGenerator.writeEndArray(); // ]
		
		jGenerator.writeStartArray(); // [
		jGenerator.writeString("1141171200000"); // "msg 1"
		jGenerator.writeString("33.3"); // "msg 2"
		jGenerator.writeString("22.3"); // "msg 3"
		jGenerator.writeEndArray(); // ]
		
		jGenerator.writeStartArray(); // [
		jGenerator.writeString("1141171200000"); // "msg 1"
		jGenerator.writeString("33.3"); // "msg 2"
		jGenerator.writeString("22.3"); // "msg 3"
		jGenerator.writeEndArray(); // ]
		
		jGenerator.writeStartArray(); // [
		jGenerator.writeString("msg 1"); // "msg 1"
		jGenerator.writeString("msg 2"); // "msg 2"
		jGenerator.writeString("msg 3"); // "msg 3"
		jGenerator.writeEndArray(); // ]
		jGenerator.writeEndArray(); // ]
	 

	 
		jGenerator.close();
		
		
	}

}
