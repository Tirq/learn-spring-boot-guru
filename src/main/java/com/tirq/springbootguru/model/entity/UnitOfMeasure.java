package com.tirq.springbootguru.model.entity;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure extends IdEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
