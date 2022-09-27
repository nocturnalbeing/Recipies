package com.recepies.model;

import lombok.Data;

@Data
public class DishRequest {
	private String name;
	private String description;
	private String category;
	private String subCateogery;
	private byte[] imageBytes;
	private String loggedUserEmail;
	private String ingredients;
}
