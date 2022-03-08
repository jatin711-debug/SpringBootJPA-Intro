package com.project.jatin.converter;
import com.project.jatin.dto.PropertyDTO;
import com.project.jatin.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {
    
    public PropertyEntity convertToEntity(PropertyDTO obj){
        PropertyEntity entity = new PropertyEntity();
        entity.setTitle(obj.getTitle());
        entity.setEmail(obj.getEmail());
        entity.setOwnerName(obj.getOwnerName());
        return entity;
    }


    public PropertyDTO convertToDTO(PropertyEntity entity){
        PropertyDTO dto = new PropertyDTO();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setTitle(entity.getTitle());
        dto.setOwnerName(entity.getOwnerName());
        return dto;
    }
}


