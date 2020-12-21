package com.shaun.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shaun.dojosandninjas.models.Dojo;
import com.shaun.dojosandninjas.models.Ninja;
import com.shaun.dojosandninjas.services.DojoService;

@Controller
public class MainController {
	@Autowired
	private DojoService dojoserv;
	
	
	@RequestMapping("/new/dojo")
	public String newdojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		
		return "dojos.jsp";
	}
	@RequestMapping("/new/ninja")
	public String newninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoserv.Dall();
		model.addAttribute("dojos", dojos);
		
		return "ninjas.jsp";
	}
	
	
	@RequestMapping("/dojo/ninjas")
	public String dojoninja() {
		return "ninjanames.jsp";
	}
	
	//Create methods
	@PostMapping("/create/dojo")
	public String createDojo(@Valid @ModelAttribute("dojos") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojos.jsp";
		} else {
			dojoserv.createDojo(dojo);
			return "redirect:/new/dojo";
		}
	}
	
	@PostMapping("/create/ninja")
	public String createNinja(@Valid @ModelAttribute("ninjas") Ninja ninjas, BindingResult result) {
        if (result.hasErrors()) {
            return "ninjas.jsp";
        
        } else {
        	dojoserv.createNinja(ninjas);
        	return "redirect:/new/ninja";
        }
	}
        @RequestMapping("/show/{id}")
        public String show(@PathVariable("id")Long id, Model model) {
        	Dojo dojos = dojoserv.getDojo(id);
        	model.addAttribute("dojos", dojos);
        	return "ninjanames.jsp";
        }
        
        
        
	
	
	
	
	
	
	
	
	
	

}
