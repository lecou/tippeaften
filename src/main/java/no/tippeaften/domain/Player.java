package no.tippeaften.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
	
	long id;
	
	private String name;
	
	public Player() {
		
	}
	public Player(String name) {
		this.name = name;
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}
	
	@JsonProperty
	public String getName() {
		return name;
	}

}
