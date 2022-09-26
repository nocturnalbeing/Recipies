package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FoodieLikes {
	@Id
	private Long likeId;
	private Dish dish;
	private Foodie likedFoodie;
}
