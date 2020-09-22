package com.komowo.projekt1.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
//@WebMvcTest(MainController.class)
class MainControllerTest {

    @Autowired
    MockMvc mockMvc;
    //----------------------------------------------------------

    @BeforeEach
    void setUp() {
    }
    //----------------------------------------------------------
    @Test
    void home() {

 }
    //----------------------------------------------------------
    @Test
    void pokazGrupaAktualizuj() {


    }

    //----------------------------------------------------------

    @Test
    void pokazPracownikow() {
    }

    @Test
    void pokaGgrupy() {
    }



    @Test
    void zapiszGrupe() {
    }
    //----------------------------------------------------------
}