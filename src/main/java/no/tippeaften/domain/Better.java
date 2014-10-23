package no.tippeaften.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Better {
	
	long id;
	
	private String name;
	
	public Better() {
		
	}
	public Better(String name) {
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
