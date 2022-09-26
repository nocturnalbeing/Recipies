package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity@Data
public class MediaDetails {
	@Id
	private Long mediaDetailsId;
	private Foodie foodieId;
	private String picturePath;
	private String typeOfPath;
	
}
