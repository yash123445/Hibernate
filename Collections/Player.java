package com.yash.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {
	
	@Id
	@Column(name= "PlayerId")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int playerId;
	@Column(name= "PlayerName")
	String playerName;
	@ManyToOne(targetEntity=Team.class)
//	@JoinColumn(name = "teamId")
	Team teamName;
	
	public Player() {
		
	}
	
	public Player(int v1, String v2, Team v3) {
		playerId= v1;
		playerName = v2;
		teamName = v3;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
