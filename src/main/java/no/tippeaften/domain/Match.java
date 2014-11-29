package no.tippeaften.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Match {
	private long id;
	private Team hosts;
	private Team visitors;
	private int hostsGoals;
	private int visitorsGoals;
	private List<Player> goals; 
	private List<Player> assists;
	private List<Player> yellowCards;
	private List<Player> redCards;

	public Match() {
	}
	
	public Match (long id, Team hosts, Team visitors) {
		
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}

	@JsonProperty
	public Team gethosts() {
		return hosts;
	}
	
	@JsonProperty
	public Team getvisitors() {
		return visitors;
	}

	@JsonProperty
	public int getHostsGoals() {
		return hostsGoals;
	}

	@JsonProperty
	public int getVisitorsGoals() {
		return visitorsGoals;
	}

	@JsonProperty
	public List<Player> getGoals() {
		return goals;
	}

	@JsonProperty
	public List<Player> getAssists() {
		return assists;
	}

	@JsonProperty
	public List<Player> getYellowCards() {
		return yellowCards;
	}

	@JsonProperty
	public List<Player> getRedCards() {
		return redCards;
	}

	public void setHostsGoals(int hostsGoals) {
		this.hostsGoals = hostsGoals;
	}

	public void setVisitorsGoals(int visitorsGoals) {
		this.visitorsGoals = visitorsGoals;
	}
	
	public void addGoal(Player player) {
		this.goals.add(player);
	}
	
	public void addAssist(Player player) {
		this.assists.add(player);
	}
	
	public void addYellowCard(Player player) {
		this.yellowCards.add(player);
	}
	
	public void addRedCard(Player player) {
		this.redCards.add(player);
	}
}