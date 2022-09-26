package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity@Data
public class Comment {
	@Id
	private Long commentId;
	private String commentDescription;
	private Foodie commentedUser;
	private Dish dish_id;

}
