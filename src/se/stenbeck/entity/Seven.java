package se.stenbeck.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Seven {
	
	private String operator;
	private String result;
	
	public Seven() {
	
	}

	public Seven(String operator, String result) {
		super();
		this.operator = operator;
		this.result = result;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}

}
