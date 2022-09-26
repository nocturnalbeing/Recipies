package com.recepies.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cateogery {
	@Id
 private Long catId;
 private String type;
}
