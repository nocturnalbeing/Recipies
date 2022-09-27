package com.recepies.repositories;

import org.springframework.data.repository.CrudRepository;

import com.recepies.entities.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
