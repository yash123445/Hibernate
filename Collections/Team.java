package com.yash.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Team")
public class Team {
	@Column(name = "TeamId")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int teamId;
	@Column(name = "TeamName")
	String teamName;
	@OneToMany(targetEntity=Player.class, cascade = CascadeType.ALL) 
	// For Collection use OneToMany There is a one to many relationship between 
	//players and team class (one team many players)
	List<Player> batters;

	public Team() {

	}

	public Team(int teamId, String teamName, List<Player> v3) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.batters = v3;
	}

	public List<Player> getBatters() {
		return batters;
	}

	public void setBatters(List<Player> batters) {
		this.batters = batters;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
