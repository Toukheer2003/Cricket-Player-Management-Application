package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Player;
import com.example.demo.service.IPLService;

@Controller
public class PlayerController 
{
	@Autowired
	IPLService service;
	
	@GetMapping("/")
	public String findAll(Model model)
	{
		model.addAttribute("players",service.findallPlayers());
		return "all-players";
	}
	
	@GetMapping("/add")
	public String AddPlayer(Model model)
	{
		model.addAttribute("player",new Player());
		return "add-player";
	}
	
	@PostMapping("/addplayer")
	public String createPlayer(Player p)
	{
		service.addPlayer(p);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editplayer(Model model, @PathVariable("id") int id)
	{
		model.addAttribute("player",service.findPlayerById(id));
		return "edit-player";
	}
	 
	@PostMapping("/updateplayer")
	public String updateplayer(Player p)
	{
		service.updatePlayer(p);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteplayer(@PathVariable("id") int id)
	{
		service.deleteById(id);
		return "redirect:/";
	}
}
