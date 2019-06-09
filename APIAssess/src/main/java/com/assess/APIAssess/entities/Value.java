package com.assess.APIAssess.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Value {
	private Integer id;
	private String joke;
	
	
	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Value(Integer id, String joke) {
		super();
		this.id = id;
		this.joke = joke;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getJoke() {
		return joke;
	}


	public void setJoke(String joke) {
		this.joke = joke;
	}


	@Override
	public String toString() {
		return "Value [id=" + id + ", joke=" + joke + "]";
	}
	
	
}
