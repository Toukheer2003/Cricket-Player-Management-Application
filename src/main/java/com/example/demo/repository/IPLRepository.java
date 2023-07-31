package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Player;

public interface IPLRepository extends CrudRepository<Player,Integer>
{

}
