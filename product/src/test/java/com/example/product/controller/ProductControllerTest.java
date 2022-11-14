package com.example.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class ProductControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    //    브라우저에서 URL을 요청한 것과 같은 환경을 구성해준다.
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void showTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/product/list")).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void writeTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/write")).andReturn().getModelAndView().getViewName());
        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/product/write")
                .param("productName", "선홍컨트롤러테스트2")
                .param("productPrice", "컨트").param("productStock", "롤러"))
                .andReturn().getModelAndView().getViewName());
    }

    @Test
    public void updateTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/update")
//                .param("boardNumber", "7")).andReturn().getModelAndView().getModelMap().toString());
        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/product/update")
                .param("productNumber", "57")
                .param("productName", "컨트롤러 수정된 선홍")
                .param("productPrice", "321")
                .param("productStock", "5"))
                .andReturn().getModelAndView().getModelMap().toString());
    }


    @Test
    public void updateTest2() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/update").param("boardNumber", "49").param("boardTitle", "장선홍").param("boardContent", "장선홍")).andReturn().getModelAndView().toString());

    }

    @Test
    public void deleteTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/product/delete")
                .param("productNumber", "58"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection());
    }
}
