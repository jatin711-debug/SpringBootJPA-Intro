package com.project.jatin.dto;

public class PropertyDTO {
    public Long id;
    public String title;
    public String ownerName;
    public String email;
    public String getTitle() {
        return title;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
