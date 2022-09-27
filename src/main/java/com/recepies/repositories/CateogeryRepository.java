package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.Cateogery;

@Repository
public interface CateogeryRepository extends CrudRepository<Cateogery, Long> {

}
