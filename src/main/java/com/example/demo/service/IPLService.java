package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.repository.IPLRepository;

import java.util.List;

@Service
public class IPLService 
{
	@Autowired
	IPLRepository iplrepository;
	
	public List<Player> findallPlayers()
	{
		iplrepository.findAll();
		return (List<Player>) iplrepository.findAll() ;
	}
	
	public Player findPlayerById(int id)
	{
		Optional<Player> result=iplrepository.findById(id);
		if(result.isPresent())
		{
			return result.get();
		}
		return new Player();
	}
	
	public Player addPlayer(Player p)
	{
		return iplrepository.save(p);
	}
	
	public Player updatePlayer(Player p)
	{
		Optional<Player> result=iplrepository.findById(p.getPlayer_ID());
		Player existing=result.get();
		existing.setName(p.getName());
		existing.setAge(p.getAge());
		existing.setTeam_Name(p.getTeam_Name());
		return iplrepository.save(existing);
	}
	
	public void deleteById(int id)
	{
		iplrepository.deleteById(id);
	}
}
