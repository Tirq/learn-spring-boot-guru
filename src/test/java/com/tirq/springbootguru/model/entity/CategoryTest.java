package com.tirq.springbootguru.model.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getDescription() {
        String s = "Italian";
        category.setDescription(s);
        assertEquals(s,category.getDescription());
    }
}