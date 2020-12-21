package com.shaun.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaun.dojosandninjas.models.Dojo;
import com.shaun.dojosandninjas.models.Ninja;
import com.shaun.dojosandninjas.repository.DojoRepo;
import com.shaun.dojosandninjas.repository.NinjaRepo;

@Service
public class DojoService {
	
	@Autowired
	private NinjaRepo nRepo;
	@Autowired
	private DojoRepo dRepo;
	
	
	
	
	public List<Dojo> Dall(){
		return dRepo.findAll();
	}
	public List<Ninja> all(){
		return nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninjas) {
        return nRepo.save(ninjas);
    }
    public Dojo createDojo(Dojo dojos) {
        System.out.println(dojos);
        return dRepo.save(dojos);
    }
    
    public Dojo getDojo(Long id) {
    	Optional<Dojo> dojo = dRepo.findById(id);
    	return dojo.isPresent() ? dojo.get(): null;
    }
    
    public Ninja getNinja(Long id) {
    	Optional<Ninja> ninja = nRepo.findById(id);
    	return ninja.isPresent() ? ninja.get(): null;
    }
    
    
    
    
    
    
    
    

}
