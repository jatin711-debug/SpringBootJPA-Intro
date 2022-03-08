package com.project.jatin.services.impl;

import com.project.jatin.converter.PropertyConverter;
import com.project.jatin.dto.PropertyDTO;
import com.project.jatin.entity.PropertyEntity;
import com.project.jatin.repository.PropertyRepository;
import com.project.jatin.services.PropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PropertyServiceImplementation implements PropertyService{


    @Autowired
    private PropertyRepository repository;

    @Autowired
    private PropertyConverter converter;

    @Override
    public PropertyDTO save(PropertyDTO obj) {
        PropertyEntity entity = converter.convertToEntity(obj);
        entity = repository.save(entity);

        obj = converter.convertToDTO(entity);
        return obj;
    }
    
}
