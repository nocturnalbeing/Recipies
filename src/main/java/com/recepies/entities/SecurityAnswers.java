package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SecurityAnswers {
	@Id
	private Long aId;
	private Foodie foodieId;
	private String answer;
	

}
