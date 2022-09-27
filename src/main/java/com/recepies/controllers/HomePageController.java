package com.recepies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recepies.model.DishRequest;
import com.recepies.model.DishResponse;
import com.recepies.services.HomePageService;

@RestController
@RequestMapping("api/homePage")
public class HomePageController {
	@Autowired
	HomePageService homePageService;
	@GetMapping("/{value}")
	public String getHi(@PathVariable("value") String value) {
		System.out.println("entered");
		return "Hello "+value;
	}
	public DishResponse dishUpload(DishRequest dishRequest) {
		
		return null;
	}
	

}
