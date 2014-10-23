package no.tippeaften.domain;

import org.apache.commons.lang.NotImplementedException;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bet {
	private Match match;
	private Better better;
	private Match betMatch;
	private int points;
	
	public Bet() {
		
	}
	
	public Bet(Match match, Better better, Match betMatch) {
		this.match = match;
		this.better = better;
		this.betMatch = betMatch;
	}
	
	public void updatePoints() {
		// TODO: finne ut av poeng
	}
	
	@JsonProperty
	public Match getMatch() {
		return match;
	}

	@JsonProperty
	public Better getBetter() {
		return better;
	}
	
	@JsonProperty
	public Match getBetMatch() {
		return betMatch;
	}
	
	@JsonProperty
	public int getPoints() {
		return points;
	}
}
