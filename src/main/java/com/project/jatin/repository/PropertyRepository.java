package com.project.jatin.repository;

import com.project.jatin.entity.PropertyEntity;

import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {
    
}
