package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Player_ID;
	@Column
	String Name;
	@Column
	int Age;
	@Column
	String Team_Name;
	
	public Player() {
		super();
	}
	
	public int getPlayer_ID() {
		return Player_ID;
	}
	public void setPlayer_ID(int player_ID) {
		Player_ID = player_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getTeam_Name() {
		return Team_Name;
	}
	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}
}
