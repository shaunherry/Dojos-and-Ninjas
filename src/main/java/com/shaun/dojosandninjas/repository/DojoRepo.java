package com.shaun.dojosandninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shaun.dojosandninjas.models.Dojo;

@Repository

public interface DojoRepo extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();
	

}
