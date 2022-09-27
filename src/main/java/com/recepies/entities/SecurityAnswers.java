package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SecurityAnswers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long aId;
	private Long foodieId;
	private Long SecurityQuestionId;
	private String answer;
	

}
