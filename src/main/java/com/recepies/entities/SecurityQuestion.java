package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity@Data
public class SecurityQuestion {
	@Id
	private Long sqId;
	private String question;

}
