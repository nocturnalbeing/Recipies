package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recepies.entities.SecurityAnswers;

@Repository
public interface SecurityAnswersRepository extends CrudRepository<SecurityAnswers, Long> {

}
