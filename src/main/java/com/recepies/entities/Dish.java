package com.recepies.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dishId;
	private String name;
	private String description;
	private String category;
	private String subCategory;
	private String imageurl;
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "foodie_id")
	private Foodie foodieId;
	private boolean liked;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	private List<Comment> commentsList;
	private String ingredients;

}
