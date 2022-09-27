package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;
	private String commentDescription;
	private Long commentedFoodieId;
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "dish_id")
	private Dish dishId;

}
