package com.project.jatin.entity;

import javax.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PROPERTY_TABLE")
@NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "PROPERTY_TITLE")
    public String title;
    @Column(name = "PROPERTY_OWNER")
    public String ownerName;
    public String email;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
