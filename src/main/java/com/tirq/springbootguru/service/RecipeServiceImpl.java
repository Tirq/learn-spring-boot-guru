package com.tirq.springbootguru.service;

import com.tirq.springbootguru.model.entity.Recipe;
import com.tirq.springbootguru.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }


    @Override
    public Set<Recipe> findAll() {
        Set<Recipe> recipes = new HashSet<>();
        repository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
