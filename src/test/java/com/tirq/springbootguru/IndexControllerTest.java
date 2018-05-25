package com.tirq.springbootguru;

import com.tirq.springbootguru.model.entity.Recipe;
import com.tirq.springbootguru.service.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new IndexController(recipeService);
    }

    @Test
    public void testMockMvc() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void getIndexPage() {
        var recipesInit = new HashSet<Recipe>();
        recipesInit.add(new Recipe());
        when(recipeService.findAll()).thenReturn(recipesInit);
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String view = controller.getIndexPage(model);
        assertEquals("index", view);
        verify(recipeService, times(1)).findAll();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        assertEquals(argumentCaptor.getValue().size(), 1);


    }

}