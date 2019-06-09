package com.assess.APIAssess.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Jokes {
	private String type;
	private Value value;
	
	
	
	
	
	public Jokes(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}





	public Jokes() {
		super();
		// TODO Auto-generated constructor stub
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public Value getValue() {
		return value;
	}





	public void setValue(Value value) {
		this.value = value;
	}





	@Override
	public String toString() {
		return "Jokes [type=" + type + ", value=" + value + "]";
	}
	
	
	
}
