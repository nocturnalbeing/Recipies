package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Foodie {
	@Id
	private Long foodieId;
	private String fName;
	private String lName;
	private String email;
	private String username;
	private String password;

}
