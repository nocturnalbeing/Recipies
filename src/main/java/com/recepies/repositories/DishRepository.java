package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {

}
