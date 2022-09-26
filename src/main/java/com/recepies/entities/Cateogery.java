package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cateogery {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Long catId;
 private String type;
}
