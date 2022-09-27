package com.recepies.entities;

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

@Entity@Data
public class MediaDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long mediaDetailsId;
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "foodie_id")
	private Foodie foodie;
	private String picturePath;
	private String typeOfPath;
	
}
