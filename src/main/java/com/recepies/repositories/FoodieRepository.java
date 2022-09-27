package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.Foodie;

@Repository
public interface FoodieRepository extends CrudRepository<Foodie, Long> {

}
