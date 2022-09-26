package com.recepies.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity@Data
public class Dish {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long dishId;
	private String name;
	private String description;
	private String cateogery;
	private String subCateogery;
	private String imageurl;
	private Foodie foodieId;
	private boolean liked;
	private List<Comment> commentsList;
	private String ingredients;
	

}
