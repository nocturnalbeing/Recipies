package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FoodieLikes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long likeId;
	private Dish dish;
	private Foodie likedFoodie;
}
