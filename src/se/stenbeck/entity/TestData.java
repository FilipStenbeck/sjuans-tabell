package se.stenbeck.entity;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TestData {

	private double version = 1.0;
	private String name = "Test1";
	private String[] someData = {"foo", "bar", "woot"};
	
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSomeData() {
		return someData;
	}
	public void setSomeData(String[] someData) {
		this.someData = someData;
	}
	
}
