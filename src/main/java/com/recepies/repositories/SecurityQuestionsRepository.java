package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.SecurityQuestion;

@Repository
public interface SecurityQuestionsRepository extends CrudRepository<SecurityQuestion, Long> {

}
