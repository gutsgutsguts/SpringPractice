package com.example.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class ItemControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void addTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/item/add")
                .param("itemName", "컨트롤러테스트")
                .param("itemPrice", "5000")
                .param("itemStock", "100")).andReturn();

    }

    @Test
    public void setTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/item/set")
        .param("itemNumber", "5")
        .param("itemName", "수정된컨트롤러")
        .param("itemPrice", "6000")
        .param("itemStock", "50"))
                .andReturn().getModelAndView().getModelMap().toString());
    }

//    상품번호로 조회
    @Test
    public void showTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/item/show")
        .param("itemNumber", "3")).andReturn().getModelAndView().getModelMap().toString());

    }

//    전체 조회
    @Test
    public void listTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/item/list"))
                .andReturn().getModelAndView().getModelMap().toString());
    }





}
