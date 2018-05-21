package com.tirq.springbootguru.service;

import com.tirq.springbootguru.model.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> findAll();
}
