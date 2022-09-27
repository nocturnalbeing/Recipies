package com.recepies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recepies.dao.HomePageDTL;
import com.recepies.model.DishRequest;

@Service
public class HomePageService {
	
	@Autowired
	HomePageDTL homePageDTL;

	public void uploadDish(DishRequest request) {
		
	}
}
