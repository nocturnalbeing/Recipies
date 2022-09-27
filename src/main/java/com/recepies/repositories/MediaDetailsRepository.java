package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.MediaDetails;

@Repository
public interface MediaDetailsRepository extends CrudRepository<MediaDetails, Long> {

}
