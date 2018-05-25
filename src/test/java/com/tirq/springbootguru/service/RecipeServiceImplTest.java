package com.tirq.springbootguru.service;

import com.tirq.springbootguru.model.entity.Recipe;
import com.tirq.springbootguru.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RecipeServiceImplTest {

    RecipeServiceImpl service;

    @Mock
    RecipeRepository repository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        service = new RecipeServiceImpl(repository);
    }

    @Test
    public void findAll() {
        var recipesInit = new HashSet<Recipe>();
        recipesInit.add(new Recipe());

        Mockito.when(service.findAll()).thenReturn(recipesInit);

        Set<Recipe> recipes = service.findAll();

        assertEquals(recipes.size(), 1);
        verify(repository, times(1)).findAll();
    }
}