package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Alien;

public interface ARepo extends JpaRepository<Alien, Integer>{

}
