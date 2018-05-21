package com.tirq.springbootguru.model.entity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Note extends IdEntity {

    @Lob
    private String text;

    @OneToOne
    private Recipe recipe;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
