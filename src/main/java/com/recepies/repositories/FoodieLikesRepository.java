package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.FoodieLikes;

@Repository
public interface FoodieLikesRepository extends CrudRepository<FoodieLikes, Long> {

}
