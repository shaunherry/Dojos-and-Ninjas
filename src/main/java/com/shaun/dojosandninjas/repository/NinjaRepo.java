package com.shaun.dojosandninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shaun.dojosandninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
}
