package com.tirq.springbootguru;

import com.tirq.springbootguru.model.entity.Recipe;
import com.tirq.springbootguru.service.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class RecipeControllerTest {

    @Mock
    RecipeService service;

    @Mock
    Model model;

    RecipeController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new RecipeController(service);
    }

    @Test
    public void getRecipe() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//        when(service.findById(anyLong())).thenReturn(new Recipe(1l));
        mockMvc.perform(get("/recipe/show/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/show"));
    }


}
