package com.ml.fruityloops.controllers;




import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

import com.ml.fruityloops.models.Item;



@Controller 
//this annotation is for return render for user to view
public class HomeController {
//	@RequestMapping("/")
//	public String home() {
//		return "index.jsp";
//		
//	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
		
	}

	@RequestMapping("/")
    public String index(Model model) {
        
        ArrayList<Item> fruits = new ArrayList<Item>();
        
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        model.addAttribute("fruitsFromMyController",fruits);
        
        // Add fruits your view model here
        
        return "index.jsp";
    }
	
//	@RequestMapping("/dojos")
//    public String loop(Model model) {
//        ArrayList<String> dojos = new ArrayList<String>();
//        dojos.add("Burbank");
//        dojos.add("Chicago");
//        dojos.add("Bellevue");
//        model.addAttribute("dojosFromMyController", dojos);
//        return "index.jsp";
//
//	}

	
	}
	